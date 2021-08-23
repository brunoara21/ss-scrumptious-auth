package com.smoothstack.scrumptious_auth.service;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.smoothstack.scrumptious_auth.dto.CreateCustomerDto;
import com.smoothstack.scrumptious_auth.entity.User;

@Service
public class UserAccountService {

	public User createNewAccountCustomer(CreateCustomerDto createCustomerDto) {
		return null;
	}

	public String createNewCustomer(@Valid CreateCustomerDto createCustomerDto) {
		return "Works";
	}
}
