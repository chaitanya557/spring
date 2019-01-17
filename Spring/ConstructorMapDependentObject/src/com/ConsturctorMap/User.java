package com.ConsturctorMap;

public class User {
	private int id;
	private String name;
	private String emailid;
	
	public User(int id,String name,String emailid) {
		this.id = id;
		this.name = name;
		this.emailid = emailid;
	}
	public String toString() {
		return "id:"+id+" username:"+name+" emailid:"+emailid;
		
	}
}
