package com.tarxsoft.root.heyvans;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class aboutButton extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //fullscreen - start
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //fullscreen - end

        setContentView(R.layout.activity_about_button);

        //twitter button - start
        final ImageButton twitter = (ImageButton)findViewById(R.id.twitter);
            twitter.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    Intent twitterIntent = new Intent();
                    twitterIntent.setAction(Intent.ACTION_VIEW);
                    twitterIntent.addCategory(Intent.CATEGORY_BROWSABLE);
                    twitterIntent.setData(Uri.parse("https://www.twitter.com/speducapp/"));
                    startActivity(twitterIntent);
                }
            });
        //twitter button - end

        //instagram button - start
        ImageButton instagram = (ImageButton)findViewById(R.id.instagram);
            instagram.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View v) {
                    Intent instagramIntent = new Intent();
                    instagramIntent.setAction(Intent.ACTION_VIEW);
                    instagramIntent.addCategory(Intent.CATEGORY_BROWSABLE);
                    instagramIntent.setData(Uri.parse("https://www.instagram.com/speducapp/"));
                    startActivity(instagramIntent);
                }
            });
        //instagram button - end
    }
}
