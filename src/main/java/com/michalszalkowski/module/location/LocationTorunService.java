package com.michalszalkowski.module.location;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("prod")
public class LocationTorunService implements LocationService{
    @Override
    public String getLocationName() {
        return "Torun";
    }
}