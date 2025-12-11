package com.sil.bulktranactionloginapp.services;


import com.sil.bulktranactionloginapp.entities.User;

public interface UserService {
    User login(String email, String password);
}
