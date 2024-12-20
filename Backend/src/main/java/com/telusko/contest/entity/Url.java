package com.telusko.contest.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
public class Url {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String inputurl;
	private String outputurl;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getInputurl() {
		return inputurl;
	}
	public void setInputurl(String inputurl) {
		this.inputurl = inputurl;
	}
	public String getOutputurl() {
		return outputurl;
	}
	public void setOutputurl(String outputurl) {
		this.outputurl = outputurl;
	}
	
	@Override // returns a string representation of the Url object.
	public String toString() {
		return "Url [id=" + id + ", inputurl=" + inputurl + ", outputurl=" + outputurl + "]";
	}


	// parameterized constructors are used with 3,2 to create new object url and empty one for jpa to fetch the object from the database
	public Url(int id, String inputurl, String outputurl) {
		super();
		this.id = id;
		this.inputurl = inputurl;
		this.outputurl = outputurl;
	}
	
	public Url(String inputurl, String outputurl) {
		super();
		this.inputurl = inputurl;
		this.outputurl = outputurl;
	}
	public Url() {
		super();
	}
}
