package com.yash.entity;

import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
@Entity
public class Post {
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer pid;
	private String discription;
	private String title;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="p_fid" ,referencedColumnName="pid")
	List<Comment> comments=new ArrayList<>();

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public Post(String discription, String title) {
		super();
		this.discription = discription;
		this.title = title;
	}
	
	
}
