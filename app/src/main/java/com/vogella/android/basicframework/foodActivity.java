package com.vogella.android.basicframework;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class foodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        if (getIntent().hasExtra("com.vogella.android.basicframework.FOOD")) {
            TextView tv = (TextView) findViewById(R.id.foodTextView);
            String text = getIntent().getExtras().getString("com.vogella.android.basicframework.FOOD");
            tv.setText(text);
        }

        Button back = (Button) findViewById(R.id.foodBackBtn);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(startIntent);
            }
        });
    }
}


