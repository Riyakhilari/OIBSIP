package com.example.OnlineReservationTrainSystem.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository; // Fix the import
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.OnlineReservationTrainSystem.entity.User;

@Repository
public interface UserRepo extends CrudRepository<User, Long> { // Fix the interface name
	 User findByEmail(@Param("email") String email);
	    User findByEmailAndPassword(String email, String password);
}
