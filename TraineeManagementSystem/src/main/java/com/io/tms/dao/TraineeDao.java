package com.io.tms.dao;

import java.util.ArrayList;

import com.io.tms.model.Trainee;

public interface TraineeDao {
	int addTrainee(Trainee trainee);

	Trainee updateTrainee(Trainee trainee);

	Trainee deleteTrainee(int traineeId);

	ArrayList<Trainee> getAll();

	Trainee getByTraineeId(int traineeId);
}