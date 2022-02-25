package com.coforge;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/comments")

public class nodecontroller {

	    @Autowired
		Noteservice service;

		@Autowired
		Environment environment;

		@GetMapping("/port")
		public String getPort() {
			return environment.getProperty("local.server.port");
		}

		@GetMapping("/all")
		public List<NoteEntity> findAllNotes() {
			return service.findAllNotes();
		}

		@GetMapping("/noteId/{noteId}")
		public List<NoteEntity> findCommentsByPid(@PathVariable int noteId) {
			// System.out.println("Inside the comments service");
			return service.findNoteBynodeId(noteId);
		}

		@GetMapping("/post/author/{noteId}")
		public String findAuthorForPid(@PathVariable int pid) {
			return service.findAuthor(pid);
		}
	}



