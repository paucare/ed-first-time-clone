package com.iesam.firsttime.features.appconfig.presentation;

import com.iesam.firsttime.features.appconfig.data.AppConfigDataRepository;
import com.iesam.firsttime.features.appconfig.data.local.FileLocalDataSource;
import com.iesam.firsttime.features.appconfig.domain.IncrementAppOpenedUseCase;

public class AppConfigPresentation {

    /**
     * Método que se ejecuta siempre que se abre la aplicación
     */
    public static void appOpened() {
        IncrementAppOpenedUseCase incrementAppOpenedUseCase = new IncrementAppOpenedUseCase(
                new AppConfigDataRepository(new FileLocalDataSource()));
        incrementAppOpenedUseCase.execute();
    }
}
