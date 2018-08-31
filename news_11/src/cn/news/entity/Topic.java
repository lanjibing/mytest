package cn.news.entity;
/**
 * 主题 -实体类
 * @author Administrator
 *
 */
public class Topic {
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	private int tid;
	private String tname;
}
