package com.example.homepc.restauranteatitapp;


        import android.animation.ObjectAnimator;
        import android.content.Intent;
        import android.os.Bundle;
        import android.os.Handler;
        import android.support.v7.app.AppCompatActivity;
        import android.widget.ProgressBar;

public class Splash extends AppCompatActivity {
    ProgressBar splashProgress;
    int SPLASH_TIME = 3000; //This is 3 seconds

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashProgress = findViewById(R.id.splashProgress);
        playProgress();
//Code to start timer and take action after the timer ends
        new Handler(getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(Splash.this,LoginOptionsPage.class);
                startActivity(i);
                finish();
            }
        }, SPLASH_TIME);
    }
    //Method to run progress bar for 5 seconds
    private void playProgress() {
        ObjectAnimator.ofInt(splashProgress, "progress", 100)
                .setDuration(3000)
                .start();
    }

}
