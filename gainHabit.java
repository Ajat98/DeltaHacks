package com.example.deltahack;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


import static com.example.deltahack.MainActivity.myHabit;

public class gainHabit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.make_habit);


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
        /*
        myHabit = new HabitModel(name, timeFrame, originalTime, expectedTime);
        String habitInfo = myHabit.printHabit();

        ((TextView) findViewById(R.id.answer)).setText(habitInfo);
        */
        if(name.equals("") || timeFrame.equals("") || originalTime.equals("") || expectedTime.equals("")) {
            ((TextView) findViewById(R.id.answer)).setText("Please fill out all text fields");
        }
        else{
            myHabit = new HabitModel(name, timeFrame, originalTime, expectedTime);
            String habitInfo = myHabit.printHabit();
            ((TextView) findViewById(R.id.answer)).setText(habitInfo);
        }
    }

}
