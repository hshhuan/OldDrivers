package com.olddrivers.tickets.bussiness.entities;

import java.io.Serializable;


public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public enum Gender {
		MALE("MALE"), FEMALE("FEMALE");

	    private String type;

	    public static Gender parse(String type) {
	        if (type == null) {
	            throw new IllegalArgumentException("Type cannot be null for Gender");
	        }
	        if (type.toUpperCase().equals("MALE")) {
	            return MALE;
	        } else if (type.toUpperCase().equals("FEMALE")) {
	            return FEMALE;
	        }
	        throw new IllegalArgumentException("Type \"" + type + "\" does not correspond to any Gender");
	    }
	    
	    
	    private Gender(String type) {
	        this.type = type;
	    }
	    
	    
	    public String getType() {
	        return this.type;
	    }
	    
	    
	    @Override
	    public String toString() {
	        return getType();
	    }
	}
	
	private long id;
	private String name;
	private String password;
	private Gender gender;
	private Integer age;
	private String phone;
	private String email;
	
	//private String avatar;
	
	public User(String name, String password) {
		super();
		
		this.name = name;
		this.password = password;
	}
	
	public long getId() {
		return this.id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return this.password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Gender getGender() {
		return this.gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public Integer getAge() {
		return this.age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public String getPhone() {
		return this.phone;
	}
	public void setID(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("{")
        .append("\"id\":").append(id).append(",")
        .append("\"name\":\"").append(name).append("\",")
        .append("\"password\":\"").append(password).append("\",")
        .append("\"gender\":\"").append(gender.getType()).append("\",")
        .append("\"age\":").append(age).append(",")
        .append("\"phone\":\"").append(phone).append("\",")
        .append("\"email\":\"").append(email).append("\"")
        .append("}");
        return builder.toString();
    }
}
