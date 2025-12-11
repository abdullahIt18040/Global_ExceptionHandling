package com.sil.bulktranactionloginapp.services.impl;

import com.sil.bulktranactionloginapp.entities.User;
import com.sil.bulktranactionloginapp.repositors.UserRepo;
import com.sil.bulktranactionloginapp.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepo repo;


    @Override
    public User login(String email, String password) {
        User user =new User("abc@gmail.com","sdsa");
        User user2 = repo.findByUsername(email);
        if (user == null) return null;


        return user;
    }
}
