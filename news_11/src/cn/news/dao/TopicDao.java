package cn.news.dao;

import java.util.List;

import cn.news.entity.Topic;

public interface TopicDao {
	/**
	 * 获得主题列表
	 */
	List<Topic> getToicList();
	/**
	 * 增加主题
	 */
	int addTopic(Topic topic);
	/**
	 * 修改主题
	 */
	int modifyTopic(Topic topic);
	/**
	 * 删除主题
	 * 
	 */
	int delTopic(int id);
}
