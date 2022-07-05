package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.ErrorClazz;
import com.example.entities.NewUser;
import com.example.service.NewUserServices;
@RestController
@RequestMapping("/newuser")

public class NewUserController {
	@Autowired
	NewUserServices newuserServices;
	
	public NewUserController() {
		System.out.println("<<<<<<<NewUserCONTROLLER INSTANTIATED>>>>>>>>");
	}
	
	@PostMapping("/save")
	public ResponseEntity<?> saveNewUser(@RequestBody NewUser newuser) {
		try {
			newuser= newuserServices.saveNewUser(newuser);
			return new ResponseEntity<NewUser>(newuser,HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			ErrorClazz errorClazz=new ErrorClazz(500,e.getMessage());
			return new ResponseEntity<ErrorClazz>(errorClazz,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
