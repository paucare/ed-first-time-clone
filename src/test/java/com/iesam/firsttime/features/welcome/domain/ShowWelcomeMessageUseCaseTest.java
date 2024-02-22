package com.iesam.firsttime.features.welcome.domain;

import com.iesam.firsttime.features.appconfig.domain.AppConfig;
import com.iesam.firsttime.features.welcome.data.Stub2AppConfigDataRepository;
import com.iesam.firsttime.features.welcome.data.Stub3AppConfigDataRepository;
import com.iesam.firsttime.features.welcome.data.StubAppConfigDataRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShowWelcomeMessageUseCaseTest {

    private ShowWelcomeMessageUseCase showWelcomeMessageUseCase;

    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {
        showWelcomeMessageUseCase = null;
    }

    @Test
    public void cuandoObtengoUnNuloEntoncesNoMuestroElMensaje() {
        //Given: se declaran variables.
        showWelcomeMessageUseCase = new ShowWelcomeMessageUseCase(
                new StubAppConfigDataRepository()
        );

        //When
        boolean showMessage = showWelcomeMessageUseCase.execute();

        //Then
        Assertions.assertFalse(showMessage);
    }

    @Test
    public void cuandoObtengoUnCeroEntoncesMuestroElMensaje() {
        //Given: se declaran variables.
        showWelcomeMessageUseCase = new ShowWelcomeMessageUseCase(
                new Stub2AppConfigDataRepository()
        );
        //When
        boolean showMessage = showWelcomeMessageUseCase.execute();

        //Then
        Assertions.assertTrue(showMessage);
    }

    @Test
    public void cuandoObtengoUnNumeroDistintoDeCeroEntoncesNoMuestroElMensaje() {
        //Given: se declaran variables.
        showWelcomeMessageUseCase = new ShowWelcomeMessageUseCase(
                new Stub3AppConfigDataRepository()
        );
        //When
        boolean showMessage = showWelcomeMessageUseCase.execute();

        //Then
        Assertions.assertFalse(showMessage);
    }
}