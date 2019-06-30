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

public class numberButtonTur extends AppCompatActivity implements View.OnClickListener {

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
        setContentView(R.layout.activity_number_button_tur);

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
                mp = MediaPlayer.create(this, R.raw.zerotr);
                break;
            case R.id.oneButton:
                mp = MediaPlayer.create(this, R.raw.onetr);
                break;
            case R.id.twoButton:
                mp = MediaPlayer.create(this, R.raw.twotr);
                break;
            case R.id.threeButton:
                mp = MediaPlayer.create(this, R.raw.threetr);
                break;
            case R.id.fourButton:
                mp = MediaPlayer.create(this, R.raw.fourtr);
                break;
            case R.id.fiveButton:
                mp = MediaPlayer.create(this, R.raw.fivetr);
                break;
            case R.id.sixButton:
                mp = MediaPlayer.create(this, R.raw.sixtr);
                break;
            case R.id.sevenButton:
                mp = MediaPlayer.create(this, R.raw.seventr);
                break;
            case R.id.eightButton:
                mp = MediaPlayer.create(this, R.raw.eighttr);
                break;
            case R.id.nineButton:
                mp = MediaPlayer.create(this, R.raw.ninetr);
                break;
            case R.id.tenButton:
                mp = MediaPlayer.create(this, R.raw.tentr);
                break;
            case R.id.twentyButton:
                mp = MediaPlayer.create(this, R.raw.twentytr);
                break;
            case R.id.thirtyButton:
                mp = MediaPlayer.create(this, R.raw.thirtytr);
                break;
            case R.id.fortyButton:
                mp = MediaPlayer.create(this, R.raw.fortytr);
                break;
            case R.id.fiftyButton:
                mp = MediaPlayer.create(this, R.raw.fiftytr);
                break;
            case R.id.sixtyButton:
                mp = MediaPlayer.create(this, R.raw.sixtytr);
                break;
            case R.id.seventyButton:
                mp = MediaPlayer.create(this, R.raw.seventytr);
                break;
            case R.id.eightyButton:
                mp = MediaPlayer.create(this, R.raw.eightytr);
                break;
            case R.id.ninetyButton:
                mp = MediaPlayer.create(this, R.raw.ninetytr);
                break;
            case R.id.onehundredButton:
                mp = MediaPlayer.create(this, R.raw.onehundredtr);
                break;
            default:
                return;
        }
        mp.start();
        while (mp.isPlaying()) {
            switch(view.getId()){
                case R.id.zeroButton:
                    mp = MediaPlayer.create(this, R.raw.zerotr);
                    break;
                case R.id.oneButton:
                    mp = MediaPlayer.create(this, R.raw.onetr);
                    break;
                case R.id.twoButton:
                    mp = MediaPlayer.create(this, R.raw.twotr);
                    break;
                case R.id.threeButton:
                    mp = MediaPlayer.create(this, R.raw.threetr);
                    break;
                case R.id.fourButton:
                    mp = MediaPlayer.create(this, R.raw.fourtr);
                    break;
                case R.id.fiveButton:
                    mp = MediaPlayer.create(this, R.raw.fivetr);
                    break;
                case R.id.sixButton:
                    mp = MediaPlayer.create(this, R.raw.sixtr);
                    break;
                case R.id.sevenButton:
                    mp = MediaPlayer.create(this, R.raw.seventr);
                    break;
                case R.id.eightButton:
                    mp = MediaPlayer.create(this, R.raw.eighttr);
                    break;
                case R.id.nineButton:
                    mp = MediaPlayer.create(this, R.raw.ninetr);
                    break;
                case R.id.tenButton:
                    mp = MediaPlayer.create(this, R.raw.tentr);
                    break;
                case R.id.twentyButton:
                    mp = MediaPlayer.create(this, R.raw.twentytr);
                    break;
                case R.id.thirtyButton:
                    mp = MediaPlayer.create(this, R.raw.thirtytr);
                    break;
                case R.id.fortyButton:
                    mp = MediaPlayer.create(this, R.raw.fortytr);
                    break;
                case R.id.fiftyButton:
                    mp = MediaPlayer.create(this, R.raw.fiftytr);
                    break;
                case R.id.sixtyButton:
                    mp = MediaPlayer.create(this, R.raw.sixtytr);
                    break;
                case R.id.seventyButton:
                    mp = MediaPlayer.create(this, R.raw.seventytr);
                    break;
                case R.id.eightyButton:
                    mp = MediaPlayer.create(this, R.raw.eightytr);
                    break;
                case R.id.ninetyButton:
                    mp = MediaPlayer.create(this, R.raw.ninetytr);
                    break;
                case R.id.onehundredButton:
                    mp = MediaPlayer.create(this, R.raw.onehundredtr);
                    break;
                default:
                    return;
            }
        }
        mp.release();

    }
}
