package com.example.ReservationSystem;

import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.ReservationSystem.model.Train;
import com.example.ReservationSystem.repository.TrainRepository;

@SpringBootApplication
public class ReservationSystemApplication {

	private static final Logger log = LoggerFactory.getLogger(ReservationSystemApplication.class);
	
	
	public static void main(String[] args) {
		SpringApplication.run(ReservationSystemApplication.class, args);
	}
	
	@Bean
	  public CommandLineRunner demo(TrainRepository repository) {
	    return (args) -> {
	      // save a few customers
	      repository.save(new Train(12003, "kdfka"));
	      repository.save(new Train(1245, "O'Brian"));
	      repository.save(new Train(1345, "Bauer"));
	      repository.save(new Train(1345, "Palmer"));
	      repository.save(new Train(51345, "Dessler"));
	      
	      List<Train> train=repository.findByTrainName("Dessler");
	      log.info(train.toString());
	      
	    };
	}

	
}
