package com.io.tms.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.query.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.io.tms.model.Trainee;

@Component("traineeDao")
@Repository
public class TraineeDaoImpl implements TraineeDao {

	@PersistenceContext
	EntityManager entityManager;

	@Override
	public int addTrainee(Trainee trainee) {
		entityManager.persist(trainee);
		return 0;
	}

	@Override
	public Trainee updateTrainee(Trainee trainee) {
		entityManager.merge(trainee);
		return trainee;
	}

	@Override
	public Trainee deleteTrainee(int traineeId) {
		Trainee trainee = new Trainee();
		trainee.setTraineeId(traineeId);
		entityManager.remove(getByTraineeId(traineeId));
		return trainee;
	}

	@Override
	public ArrayList<Trainee> getAll() {
		Query query = (Query) entityManager.createQuery("from Trainee ");
		ArrayList<Trainee> list = (ArrayList<Trainee>) query.list();
		return list;
	}

	@Override
	public Trainee getByTraineeId(int traineeId) {
		Trainee trainee = entityManager.find(Trainee.class, traineeId);
		return trainee;
	}

}
