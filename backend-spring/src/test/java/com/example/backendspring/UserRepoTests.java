package com.example.backendspring;

import com.example.backendspring.models.User;
import com.example.backendspring.repositories.UserRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class UserRepoTests {
    @Autowired
    private UserRepo userRepo;

    /*
    @Test
    public void saveUserTest(){
        User user = new User
    }
    */
}
