package com.tarxsoft.root.heyvans;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class transportationButton extends AppCompatActivity {
    public Button transportationsButtonEng,transportationsButtonTur;
    public void init() {

        transportationsButtonEng = (Button) findViewById(R.id.transportationsButtonEng);
        transportationsButtonTur = (Button) findViewById(R.id.transportationsButtonTur);
        transportationsButtonEng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy = new Intent(transportationButton.this, transportationButtonEng.class);
                startActivity(toy);
            }
        });
        transportationsButtonTur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy = new Intent(transportationButton.this, transportationButtonTur.class);
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
        setContentView(R.layout.activity_transportation_button);
        //for button1
        init();
    }
}
