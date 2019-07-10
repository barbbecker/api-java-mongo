package com.barbbecker.fundatec.apimongo.repository;

import com.barbbecker.fundatec.apimongo.domain.Animals;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalsRepository extends MongoRepository<Animals, String> {

    Animals findByNroChip(String nroChip);
}
