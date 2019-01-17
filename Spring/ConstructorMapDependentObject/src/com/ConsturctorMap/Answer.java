package com.ConsturctorMap;

public class Answer {
	private int id;
	private String answer;
	private String postedDate;
	
	public Answer(int id,String answer,String postedDate) {
		this.id = id;
		this.answer = answer;
		this.postedDate = postedDate;
	}
	public String toString() {
		return "id: "+id+" Answer: "+answer+" PostedDate: "+postedDate;
	}
}
