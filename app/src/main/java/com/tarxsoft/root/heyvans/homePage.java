package com.tarxsoft.root.heyvans;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class homePage extends AppCompatActivity {
//for the button press action
    public ImageButton animalButton,numberButton,fruitButton,transportationButton,sportButton,flagButton,aboutButton;
    public ImageView chip;
    public void init(){
        animalButton = (ImageButton)findViewById(R.id.animalButton);
        animalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy = new Intent(homePage.this,splashBeforeAnimals.class);
                startActivity(toy);
            }
        });
        numberButton = (ImageButton)findViewById(R.id.numberButton);
        numberButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy = new Intent(homePage.this,splashBeforeNumbers.class);
                startActivity(toy);
            }
        });
        fruitButton = (ImageButton)findViewById(R.id.fruitButton);
        fruitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy = new Intent(homePage.this,splashBeforeFruits.class);
                startActivity(toy);
            }
        });
        transportationButton = (ImageButton)findViewById(R.id.transportationButton);
        transportationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy = new Intent(homePage.this,splashBeforeTransportation.class);
                startActivity(toy);
            }
        });
        sportButton = (ImageButton)findViewById(R.id.sportButton);
        sportButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy = new Intent(homePage.this,splashBeforeSports.class);
                startActivity(toy);
            }
        });
        flagButton = (ImageButton)findViewById(R.id.flagButton);
        flagButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy = new Intent(homePage.this,splashBeforeFlags.class);
                startActivity(toy);
            }
        });

        aboutButton = (ImageButton)findViewById(R.id.aboutButton);
        aboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy = new Intent(homePage.this,aboutButton.class);
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

        setContentView(R.layout.activity_homepage);

        //buttons active - start
        init();
        //buttons active - end

        //contact button - start
        ImageButton contact = (ImageButton)findViewById(R.id.contactButton);
        contact.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                Intent contactIntent = new Intent();
                contactIntent.setAction(Intent.ACTION_VIEW);
                contactIntent.addCategory(Intent.CATEGORY_BROWSABLE);
                contactIntent.setData(Uri.parse("https://www.tariksune.com/"));
                startActivity(contactIntent);
            }
        });
        //contact button - end


    }
}
