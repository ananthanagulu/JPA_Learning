package com.sixdee.imp.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sixdee.imp.entity.AccountDetail;
import com.sixdee.imp.repository.AccountRepository;

@RestController
public class AccountManagementController {
	@Autowired 
	AccountRepository accountRepository;
	@GetMapping(path="/Register/{name}/{phoneNumber}/{dob}")   
	public AccountDetail register(@PathVariable("name")String name,
			@PathVariable("phoneNumber")String phoneNumber,
			@PathVariable("dob")String dob) {
		System.out.println(" name"+name);
		AccountDetail dto=new AccountDetail();
		dto.setName(name);
		dto.setPhoneNumber(phoneNumber);
		dto.setDob(dob); 
		
				return accountRepository.save(dto);
		
	}
	
}
