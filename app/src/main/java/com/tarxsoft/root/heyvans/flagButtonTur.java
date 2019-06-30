package com.tarxsoft.root.heyvans;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

public class flagButtonTur extends AppCompatActivity implements View.OnClickListener{

    ImageButton argentina,australia,azerbaijan,belgium,bosniaandherzegovina,brazil,canada,china,croatia,czechrepublic,egypt,england,france,germany,greece,india,iran,italy,japan,macedonia,mexico,montenegro,netherlands,newzealand,norway,palestine,poland,portugal,romania,russia,saudiarabia,senegal,southafrica,southkorea,spain,sweden,switzerland,turkey,ukraine,unitedstates;
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
        setContentView(R.layout.activity_flags_button_tur);

        argentina=findViewById(R.id.argentina);
        argentina.setOnClickListener(this);
        australia=findViewById(R.id.australia);
        australia.setOnClickListener(this);
        azerbaijan=findViewById(R.id.azerbaijan);
        azerbaijan.setOnClickListener(this);
        belgium=findViewById(R.id.belgium);
        belgium.setOnClickListener(this);
        bosniaandherzegovina=findViewById(R.id.bosniaandherzegovina);
        bosniaandherzegovina.setOnClickListener(this);
        brazil=findViewById(R.id.brazil);
        brazil.setOnClickListener(this);
        canada=findViewById(R.id.canada);
        canada.setOnClickListener(this);
        china=findViewById(R.id.china);
        china.setOnClickListener(this);
        croatia=findViewById(R.id.croatia);
        croatia.setOnClickListener(this);
        czechrepublic=findViewById(R.id.czechrepublic);
        czechrepublic.setOnClickListener(this);
        egypt=findViewById(R.id.egypt);
        egypt.setOnClickListener(this);
        england=findViewById(R.id.england);
        england.setOnClickListener(this);
        france=findViewById(R.id.france);
        france.setOnClickListener(this);
        germany=findViewById(R.id.germany);
        germany.setOnClickListener(this);
        greece=findViewById(R.id.greece);
        greece.setOnClickListener(this);
        india=findViewById(R.id.india);
        india.setOnClickListener(this);
        iran=findViewById(R.id.iran);
        iran.setOnClickListener(this);
        italy=findViewById(R.id.italy);
        italy.setOnClickListener(this);
        japan=findViewById(R.id.japan);
        japan.setOnClickListener(this);
        macedonia=findViewById(R.id.macedonia);
        macedonia.setOnClickListener(this);
        mexico=findViewById(R.id.mexico);
        mexico.setOnClickListener(this);
        montenegro=findViewById(R.id.montenegro);
        montenegro.setOnClickListener(this);
        netherlands=findViewById(R.id.netherlands);
        netherlands.setOnClickListener(this);
        newzealand=findViewById(R.id.newzealand);
        newzealand.setOnClickListener(this);
        norway=findViewById(R.id.norway);
        norway.setOnClickListener(this);
        palestine=findViewById(R.id.palestine);
        palestine.setOnClickListener(this);
        poland=findViewById(R.id.poland);
        poland.setOnClickListener(this);
        portugal=findViewById(R.id.portugal);
        portugal.setOnClickListener(this);
        romania=findViewById(R.id.romania);
        romania.setOnClickListener(this);
        russia=findViewById(R.id.russia);
        russia.setOnClickListener(this);
        saudiarabia=findViewById(R.id.saudiarabia);
        saudiarabia.setOnClickListener(this);
        senegal=findViewById(R.id.senegal);
        senegal.setOnClickListener(this);
        southafrica=findViewById(R.id.southafrica);
        southafrica.setOnClickListener(this);
        southkorea=findViewById(R.id.southkorea);
        southkorea.setOnClickListener(this);
        spain=findViewById(R.id.spain);
        spain.setOnClickListener(this);
        sweden=findViewById(R.id.sweden);
        sweden.setOnClickListener(this);
        switzerland=findViewById(R.id.switzerland);
        switzerland.setOnClickListener(this);
        turkey=findViewById(R.id.turkey);
        turkey.setOnClickListener(this);
        ukraine=findViewById(R.id.ukraine);
        ukraine.setOnClickListener(this);
        unitedstates=findViewById(R.id.unitedstates);
        unitedstates.setOnClickListener(this);
    }
    public void onClick(View view){
        switch(view.getId()){
            case R.id.argentina:
                mp = MediaPlayer.create(this, R.raw.argentinatr);
                break;
            case R.id.australia:
                mp = MediaPlayer.create(this, R.raw.australiatr);
                break;
            case R.id.azerbaijan:
                mp = MediaPlayer.create(this, R.raw.azerbaijantr);
                break;
            case R.id.belgium:
                mp = MediaPlayer.create(this, R.raw.belgiumtr);
                break;
            case R.id.bosniaandherzegovina:
                mp = MediaPlayer.create(this, R.raw.bosniaandherzegovinatr);
                break;
            case R.id.brazil:
                mp = MediaPlayer.create(this, R.raw.braziltr);
                break;
            case R.id.canada:
                mp = MediaPlayer.create(this, R.raw.canadatr);
                break;
            case R.id.china:
                mp = MediaPlayer.create(this, R.raw.chinatr);
                break;
            case R.id.croatia:
                mp = MediaPlayer.create(this, R.raw.croatiatr);
                break;
            case R.id.czechrepublic:
                mp = MediaPlayer.create(this, R.raw.czechrepublictr);
                break;
            case R.id.egypt:
                mp = MediaPlayer.create(this, R.raw.egypttr);
                break;
            case R.id.england:
                mp = MediaPlayer.create(this, R.raw.englandtr);
                break;
            case R.id.france:
                mp = MediaPlayer.create(this, R.raw.francetr);
                break;
            case R.id.germany:
                mp = MediaPlayer.create(this, R.raw.germanytr);
                break;
            case R.id.greece:
                mp = MediaPlayer.create(this, R.raw.greecetr);
                break;
            case R.id.india:
                mp = MediaPlayer.create(this, R.raw.indiatr);
                break;
            case R.id.iran:
                mp = MediaPlayer.create(this, R.raw.irantr);
                break;
            case R.id.italy:
                mp = MediaPlayer.create(this, R.raw.italytr);
                break;
            case R.id.japan:
                mp = MediaPlayer.create(this, R.raw.japantr);
                break;
            case R.id.macedonia:
                mp = MediaPlayer.create(this, R.raw.macedoniatr);
                break;
            case R.id.mexico:
                mp = MediaPlayer.create(this, R.raw.mexicotr);
                break;
            case R.id.montenegro:
                mp = MediaPlayer.create(this, R.raw.montenegrotr);
                break;
            case R.id.netherlands:
                mp = MediaPlayer.create(this, R.raw.netherlandstr);
                break;
            case R.id.newzealand:
                mp = MediaPlayer.create(this, R.raw.newzealandtr);
                break;
            case R.id.norway:
                mp = MediaPlayer.create(this, R.raw.norwaytr);
                break;
            case R.id.palestine:
                mp = MediaPlayer.create(this, R.raw.palestinetr);
                break;
            case R.id.poland:
                mp = MediaPlayer.create(this, R.raw.polandtr);
                break;
            case R.id.portugal:
                mp = MediaPlayer.create(this, R.raw.portugaltr);
                break;
            case R.id.romania:
                mp = MediaPlayer.create(this, R.raw.romaniatr);
                break;
            case R.id.russia:
                mp = MediaPlayer.create(this, R.raw.russiatr);
                break;
            case R.id.saudiarabia:
                mp = MediaPlayer.create(this, R.raw.saudiarabiatr);
                break;
            case R.id.senegal:
                mp = MediaPlayer.create(this, R.raw.senegaltr);
                break;
            case R.id.southafrica:
                mp = MediaPlayer.create(this, R.raw.southafricatr);
                break;
            case R.id.southkorea:
                mp = MediaPlayer.create(this, R.raw.southkoreatr);
                break;
            case R.id.spain:
                mp = MediaPlayer.create(this, R.raw.spaintr);
                break;
            case R.id.sweden:
                mp = MediaPlayer.create(this, R.raw.swedentr);
                break;
            case R.id.switzerland:
                mp = MediaPlayer.create(this, R.raw.switzerlandtr);
                break;
            case R.id.turkey:
                mp = MediaPlayer.create(this, R.raw.turkeytr);
                break;
            case R.id.ukraine:
                mp = MediaPlayer.create(this, R.raw.ukrainetr);
                break;
            case R.id.unitedstates:
                mp = MediaPlayer.create(this, R.raw.unitedstatestr);
                break;
            default:
                return;
        }
        mp.start();
        while (mp.isPlaying()) {
            switch(view.getId()){
                case R.id.argentina:
                    mp = MediaPlayer.create(this, R.raw.argentinatr);
                    break;
                case R.id.australia:
                    mp = MediaPlayer.create(this, R.raw.australiatr);
                    break;
                case R.id.azerbaijan:
                    mp = MediaPlayer.create(this, R.raw.azerbaijantr);
                    break;
                case R.id.belgium:
                    mp = MediaPlayer.create(this, R.raw.belgiumtr);
                    break;
                case R.id.bosniaandherzegovina:
                    mp = MediaPlayer.create(this, R.raw.bosniaandherzegovinatr);
                    break;
                case R.id.brazil:
                    mp = MediaPlayer.create(this, R.raw.braziltr);
                    break;
                case R.id.canada:
                    mp = MediaPlayer.create(this, R.raw.canadatr);
                    break;
                case R.id.china:
                    mp = MediaPlayer.create(this, R.raw.chinatr);
                    break;
                case R.id.croatia:
                    mp = MediaPlayer.create(this, R.raw.croatiatr);
                    break;
                case R.id.czechrepublic:
                    mp = MediaPlayer.create(this, R.raw.czechrepublictr);
                    break;
                case R.id.egypt:
                    mp = MediaPlayer.create(this, R.raw.egypttr);
                    break;
                case R.id.england:
                    mp = MediaPlayer.create(this, R.raw.englandtr);
                    break;
                case R.id.france:
                    mp = MediaPlayer.create(this, R.raw.francetr);
                    break;
                case R.id.germany:
                    mp = MediaPlayer.create(this, R.raw.germanytr);
                    break;
                case R.id.greece:
                    mp = MediaPlayer.create(this, R.raw.greecetr);
                    break;
                case R.id.india:
                    mp = MediaPlayer.create(this, R.raw.indiatr);
                    break;
                case R.id.iran:
                    mp = MediaPlayer.create(this, R.raw.irantr);
                    break;
                case R.id.italy:
                    mp = MediaPlayer.create(this, R.raw.italytr);
                    break;
                case R.id.japan:
                    mp = MediaPlayer.create(this, R.raw.japantr);
                    break;
                case R.id.macedonia:
                    mp = MediaPlayer.create(this, R.raw.macedoniatr);
                    break;
                case R.id.mexico:
                    mp = MediaPlayer.create(this, R.raw.mexicotr);
                    break;
                case R.id.montenegro:
                    mp = MediaPlayer.create(this, R.raw.montenegrotr);
                    break;
                case R.id.netherlands:
                    mp = MediaPlayer.create(this, R.raw.netherlandstr);
                    break;
                case R.id.newzealand:
                    mp = MediaPlayer.create(this, R.raw.newzealandtr);
                    break;
                case R.id.norway:
                    mp = MediaPlayer.create(this, R.raw.norwaytr);
                    break;
                case R.id.palestine:
                    mp = MediaPlayer.create(this, R.raw.palestinetr);
                    break;
                case R.id.poland:
                    mp = MediaPlayer.create(this, R.raw.polandtr);
                    break;
                case R.id.portugal:
                    mp = MediaPlayer.create(this, R.raw.portugaltr);
                    break;
                case R.id.romania:
                    mp = MediaPlayer.create(this, R.raw.romaniatr);
                    break;
                case R.id.russia:
                    mp = MediaPlayer.create(this, R.raw.russiatr);
                    break;
                case R.id.saudiarabia:
                    mp = MediaPlayer.create(this, R.raw.saudiarabiatr);
                    break;
                case R.id.senegal:
                    mp = MediaPlayer.create(this, R.raw.senegaltr);
                    break;
                case R.id.southafrica:
                    mp = MediaPlayer.create(this, R.raw.southafricatr);
                    break;
                case R.id.southkorea:
                    mp = MediaPlayer.create(this, R.raw.southkoreatr);
                    break;
                case R.id.spain:
                    mp = MediaPlayer.create(this, R.raw.spaintr);
                    break;
                case R.id.sweden:
                    mp = MediaPlayer.create(this, R.raw.swedentr);
                    break;
                case R.id.switzerland:
                    mp = MediaPlayer.create(this, R.raw.switzerlandtr);
                    break;
                case R.id.turkey:
                    mp = MediaPlayer.create(this, R.raw.turkeytr);
                    break;
                case R.id.ukraine:
                    mp = MediaPlayer.create(this, R.raw.ukrainetr);
                    break;
                case R.id.unitedstates:
                    mp = MediaPlayer.create(this, R.raw.unitedstatestr);
                    break;
                default:
                    return;
            }
        }
        mp.release();

    }
}
