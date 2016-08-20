package com.slokam.dao;

import java.util.List;

import com.slokam.Entity.UserPojo;

public interface UserDaoInterface {
	public void addUser(UserPojo user);
	public List<UserPojo> getAllUsers();
	public void deleteUser(int id);
}  // UserDaoInterface