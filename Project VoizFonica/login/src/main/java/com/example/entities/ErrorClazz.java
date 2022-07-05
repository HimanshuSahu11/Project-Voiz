package com.example.entities;

public class ErrorClazz {
private int code;
private String errorMessage;
public ErrorClazz(int code, String errorMessage) {
	super();
	this.code = code;
	this.errorMessage = errorMessage;
}
public int getCode() {
	return code;
}
public void setCode(int code) {
	this.code = code;
}
public String getErrorMessage() {
	return errorMessage;
}
public void setErrorMessage(String errorMessage) {
	this.errorMessage = errorMessage;
}
}
