package cn.news.dao.Impl;

import java.util.Map;

import cn.news.dao.BaseDao;
import cn.news.dao.NewsDao;
import cn.news.entity.News;

public class NewsDaoImpl extends BaseDao implements NewsDao {
	@Override
	public Map<String, Object> getNewsList(Integer curPageNo) {
		int pageSize = 10;//页码大小
		int totalCount = getNewsCount();//总条数
		int totalPageSize = totalCount/pageSize;//总页数 总条数/页码大小
		if(totalCount/pageSize == 0){
			totalPageSize = 1;
		}else if(totalCount%pageSize!=0){
			totalPageSize+=1;
		}
		
		return null;
		
	
		}

	@Override
	public int getNewsCount() {
		return 0;
	}

	

}