package com.example.habit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void buttonClicked(View v){

        EditText nameView = (EditText) findViewById(R.id.habitName);
        String name = nameView.getText().toString();
        EditText timeFrameView = (EditText) findViewById(R.id.habitTF);
        String timeFrame = timeFrameView.getText().toString();
        EditText originalTimeView = (EditText) findViewById(R.id.originalTimeBox);
        String originalTime = originalTimeView.getText().toString();
        EditText expectedTimeView = (EditText) findViewById(R.id.expectedTimeBox);
        String expectedTime = expectedTimeView.getText().toString();
        String currentTime = originalTime;

        HabitModel myHabit = new HabitModel(name, timeFrame, originalTime, currentTime, expectedTime);
        String habitInfo = myHabit.printHabit();

        ((TextView) findViewById(R.id.answer)).setText(habitInfo);

    }

}
