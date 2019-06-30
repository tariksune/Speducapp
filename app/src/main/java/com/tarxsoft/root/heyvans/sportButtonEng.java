package com.tarxsoft.root.heyvans;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

public class sportButtonEng extends AppCompatActivity implements View.OnClickListener{

    ImageButton airhockey,americanfootball,archery,athletics,badminton,baseball,basketball,racingbicycle,billiard,bowling,boxing,canoe,chess,climber,curling,dart,fitness,football,golf,gymnastic,handball,hockey,horsemanship,iceskating,karate,kickboxing,painter,rowing,sailing,skate,skater,skiing,snowboard,surf,swimming,tabletennis,tennis,trekking,volleyball,waterpolo;
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
        setContentView(R.layout.activity_sport_button_eng);

        airhockey=findViewById(R.id.airhockey);
        airhockey.setOnClickListener(this);
        americanfootball=findViewById(R.id.americanfootball);
        americanfootball.setOnClickListener(this);
        archery=findViewById(R.id.archery);
        archery.setOnClickListener(this);
        athletics=findViewById(R.id.athletics);
        athletics.setOnClickListener(this);
        badminton=findViewById(R.id.badminton);
        badminton.setOnClickListener(this);
        baseball=findViewById(R.id.baseball);
        baseball.setOnClickListener(this);
        basketball=findViewById(R.id.basketball);
        basketball.setOnClickListener(this);
        racingbicycle=findViewById(R.id.racingbicycle);
        racingbicycle.setOnClickListener(this);
        billiard=findViewById(R.id.billiard);
        billiard.setOnClickListener(this);
        bowling=findViewById(R.id.bowling);
        bowling.setOnClickListener(this);
        boxing=findViewById(R.id.boxing);
        boxing.setOnClickListener(this);
        canoe=findViewById(R.id.canoe);
        canoe.setOnClickListener(this);
        chess=findViewById(R.id.chess);
        chess.setOnClickListener(this);
        climber=findViewById(R.id.climber);
        climber.setOnClickListener(this);
        curling=findViewById(R.id.curling);
        curling.setOnClickListener(this);
        dart=findViewById(R.id.dart);
        dart.setOnClickListener(this);
        fitness=findViewById(R.id.fitness);
        fitness.setOnClickListener(this);
        football=findViewById(R.id.football);
        football.setOnClickListener(this);
        golf=findViewById(R.id.golf);
        golf.setOnClickListener(this);
        gymnastic=findViewById(R.id.gymnastic);
        gymnastic.setOnClickListener(this);
        handball=findViewById(R.id.handball);
        handball.setOnClickListener(this);
        hockey=findViewById(R.id.hockey);
        hockey.setOnClickListener(this);
        horsemanship=findViewById(R.id.horsemanship);
        horsemanship.setOnClickListener(this);
        iceskating=findViewById(R.id.iceskating);
        iceskating.setOnClickListener(this);
        karate=findViewById(R.id.karate);
        karate.setOnClickListener(this);
        kickboxing=findViewById(R.id.kickboxing);
        kickboxing.setOnClickListener(this);
        painter=findViewById(R.id.painter);
        painter.setOnClickListener(this);
        rowing=findViewById(R.id.rowing);
        rowing.setOnClickListener(this);
        sailing=findViewById(R.id.sailing);
        sailing.setOnClickListener(this);
        skate=findViewById(R.id.skate);
        skate.setOnClickListener(this);
        skater=findViewById(R.id.skater);
        skater.setOnClickListener(this);
        skiing=findViewById(R.id.skiing);
        skiing.setOnClickListener(this);
        snowboard=findViewById(R.id.snowboard);
        snowboard.setOnClickListener(this);
        surf=findViewById(R.id.surf);
        surf.setOnClickListener(this);
        swimming=findViewById(R.id.swimming);
        swimming.setOnClickListener(this);
        tabletennis=findViewById(R.id.tabletennis);
        tabletennis.setOnClickListener(this);
        tennis=findViewById(R.id.tennis);
        tennis.setOnClickListener(this);
        trekking=findViewById(R.id.trekking);
        trekking.setOnClickListener(this);
        volleyball=findViewById(R.id.volleyball);
        volleyball.setOnClickListener(this);
        waterpolo=findViewById(R.id.waterpolo);
        waterpolo.setOnClickListener(this);
    }
    public void onClick(View view){
        switch(view.getId()){
            case R.id.airhockey:
                mp = MediaPlayer.create(this, R.raw.airhockey);
                break;
            case R.id.americanfootball:
                mp = MediaPlayer.create(this, R.raw.americanfootball);
                break;
            case R.id.archery:
                mp = MediaPlayer.create(this, R.raw.archery);
                break;
            case R.id.athletics:
                mp = MediaPlayer.create(this, R.raw.athletics);
                break;
            case R.id.badminton:
                mp = MediaPlayer.create(this, R.raw.badminton);
                break;
            case R.id.baseball:
                mp = MediaPlayer.create(this, R.raw.baseball);
                break;
            case R.id.basketball:
                mp = MediaPlayer.create(this, R.raw.basketball);
                break;
            case R.id.racingbicycle:
                mp = MediaPlayer.create(this, R.raw.racingbicycle);
                break;
            case R.id.billiard:
                mp = MediaPlayer.create(this, R.raw.billiard);
                break;
            case R.id.bowling:
                mp = MediaPlayer.create(this, R.raw.bowling);
                break;
            case R.id.boxing:
                mp = MediaPlayer.create(this, R.raw.boxing);
                break;
            case R.id.canoe:
                mp = MediaPlayer.create(this, R.raw.canoe);
                break;
            case R.id.chess:
                mp = MediaPlayer.create(this, R.raw.chess);
                break;
            case R.id.climber:
                mp = MediaPlayer.create(this, R.raw.climber);
                break;
            case R.id.curling:
                mp = MediaPlayer.create(this, R.raw.curling);
                break;
            case R.id.dart:
                mp = MediaPlayer.create(this, R.raw.dart);
                break;
            case R.id.fitness:
                mp = MediaPlayer.create(this, R.raw.fitness);
                break;
            case R.id.football:
                mp = MediaPlayer.create(this, R.raw.football);
                break;
            case R.id.golf:
                mp = MediaPlayer.create(this, R.raw.golf);
                break;
            case R.id.gymnastic:
                mp = MediaPlayer.create(this, R.raw.gymnastic);
                break;
            case R.id.handball:
                mp = MediaPlayer.create(this, R.raw.handball);
                break;
            case R.id.hockey:
                mp = MediaPlayer.create(this, R.raw.hockey);
                break;
            case R.id.horsemanship:
                mp = MediaPlayer.create(this, R.raw.horsemanship);
                break;
            case R.id.iceskating:
                mp = MediaPlayer.create(this, R.raw.iceskating);
                break;
            case R.id.karate:
                mp = MediaPlayer.create(this, R.raw.karate);
                break;
            case R.id.kickboxing:
                mp = MediaPlayer.create(this, R.raw.kickboxing);
                break;
            case R.id.painter:
                mp = MediaPlayer.create(this, R.raw.painter);
                break;
            case R.id.rowing:
                mp = MediaPlayer.create(this, R.raw.rowing);
                break;
            case R.id.sailing:
                mp = MediaPlayer.create(this, R.raw.sailing);
                break;
            case R.id.skate:
                mp = MediaPlayer.create(this, R.raw.skate);
                break;
            case R.id.skater:
                mp = MediaPlayer.create(this, R.raw.skater);
                break;
            case R.id.skiing:
                mp = MediaPlayer.create(this, R.raw.skiing);
                break;
            case R.id.snowboard:
                mp = MediaPlayer.create(this, R.raw.snowboard);
                break;
            case R.id.surf:
                mp = MediaPlayer.create(this, R.raw.surf);
                break;
            case R.id.swimming:
                mp = MediaPlayer.create(this, R.raw.swimming);
                break;
            case R.id.tabletennis:
                mp = MediaPlayer.create(this, R.raw.tabletennis);
                break;
            case R.id.tennis:
                mp = MediaPlayer.create(this, R.raw.tennis);
                break;
            case R.id.trekking:
                mp = MediaPlayer.create(this, R.raw.trekking);
                break;
            case R.id.volleyball:
                mp = MediaPlayer.create(this, R.raw.volleyball);
                break;
            case R.id.waterpolo:
                mp = MediaPlayer.create(this, R.raw.waterpolo);
                break;
            default:
                return;
        }
        mp.start();
        while (mp.isPlaying()) {
            switch(view.getId()){
                case R.id.airhockey:
                    mp = MediaPlayer.create(this, R.raw.airhockey);
                    break;
                case R.id.americanfootball:
                    mp = MediaPlayer.create(this, R.raw.americanfootball);
                    break;
                case R.id.archery:
                    mp = MediaPlayer.create(this, R.raw.archery);
                    break;
                case R.id.athletics:
                    mp = MediaPlayer.create(this, R.raw.athletics);
                    break;
                case R.id.badminton:
                    mp = MediaPlayer.create(this, R.raw.badminton);
                    break;
                case R.id.baseball:
                    mp = MediaPlayer.create(this, R.raw.baseball);
                    break;
                case R.id.basketball:
                    mp = MediaPlayer.create(this, R.raw.basketball);
                    break;
                case R.id.racingbicycle:
                    mp = MediaPlayer.create(this, R.raw.racingbicycle);
                    break;
                case R.id.billiard:
                    mp = MediaPlayer.create(this, R.raw.billiard);
                    break;
                case R.id.bowling:
                    mp = MediaPlayer.create(this, R.raw.bowling);
                    break;
                case R.id.boxing:
                    mp = MediaPlayer.create(this, R.raw.boxing);
                    break;
                case R.id.canoe:
                    mp = MediaPlayer.create(this, R.raw.canoe);
                    break;
                case R.id.chess:
                    mp = MediaPlayer.create(this, R.raw.chess);
                    break;
                case R.id.climber:
                    mp = MediaPlayer.create(this, R.raw.climber);
                    break;
                case R.id.curling:
                    mp = MediaPlayer.create(this, R.raw.curling);
                    break;
                case R.id.dart:
                    mp = MediaPlayer.create(this, R.raw.dart);
                    break;
                case R.id.fitness:
                    mp = MediaPlayer.create(this, R.raw.fitness);
                    break;
                case R.id.football:
                    mp = MediaPlayer.create(this, R.raw.football);
                    break;
                case R.id.golf:
                    mp = MediaPlayer.create(this, R.raw.golf);
                    break;
                case R.id.gymnastic:
                    mp = MediaPlayer.create(this, R.raw.gymnastic);
                    break;
                case R.id.handball:
                    mp = MediaPlayer.create(this, R.raw.handball);
                    break;
                case R.id.hockey:
                    mp = MediaPlayer.create(this, R.raw.hockey);
                    break;
                case R.id.horsemanship:
                    mp = MediaPlayer.create(this, R.raw.horsemanship);
                    break;
                case R.id.iceskating:
                    mp = MediaPlayer.create(this, R.raw.iceskating);
                    break;
                case R.id.karate:
                    mp = MediaPlayer.create(this, R.raw.karate);
                    break;
                case R.id.kickboxing:
                    mp = MediaPlayer.create(this, R.raw.kickboxing);
                    break;
                case R.id.painter:
                    mp = MediaPlayer.create(this, R.raw.painter);
                    break;
                case R.id.rowing:
                    mp = MediaPlayer.create(this, R.raw.rowing);
                    break;
                case R.id.sailing:
                    mp = MediaPlayer.create(this, R.raw.sailing);
                    break;
                case R.id.skate:
                    mp = MediaPlayer.create(this, R.raw.skate);
                    break;
                case R.id.skater:
                    mp = MediaPlayer.create(this, R.raw.skater);
                    break;
                case R.id.skiing:
                    mp = MediaPlayer.create(this, R.raw.skiing);
                    break;
                case R.id.snowboard:
                    mp = MediaPlayer.create(this, R.raw.snowboard);
                    break;
                case R.id.surf:
                    mp = MediaPlayer.create(this, R.raw.surf);
                    break;
                case R.id.swimming:
                    mp = MediaPlayer.create(this, R.raw.swimming);
                    break;
                case R.id.tabletennis:
                    mp = MediaPlayer.create(this, R.raw.tabletennis);
                    break;
                case R.id.tennis:
                    mp = MediaPlayer.create(this, R.raw.tennis);
                    break;
                case R.id.trekking:
                    mp = MediaPlayer.create(this, R.raw.trekking);
                    break;
                case R.id.volleyball:
                    mp = MediaPlayer.create(this, R.raw.volleyball);
                    break;
                case R.id.waterpolo:
                    mp = MediaPlayer.create(this, R.raw.waterpolo);
                    break;
                default:
                    return;
            }
        }
        mp.release();
    }
}
