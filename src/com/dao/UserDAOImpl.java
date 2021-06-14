package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Service;

import com.util.DBUtil;

import com.entity.User;

@Service
public class UserDAOImpl implements IUserDAO {

	//注册实现
	@Override
	public void save(User user) throws Exception {
		Connection conn=null;
		PreparedStatement prep=null;
	
		try{ 
		conn=DBUtil.getConnection();
		 prep=conn.prepareStatement("insert into User_Demo(id,username,pwd)values(?,?,?)");
		 prep.setInt(1, 1);
		 prep.setString(2, user.getUsername());
		 prep.setString(3,user.getPwd());
		 
		prep.executeUpdate();
		
		}catch(Exception e1){
			e1.printStackTrace();
			
		}finally{
			if( prep != null){
				prep.close();
			}
			DBUtil.close(conn);
			
		}
		
		
		

	}

	//登录实现
	@Override
	public User Login(String username) throws Exception {
		User user=null;
		Connection conn = null;
		PreparedStatement prep = null;
		ResultSet rs = null;
		
		try{
			conn = DBUtil.getConnection();
			prep = conn.prepareStatement(
					"select * from User_Demo where username=?");
			prep.setString(1, username);
			rs = prep.executeQuery();
			if(rs.next()){
				user=new User();
			
				user.setPwd(rs.getString("pwd"));
			    user.setUsername(rs.getString("username"));
			    
			}
		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}finally{
			if(rs != null){
				rs.close();
			}
			if( prep != null){
				prep.close();
			}
			DBUtil.close(conn);
		}
		return user;
	}

	//发表文章
	@Override
	public void addContent(String content) throws Exception {
		
		Connection conn=null;
		PreparedStatement prep=null;
	
		try{ 
		conn=DBUtil.getConnection();
		 prep=conn.prepareStatement("insert into User_Demo(content)values(?)where id=?");
		 prep.setString(1, content);
		prep.setInt(2, 1);
		 
		prep.executeUpdate();
		
		}catch(Exception e1){
			e1.printStackTrace();
			
		}finally{
			if( prep != null){
				prep.close();
			}
			DBUtil.close(conn);
			
		}
		
		
		
	}



	

}
