package com.programinjava.learn.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.programinjava.learn.model.User;

@Repository
public interface UserRespository extends CrudRepository<User, Integer> {


}
