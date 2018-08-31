<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>登录页面</title>
  </head>
  <body>
   	<%=request.getAttribute("error")==null ? " ": request.getAttribute("error")%>
   	<form action="" method="post">
   		<table border="0" align="center">
   			<tr>
   				<td align="center"><strong>登录页面</strong></td>
   			</tr>
   			<tr>
   				<td>用户名：</td>
   				<td><input type="text" name="name"></td>
   			</tr>
   			<tr>
   				<td>密码：</td>
   				<td><input type="text" name="pwd"></td>
   			</tr>
   			<tr>
   				<td align="center">
   					<input type="submit" name="submit" value="登录">
   					<a href="register.jsp"><strong>注册</strong></a>
   				</td>
   			</tr>
   		</table>
   	</form>
   	
  </body>
</html>
