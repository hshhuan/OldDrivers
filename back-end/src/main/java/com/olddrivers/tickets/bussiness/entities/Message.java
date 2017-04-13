package com.olddrivers.tickets.bussiness.entities;

import java.io.Serializable;
import java.util.ArrayList;

public class Message implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Status status;
	private ArrayList<FailedError> errorList = null;
	private User user;
	
	public Message(Status status, ArrayList<FailedError> errorList, User user) {
		this.setStatus(status);
		this.setErrorList(errorList);
		this.setUser(user);
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public ArrayList<FailedError> getErrorList() {
		return errorList;
	}

	public void setErrorList(ArrayList<FailedError> errorList) {
		this.errorList = errorList;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{")
		.append("\"status\":\"").append(status.getCode()).append("\",")
		//TODO: errorList to json string
		.append("\"error\":\"").append(errorList.toString()).append("\",")
		.append("\"user\":").append(user.toString()).append("\"")
		.append("}");
		return builder.toString();
	}
	
}
