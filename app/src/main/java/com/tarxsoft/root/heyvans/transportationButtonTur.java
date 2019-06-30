package com.tarxsoft.root.heyvans;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

public class transportationButtonTur extends AppCompatActivity implements View.OnClickListener{

    ImageButton aeroplane,ambulance,bicycle,boat,bulldozer,bus,cablecar,car,cargoship,concretemixer,crane,dumper,excavator,firetruck,golfcart,helicopter,hotairballoon,jeep,jet,jetski,lorry,motorcycle,police,roadroller,rocketship,sailboat,scooter,scooter1,segway,ship,speedboat,submarine,tank,taxi,tractor,train,tramway,ufo,unicycle,zeppelin;
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
        setContentView(R.layout.activity_transportation_button_tur);

        aeroplane=findViewById(R.id.aeroplane);
        aeroplane.setOnClickListener(this);
        ambulance=findViewById(R.id.ambulance);
        ambulance.setOnClickListener(this);
        bicycle=findViewById(R.id.bicycle);
        bicycle.setOnClickListener(this);
        boat=findViewById(R.id.boat);
        boat.setOnClickListener(this);
        bulldozer=findViewById(R.id.bulldozer);
        bulldozer.setOnClickListener(this);
        bus=findViewById(R.id.bus);
        bus.setOnClickListener(this);
        cablecar=findViewById(R.id.cablecar);
        cablecar.setOnClickListener(this);
        car=findViewById(R.id.car);
        car.setOnClickListener(this);
        cargoship=findViewById(R.id.cargoship);
        cargoship.setOnClickListener(this);
        concretemixer=findViewById(R.id.concretemixer);
        concretemixer.setOnClickListener(this);
        crane=findViewById(R.id.crane);
        crane.setOnClickListener(this);
        dumper=findViewById(R.id.dumper);
        dumper.setOnClickListener(this);
        excavator=findViewById(R.id.excavator);
        excavator.setOnClickListener(this);
        firetruck=findViewById(R.id.firetruck);
        firetruck.setOnClickListener(this);
        golfcart=findViewById(R.id.golfcart);
        golfcart.setOnClickListener(this);
        helicopter=findViewById(R.id.helicopter);
        helicopter.setOnClickListener(this);
        hotairballoon=findViewById(R.id.hotairballoon);
        hotairballoon.setOnClickListener(this);
        jeep=findViewById(R.id.jeep);
        jeep.setOnClickListener(this);
        jet=findViewById(R.id.jet);
        jet.setOnClickListener(this);
        jetski=findViewById(R.id.jetski);
        jetski.setOnClickListener(this);
        lorry=findViewById(R.id.lorry);
        lorry.setOnClickListener(this);
        motorcycle=findViewById(R.id.motorcycle);
        motorcycle.setOnClickListener(this);
        police=findViewById(R.id.police);
        police.setOnClickListener(this);
        roadroller=findViewById(R.id.roadroller);
        roadroller.setOnClickListener(this);
        rocketship=findViewById(R.id.rocketship);
        rocketship.setOnClickListener(this);
        sailboat=findViewById(R.id.sailboat);
        sailboat.setOnClickListener(this);
        scooter=findViewById(R.id.scooter);
        scooter.setOnClickListener(this);
        scooter1=findViewById(R.id.scooter1);
        scooter1.setOnClickListener(this);
        segway=findViewById(R.id.segway);
        segway.setOnClickListener(this);
        ship=findViewById(R.id.ship);
        ship.setOnClickListener(this);
        speedboat=findViewById(R.id.speedboat);
        speedboat.setOnClickListener(this);
        submarine=findViewById(R.id.submarine);
        submarine.setOnClickListener(this);
        tank=findViewById(R.id.tank);
        tank.setOnClickListener(this);
        taxi=findViewById(R.id.taxi);
        taxi.setOnClickListener(this);
        tractor=findViewById(R.id.tractor);
        tractor.setOnClickListener(this);
        train=findViewById(R.id.train);
        train.setOnClickListener(this);
        tramway=findViewById(R.id.tramway);
        tramway.setOnClickListener(this);
        ufo=findViewById(R.id.ufo);
        ufo.setOnClickListener(this);
        unicycle=findViewById(R.id.unicycle);
        unicycle.setOnClickListener(this);
        zeppelin=findViewById(R.id.zeppelin);
        zeppelin.setOnClickListener(this);
    }
    public void onClick(View view){
        switch(view.getId()){
            case R.id.aeroplane:
                mp = MediaPlayer.create(this, R.raw.aeroplanetr);
                break;
            case R.id.ambulance:
                mp = MediaPlayer.create(this, R.raw.ambulancetr);
                break;
            case R.id.bicycle:
                mp = MediaPlayer.create(this, R.raw.bicycletr);
                break;
            case R.id.boat:
                mp = MediaPlayer.create(this, R.raw.boattr);
                break;
            case R.id.bulldozer:
                mp = MediaPlayer.create(this, R.raw.bulldozertr);
                break;
            case R.id.bus:
                mp = MediaPlayer.create(this, R.raw.bustr);
                break;
            case R.id.cablecar:
                mp = MediaPlayer.create(this, R.raw.cablecartr);
                break;
            case R.id.car:
                mp = MediaPlayer.create(this, R.raw.cartr);
                break;
            case R.id.cargoship:
                mp = MediaPlayer.create(this, R.raw.cargoshiptr);
                break;
            case R.id.concretemixer:
                mp = MediaPlayer.create(this, R.raw.concretemixertr);
                break;
            case R.id.crane:
                mp = MediaPlayer.create(this, R.raw.cranetr);
                break;
            case R.id.dumper:
                mp = MediaPlayer.create(this, R.raw.dumpertr);
                break;
            case R.id.excavator:
                mp = MediaPlayer.create(this, R.raw.excavatortr);
                break;
            case R.id.firetruck:
                mp = MediaPlayer.create(this, R.raw.firetrucktr);
                break;
            case R.id.golfcart:
                mp = MediaPlayer.create(this, R.raw.golfcarttr);
                break;
            case R.id.helicopter:
                mp = MediaPlayer.create(this, R.raw.helicoptertr);
                break;
            case R.id.hotairballoon:
                mp = MediaPlayer.create(this, R.raw.hotairballoontr);
                break;
            case R.id.jeep:
                mp = MediaPlayer.create(this, R.raw.jeeptr);
                break;
            case R.id.jet:
                mp = MediaPlayer.create(this, R.raw.jettr);
                break;
            case R.id.jetski:
                mp = MediaPlayer.create(this, R.raw.jetskitr);
                break;
            case R.id.lorry:
                mp = MediaPlayer.create(this, R.raw.lorrytr);
                break;
            case R.id.motorcycle:
                mp = MediaPlayer.create(this, R.raw.motorcycletr);
                break;
            case R.id.police:
                mp = MediaPlayer.create(this, R.raw.policetr);
                break;
            case R.id.roadroller:
                mp = MediaPlayer.create(this, R.raw.roadrollertr);
                break;
            case R.id.rocketship:
                mp = MediaPlayer.create(this, R.raw.rocketshiptr);
                break;
            case R.id.sailboat:
                mp = MediaPlayer.create(this, R.raw.sailboattr);
                break;
            case R.id.scooter:
                mp = MediaPlayer.create(this, R.raw.scootertr);
                break;
            case R.id.scooter1:
                mp = MediaPlayer.create(this, R.raw.scooter1tr);
                break;
            case R.id.segway:
                mp = MediaPlayer.create(this, R.raw.segwaytr);
                break;
            case R.id.ship:
                mp = MediaPlayer.create(this, R.raw.shiptr);
                break;
            case R.id.speedboat:
                mp = MediaPlayer.create(this, R.raw.speedboattr);
                break;
            case R.id.submarine:
                mp = MediaPlayer.create(this, R.raw.submarinetr);
                break;
            case R.id.tank:
                mp = MediaPlayer.create(this, R.raw.tanktr);
                break;
            case R.id.taxi:
                mp = MediaPlayer.create(this, R.raw.taxitr);
                break;
            case R.id.tractor:
                mp = MediaPlayer.create(this, R.raw.tractortr);
                break;
            case R.id.train:
                mp = MediaPlayer.create(this, R.raw.traintr);
                break;
            case R.id.tramway:
                mp = MediaPlayer.create(this, R.raw.tramwaytr);
                break;
            case R.id.ufo:
                mp = MediaPlayer.create(this, R.raw.ufotr);
                break;
            case R.id.unicycle:
                mp = MediaPlayer.create(this, R.raw.unicycletr);
                break;
            case R.id.zeppelin:
                mp = MediaPlayer.create(this, R.raw.zeppelintr);
                break;
            default:
                return;
        }
        mp.start();
        while (mp.isPlaying()) {
            switch(view.getId()){
                case R.id.aeroplane:
                    mp = MediaPlayer.create(this, R.raw.aeroplanetr);
                    break;
                case R.id.ambulance:
                    mp = MediaPlayer.create(this, R.raw.ambulancetr);
                    break;
                case R.id.bicycle:
                    mp = MediaPlayer.create(this, R.raw.bicycletr);
                    break;
                case R.id.boat:
                    mp = MediaPlayer.create(this, R.raw.boattr);
                    break;
                case R.id.bulldozer:
                    mp = MediaPlayer.create(this, R.raw.bulldozertr);
                    break;
                case R.id.bus:
                    mp = MediaPlayer.create(this, R.raw.bustr);
                    break;
                case R.id.cablecar:
                    mp = MediaPlayer.create(this, R.raw.cablecartr);
                    break;
                case R.id.car:
                    mp = MediaPlayer.create(this, R.raw.cartr);
                    break;
                case R.id.cargoship:
                    mp = MediaPlayer.create(this, R.raw.cargoshiptr);
                    break;
                case R.id.concretemixer:
                    mp = MediaPlayer.create(this, R.raw.concretemixertr);
                    break;
                case R.id.crane:
                    mp = MediaPlayer.create(this, R.raw.cranetr);
                    break;
                case R.id.dumper:
                    mp = MediaPlayer.create(this, R.raw.dumpertr);
                    break;
                case R.id.excavator:
                    mp = MediaPlayer.create(this, R.raw.excavatortr);
                    break;
                case R.id.firetruck:
                    mp = MediaPlayer.create(this, R.raw.firetrucktr);
                    break;
                case R.id.golfcart:
                    mp = MediaPlayer.create(this, R.raw.golfcarttr);
                    break;
                case R.id.helicopter:
                    mp = MediaPlayer.create(this, R.raw.helicoptertr);
                    break;
                case R.id.hotairballoon:
                    mp = MediaPlayer.create(this, R.raw.hotairballoontr);
                    break;
                case R.id.jeep:
                    mp = MediaPlayer.create(this, R.raw.jeeptr);
                    break;
                case R.id.jet:
                    mp = MediaPlayer.create(this, R.raw.jettr);
                    break;
                case R.id.jetski:
                    mp = MediaPlayer.create(this, R.raw.jetskitr);
                    break;
                case R.id.lorry:
                    mp = MediaPlayer.create(this, R.raw.lorrytr);
                    break;
                case R.id.motorcycle:
                    mp = MediaPlayer.create(this, R.raw.motorcycletr);
                    break;
                case R.id.police:
                    mp = MediaPlayer.create(this, R.raw.policetr);
                    break;
                case R.id.roadroller:
                    mp = MediaPlayer.create(this, R.raw.roadrollertr);
                    break;
                case R.id.rocketship:
                    mp = MediaPlayer.create(this, R.raw.rocketshiptr);
                    break;
                case R.id.sailboat:
                    mp = MediaPlayer.create(this, R.raw.sailboattr);
                    break;
                case R.id.scooter:
                    mp = MediaPlayer.create(this, R.raw.scootertr);
                    break;
                case R.id.scooter1:
                    mp = MediaPlayer.create(this, R.raw.scooter1tr);
                    break;
                case R.id.segway:
                    mp = MediaPlayer.create(this, R.raw.segwaytr);
                    break;
                case R.id.ship:
                    mp = MediaPlayer.create(this, R.raw.shiptr);
                    break;
                case R.id.speedboat:
                    mp = MediaPlayer.create(this, R.raw.speedboattr);
                    break;
                case R.id.submarine:
                    mp = MediaPlayer.create(this, R.raw.submarinetr);
                    break;
                case R.id.tank:
                    mp = MediaPlayer.create(this, R.raw.tanktr);
                    break;
                case R.id.taxi:
                    mp = MediaPlayer.create(this, R.raw.taxitr);
                    break;
                case R.id.tractor:
                    mp = MediaPlayer.create(this, R.raw.tractortr);
                    break;
                case R.id.train:
                    mp = MediaPlayer.create(this, R.raw.traintr);
                    break;
                case R.id.tramway:
                    mp = MediaPlayer.create(this, R.raw.tramwaytr);
                    break;
                case R.id.ufo:
                    mp = MediaPlayer.create(this, R.raw.ufotr);
                    break;
                case R.id.unicycle:
                    mp = MediaPlayer.create(this, R.raw.unicycletr);
                    break;
                case R.id.zeppelin:
                    mp = MediaPlayer.create(this, R.raw.zeppelintr);
                    break;
                default:
                    return;
            }
        }
        mp.release();

    }
}
