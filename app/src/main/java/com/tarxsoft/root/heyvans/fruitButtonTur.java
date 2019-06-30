package com.tarxsoft.root.heyvans;

import android.content.Intent;
import android.media.Image;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.Button;

public class fruitButtonTur extends AppCompatActivity implements View.OnClickListener{

    ImageButton apple,aubergine,avocado,banana,broccoli,cabbage,carrot,cherry,corn,courgette,cucumber,fig,garlic,grape,kiwi,lemon,melon,mushroom,onion,orange,peach,pear,peas,pepper,pineapple,potato,pumpkin,radish,redpepper,strawberry,tomato,watermelon;
    MediaPlayer mp;
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        this.finish();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //fullscreen - start
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //fullscreen - end
        setContentView(R.layout.activity_fruit_button_tur);

        apple=findViewById(R.id.appleButton);
        apple.setOnClickListener(this);
        aubergine=findViewById(R.id.aubergineButton);
        aubergine.setOnClickListener(this);
        avocado=findViewById(R.id.avocadoButton);
        avocado.setOnClickListener(this);
        banana=findViewById(R.id.bananaButton);
        banana.setOnClickListener(this);
        broccoli=findViewById(R.id.broccoliButton);
        broccoli.setOnClickListener(this);
        cabbage=findViewById(R.id.cabbageButton);
        cabbage.setOnClickListener(this);
        carrot=findViewById(R.id.carrotButton);
        carrot.setOnClickListener(this);
        cherry=findViewById(R.id.cherryButton);
        cherry.setOnClickListener(this);
        corn=findViewById(R.id.cornButton);
        corn.setOnClickListener(this);
        courgette=findViewById(R.id.courgetteButton);
        courgette.setOnClickListener(this);
        cucumber=findViewById(R.id.cucumberButton);
        cucumber.setOnClickListener(this);
        fig=findViewById(R.id.figButton);
        fig.setOnClickListener(this);
        garlic=findViewById(R.id.garlicButton);
        garlic.setOnClickListener(this);
        grape=findViewById(R.id.grapeButton);
        grape.setOnClickListener(this);
        kiwi=findViewById(R.id.kiwiButton);
        kiwi.setOnClickListener(this);
        lemon=findViewById(R.id.lemonButton);
        lemon.setOnClickListener(this);
        melon=findViewById(R.id.melonButton);
        melon.setOnClickListener(this);
        mushroom=findViewById(R.id.mushroomButton);
        mushroom.setOnClickListener(this);
        onion=findViewById(R.id.onionButton);
        onion.setOnClickListener(this);
        orange=findViewById(R.id.orangeButton);
        orange.setOnClickListener(this);
        peach=findViewById(R.id.peachButton);
        peach.setOnClickListener(this);
        pear=findViewById(R.id.pearButton);
        pear.setOnClickListener(this);
        peas=findViewById(R.id.peasButton);
        peas.setOnClickListener(this);
        pepper=findViewById(R.id.pepperButton);
        pepper.setOnClickListener(this);
        pineapple=findViewById(R.id.pineappleButton);
        pineapple.setOnClickListener(this);
        potato=findViewById(R.id.potatoButton);
        potato.setOnClickListener(this);
        pumpkin=findViewById(R.id.pumpkinButton);
        pumpkin.setOnClickListener(this);
        radish=findViewById(R.id.radishButton);
        radish.setOnClickListener(this);
        redpepper=findViewById(R.id.redpepperButton);
        redpepper.setOnClickListener(this);
        strawberry=findViewById(R.id.strawberryButton);
        strawberry.setOnClickListener(this);
        tomato=findViewById(R.id.tomatoButton);
        tomato.setOnClickListener(this);
        watermelon=findViewById(R.id.watermelonButton);
        watermelon.setOnClickListener(this);

    }
    public void onClick(View view){
        switch(view.getId()){
            case R.id.appleButton:
                mp = MediaPlayer.create(this, R.raw.appletr);
                break;
            case R.id.aubergineButton:
                mp = MediaPlayer.create(this, R.raw.auberginetr);
                break;
            case R.id.avocadoButton:
                mp = MediaPlayer.create(this, R.raw.avocadotr);
                break;
            case R.id.bananaButton:
                mp = MediaPlayer.create(this, R.raw.bananatr);
                break;
            case R.id.broccoliButton:
                mp = MediaPlayer.create(this, R.raw.broccolitr);
                break;
            case R.id.cabbageButton:
                mp = MediaPlayer.create(this, R.raw.cabbagetr);
                break;
            case R.id.carrotButton:
                mp = MediaPlayer.create(this, R.raw.carrottr);
                break;
            case R.id.cherryButton:
                mp = MediaPlayer.create(this, R.raw.cherrytr);
                break;
            case R.id.cornButton:
                mp = MediaPlayer.create(this, R.raw.corntr);
                break;
            case R.id.courgetteButton:
                mp = MediaPlayer.create(this, R.raw.courgettetr);
                break;
            case R.id.cucumberButton:
                mp = MediaPlayer.create(this, R.raw.cucumbertr);
                break;
            case R.id.figButton:
                mp = MediaPlayer.create(this, R.raw.figtr);
                break;
            case R.id.garlicButton:
                mp = MediaPlayer.create(this, R.raw.garlictr);
                break;
            case R.id.grapeButton:
                mp = MediaPlayer.create(this, R.raw.grapetr);
                break;
            case R.id.kiwiButton:
                mp = MediaPlayer.create(this, R.raw.kiwitr);
                break;
            case R.id.lemonButton:
                mp = MediaPlayer.create(this, R.raw.lemontr);
                break;
            case R.id.melonButton:
                mp = MediaPlayer.create(this, R.raw.melontr);
                break;
            case R.id.mushroomButton:
                mp = MediaPlayer.create(this, R.raw.mushroomtr);
                break;
            case R.id.onionButton:
                mp = MediaPlayer.create(this, R.raw.oniontr);
                break;
            case R.id.orangeButton:
                mp = MediaPlayer.create(this, R.raw.orangetr);
                break;
            case R.id.peachButton:
                mp = MediaPlayer.create(this, R.raw.peachtr);
                break;
            case R.id.pearButton:
                mp = MediaPlayer.create(this, R.raw.peartr);
                break;
            case R.id.peasButton:
                mp = MediaPlayer.create(this, R.raw.peastr);
                break;
            case R.id.pepperButton:
                mp = MediaPlayer.create(this, R.raw.peppertr);
                break;
            case R.id.pineappleButton:
                mp = MediaPlayer.create(this, R.raw.pineappletr);
                break;
            case R.id.potatoButton:
                mp = MediaPlayer.create(this, R.raw.potatotr);
                break;
            case R.id.pumpkinButton:
                mp = MediaPlayer.create(this, R.raw.pumpkintr);
                break;
            case R.id.radishButton:
                mp = MediaPlayer.create(this, R.raw.radishtr);
                break;
            case R.id.redpepperButton:
                mp = MediaPlayer.create(this, R.raw.redpeppertr);
                break;
            case R.id.strawberryButton:
                mp = MediaPlayer.create(this, R.raw.strawberrytr);
                break;
            case R.id.tomatoButton:
                mp = MediaPlayer.create(this, R.raw.tomatotr);
                break;
            case R.id.watermelonButton:
                mp = MediaPlayer.create(this, R.raw.watermelontr);
                break;
            default:
                return;
        }
        mp.start();
        while (mp.isPlaying()) {
            switch(view.getId()){
                case R.id.appleButton:
                    mp = MediaPlayer.create(this, R.raw.appletr);
                    break;
                case R.id.aubergineButton:
                    mp = MediaPlayer.create(this, R.raw.auberginetr);
                    break;
                case R.id.avocadoButton:
                    mp = MediaPlayer.create(this, R.raw.avocadotr);
                    break;
                case R.id.bananaButton:
                    mp = MediaPlayer.create(this, R.raw.bananatr);
                    break;
                case R.id.broccoliButton:
                    mp = MediaPlayer.create(this, R.raw.broccolitr);
                    break;
                case R.id.cabbageButton:
                    mp = MediaPlayer.create(this, R.raw.cabbagetr);
                    break;
                case R.id.carrotButton:
                    mp = MediaPlayer.create(this, R.raw.carrottr);
                    break;
                case R.id.cherryButton:
                    mp = MediaPlayer.create(this, R.raw.cherrytr);
                    break;
                case R.id.cornButton:
                    mp = MediaPlayer.create(this, R.raw.corntr);
                    break;
                case R.id.courgetteButton:
                    mp = MediaPlayer.create(this, R.raw.courgettetr);
                    break;
                case R.id.cucumberButton:
                    mp = MediaPlayer.create(this, R.raw.cucumbertr);
                    break;
                case R.id.figButton:
                    mp = MediaPlayer.create(this, R.raw.figtr);
                    break;
                case R.id.garlicButton:
                    mp = MediaPlayer.create(this, R.raw.garlictr);
                    break;
                case R.id.grapeButton:
                    mp = MediaPlayer.create(this, R.raw.grapetr);
                    break;
                case R.id.kiwiButton:
                    mp = MediaPlayer.create(this, R.raw.kiwitr);
                    break;
                case R.id.lemonButton:
                    mp = MediaPlayer.create(this, R.raw.lemontr);
                    break;
                case R.id.melonButton:
                    mp = MediaPlayer.create(this, R.raw.melontr);
                    break;
                case R.id.mushroomButton:
                    mp = MediaPlayer.create(this, R.raw.mushroomtr);
                    break;
                case R.id.onionButton:
                    mp = MediaPlayer.create(this, R.raw.oniontr);
                    break;
                case R.id.orangeButton:
                    mp = MediaPlayer.create(this, R.raw.orangetr);
                    break;
                case R.id.peachButton:
                    mp = MediaPlayer.create(this, R.raw.peachtr);
                    break;
                case R.id.pearButton:
                    mp = MediaPlayer.create(this, R.raw.peartr);
                    break;
                case R.id.peasButton:
                    mp = MediaPlayer.create(this, R.raw.peastr);
                    break;
                case R.id.pepperButton:
                    mp = MediaPlayer.create(this, R.raw.peppertr);
                    break;
                case R.id.pineappleButton:
                    mp = MediaPlayer.create(this, R.raw.pineappletr);
                    break;
                case R.id.potatoButton:
                    mp = MediaPlayer.create(this, R.raw.potatotr);
                    break;
                case R.id.pumpkinButton:
                    mp = MediaPlayer.create(this, R.raw.pumpkintr);
                    break;
                case R.id.radishButton:
                    mp = MediaPlayer.create(this, R.raw.radishtr);
                    break;
                case R.id.redpepperButton:
                    mp = MediaPlayer.create(this, R.raw.redpeppertr);
                    break;
                case R.id.strawberryButton:
                    mp = MediaPlayer.create(this, R.raw.strawberrytr);
                    break;
                case R.id.tomatoButton:
                    mp = MediaPlayer.create(this, R.raw.tomatotr);
                    break;
                case R.id.watermelonButton:
                    mp = MediaPlayer.create(this, R.raw.watermelontr);
                    break;
                default:
                    return;
            }
        }
        mp.release();

    }
}
