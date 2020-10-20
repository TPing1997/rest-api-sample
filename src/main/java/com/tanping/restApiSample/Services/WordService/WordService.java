package com.tanping.restApiSample.Services.WordService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tanping.restApiSample.Entities.Word.Word;
import com.tanping.restApiSample.Repositories.WordRepository.WordRepository;


@Service
public class WordService {

	@Autowired
	private WordRepository wordRepository;

	private List<Word> wordList = new ArrayList<>();

//	During Start	
//	public WordService() {
//
//		System.out.println("Word Service - service layer created");
//
//		Word word = new Word();
//		word.setComma(true);
//		word.setFinalLetter("test");
//		word.setIntialLetter("test");
//		word.setFinalLetter("test");
//		word.setName("test");
//		for (int i = 1; i < 4; i++) {
//			word.setId(i);
//			wordList.add(word);
//		}
//	}

	// Return All the Words
	public List<Word> getAllTheWords() {
		List<Word> newWordList = new ArrayList<>();
		wordRepository.findAll().forEach(newWordList::add);
		return newWordList;
	}

	// Return Single Word
	public Word getWordById(Integer id) {
		Optional<Word> optionalWord = wordRepository.findById(id);
		if (optionalWord.isPresent()) {
			return optionalWord.get();
		}
		return null;
	}

	// Save the Word
	public Word saveWord(Word word) {
		return wordRepository.save(word);
	}

	// Update the Word
	public Word updateWord(Word word) {
		return wordRepository.save(word);
	}

	// Remove the Word
	public void deletePlayerById(int id) {
		wordRepository.deleteById(id);
	}

}
