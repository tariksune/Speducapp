package com.tarxsoft.root.heyvans;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class fruitButton extends AppCompatActivity {
    public Button fruitsButtonEng,fruitsButtonTur;
    public void init() {

        fruitsButtonEng = (Button) findViewById(R.id.fruitsButtonEng);
        fruitsButtonTur = (Button) findViewById(R.id.fruitsButtonTur);
        fruitsButtonEng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy = new Intent(fruitButton.this, fruitButtonEng.class);
                startActivity(toy);
            }
        });
        fruitsButtonTur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy = new Intent(fruitButton.this, fruitButtonTur.class);
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
        setContentView(R.layout.activity_fruit_button);
            //for button1
            init();
    }
}
