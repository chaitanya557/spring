package com.collection;

import java.util.Iterator;
import java.util.List;

public class Question {
	private int id;
	private String name;
	private List<String> answers;
	
	public Question(int id,String name,List<String> answers) {
		super();
		this.id = id;
		this.name= name;
		this.answers = answers;
		
	}
	
	public void display() {
		System.out.println(id + " " +name);
		System.out.println("choose the correct answer");
		Iterator<String> itr = answers.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
