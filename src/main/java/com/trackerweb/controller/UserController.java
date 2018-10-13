/**
 * 
 */
package com.trackerweb.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.trackerweb.bo.UserBO;
import com.trackerweb.vo.UserVO;

/**
 * @author bujair
 *
 */
@Controller
public class UserController{
	
	@Autowired
	UserBO userBO;
	
	Logger logger = LoggerFactory.getLogger(UserController.class);
	@GetMapping(path={"/","/home"})
	public String goHome(){
		return "index";
	}
	
	@GetMapping(path={"/sessionexpired","/loginpage"})
	public String goLogin(){
		return "login";
	}
	
	@GetMapping(path={"/invalid","/timeout"})
	public String goError(){
		throw new RuntimeException("test exception");
	}
	
	
	@GetMapping(path={"/users"})
	public String getUsers(HttpServletRequest request){
		UserVO[] users = userBO.getAllUsers();
		request.setAttribute("users",users);
		return "users";
	}
	


}
