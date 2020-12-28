package service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import dao.Dao;
import model.Login;
import model.User;
import utility.HibernateUtility;

public class UserService implements Dao {

	@Override
	public String login(Login log) {

		Session session = HibernateUtility.getSession();
		String username = "";
		List<User> data = session.createQuery("from User").list();
		for (User user : data) {
			if (user.getUsername().equalsIgnoreCase(log.getUsername()) && user.getPassword().equals(log.getPassword())) {
				
				username=user.getUsername();
				
			}
		} 
		return username;
	}

	@Override
	public boolean register(User reg) {
		boolean userAlreadyExists = false;
		Session session = HibernateUtility.getSession();
		Transaction tx = session.beginTransaction();
		
		List<User> data = session.createQuery("from User").list();
		for (User user : data) {
			if (user.getUsername().equalsIgnoreCase(reg.getUsername())) {
				userAlreadyExists = true;
				break;
			}
		}
		if(!userAlreadyExists) {
			session.save(reg);
			tx.commit();
			return true;
		} else {
			return false;
		}
		
	}

}
