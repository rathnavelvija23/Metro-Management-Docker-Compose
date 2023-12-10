package com.vija.docker.compose.repo;

import java.util.List;
import java.util.Optional;

import com.vija.docker.compose.model.Rail;
import org.springframework.data.mongodb.repository.MongoRepository;



public interface MetroRepository extends MongoRepository<Rail, String> {


}
