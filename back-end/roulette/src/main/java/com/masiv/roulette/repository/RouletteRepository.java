package com.masiv.roulette.repository;

import java.io.Serializable;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.masiv.roulette.documents.Roulette;
@Repository
public interface RouletteRepository extends MongoRepository<Roulette, Serializable> {
	
}
