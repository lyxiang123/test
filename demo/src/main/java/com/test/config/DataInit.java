package com.test.config;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.entry.User;
import com.test.repository.UserRepository;

@Service
public class DataInit {

    @Autowired UserRepository userRepository;

    @PostConstruct
    public void dataInit(){
        User admin = new User();
        admin.setPassword("admin");
        admin.setUsername("admin");
        admin.setRole(User.ROLE.admin);
        userRepository.save(admin);

        User user = new User();
        user.setPassword("user");
        user.setUsername("user");
        user.setRole(User.ROLE.user);
        userRepository.save(user);
    }

}