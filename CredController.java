package com.credApp.credApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.credApp.credApp.dao.DaoCred;
import com.credApp.credApp.model.UserCred;
import com.credApp.credApp.service.CredService;

@RestController
@RequestMapping(value = "/api")
public class CredController {

	@Autowired
	JdbcTemplate jdbcTemp;

	@Autowired
	private CredService credService;

	@Autowired
	private DaoCred daoCred;

	@GetMapping(path = "users", produces = "application/JSON")
	public List<UserCred> getAll() {
		return daoCred.findAll();

	}

	@PostMapping(path = "user", produces = "application/json")
	public void addItem(@RequestBody UserCred userCred) {
		credService.addUser(userCred);
	}
	
	@DeleteMapping(path = "userid")
	public void deleteItem(@PathVariable int id) {
		
		daoCred.deleteById(id);
	}

}
