package com.lei.springboot.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

//With ApplicationRunner interface, program can find method to be run immediallty after SpringBoot is started
@Component
public class ServerTest implements ApplicationRunner {
    //Regist userService daemon
    @Autowired
    public UserService userService;

    /*
    This will run after SpringBoot start
    @param args
    @throws Exception
    */
    @Override
    public void run(ApplicationArguments args) throws Exception {

        //Create an entity
        User user = new User();
        user.setPassword("springboot");
        user.setUsername("shiyanlou");
        //Transfer service for entity
        userService.save(user);
    }
}
