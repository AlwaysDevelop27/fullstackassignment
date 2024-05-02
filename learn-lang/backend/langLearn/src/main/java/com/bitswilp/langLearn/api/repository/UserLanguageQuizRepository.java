package com.bitswilp.langLearn.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bitswilp.langLearn.api.models.UserLanguageQuizModel;



@Repository
public interface UserLanguageQuizRepository extends JpaRepository<UserLanguageQuizModel, Long>{

}
