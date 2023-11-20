package ezeusecurity.security.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import ezeusecurity.security.DTO.UserRegisteredDTO;
import ezeusecurity.security.entity.User;

public interface DefaultUserService extends UserDetailsService{

	User save(UserRegisteredDTO userRegisteredDTO);
	
}