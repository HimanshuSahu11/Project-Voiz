package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.ErrorClazz;
import com.example.entities.user;
import com.example.service.userservice;

@RestController
@RequestMapping("/user")
public class UserController {
     @Autowired
      userservice userServices;

 @PostMapping("/save")
   public ResponseEntity<?> saveUser(@RequestBody  user User) {
     try {
              User= userServices.saveUser(User);
    return new ResponseEntity<user>(User,HttpStatus.CREATED);
     } catch (Exception e) {
 // TODO: handle exception

    	 ErrorClazz errorClazz=new ErrorClazz(500,e.getMessage());
			return new ResponseEntity<ErrorClazz>(errorClazz,HttpStatus.INTERNAL_SERVER_ERROR);

        }
    }
}


