package com.io.tms.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.io.tms.model.Admin;
import com.io.tms.model.Trainee;
import com.io.tms.service.AdminService;
import com.io.tms.service.TraineeService;

@RestController
public class TMSController {
	String username;

	@Autowired 
	AdminService adminService;
	
	@Autowired
	TraineeService traineeService;

	@GetMapping("/")
	public String sayHi() {
		return "Welcome User";
	}

	@GetMapping(value = "/login")
	public void login(@RequestBody Admin admin) {
		username = adminService.login(admin);

	}

	@PostMapping("/addTrainee")
	public ResponseEntity insertData(@RequestBody Trainee trainee) {
		traineeService.addTrainee(trainee);
		return new ResponseEntity(HttpStatus.OK);
	}

	@PutMapping("/updateTrainee")
	public Trainee updateData(@RequestBody Trainee trainee) {
		trainee = traineeService.updateTrainee(trainee);
		return trainee;
	}

	@DeleteMapping("/deleteTrainee")
	public Trainee deleteData(@RequestBody int traineeId) {
		Trainee trainee = traineeService.deleteTrainee(traineeId);
		return trainee;
	}

	@GetMapping("/getById")
	public Trainee getByTraineeid(@RequestBody int traineeId) {
		Trainee trainee = traineeService.getByTraineeId(traineeId);
		return trainee;
	}

	@GetMapping("/getAll")
	public ArrayList<Trainee> getAllProducts() {
		ArrayList<Trainee> trainee = traineeService.getAll();
		return trainee;
	}
}