package com.olddrivers.tickets.bussiness.entities;

public enum FailedError {
	
	NAME_EXISTED(401),
	PHONE_EXISTED(402),
	EMAIL_EXISTED(403),
	USER_NOT_EXISTED(404),
	PASSWORD_ERROR(405);
	
	private Integer code;
	
	private FailedError(Integer code) {
		this.code = code;
	}
	
	public static FailedError parse(Integer code) {
        if (code == null) {
            throw new IllegalArgumentException("code cannot be null for FailedError");
        }
        if (code == 401) {
            return NAME_EXISTED;
        } else if (code == 402) {
            return PHONE_EXISTED;
        }
        else if (code == 403) {
            return EMAIL_EXISTED;
        }
        else if (code == 404) {
            return USER_NOT_EXISTED;
        }
        else if (code == 405) {
            return PASSWORD_ERROR;
        }
        throw new IllegalArgumentException("Code \"" + code + "\" does not correspond to any FailedError");
	}
	
	public Integer getCode() {
		return this.code;
	}
}