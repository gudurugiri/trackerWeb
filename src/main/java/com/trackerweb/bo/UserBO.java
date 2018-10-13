package com.trackerweb.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.trackerweb.service.UserService;
import com.trackerweb.vo.UserVO;

@Component
public class UserBO {
	
	@Autowired 
	UserService service;

	public UserVO[] getAllUsers() {
		return service.getAllUsers();
	}
}