package cn.news.dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cn.news.dao.BaseDao;
import cn.news.dao.UserDao;
import cn.news.entity.User;

public class UserDaoImpl extends BaseDao implements UserDao {
	Connection conn= BaseDao.getConnection();//获取连接
	PreparedStatement pstmt = null;
	ResultSet rs= null;
	@Override
	public User login(String username) {
		String sql = "select * from news_users where uname=?";
		
		User user = null;
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()){
				user = new User();
				rs.getInt("uid");
				rs.getString("uname");
				rs.getString("upwd");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			BaseDao.close(conn, pstmt, rs);
		}
		return user;
	}

	@Override
	public int addUser(User user) {
		int result = 0;
		try {
			String sql = "insert into news_users(uname,upwd)values(?,?) ";
			result = UserDaoImpl.executeUpdate(sql,user.getUname(),user.getUpwd());
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			BaseDao.close(conn, null, null);
		}
		
		return result;
	}

}
