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

public class numberButtonEng extends AppCompatActivity implements View.OnClickListener {

    ImageButton zero,one,two,three,four,five,six,seven,eight,nine,ten,twenty,thirty,forty,fifty,sixty,seventy,eighty,ninety,onehundred;
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
        setContentView(R.layout.activity_number_button_eng);

        zero=findViewById(R.id.zeroButton);
        zero.setOnClickListener(this);
        one=findViewById(R.id.oneButton);
        one.setOnClickListener(this);
        two=findViewById(R.id.twoButton);
        two.setOnClickListener(this);
        three=findViewById(R.id.threeButton);
        three.setOnClickListener(this);
        four=findViewById(R.id.fourButton);
        four.setOnClickListener(this);
        five=findViewById(R.id.fiveButton);
        five.setOnClickListener(this);
        six=findViewById(R.id.sixButton);
        six.setOnClickListener(this);
        seven=findViewById(R.id.sevenButton);
        seven.setOnClickListener(this);
        eight=findViewById(R.id.eightButton);
        eight.setOnClickListener(this);
        nine=findViewById(R.id.nineButton);
        nine.setOnClickListener(this);
        ten=findViewById(R.id.tenButton);
        ten.setOnClickListener(this);
        twenty=findViewById(R.id.twentyButton);
        twenty.setOnClickListener(this);
        thirty=findViewById(R.id.thirtyButton);
        thirty.setOnClickListener(this);
        forty=findViewById(R.id.fortyButton);
        forty.setOnClickListener(this);
        fifty=findViewById(R.id.fiftyButton);
        fifty.setOnClickListener(this);
        sixty=findViewById(R.id.sixtyButton);
        sixty.setOnClickListener(this);
        seventy=findViewById(R.id.seventyButton);
        seventy.setOnClickListener(this);
        eighty=findViewById(R.id.eightyButton);
        eighty.setOnClickListener(this);
        ninety=findViewById(R.id.ninetyButton);
        ninety.setOnClickListener(this);
        onehundred=findViewById(R.id.onehundredButton);
        onehundred.setOnClickListener(this);



    }

    public void onClick(View view){
        switch(view.getId()){
            case R.id.zeroButton:
                mp = MediaPlayer.create(this, R.raw.zero);
                break;
            case R.id.oneButton:
                mp = MediaPlayer.create(this, R.raw.one);
                break;
            case R.id.twoButton:
                mp = MediaPlayer.create(this, R.raw.two);
                break;
            case R.id.threeButton:
                mp = MediaPlayer.create(this, R.raw.three);
                break;
            case R.id.fourButton:
                mp = MediaPlayer.create(this, R.raw.four);
                break;
            case R.id.fiveButton:
                mp = MediaPlayer.create(this, R.raw.five);
                break;
            case R.id.sixButton:
                mp = MediaPlayer.create(this, R.raw.six);
                break;
            case R.id.sevenButton:
                mp = MediaPlayer.create(this, R.raw.seven);
                break;
            case R.id.eightButton:
                mp = MediaPlayer.create(this, R.raw.eight);
                break;
            case R.id.nineButton:
                mp = MediaPlayer.create(this, R.raw.nine);
                break;
            case R.id.tenButton:
                mp = MediaPlayer.create(this, R.raw.ten);
                break;
            case R.id.twentyButton:
                mp = MediaPlayer.create(this, R.raw.twenty);
                break;
            case R.id.thirtyButton:
                mp = MediaPlayer.create(this, R.raw.thirty);
                break;
            case R.id.fortyButton:
                mp = MediaPlayer.create(this, R.raw.forty);
                break;
            case R.id.fiftyButton:
                mp = MediaPlayer.create(this, R.raw.fifty);
                break;
            case R.id.sixtyButton:
                mp = MediaPlayer.create(this, R.raw.sixty);
                break;
            case R.id.seventyButton:
                mp = MediaPlayer.create(this, R.raw.seventy);
                break;
            case R.id.eightyButton:
                mp = MediaPlayer.create(this, R.raw.eighty);
                break;
            case R.id.ninetyButton:
                mp = MediaPlayer.create(this, R.raw.ninety);
                break;
            case R.id.onehundredButton:
                mp = MediaPlayer.create(this, R.raw.onehundred);
                break;
            default:
                return;
        }
        mp.start();
        while (mp.isPlaying()) {
            switch(view.getId()){
                case R.id.zeroButton:
                    mp = MediaPlayer.create(this, R.raw.zero);
                    break;
                case R.id.oneButton:
                    mp = MediaPlayer.create(this, R.raw.one);
                    break;
                case R.id.twoButton:
                    mp = MediaPlayer.create(this, R.raw.two);
                    break;
                case R.id.threeButton:
                    mp = MediaPlayer.create(this, R.raw.three);
                    break;
                case R.id.fourButton:
                    mp = MediaPlayer.create(this, R.raw.four);
                    break;
                case R.id.fiveButton:
                    mp = MediaPlayer.create(this, R.raw.five);
                    break;
                case R.id.sixButton:
                    mp = MediaPlayer.create(this, R.raw.six);
                    break;
                case R.id.sevenButton:
                    mp = MediaPlayer.create(this, R.raw.seven);
                    break;
                case R.id.eightButton:
                    mp = MediaPlayer.create(this, R.raw.eight);
                    break;
                case R.id.nineButton:
                    mp = MediaPlayer.create(this, R.raw.nine);
                    break;
                case R.id.tenButton:
                    mp = MediaPlayer.create(this, R.raw.ten);
                    break;
                case R.id.twentyButton:
                    mp = MediaPlayer.create(this, R.raw.twenty);
                    break;
                case R.id.thirtyButton:
                    mp = MediaPlayer.create(this, R.raw.thirty);
                    break;
                case R.id.fortyButton:
                    mp = MediaPlayer.create(this, R.raw.forty);
                    break;
                case R.id.fiftyButton:
                    mp = MediaPlayer.create(this, R.raw.fifty);
                    break;
                case R.id.sixtyButton:
                    mp = MediaPlayer.create(this, R.raw.sixty);
                    break;
                case R.id.seventyButton:
                    mp = MediaPlayer.create(this, R.raw.seventy);
                    break;
                case R.id.eightyButton:
                    mp = MediaPlayer.create(this, R.raw.eighty);
                    break;
                case R.id.ninetyButton:
                    mp = MediaPlayer.create(this, R.raw.ninety);
                    break;
                case R.id.onehundredButton:
                    mp = MediaPlayer.create(this, R.raw.onehundred);
                    break;
                default:
                    return;
            }
        }
        mp.release();

    }
}
