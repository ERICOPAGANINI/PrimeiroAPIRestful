package service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import API.REST.dio.PrimeiroAPI.User;
import repository.UserRepository;
import service.UserService;

@Service
public class UserServiceImpl implements UserService{

	private final UserRepository userRepository;
	
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@Override
	public User findById(Long id) {
		return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
	}

	@Override
	public User create(User userToCreate) {
		if (userToCreate.getId() != 0 && userRepository.existsById(userToCreate.getId())) {
			throw new IllegalArgumentException("This User ID already exists");
		}
		
		return null;
	}

	@Override
	public boolean existsByAccountNumber(String accountNumber) {
		// TODO Auto-generated method stub
		return false;
	}


}
