package com.dao;

import com.entity.User;

public interface IUserDAO {
	//ע��
	public void  save(User user) throws Exception;
	//��¼
	public User Login(String username)throws Exception;
	//���·���
	public void addContent(String content)throws Exception;

}
