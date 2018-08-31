package cn.news.entity;

import java.util.Date;

public class News {
	private int nid;
	private int ntid;
	private String ntname;
	public int getNid() {
		return nid;
	}
	public void setNid(int nid) {
		this.nid = nid;
	}
	public int getNtid() {
		return ntid;
	}
	public void setNtid(int ntid) {
		this.ntid = ntid;
	}
	public String getNtname() {
		return ntname;
	}
	public void setNtname(String ntname) {
		this.ntname = ntname;
	}
	public String getNtitle() {
		return ntitle;
	}
	public void setNtitle(String ntitle) {
		this.ntitle = ntitle;
	}
	public String getNauthor() {
		return nauthor;
	}
	public void setNauthor(String nauthor) {
		this.nauthor = nauthor;
	}
	public Date getNcreatedate() {
		return ncreatedate;
	}
	public void setNcreatedate(Date ncreatedate) {
		this.ncreatedate = ncreatedate;
	}
	public String getNpicpath() {
		return npicpath;
	}
	public void setNpicpath(String npicpath) {
		this.npicpath = npicpath;
	}
	public String getNcontent() {
		return ncontent;
	}
	public void setNcontent(String ncontent) {
		this.ncontent = ncontent;
	}
	public Date getNmodifydate() {
		return nmodifydate;
	}
	public void setNmodifydate(Date nmodifydate) {
		this.nmodifydate = nmodifydate;
	}
	public String getNsummary() {
		return nsummary;
	}
	public void setNsummary(String nsummary) {
		this.nsummary = nsummary;
	}
	private String ntitle;
	private String nauthor;
	private Date ncreatedate;
	private String npicpath;
	private String ncontent;
	private Date nmodifydate;
	private String nsummary;
}
