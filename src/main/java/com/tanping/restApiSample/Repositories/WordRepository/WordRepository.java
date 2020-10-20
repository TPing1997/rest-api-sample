package com.tanping.restApiSample.Repositories.WordRepository;

import org.springframework.data.repository.CrudRepository;

import com.tanping.restApiSample.Entities.Word.Word;


public interface WordRepository extends CrudRepository<Word, Integer> {
	
}
