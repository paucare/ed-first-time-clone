package com.iesam.firsttime.features.appconfig.domain;

public interface AppConfigRepository {

    AppConfig getAppConfig();

    void saveAppConfig(AppConfig appConfig);
}
