package com.imaginologie.friendlist;

import java.io.Serializable;

public class FriendlistDto implements Serializable{
	private int no;
	private String name;
	private String gender;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	

}
