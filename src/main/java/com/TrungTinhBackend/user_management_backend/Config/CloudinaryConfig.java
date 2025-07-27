package com.TrungTinhBackend.user_management_backend.Config;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CloudinaryConfig {

    @Value("${cloudinary.cloud_name}")
    private String cloudName;

    @Value("${cloudinary.api_key}")
    private String api_key;

    @Value("${cloudinary.api_secret}")
    private String api_secret;

    public CloudinaryConfig(String cloudName, String apiKey, String apiSecret) {
        this.cloudName = cloudName;
        api_key = apiKey;
        api_secret = apiSecret;
    }

    @Bean
    public Cloudinary cloudinary() {
        return new Cloudinary(ObjectUtils.asMap(
                "cloud_name",cloudName,
                "api_key",api_key,
                "api_secret",api_secret
        ));
    }
}
