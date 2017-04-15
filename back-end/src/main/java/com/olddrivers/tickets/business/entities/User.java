package com.olddrivers.tickets.business.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.olddrivers.tickets.util.RegistForm;

import javax.persistence.Id;


@Entity
@Table(name = "user")
public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name="system-uuid", strategy="uuid")
	@Column(name = "id")
	private long id;
	
	@Column(name = "name", unique = true)
	private String name;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "age")
	private Integer age;
	
	@Column(name = "phone")
	private String phone;
	
	@Column(name = "email")
	private String email;
	
	//private String avatar;
	
	//@Transient
	// Gender gender;
	
	public User() {
		super();
		
	}
	
	public User(RegistForm registForm) {
		super();
		
		this.name = registForm.getName();
		this.password = registForm.getPassword();
		this.email = registForm.getEmail();
		
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
	public String getGender() {
		return this.gender;
	}
	public void setGender(String gender) {
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
        .append("\"gender\":\"").append(gender).append("\",")
        .append("\"age\":").append(age).append(",")
        .append("\"phone\":\"").append(phone).append("\",")
        .append("\"email\":\"").append(email).append("\"")
        .append("}");
        return builder.toString();
    }
	
}
