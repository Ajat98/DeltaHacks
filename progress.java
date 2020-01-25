package com.example.deltahack;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class progress extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.progress_page);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
//        TextView textView = (TextView) findViewById(R.id.textView);
//        textView.setText(message);
    }
}
