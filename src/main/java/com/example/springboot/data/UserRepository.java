package com.example.springboot.data;

import org.springframework.data.repository.CrudRepository;

import com.example.springboot.data.UserEntity;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<UserEntity, Integer> {

}