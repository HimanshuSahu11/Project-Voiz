package com.example.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.userDao;
import com.example.entities.user;

@Service
@Transactional
public class userservice {
@Autowired
userDao userdao;

public user saveUser(user User) {
	userdao.save(User);
	return User;
}
}


