package com.spring.bank.api.boundary.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
	@RequiredArgsConstructor
	@RequestMapping("/api/gateway")
	public class ApiGatewayController {

	    private final CustomersServiceClient customersServiceClient;

	    private final VisitsServiceClient visitsServiceClient;

	    private final ReactiveCircuitBreakerFactory cbFactory;

	    @GetMapping(value = "owners/{ownerId}")
	    public Mono<OwnerDetails> getOwnerDetails(final @PathVariable int ownerId) {
	        return customersServiceClient.getOwner(ownerId)
	            .flatMap(owner ->
	                visitsServiceClient.getVisitsForPets(owner.getPetIds())
	                    .transform(it -> {
	                        ReactiveCircuitBreaker cb = cbFactory.create("getOwnerDetails");
	                        return cb.run(it, throwable -> emptyVisitsForPets());
	                    })
	                    .map(addVisitsToOwner(owner))
	            );

	    }

	    private Function<Visits, OwnerDetails> addVisitsToOwner(OwnerDetails owner) {
	        return visits -> {
	            owner.getPets()
	                .forEach(pet -> pet.getVisits()
	                    .addAll(visits.getItems().stream()
	                        .filter(v -> v.getPetId() == pet.getId())
	                        .collect(Collectors.toList()))
	                );
	            return owner;
	        };
	    }

	    private Mono<Visits> emptyVisitsForPets() {
	        return Mono.just(new Visits());
	    }
	}



