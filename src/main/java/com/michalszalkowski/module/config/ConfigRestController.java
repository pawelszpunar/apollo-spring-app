package com.michalszalkowski.module.config;

import com.michalszalkowski.core.ApplicationConfig;
import com.michalszalkowski.core.ApplicationConfigDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigRestController {

    @Autowired
    private ApplicationConfig applicationConfig;

    @GetMapping("/api/config")
    public ApplicationConfigDto getConfig() {
        return applicationConfig.asDto();
    }
}
