package com.iesam.firsttime.features;

import com.iesam.firsttime.features.appconfig.presentation.AppConfigPresentation;
import com.iesam.firsttime.features.vote.presentation.VotePresentation;
import com.iesam.firsttime.features.welcome.presentation.WelcomePresentation;

public class Main {

    public static void main(String[] args) {
        AppConfigPresentation.appOpened();
        WelcomePresentation.showWelcomeMessage();
        VotePresentation.showVoteApp();
    }
}
