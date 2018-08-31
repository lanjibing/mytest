package cn.news.dao;

import cn.news.entity.User;

public interface UserDao {
	User login(String username);
	public int addUser(User user);
}
