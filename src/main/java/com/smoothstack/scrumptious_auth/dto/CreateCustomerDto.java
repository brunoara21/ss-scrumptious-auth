package com.smoothstack.scrumptious_auth.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class CreateCustomerDto {

	private final String firstName;
	private final String lastName;
	private final String userName;
	private final String email;
	private final String password;
	private final String phone;
}
