package com.vogella.android.basicframework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class studyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study);

        if (getIntent().hasExtra("com.vogella.android.basicframework.STUDY")) {
            TextView tv = (TextView) findViewById(R.id.studyTextView);
            String text = getIntent().getExtras().getString("com.vogella.android.basicframework.STUDY");
            tv.setText(text);
        }

        Button back = (Button) findViewById(R.id.studyBackBtn);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(startIntent);
            }
        });
    }
}
