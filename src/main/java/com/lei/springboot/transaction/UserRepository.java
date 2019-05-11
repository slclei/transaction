package com.lei.springboot.transaction;

import org.springframework.data.repository.CrudRepository;

//Inherit CrudRepository. As dao level
public interface UserRepository extends CrudRepository<User, Integer> {
}
