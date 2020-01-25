package com.example.deltahack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.deltahack.gainHabbit;
import com.example.deltahack.R;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    HabitModel myHabit;

    public void buttonClicked(View v){

        EditText nameView = (EditText) findViewById(R.id.habitName);
        String name = nameView.getText().toString();
        EditText timeFrameView = (EditText) findViewById(R.id.habitTF);
        String timeFrame = timeFrameView.getText().toString();
        EditText originalTimeView = (EditText) findViewById(R.id.originalTimeBox);
        String originalTime = originalTimeView.getText().toString();
        EditText expectedTimeView = (EditText) findViewById(R.id.expectedTimeBox);
        String expectedTime = expectedTimeView.getText().toString();

        myHabit = new HabitModel(name, timeFrame, originalTime, expectedTime);
        String habitInfo = myHabit.printHabit();

        ((TextView) findViewById(R.id.answer)).setText(habitInfo);
    }

    public void currentTimeSubmit(View V) {
        EditText currentTimeView = (EditText) findViewById(R.id.todayHrs);
        String currentTime = currentTimeView.getText().toString();
        myHabit.currentTimes.add(Double.parseDouble(currentTime));
        myHabit.printCurrentTimes();
//        myHabit.printAverage();
    }

    /** Called when the user taps the Send button */
    public void gainHabbit(View view) {
        Intent intent = new Intent(this, gainHabbit.class);
        startActivity(intent);
    }

    public void progress(View view) {
        Intent intent = new Intent(this, progress.class);
        startActivity(intent);
    }
}
