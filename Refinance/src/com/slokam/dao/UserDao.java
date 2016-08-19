package com.slokam.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.slokam.Entity.UserPojo;

@Repository
public class UserDao {
	@Autowired
	private HibernateTemplate ht;
	
	public void saveUser(UserPojo user) {
		ht.save(user);
	}
	public boolean getUser(UserPojo userPojo) {
		List<UserPojo> list =
				(List<UserPojo>) ht.find("from UserPojo where id=? and ssn=?", userPojo.getId(), userPojo.getSsn());
		if (list.size() > 0)
			return true;
		else
			return false;
	}
}  // UserDao