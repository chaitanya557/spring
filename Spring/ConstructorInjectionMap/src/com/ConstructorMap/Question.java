package com.ConstructorMap;

import java.util.*;
import java.util.Map.Entry;

public class Question {
	private int id;
	private String name;
	private Map<String,String> answers;
	
	public Question(int id,String name,Map<String,String> answers) {
		this.id = id;
		this.name = name;
		this.answers = answers;
	}
	
	public void display() {
		System.out.println("id:"+id);
		System.out.println("question name:"+name);
		System.out.println("Answers:");
		Set<Entry<String,String>> set = answers.entrySet();
		Iterator<Entry<String,String>> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
