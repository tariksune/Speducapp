package com.tarxsoft.root.heyvans;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class sportButton extends AppCompatActivity {
    public Button sportsButtonTur,sportsButtonEng;
    public void init(){

        sportsButtonEng = (Button) findViewById(R.id.sportsButtonEng);
        sportsButtonTur = (Button) findViewById(R.id.sportsButtonTur);
        sportsButtonEng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy = new Intent(sportButton.this, sportButtonEng.class);
                startActivity(toy);
            }
        });
        sportsButtonTur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy = new Intent(sportButton.this, sportButtonTur.class);
                startActivity(toy);
            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //fullscreen - start
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //fullscreen - end
        setContentView(R.layout.activity_sport_button);
        //for button1
        init();
    }
}
