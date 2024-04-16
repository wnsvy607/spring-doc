package com.springdoc.dto;

public record ErrorResponse(String errorMessage) {

	public static ErrorResponse of(String errorMessage) {
		return new ErrorResponse(errorMessage);
	}

}
