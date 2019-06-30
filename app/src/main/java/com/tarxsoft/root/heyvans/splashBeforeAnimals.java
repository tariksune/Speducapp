package com.tarxsoft.root.heyvans;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class splashBeforeAnimals extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
        //fullscreen - start
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //fullscreen - end
    setContentView(R.layout.activity_splash_before);

    new Handler().postDelayed(new Runnable() {
        @Override
        public void run() {
            startActivity(new Intent(splashBeforeAnimals.this,animalButton.class));
            finish();
        }
    },SPLASH_TIME_OUT);

}
}
