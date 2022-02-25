package com.coforge;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public interface Noteservice{
	
	public List<NoteEntity> findAllNotes();
	public List<NoteEntity> findNoteBynodeId(int noteId);
	public String findAuthor(int noteId);
	

}


