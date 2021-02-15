package com.credApp.credApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.credApp.credApp.model.UserCred;


@Repository
public interface DaoCred extends JpaRepository<UserCred, Integer>{

}
