package com.iesam.firsttime.features.welcome.domain;

import com.iesam.firsttime.features.appconfig.domain.AppConfig;
import com.iesam.firsttime.features.appconfig.domain.AppConfigRepository;

public class ShowWelcomeMessageUseCase {

    private AppConfigRepository appConfigRepository;

    public ShowWelcomeMessageUseCase(AppConfigRepository appConfigRepository) {
        this.appConfigRepository = appConfigRepository;
    }

    public boolean execute() {
        AppConfig appConfig = appConfigRepository.getAppConfig();
        return appConfig != null && appConfig.countTimeOpened == 0;
    }
}
