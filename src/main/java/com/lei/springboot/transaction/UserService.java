package com.lei.springboot.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Used as service level, to save User object.
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User save(User user) {
        //Save entity
        userRepository.save(user);

        //Set password
        user.setPassword("123456");

        //Update record
        return userRepository.save(user);
    }
}
