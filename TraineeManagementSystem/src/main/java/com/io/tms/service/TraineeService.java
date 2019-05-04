package com.io.tms.service;

import java.util.ArrayList;

import com.io.tms.model.Trainee;

public interface TraineeService {

	int addTrainee(Trainee trainee);

	Trainee updateTrainee(Trainee trainee);

	Trainee deleteTrainee(int traineeId);

	Trainee getByTraineeId(int traineeId);

	ArrayList<Trainee> getAll();

}
