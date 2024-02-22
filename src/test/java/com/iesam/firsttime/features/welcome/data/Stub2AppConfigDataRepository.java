package com.iesam.firsttime.features.welcome.data;

import com.iesam.firsttime.features.appconfig.domain.AppConfig;
import com.iesam.firsttime.features.appconfig.domain.AppConfigRepository;

public class Stub2AppConfigDataRepository implements AppConfigRepository {
    @Override
    public AppConfig getAppConfig() {
        return new AppConfig(0);
    }

    @Override
    public void saveAppConfig(AppConfig appConfig) {

    }
}
