package com.tanping.restApiSample.Controllers.WordController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tanping.restApiSample.Entities.Word.Word;
import com.tanping.restApiSample.Services.WordService.WordService;

@RestController
public class WordController {

	@Autowired
	private WordService wordService;

	// GET
	@RequestMapping(value = "/words", method = RequestMethod.GET)
	public List<Word> getMessage() {
		return wordService.getAllTheWords();
	}

	@RequestMapping(value = "/words/{id}", method = RequestMethod.GET)
	public Word getWordById(@PathVariable Integer id) {
		return wordService.getWordById(id);
	}

	// POST
	@RequestMapping(value = "/words/save", method = RequestMethod.POST)
	public Word saveWord(@RequestBody Word word) {
		
		return wordService.saveWord(word);
	}

	// PUT
	@RequestMapping(value = "/words/edit", method = RequestMethod.PUT)
	public Word updateWord(@RequestBody Word word) {
		return wordService.updateWord(word);
	}

	// DELETE
	@RequestMapping(value = "/words/delete/{id}", method = RequestMethod.DELETE)
	public Boolean deletePlayerById(@PathVariable Integer id) {
		if(wordService.getWordById(id) != null) {
			wordService.deletePlayerById(id);
			return true;
		}			
		return false;

	}
	
}
