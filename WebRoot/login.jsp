<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'login.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
           
           <body>
    <form name=form method=post action=#>
        <table>
            <tr>
                <td colspan=2>登录界面</td>  
            </tr>
            <tr>
                <td>用户名:</td>
                <td><input type=text name=user size=16></td>
            </tr>
            <tr>
                <td>密码:</td>
                <td><input type=password  name=pwd size=16></td>
            </tr>
            <tr>
                <td colspan=2><input type="submit" value="登录"></td>
            </tr>
        </table>
    </form>
</body>

  </body>
</html>
