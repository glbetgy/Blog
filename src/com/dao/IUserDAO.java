package com.dao;

import com.entity.User;

public interface IUserDAO {
	//×¢²á
	public void  save(User user) throws Exception;
	//µÇÂ¼
	public User Login(String username)throws Exception;
	//ÎÄÕÂ·¢±í
	public void addContent(String content)throws Exception;

}
