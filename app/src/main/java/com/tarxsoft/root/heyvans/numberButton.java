package com.tarxsoft.root.heyvans;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class numberButton extends AppCompatActivity {
        public Button numbersButtonEng,numbersButtonTur;
        public void init(){

            numbersButtonEng = (Button)findViewById(R.id.numbersButtonEng);
            numbersButtonTur = (Button)findViewById(R.id.numbersButtonTur);
            numbersButtonEng.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent toy = new Intent(numberButton.this,numberButtonEng.class);
                    startActivity(toy);
                }
            });
            numbersButtonTur.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent toy = new Intent(numberButton.this,numberButtonTur.class);
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
        setContentView(R.layout.activity_number_button);
        //for button1
        init();
    }
}
