package com.cmpe172.dogshelter.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Dog")
public class Dog {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

 
    @Column(name = "breed")
    private String breed;
    
    @Column(name = "age")
    private int age;

    @Column(name = "gender")
    private String gender;
    
    @Column(name = "date")
    private String date;
   
    @Column(name = "comments")
    private String comments;
   

    public Dog() {
    }
  	
    public Dog(String name, String breed, int age, String gender, String date, String comments) {
    	this.name = name;
    	this.breed = breed;
    	this.age = age;
    	this.gender = gender;
    	this.date = date;
    	this.comments = comments;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

	public String getBreed() {
		return breed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}
	

}