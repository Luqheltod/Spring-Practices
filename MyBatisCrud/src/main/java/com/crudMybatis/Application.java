package com.crudMybatis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.crudMybatis.model.Employee;
import com.crudMybatis.repository.EmployeeMyBatisRepository;

@SpringBootApplication
public class Application implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private EmployeeMyBatisRepository employeeRepository;

	@Override
		public  void run(String[] args) throws Exception {
		
		logger.info("Inserting -> {}", employeeRepository.insert(new Employee(10011 , "Ramesh", "Fadatare", "ramesh@gmail.com")));
	        logger.info("Inserting -> {}", employeeRepository.insert(new Employee(10012 , "John", "Cena", "john@gmail.com")));
	        logger.info("Inserting -> {}", employeeRepository.insert(new Employee(10013 , "tony", "stark", "stark@gmail.com")));

	        logger.info("Employee id 10011 -> {}", employeeRepository.findById(10011 ));

	        logger.info("Update 10003 -> {}", employeeRepository.update(new Employee(10011 , "ram", "Stark", "ramesh123@gmail.com")));

	        employeeRepository.deleteById(10013 );

	        logger.info("All users -> {}", employeeRepository.findAll());
	    }

	 public static void main(String[] args) {
	        SpringApplication.run(Application.class, args);
	    }
	}

