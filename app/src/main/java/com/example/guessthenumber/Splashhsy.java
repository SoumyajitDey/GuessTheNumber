package com.example.guessthenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Splashhsy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashhsy);

        getSupportActionBar().setTitle("?1?2?3?4?5?6?7?8??1?2?3?4?5?1?12?");

        LogoLauncher logoLauncher = new LogoLauncher();
        logoLauncher.start();
    }

    private class LogoLauncher extends Thread {
        public void run(){
            try{
             sleep(2000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

            Intent intent = new Intent(Splashhsy.this,MainActivity.class);
            startActivity(intent);
            Splashhsy.this.finish();
        }
    }



}


