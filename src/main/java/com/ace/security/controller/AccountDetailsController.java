package com.ace.security.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ace.security.vo.User;

@RestController
@RequestMapping("oi/bank/account")
public class AccountDetailsController {
	
	@PostMapping
	public ResponseEntity<String> getAccountDetails(@RequestBody User user){
		
		return new ResponseEntity<String>("this is your account details", HttpStatus.OK);
	}

}
