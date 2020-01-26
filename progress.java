package com.example.deltahack;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import static com.example.deltahack.MainActivity.myHabit;

public class progress extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.progress_page);
    }

    public void currentTimeSubmit(View V) {
        EditText currentTimeView = (EditText) findViewById(R.id.todayHrs);
        String currentTime = currentTimeView.getText().toString();
        myHabit.currentTimes.add(Double.parseDouble(currentTime));
        myHabit.total += Double.parseDouble(currentTime);
        myHabit.printCurrentTimes();
        myHabit.AverageTime();
    }

}
