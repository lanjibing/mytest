package cn.news.dao;

import java.util.List;
import java.util.Map;

import cn.news.entity.News;

public interface NewsDao {
	/**
	 * 获取所有新闻
	 * @return
	 */
	Map<String,Object> getNewsList(Integer curPageNo);
	
	
	/**
	 * 获得新闻总条数
	 */
	int getNewsCount();
}
