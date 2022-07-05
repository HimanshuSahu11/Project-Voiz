package com.example.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.NewUserDao;
import com.example.entities.NewUser;

@Service
@Transactional
public class NewUserServices {
	
	@Autowired
	NewUserDao newuserDao;
	
	public NewUserServices() {
		System.out.println("<<<<<<Post Service is INSTANTIATED>>>>");
	}
	
	public NewUser saveNewUser(NewUser newuser) {
		newuserDao.save(newuser);
	return newuser;
}

}
