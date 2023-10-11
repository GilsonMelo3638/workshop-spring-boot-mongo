package com.melogilson.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.melogilson.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}