package com.cognizant.springsecurity.demo.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cognizant.springsecurity.demo.entity.User;

@Repository
public class UserDaoImpl implements UserDao {

	// need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public User findByUserName(String theUserName) {
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// now retrieve/read from database using username
		Query<User> theQuery = currentSession.createQuery("from User where userName=:uName", User.class);
		theQuery.setParameter("uName", theUserName);
		User theUser = null;
		try {
			theUser = theQuery.getSingleResult();
		} catch (Exception e) {
			theUser = null;
		}

		return theUser;
	}

	@Override
	public void save(User theUser) {
		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// create the user ...
		currentSession.saveOrUpdate(theUser);
	}

	
	@Override
	public List<User> findAll() {
		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		List<User> theUsers = castList(User.class, currentSession.createQuery("from User").getResultList());
		
		// display the result
		System.out.println("disply result :");
		displayStudents(theUsers);

		return theUsers;
	}
	
	public static <T> List<T> castList(Class<? extends T> clazz, Collection<?> c) {
	    List<T> r = new ArrayList<T>(c.size());
	    for(Object o: c)
	      r.add(clazz.cast(o));
	    return r;
	}

	private static void displayStudents(List<User> theUsers) {
		for (User item : theUsers) {
			System.out.println("user-" + item.getId() + " - " + item);
		}
	}

}
