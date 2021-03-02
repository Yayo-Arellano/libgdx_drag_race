package com.nopalsoft.dragracer.client;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;
import com.nopalsoft.dragracer.MainStreet;
import com.nopalsoft.dragracer.handlers.GameServicesHandler;
import com.nopalsoft.dragracer.handlers.RequestHandler;

public class HtmlLauncher extends GwtApplication implements RequestHandler, GameServicesHandler {

    @Override
    public GwtApplicationConfiguration getConfig() {

        return new GwtApplicationConfiguration(480, 800);
    }

    @Override
    public ApplicationListener createApplicationListener() {
        return new MainStreet(this, this);
    }

    @Override
    public void submitScore(long score) {

    }

    @Override
    public void unlockAchievement(String achievementId) {

    }

    @Override
    public void getLeaderboard() {

    }

    @Override
    public void getAchievements() {

    }

    @Override
    public boolean isSignedIn() {
        return false;
    }

    @Override
    public void signIn() {

    }

    @Override
    public void signOut() {

    }

    @Override
    public void showRater() {

    }

    @Override
    public void showInterstitial() {

    }

    @Override
    public void showFacebook() {

    }

    @Override
    public void showMoreGames() {

    }

    @Override
    public void shareOnFacebook(String mensaje) {

    }

    @Override
    public void shareOnTwitter(String mensaje) {

    }

    @Override
    public void removeAds() {

    }

    @Override
    public void showAdBanner() {

    }

    @Override
    public void hideAdBanner() {

    }

    @Override
    public void buy50milCoins() {

    }
}