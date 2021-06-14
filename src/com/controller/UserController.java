package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dao.UserDAOImpl;
import com.entity.User;


@Controller
public class UserController {
@Autowired
 public	UserDAOImpl udi;
	@RequestMapping(value="register.do")
	public String Register(User user, Model model){
		
		try {
			udi.save(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return "";
	}
	@RequestMapping(value="logon.do")
	public String logon(HttpServletRequest request,User user, Model model){
		String username=request.getParameter("username");
		String pwd=request.getParameter("pwd");
	try {
		user=	udi.Login(username);
		if(user!=null && user.getPwd().equals(pwd)){
			
			
			model.addAttribute("user",user);
			
			
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		return "";
	}
	
	@RequestMapping(value="addcontent.do")
	public String addcontent(HttpServletRequest request,User user, Model model){
		 String content=request.getParameter("conent");
		try {
			udi.addContent(content);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return "";
	}
	
	
	

}
