package com.assignment.service;

import java.util.Optional;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.assignment.entity.User;
import com.assignment.repository.UserRepo;

//import feignclient.AdminClient;
import jakarta.servlet.http.HttpSession;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepo userRepo;
	
	/*
	 * @Autowired private AdminClient adminClient;
	 */

	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	
	@Override
	public User saveUser(User user) {

		String password=passwordEncoder.encode(user.getPassword());
		user.setPassword(password);
		user.setRole("ROLE_USER");
		User newuser = userRepo.save(user);

		return newuser;
	}

	@Override
	public void removeSessionMessage() {

		HttpSession session = ((ServletRequestAttributes) (RequestContextHolder.getRequestAttributes())).getRequest()
				.getSession();

		session.removeAttribute("msg");
	}
	
	//to use openfeign and to communicate with other services
	/*
	 * @Autowired private ModelMapper mapper;
	 * 
	 * public User getUserById(int id) { Optional<User> user =
	 * userRepo.findById(id); User u= mapper.map(user, User.class); return u; }
	 */
	    
	    
	 
	    // Using FeignClient
//	    ResponseEntity<User> user = adminClient.getUserById(id);
	    
	    
//	    user.setAddressResponse(addressResponse.getBody());


}
