package com.michalszalkowski.module.location;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"local", "default"})
public class LocationGdanskService implements LocationService{
    @Override
    public String getLocationName() {
        return "Gdansk";
    }
}
