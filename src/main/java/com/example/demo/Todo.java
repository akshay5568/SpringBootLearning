package com.example.demo;

public class Todo{
	private String task;
	private int id;
	private String email;

	public Todo(int id,String email,String task){
		this.email = email;
		this.id = id;
		this.task = task;
	}

	public Todo(){}

	public void setTask(String task){
		this.task = task;
	}

	public String getTask(){
		return task;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	@Override
 	public String toString(){
		return 
			"Todo{" + 
			"task = '" + task + '\'' + 
			",id = '" + id + '\'' + 
			",email = '" + email + '\'' + 
			"}";
		}
}
