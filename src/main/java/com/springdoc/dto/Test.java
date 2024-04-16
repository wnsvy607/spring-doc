package com.springdoc.dto;

import jakarta.validation.constraints.NotNull;

public class Test {

	public record Request(
		@NotNull
		String data
	) {
	}

	public record Response(
		String message
	) {
	}


}
