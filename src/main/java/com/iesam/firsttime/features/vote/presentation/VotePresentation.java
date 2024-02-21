package com.iesam.firsttime.features.vote.presentation;

import com.iesam.firsttime.features.appconfig.data.AppConfigDataRepository;
import com.iesam.firsttime.features.appconfig.data.local.FileLocalDataSource;
import com.iesam.firsttime.features.vote.domain.VoteAppUseCase;

public class VotePresentation {

    public static void showVoteApp() {
        VoteAppUseCase voteAppUseCase = new VoteAppUseCase(
                new AppConfigDataRepository(new FileLocalDataSource()));
        boolean showVoteApp = voteAppUseCase.execute();
        if (showVoteApp) {
            System.out.println("Por favor, vote nuestra app ....");
        }
    }

}
