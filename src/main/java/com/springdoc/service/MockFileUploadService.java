package com.springdoc.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.springdoc.dto.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class MockFileUploadService {

	public void upload(List<MultipartFile> files, Test.Request request) {
		log.info("파일 업로드 시작");
		for (var file : files) {
			log.info("file named [{}] uploaded",file.getName());
		}
	}

}
