package com.tarxsoft.root.heyvans;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

public class sportButtonTur extends AppCompatActivity implements View.OnClickListener{

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
        setContentView(R.layout.activity_sport_button_tur);

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
                mp = MediaPlayer.create(this, R.raw.airhockeytr);
                break;
            case R.id.americanfootball:
                mp = MediaPlayer.create(this, R.raw.americanfootballtr);
                break;
            case R.id.archery:
                mp = MediaPlayer.create(this, R.raw.archerytr);
                break;
            case R.id.athletics:
                mp = MediaPlayer.create(this, R.raw.athleticstr);
                break;
            case R.id.badminton:
                mp = MediaPlayer.create(this, R.raw.badmintontr);
                break;
            case R.id.baseball:
                mp = MediaPlayer.create(this, R.raw.baseballtr);
                break;
            case R.id.basketball:
                mp = MediaPlayer.create(this, R.raw.basketballtr);
                break;
            case R.id.racingbicycle:
                mp = MediaPlayer.create(this, R.raw.racingbicycletr);
                break;
            case R.id.billiard:
                mp = MediaPlayer.create(this, R.raw.billiardtr);
                break;
            case R.id.bowling:
                mp = MediaPlayer.create(this, R.raw.bowlingtr);
                break;
            case R.id.boxing:
                mp = MediaPlayer.create(this, R.raw.boxingtr);
                break;
            case R.id.canoe:
                mp = MediaPlayer.create(this, R.raw.canoetr);
                break;
            case R.id.chess:
                mp = MediaPlayer.create(this, R.raw.chesstr);
                break;
            case R.id.climber:
                mp = MediaPlayer.create(this, R.raw.climbertr);
                break;
            case R.id.curling:
                mp = MediaPlayer.create(this, R.raw.curlingtr);
                break;
            case R.id.dart:
                mp = MediaPlayer.create(this, R.raw.darttr);
                break;
            case R.id.fitness:
                mp = MediaPlayer.create(this, R.raw.fitnesstr);
                break;
            case R.id.football:
                mp = MediaPlayer.create(this, R.raw.footballtr);
                break;
            case R.id.golf:
                mp = MediaPlayer.create(this, R.raw.golftr);
                break;
            case R.id.gymnastic:
                mp = MediaPlayer.create(this, R.raw.gymnastictr);
                break;
            case R.id.handball:
                mp = MediaPlayer.create(this, R.raw.handballtr);
                break;
            case R.id.hockey:
                mp = MediaPlayer.create(this, R.raw.hockeytr);
                break;
            case R.id.horsemanship:
                mp = MediaPlayer.create(this, R.raw.horsemanshiptr);
                break;
            case R.id.iceskating:
                mp = MediaPlayer.create(this, R.raw.iceskatingtr);
                break;
            case R.id.karate:
                mp = MediaPlayer.create(this, R.raw.karatetr);
                break;
            case R.id.kickboxing:
                mp = MediaPlayer.create(this, R.raw.kickboxingtr);
                break;
            case R.id.painter:
                mp = MediaPlayer.create(this, R.raw.paintertr);
                break;
            case R.id.rowing:
                mp = MediaPlayer.create(this, R.raw.rowingtr);
                break;
            case R.id.sailing:
                mp = MediaPlayer.create(this, R.raw.sailingtr);
                break;
            case R.id.skate:
                mp = MediaPlayer.create(this, R.raw.skatetr);
                break;
            case R.id.skater:
                mp = MediaPlayer.create(this, R.raw.skatertr);
                break;
            case R.id.skiing:
                mp = MediaPlayer.create(this, R.raw.skiingtr);
                break;
            case R.id.snowboard:
                mp = MediaPlayer.create(this, R.raw.snowboardtr);
                break;
            case R.id.surf:
                mp = MediaPlayer.create(this, R.raw.surftr);
                break;
            case R.id.swimming:
                mp = MediaPlayer.create(this, R.raw.swimmingtr);
                break;
            case R.id.tabletennis:
                mp = MediaPlayer.create(this, R.raw.tabletennistr);
                break;
            case R.id.tennis:
                mp = MediaPlayer.create(this, R.raw.tennistr);
                break;
            case R.id.trekking:
                mp = MediaPlayer.create(this, R.raw.trekkingtr);
                break;
            case R.id.volleyball:
                mp = MediaPlayer.create(this, R.raw.volleyballtr);
                break;
            case R.id.waterpolo:
                mp = MediaPlayer.create(this, R.raw.waterpolotr);
                break;
            default:
                return;
        }

        mp.start();
        while (mp.isPlaying()) {
            switch(view.getId()){
                case R.id.airhockey:
                    mp = MediaPlayer.create(this, R.raw.airhockeytr);
                    break;
                case R.id.americanfootball:
                    mp = MediaPlayer.create(this, R.raw.americanfootballtr);
                    break;
                case R.id.archery:
                    mp = MediaPlayer.create(this, R.raw.archerytr);
                    break;
                case R.id.athletics:
                    mp = MediaPlayer.create(this, R.raw.athleticstr);
                    break;
                case R.id.badminton:
                    mp = MediaPlayer.create(this, R.raw.badmintontr);
                    break;
                case R.id.baseball:
                    mp = MediaPlayer.create(this, R.raw.baseballtr);
                    break;
                case R.id.basketball:
                    mp = MediaPlayer.create(this, R.raw.basketballtr);
                    break;
                case R.id.racingbicycle:
                    mp = MediaPlayer.create(this, R.raw.racingbicycletr);
                    break;
                case R.id.billiard:
                    mp = MediaPlayer.create(this, R.raw.billiardtr);
                    break;
                case R.id.bowling:
                    mp = MediaPlayer.create(this, R.raw.bowlingtr);
                    break;
                case R.id.boxing:
                    mp = MediaPlayer.create(this, R.raw.boxingtr);
                    break;
                case R.id.canoe:
                    mp = MediaPlayer.create(this, R.raw.canoetr);
                    break;
                case R.id.chess:
                    mp = MediaPlayer.create(this, R.raw.chesstr);
                    break;
                case R.id.climber:
                    mp = MediaPlayer.create(this, R.raw.climbertr);
                    break;
                case R.id.curling:
                    mp = MediaPlayer.create(this, R.raw.curlingtr);
                    break;
                case R.id.dart:
                    mp = MediaPlayer.create(this, R.raw.darttr);
                    break;
                case R.id.fitness:
                    mp = MediaPlayer.create(this, R.raw.fitnesstr);
                    break;
                case R.id.football:
                    mp = MediaPlayer.create(this, R.raw.footballtr);
                    break;
                case R.id.golf:
                    mp = MediaPlayer.create(this, R.raw.golftr);
                    break;
                case R.id.gymnastic:
                    mp = MediaPlayer.create(this, R.raw.gymnastictr);
                    break;
                case R.id.handball:
                    mp = MediaPlayer.create(this, R.raw.handballtr);
                    break;
                case R.id.hockey:
                    mp = MediaPlayer.create(this, R.raw.hockeytr);
                    break;
                case R.id.horsemanship:
                    mp = MediaPlayer.create(this, R.raw.horsemanshiptr);
                    break;
                case R.id.iceskating:
                    mp = MediaPlayer.create(this, R.raw.iceskatingtr);
                    break;
                case R.id.karate:
                    mp = MediaPlayer.create(this, R.raw.karatetr);
                    break;
                case R.id.kickboxing:
                    mp = MediaPlayer.create(this, R.raw.kickboxingtr);
                    break;
                case R.id.painter:
                    mp = MediaPlayer.create(this, R.raw.paintertr);
                    break;
                case R.id.rowing:
                    mp = MediaPlayer.create(this, R.raw.rowingtr);
                    break;
                case R.id.sailing:
                    mp = MediaPlayer.create(this, R.raw.sailingtr);
                    break;
                case R.id.skate:
                    mp = MediaPlayer.create(this, R.raw.skatetr);
                    break;
                case R.id.skater:
                    mp = MediaPlayer.create(this, R.raw.skatertr);
                    break;
                case R.id.skiing:
                    mp = MediaPlayer.create(this, R.raw.skiingtr);
                    break;
                case R.id.snowboard:
                    mp = MediaPlayer.create(this, R.raw.snowboardtr);
                    break;
                case R.id.surf:
                    mp = MediaPlayer.create(this, R.raw.surftr);
                    break;
                case R.id.swimming:
                    mp = MediaPlayer.create(this, R.raw.swimmingtr);
                    break;
                case R.id.tabletennis:
                    mp = MediaPlayer.create(this, R.raw.tabletennistr);
                    break;
                case R.id.tennis:
                    mp = MediaPlayer.create(this, R.raw.tennistr);
                    break;
                case R.id.trekking:
                    mp = MediaPlayer.create(this, R.raw.trekkingtr);
                    break;
                case R.id.volleyball:
                    mp = MediaPlayer.create(this, R.raw.volleyballtr);
                    break;
                case R.id.waterpolo:
                    mp = MediaPlayer.create(this, R.raw.waterpolotr);
                    break;
                default:
                    return;
            }
        }
        mp.release();

    }

}
