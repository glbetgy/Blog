package com.wy.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.wy.entity.User;
import com.wy.service.UserService;

public class register extends ActionSupport{
	private String username;
	private String password;
	
	private UserService userService;
	
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public String execute() throws Exception {
		//��װһ��user����
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		//���request
		HttpServletRequest request = ServletActionContext.getRequest();
		if(userService.registerUser(user)) {
			request.setAttribute("url", "login.jsp");
			request.setAttribute("info", "ע��ɹ�");
			return SUCCESS;
		}else {
			request.setAttribute("url", "register.jsp");
			request.setAttribute("info", "ע��ʧ��");
			return ERROR;
		}
	}

}
