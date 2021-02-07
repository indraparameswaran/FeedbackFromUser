package com.ecommerce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "feedback" ,schema="ecommerce")
public class Feedback {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@Column(name = "id")
	private int id;
	//@Column(name = "username")
	private String username;
	//@Column(name = "userfeedback")
	private String userfeedback;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	
	public String getUserfeedback() {
		return userfeedback;
	}
	public void setUserfeedback(String userfeedback) {
		this.userfeedback = userfeedback;
	}
	@Override
	public String toString() {
		return "Feedback [username=" + username + ", userfeedback=" + userfeedback + "]";
	}
	
	
	
}
