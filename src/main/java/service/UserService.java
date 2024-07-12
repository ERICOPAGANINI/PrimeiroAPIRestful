package service;

import API.REST.dio.PrimeiroAPI.User;

public interface UserService {
	User findById(Long id);
	
	User create(User usertoCreate);
	
	boolean existsByAccountNumber(String accountNumber);
	
	

}
