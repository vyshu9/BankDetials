package com.spring.bank.api.application;


	@Component
	@RequiredArgsConstructor
	public class ManagerServiceClient {

	    private final WebClient.Builder webClientBuilder;

	    public Mono<CustomerDetails> getOwner(final int CustomerId) {
	        return webClientBuilder.build().get()
	            .uri("http://customers-service/owners/{ownerId}", CustomerId)
	            .retrieve()
	            .bodyToMono(CustomerDetails.class);
	    }


}
