package com.iesam.firsttime.features.vote.domain;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VoteAppUseCaseTest {

    VoteAppUseCase voteAppUseCase = null;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
         voteAppUseCase = null;

    }
    @Test
    public void cuanndoAppConfigEsNuloEntoncesMostrarVotarEsFalse(){

        //Given/Dado
        voteAppUseCase = new VoteAppUseCase(new StubNullAppConfigDataRepository));

        //When
        Boolean result = voteAppUseCase.execute();

        //Then/Entonces
        Assertions.assertFalse(result);
    }

    @Test
    public void cuandoLaAppSeHaAbiertoDistintoDeCincoVecesEntoncesMostrarVotarEsFalse(){

        //Given
        voteAppUseCase = new VoteAppUseCase(new StubNot5AppConfigDataRepository());

        //When
        Boolean result= voteAppUseCase.execute();

        //Then
        Assertions.assertFalse(result);
    }
}