package com.tarxsoft.root.heyvans;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

public class animalNamesEng extends AppCompatActivity implements View.OnClickListener{

    ImageButton dog,cat,bear,frog,horse,sheep,bird,chicken,elephant,leopard,pig,wolf,rhinoceros,bee,bull,dolphin,cow,duck,fly,gorilla,deer,panda,stork,whale,shark,giraffe,lion,grasshopper,mouse,goat,fox,snake;
    MediaPlayer mp;
    @SuppressLint("ResourceType")
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
        setContentView(R.layout.activity_animal_names_eng);

        dog=findViewById(R.id.dog);
        dog.setOnClickListener(this);
        cat=findViewById(R.id.cat);
        cat.setOnClickListener(this);
        bear=findViewById(R.id.bear);
        bear.setOnClickListener(this);
        frog=findViewById(R.id.frog);
        frog.setOnClickListener(this);
        horse=findViewById(R.id.horse);
        horse.setOnClickListener(this);
        sheep=findViewById(R.id.sheep);
        sheep.setOnClickListener(this);
        bird=findViewById(R.id.bird);
        bird.setOnClickListener(this);
        chicken=findViewById(R.id.chicken);
        chicken.setOnClickListener(this);
        elephant=findViewById(R.id.elephant);
        elephant.setOnClickListener(this);
        leopard=findViewById(R.id.leopard);
        leopard.setOnClickListener(this);
        pig=findViewById(R.id.pig);
        pig.setOnClickListener(this);
        wolf=findViewById(R.id.wolf);
        wolf.setOnClickListener(this);
        rhinoceros=findViewById(R.id.rhinoceros);
        rhinoceros.setOnClickListener(this);
        bee=findViewById(R.id.bee);
        bee.setOnClickListener(this);
        bull=findViewById(R.id.bull);
        bull.setOnClickListener(this);
        dolphin=findViewById(R.id.dolphin);
        dolphin.setOnClickListener(this);
        cow=findViewById(R.id.cow);
        cow.setOnClickListener(this);
        duck=findViewById(R.id.duck);
        duck.setOnClickListener(this);
        fly=findViewById(R.id.fly);
        fly.setOnClickListener(this);
        gorilla=findViewById(R.id.gorilla);
        gorilla.setOnClickListener(this);
        deer=findViewById(R.id.deer);
        deer.setOnClickListener(this);
        panda=findViewById(R.id.panda);
        panda.setOnClickListener(this);
        stork=findViewById(R.id.stork);
        stork.setOnClickListener(this);
        whale=findViewById(R.id.whale);
        whale.setOnClickListener(this);
        shark=findViewById(R.id.shark);
        shark.setOnClickListener(this);
        giraffe=findViewById(R.id.giraffe);
        giraffe.setOnClickListener(this);
        lion=findViewById(R.id.lion);
        lion.setOnClickListener(this);
        grasshopper=findViewById(R.id.grasshopper);
        grasshopper.setOnClickListener(this);
        mouse=findViewById(R.id.mouse);
        mouse.setOnClickListener(this);
        goat=findViewById(R.id.goat);
        goat.setOnClickListener(this);
        fox=findViewById(R.id.fox);
        fox.setOnClickListener(this);
        snake=findViewById(R.id.snake);
        snake.setOnClickListener(this);
    }

    public void onClick(View view){
        switch(view.getId()){
            case R.id.dog:
                mp = MediaPlayer.create(this, R.raw.dogname);
                break;
            case R.id.cat:
                mp = MediaPlayer.create(this, R.raw.catname);
                break;
            case R.id.bear:
                mp = MediaPlayer.create(this, R.raw.bearname);
                break;
            case R.id.frog:
                mp = MediaPlayer.create(this, R.raw.frogname);
                break;
            case R.id.horse:
                mp = MediaPlayer.create(this, R.raw.horsename);
                break;
            case R.id.sheep:
                mp = MediaPlayer.create(this, R.raw.sheepname);
                break;
            case R.id.bird:
                mp = MediaPlayer.create(this, R.raw.birdname);
                break;
            case R.id.chicken:
                mp = MediaPlayer.create(this, R.raw.chickenname);
                break;
            case R.id.elephant:
                mp = MediaPlayer.create(this, R.raw.elephantname);
                break;
            case R.id.leopard:
                mp = MediaPlayer.create(this, R.raw.leopardname);
                break;
            case R.id.pig:
                mp = MediaPlayer.create(this, R.raw.pigname);
                break;
            case R.id.wolf:
                mp = MediaPlayer.create(this, R.raw.wolfname);
                break;
            case R.id.rhinoceros:
                mp = MediaPlayer.create(this, R.raw.rhinocerosname);
                break;
            case R.id.bee:
                mp = MediaPlayer.create(this, R.raw.beename);
                break;
            case R.id.bull:
                mp = MediaPlayer.create(this, R.raw.bullname);
                break;
            case R.id.dolphin:
                mp = MediaPlayer.create(this, R.raw.dolphinname);
                break;
            case R.id.cow:
                mp = MediaPlayer.create(this, R.raw.cowname);
                break;
            case R.id.duck:
                mp = MediaPlayer.create(this, R.raw.duckname);
                break;
            case R.id.fly:
                mp = MediaPlayer.create(this, R.raw.flyname);
                break;
            case R.id.gorilla:
                mp = MediaPlayer.create(this, R.raw.gorillaname);
                break;
            case R.id.deer:
                mp = MediaPlayer.create(this, R.raw.deername);
                break;
            case R.id.panda:
                mp = MediaPlayer.create(this, R.raw.pandaname);
                break;
            case R.id.stork:
                mp = MediaPlayer.create(this, R.raw.storkname);
                break;
            case R.id.whale:
                mp = MediaPlayer.create(this, R.raw.whalename);
                break;
            case R.id.shark:
                mp = MediaPlayer.create(this, R.raw.sharkname);
                break;
            case R.id.giraffe:
                mp = MediaPlayer.create(this, R.raw.giraffename);
                break;
            case R.id.lion:
                mp = MediaPlayer.create(this, R.raw.lionname);
                break;
            case R.id.grasshopper:
                mp = MediaPlayer.create(this, R.raw.grasshoppername);
                break;
            case R.id.mouse:
                mp = MediaPlayer.create(this, R.raw.mousename);
                break;
            case R.id.goat:
                mp = MediaPlayer.create(this, R.raw.goatname);
                break;
            case R.id.fox:
                mp = MediaPlayer.create(this, R.raw.foxname);
                break;
            case R.id.snake:
                mp = MediaPlayer.create(this, R.raw.snakename);
                break;
            default:
                return;
        }
        mp.start();
        while (mp.isPlaying()) {
            switch(view.getId()){
                case R.id.dog:
                    mp = MediaPlayer.create(this, R.raw.dogname);
                    break;
                case R.id.cat:
                    mp = MediaPlayer.create(this, R.raw.catname);
                    break;
                case R.id.bear:
                    mp = MediaPlayer.create(this, R.raw.bearname);
                    break;
                case R.id.frog:
                    mp = MediaPlayer.create(this, R.raw.frogname);
                    break;
                case R.id.horse:
                    mp = MediaPlayer.create(this, R.raw.horsename);
                    break;
                case R.id.sheep:
                    mp = MediaPlayer.create(this, R.raw.sheepname);
                    break;
                case R.id.bird:
                    mp = MediaPlayer.create(this, R.raw.birdname);
                    break;
                case R.id.chicken:
                    mp = MediaPlayer.create(this, R.raw.chickenname);
                    break;
                case R.id.elephant:
                    mp = MediaPlayer.create(this, R.raw.elephantname);
                    break;
                case R.id.leopard:
                    mp = MediaPlayer.create(this, R.raw.leopardname);
                    break;
                case R.id.pig:
                    mp = MediaPlayer.create(this, R.raw.pigname);
                    break;
                case R.id.wolf:
                    mp = MediaPlayer.create(this, R.raw.wolfname);
                    break;
                case R.id.rhinoceros:
                    mp = MediaPlayer.create(this, R.raw.rhinocerosname);
                    break;
                case R.id.bee:
                    mp = MediaPlayer.create(this, R.raw.beename);
                    break;
                case R.id.bull:
                    mp = MediaPlayer.create(this, R.raw.bullname);
                    break;
                case R.id.dolphin:
                    mp = MediaPlayer.create(this, R.raw.dolphinname);
                    break;
                case R.id.cow:
                    mp = MediaPlayer.create(this, R.raw.cowname);
                    break;
                case R.id.duck:
                    mp = MediaPlayer.create(this, R.raw.duckname);
                    break;
                case R.id.fly:
                    mp = MediaPlayer.create(this, R.raw.flyname);
                    break;
                case R.id.gorilla:
                    mp = MediaPlayer.create(this, R.raw.gorillaname);
                    break;
                case R.id.deer:
                    mp = MediaPlayer.create(this, R.raw.deername);
                    break;
                case R.id.panda:
                    mp = MediaPlayer.create(this, R.raw.pandaname);
                    break;
                case R.id.stork:
                    mp = MediaPlayer.create(this, R.raw.storkname);
                    break;
                case R.id.whale:
                    mp = MediaPlayer.create(this, R.raw.whalename);
                    break;
                case R.id.shark:
                    mp = MediaPlayer.create(this, R.raw.sharkname);
                    break;
                case R.id.giraffe:
                    mp = MediaPlayer.create(this, R.raw.giraffename);
                    break;
                case R.id.lion:
                    mp = MediaPlayer.create(this, R.raw.lionname);
                    break;
                case R.id.grasshopper:
                    mp = MediaPlayer.create(this, R.raw.grasshoppername);
                    break;
                case R.id.mouse:
                    mp = MediaPlayer.create(this, R.raw.mousename);
                    break;
                case R.id.goat:
                    mp = MediaPlayer.create(this, R.raw.goatname);
                    break;
                case R.id.fox:
                    mp = MediaPlayer.create(this, R.raw.foxname);
                    break;
                case R.id.snake:
                    mp = MediaPlayer.create(this, R.raw.snakename);
                    break;
                default:
                    return;
            }
        }
        mp.release();

    }


}
