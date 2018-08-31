<%@page import="cn.news.entity.User"%>
<%@page import="cn.news.dao.Impl.UserDaoImpl"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'success.jsp' starting page</title>
  </head>
  
  <body>
  	<%
  		//登录验证
  		request.setCharacterEncoding("UTF-8");
  		String username = request.getParameter("name");
  		String password = request.getParameter("pwd");
  		User user = new User();
  		user.setUname(username);
  		user.setUpwd(password);
  		int result = new UserDaoImpl().addUser(user);
  		if(result>0){
  			response.sendRedirect("login,jsp");
  		}else{
  			request.getRequestDispatcher("register.jsp").forward(request, response);
  		}
  	 %>
  		
  </body>
</html>
