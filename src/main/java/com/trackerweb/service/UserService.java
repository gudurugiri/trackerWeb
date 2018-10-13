/**
 * 
 */
package com.trackerweb.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.trackerweb.vo.UserVO;

/**
 * @author bujair
 *
 */
@Service
public class UserService {

	public UserVO[] getAllUsers() {
		RestTemplate restTemplate = new RestTemplate();
		UserVO[] users =	restTemplate.getForObject("http://localhost:4000//tracker/1.0/api/user", UserVO[].class);
		return users;
	}

}
