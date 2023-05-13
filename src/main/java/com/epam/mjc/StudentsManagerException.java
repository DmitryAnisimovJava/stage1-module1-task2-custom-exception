package com.epam.mjc;

public class StudentsManagerException extends IllegalArgumentException {
	public StudentsManagerException(String message) {
		super(message);
	}
	public StudentsManagerException(String message, Throwable cause) {
		super(message, cause);
	}
}
