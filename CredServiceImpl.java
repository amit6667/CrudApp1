package com.credApp.credApp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.credApp.credApp.dao.DaoCred;
import com.credApp.credApp.model.UserCred;

@Service
public class CredServiceImpl implements CredService {

	@Autowired
	private DaoCred daoCred;

	@Override
	public List<UserCred> getAllList() {
		// TODO Auto-generated method stub

		List<UserCred> list = new ArrayList<UserCred>();
		daoCred.findAll().forEach(list::add);
		return list;
	}

	public void addUser(UserCred userCred) {
		daoCred.save(userCred);

	}

}
