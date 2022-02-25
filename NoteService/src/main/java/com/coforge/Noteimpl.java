package com.coforge;

import java.util.List;

import javax.xml.stream.events.Comment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
   
public class Noteimpl {
	

		@Autowired
		private NoteRepository repo;

		@Autowired
		RestTemplate template;

		public List<NoteEntity> findAllnodes() {
			// TODO Auto-generated method stub
			return repo.findAll();
		}

		public List<NoteEntity> findNoteBynodeId(int noteId) {
			// TODO Auto-generated method stub
			return repo.findNoteBynodeId();
		}

		public String findAuthor(int noteId) {
			// TODO Auto-generated method stub

			return template
					.getForObject("http://localhost:8800/posts/author/" + noteId, String.class);

		}
		
	}




