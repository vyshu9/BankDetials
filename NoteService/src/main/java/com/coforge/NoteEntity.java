package com.coforge;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity

public class NoteEntity {
	
		@Id
		private Integer noteId;
		private String Author;
		private String description;
		private String status;

		public int getNoteId() {
			return noteId;
		}
		public void setNoteId(int noteId) {
			this.noteId = noteId;
		}
		public String getAuthor() {
			return Author;
		}
		public void setAuthor(String author) {
			Author = author;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		@Override
		public String toString() {
			return "Noteservice [noteId=" + noteId + ", Author=" + Author + ", description=" + description + ", status="
					+ status + "]";
		}
	
		public NoteEntity(Integer noteId, String author, String description, String status) {
			super();
			this.noteId = noteId;
			Author = author;
			this.description = description;
			this.status = status;
		}
		
		



}
