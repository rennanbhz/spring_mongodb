package com.udemy.springandmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.udemy.springandmongodb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
