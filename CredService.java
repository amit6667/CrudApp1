package com.credApp.credApp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.credApp.credApp.model.UserCred;

@Service
public interface CredService {

	public List<UserCred> getAllList();

	public void addUser(UserCred userCred);
	// public List<UserCred> list = new ArrayList<UserCred>();

}
