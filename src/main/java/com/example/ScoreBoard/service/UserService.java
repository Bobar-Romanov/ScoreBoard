package com.example.ScoreBoard.service;

import com.example.ScoreBoard.models.Role;
import com.example.ScoreBoard.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.ScoreBoard.repo.UserRepo;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepo.findByUsername(username);
    }


}