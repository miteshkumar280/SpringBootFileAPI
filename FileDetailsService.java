package com.hitachi.consulting.service;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

public interface FileDetailsService {

	String storeFile(MultipartFile file);

	Resource loadFileAsResource(String fileName);

}
