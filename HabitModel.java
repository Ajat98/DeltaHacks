package com.example.deltahack;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class HabitModel {

    private double originalTime;
    protected List<Double> currentTimes = new ArrayList<>();;
    private double expectedTime;
    private int timeFrame;
    protected String name;
    protected double total;

    public HabitModel(String n, String tF, String oT, String eT) {
        this.originalTime = Double.parseDouble(oT);
        this.expectedTime = Double.parseDouble(eT);
        this.timeFrame = Integer.parseInt(tF);
        this.name = n;
        total = 0;
    }

    public String printHabit(){
        double originalTime = this.originalTime;
        double expectedTime = this.expectedTime;
        int timeFrame = this.timeFrame;
        String name = this.name;

        String result = String.format("Your new habit is " + name + "." + " Current time spent per day is: " + originalTime + " hours, Goal time per day is: "
        + expectedTime + "hours, Time-Frame for this habit is " +timeFrame + " days.");

        return result;

    }

    public void printCurrentTimes() {
        for(Double currentTime: currentTimes) {
            Log.d("d", "printCurrentTimes: " + currentTime);
        }
    }

    /** print the average current time the user spending on the target activities from
     * start to current
     * @return
     */
    public String AverageTime() {
        if(currentTimes.size() >= 3) {
            return "Your average time per day is: " + Double.toString(total / currentTimes.size()) +" hour(s)";
        }
        return "";
    }

    public static void main(String[] args) {

    }




}
