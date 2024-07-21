package com.legend.ws.error;

import java.util.Date;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiError {
	
	private int status;
	
	private String message;
	
	private String path;
	
	private long timestamp = new Date().getTime();
	
	private Map<String, String> validationErrors;
	
	public ApiError() {
	}

    //setter -getter


    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public Map<String, String> getValidationErrors() {

        return validationErrors;
    }

    public void setValidationErrors(Map<String, String> validationErrors) {

        this.validationErrors = validationErrors;

    }





}