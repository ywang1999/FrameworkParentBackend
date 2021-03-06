package com.msclub.base.file;

import org.apache.http.client.HttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartFile;

/**
 * Provides a {@link org.springframework.web.client.RestTemplate} configured with
 * a pooled {@link HttpClient} suitable to perform better on an enterprise environment.
 */
@Configuration
public class FileUploadingAutoConfiguration {
	
	@Autowired
	private FileUploadingProperties fileUploadingProperties;

    @Bean
    public FileUpload fileUpload(String filePath) {
        return new FileUpload(fileUploadingProperties);
    }

}
