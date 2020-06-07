package com.android.cicekdedektoru;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import gr.net.maroulis.library.EasySplashScreen;

public class SplashScreenActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EasySplashScreen config = new EasySplashScreen(SplashScreenActivity.this)
                .withFullScreen()
                .withTargetActivity(MainActivity.class)
                .withSplashTimeOut(4000)
                .withBackgroundColor(Color.parseColor("#4CAF50"))
                .withHeaderText("")
                .withFooterText("")
                .withBeforeLogoText("Çiçek")
                .withAfterLogoText("Detektörü")
                .withLogo(R.mipmap.ic_launcher);

        config.getHeaderTextView().setTextColor(Color.WHITE);
        config.getFooterTextView().setTextColor(Color.WHITE);
        config.getBeforeLogoTextView().setTextColor(Color.WHITE);
        config.getAfterLogoTextView().setTextColor(Color.WHITE);

        View easySplashScreen = config.create();
        setContentView(easySplashScreen);
    }
}