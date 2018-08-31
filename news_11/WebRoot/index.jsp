<%@page import="cn.news.entity.User"%>
<%@page import="cn.news.entity.News"%>
<%@page import="cn.news.dao.Impl.NewsDaoImpl"%>
<%@page import="cn.news.dao.NewsDao"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>新闻列表</title>
  </head>
  
  <body>
    <div>
    	<%
    		request.setCharacterEncoding("utf-8");
	        NewsDao newsdao = new NewsDaoImpl();
	        List<News> news = newsdao.getNewsList();
    	 %>
    	 	<h2>欢迎：<%=((User)session.getAttribute("sessionName")).getUname() %></h2>
	       <table  border="1" align="center" cellpadding="0" cellspacing="0" width="100%">
		       <tr class="first">
		           <td>标题</td>
		           <td>作者</td>
		           <td>操作</td>
		       </tr>
		       <%for(News newss :news) {%>
		          <tr >
		             <td><%=newss.getNtitle() %></td>
		             <td><%=newss.getNauthor() %></td>
		             <td><a href="#">修改</a> <a href="#">删除</a></td>
		          </tr>
		       <%} %>
		</table>
     </div>
   </body>
</html>
