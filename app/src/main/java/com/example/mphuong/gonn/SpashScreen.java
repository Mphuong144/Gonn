package com.example.mphuong.gonn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SpashScreen extends AppCompatActivity {
    private ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spash_screen);

        img = (ImageView) findViewById(R.id.imageView4);
        Animation ani = AnimationUtils.loadAnimation(this,R.anim.transition);
        img.startAnimation(ani);

        final Intent home = new Intent(this, MainActivity.class);
        Thread timer = new Thread(){
            public void run () {
                try {
                    sleep(3000);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
                finally {
                    startActivity(home);
                    finish();
                }
            }
        };
        timer.start();
    }
}
