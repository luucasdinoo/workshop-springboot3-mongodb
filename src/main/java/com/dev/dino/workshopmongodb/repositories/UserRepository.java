package com.dev.dino.workshopmongodb.repositories;

import com.dev.dino.workshopmongodb.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
