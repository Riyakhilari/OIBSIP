package com.example.OnlineReservationTrainSystem.services;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.OnlineReservationTrainSystem.Repo.UserRepo;
import com.example.OnlineReservationTrainSystem.entity.User;


@Service
public class userServices {
	@Autowired
	private UserRepo userRepo;
	
	public User SaveUser(User user) {
		return userRepo.save(user);
	}
	
	public void deleteUser(Long userId) {
		userRepo.deleteById(userId);
	}
	
	
	public User getUserById(Long id) {
		return userRepo.findById(id).orElseThrow(()->new RuntimeException(id +" not found"));
	}
	
	public User UpdateUser(User user) {
		User getUserId=getUserById(user.getId());
		User user1= new User();
		if(getUserId!=null) {
    		user1.setEmail(user.getEmail());
    		user1.setPassword(user.getPassword());
		}
    	return userRepo.save(user1);
	}
	
	 public boolean authenticateUser(String email, String password) {

	        // Find the user by email and password
	        User user = userRepo.findByEmailAndPassword(email, password);

	        // Check if the user is found
	        return user != null;
	        }
}
