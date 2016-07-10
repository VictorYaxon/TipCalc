package org.victoryaxon.android.tipcalc;

import android.app.Application;

/**
 * Created by victoryaxon.
 */
public class TipCalcApp extends Application {
    private final static String ABOUT_URL = "https://about.me/victoryaxon";

    public static String getAboutUrl() {
        return ABOUT_URL;
    }
}
