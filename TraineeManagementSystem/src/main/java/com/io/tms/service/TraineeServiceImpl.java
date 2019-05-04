package com.io.tms.service;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.io.tms.dao.TraineeDao;
import com.io.tms.model.Trainee;

@Component("traineeService")
@Service
@Transactional
public class TraineeServiceImpl implements TraineeService {
	@Autowired
	TraineeDao traineeDao;

	@Override
	public int addTrainee(Trainee trainee) {
		// TODO Auto-generated method stub
		return traineeDao.addTrainee(trainee);
	}

	@Override
	public Trainee updateTrainee(Trainee trainee) {
		// TODO Auto-generated method stub
		return traineeDao.updateTrainee(trainee);
	}

	@Override
	public Trainee deleteTrainee(int traineeId) {
		// TODO Auto-generated method stub
		return traineeDao.deleteTrainee(traineeId);
	}

	@Override
	public Trainee getByTraineeId(int traineeId) {
		// TODO Auto-generated method stub
		return traineeDao.getByTraineeId(traineeId);
	}

	@Override
	public ArrayList<Trainee> getAll() {
		// TODO Auto-generated method stub
		return traineeDao.getAll();
	}

}
