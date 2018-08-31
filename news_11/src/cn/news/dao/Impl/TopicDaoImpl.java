package cn.news.dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import cn.news.dao.BaseDao;
import cn.news.dao.TopicDao;
import cn.news.entity.Topic;

public class TopicDaoImpl implements TopicDao{

	@Override
	public List<Topic> getToicList() {
		String sql = "SELECT * FROM topic";
		Connection conn = BaseDao.getConnection();
		PreparedStatement pstat = null;
		ResultSet rs = null;
		List<Topic> list = new ArrayList<Topic>();
		try {
			pstat = conn.prepareStatement(sql);
			rs = pstat.executeQuery();
			while(rs.next()){
				Topic topic = new Topic();
				topic.setTid(rs.getInt("tid"));
				topic.setTname(rs.getString("tname"));
				list.add(topic);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			BaseDao.close(conn, pstat, rs);
		}
		
		return list;
	}

	@Override
	public int addTopic(Topic topic) {
		return 0;
	}

	@Override
	public int modifyTopic(Topic topic) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delTopic(int id) {
		return 0;
	}

}
