package com.wy.service;

import com.wy.entity.User;

public interface UserService {
	//�û�ע��
	public boolean registerUser(User user);
	
	//�û���½
	public boolean loginUser(User user);
}