package com.sil.bulktranactionloginapp.repositors;

import com.sil.bulktranactionloginapp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String email);

}