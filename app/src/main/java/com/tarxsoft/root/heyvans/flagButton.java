package com.tarxsoft.root.heyvans;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class flagButton extends AppCompatActivity {
    public Button flagsButtonTur,flagsButtonEng;
    public void init(){

        flagsButtonEng = (Button) findViewById(R.id.flagsButtonEng);
        flagsButtonTur = (Button) findViewById(R.id.flagsButtonTur);
        flagsButtonEng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy = new Intent(flagButton.this, flagButtonEng.class);
                startActivity(toy);
            }
        });
        flagsButtonTur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy = new Intent(flagButton.this, flagButtonTur.class);
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
        setContentView(R.layout.activity_flags_button);
        //for button1
        init();
    }
}
