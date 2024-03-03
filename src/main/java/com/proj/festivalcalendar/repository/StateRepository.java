package com.proj.festivalcalendar.repository;


import com.proj.festivalcalendar.model.State;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepository extends MongoRepository<State,Integer> {
}
