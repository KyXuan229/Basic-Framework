package com.vogella.android.basicframework;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button foodBtn = (Button) findViewById(R.id.foodButton);
        foodBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), foodActivity.class);
                startIntent.putExtra( "com.vogella.android.basicframework.FOOD", "food list here");
                startActivity(startIntent);
            }
        });

        Button studyBtn = (Button) findViewById(R.id.studyButton);
        studyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), studyActivity.class);
                startIntent.putExtra( "com.vogella.android.basicframework.STUDY", "study list here");
                startActivity(startIntent);
            }
        });

        Button busBtn = (Button) findViewById(R.id.busButton);
        busBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), busActivity.class);
                startActivity(startIntent);
            }
        });

        Button mapBtn = (Button) findViewById(R.id.mapButton);
        mapBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), mapActivity.class);
                startActivity(startIntent);
            }
        });

    }
}
