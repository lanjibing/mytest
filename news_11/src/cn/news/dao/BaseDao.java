package cn.news.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BaseDao {
	private static String driver = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql://127.0.0.1:3306/petshop";
	private static String user = "root"; 
	private static String password = "123456"; 
	
	
	static{
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 获得连接 
	 * @return
	 */
	public static Connection getConnection(){
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		
		}
		return conn;
	}
	/*
	 public static Connection getConnection(){
        Connection conn = null;
        try { 
	             Context ctx = new InitialContext();
	             DataSource ds=(DataSource)ctx.lookup("java:comp/env/jdbc/news");
	             conn = ds.getConnection();	             
	        } catch (SQLException exception) {
	              exception.printStackTrace();
	        } catch (NamingException namingException)  {    
	              namingException.printStackTrace();
	        }
        return conn;
	  */
	public static void close(Connection conn,PreparedStatement pstmt,ResultSet rs){
		if(rs!=null)
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		if(pstmt!=null)
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		if(rs!=null)
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
	/**
	 * 
	 * @param sql
	 * @param param
	 * @return
	 */
	public static int executeUpdate(String sql,Object...param){
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		int result =0;
		try {
			pstmt=conn.prepareStatement(sql);
			for (int i = 0; i < param.length; i++) {
				pstmt.setObject(i+1, param[i]);
			}
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			close(conn,pstmt,null);
		}
		return result;
		
	}
}