package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.NewUser;

public interface NewUserDao extends JpaRepository<NewUser, Integer>{

}
