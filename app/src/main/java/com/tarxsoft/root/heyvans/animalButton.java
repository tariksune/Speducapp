package com.tarxsoft.root.heyvans;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class animalButton extends AppCompatActivity {
    public Button soundsButton,namesButtonEng,namesButtonTur;
    public void init(){
        soundsButton = (Button)findViewById(R.id.soundsButton);
        namesButtonEng = (Button)findViewById(R.id.numbersButtonEng);
        namesButtonTur = (Button)findViewById(R.id.numbersButtonTur);
        soundsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy = new Intent(animalButton.this,animalSounds.class);
                startActivity(toy);
            }
        });
        namesButtonEng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy = new Intent(animalButton.this,animalNamesEng.class);
                startActivity(toy);
            }
        });
        namesButtonTur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy = new Intent(animalButton.this,animalNamesTur.class);
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
        setContentView(R.layout.activity_animal_button);
        //for button1
        init();
    }
}
