package com.slokam.dao;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.slokam.Entity.UserPojo;

@Repository
public class UserDao implements UserDaoInterface {
	@Autowired
	private HibernateTemplate ht;

	public void addUser(UserPojo user) {
		ht.save(user);
	}

	@SuppressWarnings("unchecked")
	public List<UserPojo> getAllUsers() {
		return ht.executeFind(new HibernateCallback<List<UserPojo>>() {
			public List<UserPojo> doInHibernate(Session session) throws HibernateException, SQLException {
				return session.createQuery("from UserPojo u").list();
			}
		});
	}

	public void deleteUser(int id) {
		UserPojo user = (UserPojo) ht.find("from UserPojo where id=" + id);
		if (user != null)
			ht.delete(user);
		else
			System.out.println("Requested User is not in our database.");
	}

}  // UserDao