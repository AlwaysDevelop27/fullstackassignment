package com.bitswilp.langLearn.api.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bitswilp.langLearn.api.models.UserLanguageModel;
import com.bitswilp.langLearn.api.models.UserLanguageQuizModel;
import com.bitswilp.langLearn.api.models.UserLanguageStructureModel;
import com.bitswilp.langLearn.api.models.UserLanguageYoutubeLinkModel;
import com.bitswilp.langLearn.api.repository.UserLanguageRepository;
import com.bitswilp.langLearn.api.service.UserLanguageService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/api/v1")
@Tag(name="userlanguagecontroller",description = "to perform operations on language")
public class UserLanguageController {
	
	@Autowired
	private UserLanguageRepository userLangRepo;
	
	@Autowired
	private UserLanguageService userLangSer;
	
	
	
	 @Operation( 
			 summary = "GET Operation on languages", 
			 description ="to fetch details of languages from database" 
			 )
	 
	@GetMapping("languages")
	public ResponseEntity<List<UserLanguageModel>> getAllLanguages(){
	    List<UserLanguageModel> langg = userLangSer.getAllLanguages();
        return ResponseEntity.ok(langg);

}



	 @Operation( summary = "GET Operation on quiz related to languages",
			  description = "to fetch quiz details of languages from database" )
 
 
	@GetMapping("/languages_quiz")
	public ResponseEntity<List<UserLanguageQuizModel>> getAllLanguageQuiz(){
	    List<UserLanguageQuizModel> lang_quiz = userLangSer.getAllLanguageQuiz();
        return ResponseEntity.ok(lang_quiz);

}


 @Operation( summary = "GET Operation on structure of languages", description
= "to fetch structure details of languages from database" )

	@GetMapping("/languages_structure")
	public ResponseEntity<List<UserLanguageStructureModel>> getAllLanguageStructure(){
	    List<UserLanguageStructureModel> lang_stru = userLangSer.getAllLanguageStructure();
        return ResponseEntity.ok(lang_stru);

	}
	
	
	
	 @Operation( summary = "GET Operation on youtube links of languages",
	 description = "to fetch youtube link details of languages from database" )
	
	 
	@GetMapping("/youtubeLink")
	public ResponseEntity<List<UserLanguageYoutubeLinkModel>> getAllYoutubeLink(){
		List<UserLanguageYoutubeLinkModel> youtube_link = userLangSer.getAllYoutubeLink();
		return ResponseEntity.ok(youtube_link);
	}

	

}
