package com.iesam.firsttime.features.welcome.presentation;

import com.iesam.firsttime.features.appconfig.data.AppConfigDataRepository;
import com.iesam.firsttime.features.appconfig.data.local.FileLocalDataSource;
import com.iesam.firsttime.features.welcome.domain.ShowWelcomeMessageUseCase;

public class WelcomePresentation {

    public static void showWelcomeMessage() {
        ShowWelcomeMessageUseCase showWelcomeMessageUseCase = new ShowWelcomeMessageUseCase(
                new AppConfigDataRepository(new FileLocalDataSource()));
        boolean isFirstTime = showWelcomeMessageUseCase.execute();
        if (isFirstTime) {
            System.out.println("Bienvenidos a la aplicación ....");
        }
    }

}
