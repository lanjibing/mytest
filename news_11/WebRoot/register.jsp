<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>用户注册 </title>
  </head>
  
  <body>
  <%=request.getAttribute("error")==null ? " ": request.getAttribute("error") %>	 
    <form action="control.jsp" method="post">
    <table>
    	<tr>
    		<td>用户名：</td>
    		<td><input type="text" name="name"></td>
    	</tr>
    	<tr>
    		<td>输入登录密码：</td>
    		<td><input type="password" name="pwd"></td>
    	</tr>
    	<tr>
    		<td>再次输入密码：</td>
    		<td><input type="password" name="senondpwd"></td>
    	</tr>
    	<tr>
    		<td></td>
    		<td><input type="submit" value="注册">
    		<a href="login.jsp"><strong>登录</strong></a>
    		</td>
    	</tr>
    </table>
    </form>
    
  </body>
</html>
