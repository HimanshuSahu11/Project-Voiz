package com.example.dao;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.user;

public interface userDao extends JpaRepository<user, Integer> {

}