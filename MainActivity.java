package com.example.deltahack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.example.deltahack.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gainHabit(View view) {
        Intent intent = new Intent(this, gainHabit.class);
        startActivity(intent);
    }

    public void loseHabit(View view) {
        Intent intent = new Intent(this, loseHabit.class);
        startActivity(intent);
    }
    public void progress(View view) {
        Intent intent = new Intent(this, progress.class);
        startActivity(intent);
    }

    public static HabitModel myHabit;



}
