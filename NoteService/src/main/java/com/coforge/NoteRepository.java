package com.coforge;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface NoteRepository extends JpaRepository<NoteEntity,Integer>{
	
	
	@Query("select u from Comment u where u.nodeid=?1")
	public List<NoteEntity> findNoteBynodeid(int noteId);

	public List<NoteEntity> findNoteBynodeId();
}
	
	
	


