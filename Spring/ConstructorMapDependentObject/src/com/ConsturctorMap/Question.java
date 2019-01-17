package com.ConsturctorMap;

import java.util.*;
import java.util.Map.Entry;

public class Question {
	private int id;
	private String name;
	private Map<Answer,User> answers;
	
	public Question(int id,String name,Map<Answer,User> answers) {
		this.id = id;
		this.name = name;
		this.answers = answers;
	}
	public void display() {
		System.out.println("id:"+id);
		System.out.println("Question is:"+name);
		System.out.println("Answers are");
		Set<Entry<Answer,User>> set = answers.entrySet();
		Iterator<Entry<Answer,User>> itr = set.iterator();
		while(itr.hasNext()) {
			Entry<Answer,User> entry = itr.next();
			Answer ans = entry.getKey();
			User usr = entry.getValue();
			System.out.println("Answer information:");
			System.out.println(ans);
			System.out.println("Posted by");
			System.out.println(usr);
		}
	}
}
