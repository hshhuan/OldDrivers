package com.olddrivers.tickets.util;

import java.io.Serializable;
import java.util.ArrayList;

import com.olddrivers.tickets.business.entities.FailedError;
import com.olddrivers.tickets.business.entities.Status;
import com.olddrivers.tickets.business.entities.User;

public class Message implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Integer statusCode;
	private ArrayList<ErrorCode> errorCodeList = new ArrayList<ErrorCode>();
	private User user;
	
	public Message(Status status, ArrayList<FailedError> errorList, User user) {
		this.setStatusCode(status.getCode());
		for(FailedError error : errorList) {
			errorCodeList.add(new ErrorCode(error.getCode()));
		}
		this.user = user;
	}

	public Integer getStatusCode() {
		return statusCode;
	}
	
	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}


	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{")
		.append("\"status\":").append(statusCode).append(",")
		.append("\"error\":").append(errorCodeList.toString()).append(",")
		.append("\"user\":").append(user!=null?user.toString():"{}")
		.append("}");
		return builder.toString();
	}
}
