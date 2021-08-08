package com.michalszalkowski.module.config;

import com.michalszalkowski.core.ApplicationConfig;
import com.michalszalkowski.module.location.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConfigWebController {

    @Autowired
    private ApplicationConfig applicationConfig;
    @Autowired
    private LocationService locationService;

    @GetMapping("/config")
    public String getConfig(Model model) {
        model.addAttribute("config", applicationConfig.asDto());
        model.addAttribute("location", locationService.getLocationName());
        return "config.html";
    }

}