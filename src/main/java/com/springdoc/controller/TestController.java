package com.springdoc.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.springdoc.dto.Test;
import com.springdoc.service.MockFileUploadService;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import lombok.RequiredArgsConstructor;

@Validated
@RequiredArgsConstructor
@RestController
public class TestController {

	private final MockFileUploadService mockFileUploadService;

	@PostMapping(value = "/file", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public Test.Response uploadFile(
		@RequestPart("files") @NotEmpty List<MultipartFile> files,
		@RequestPart("request") @Valid Test.Request request
	) {
		mockFileUploadService.upload(files, request);
		return new Test.Response("success");
	}

}
