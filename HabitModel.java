package com.example.deltahack;

import android.util.Log;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import static com.example.deltahack.MainActivity.myHabit;

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
        total = originalTime;
    }

    public String printHabit(){
        double originalTime = this.originalTime;
        double expectedTime = this.expectedTime;
        int timeFrame = this.timeFrame;
        String name = this.name;

        String result = String.format("Your new habit is " + name + "." + " Current time spent per day is: " + originalTime + " hours, Goal time per day is: "
        + expectedTime + " hours, Time-Frame for this habit is " +timeFrame + " days.");

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

        Double average = total / currentTimes.size();


        if (currentTimes.size() == timeFrame){
            DecimalFormat df = new DecimalFormat(".###");
            return "Your tracking period has ended!" + " Target time was " + expectedTime +" and your avg time per day was "
                    + df.format(average) + " hrs";
        }

        if(currentTimes.size() < 3){
            return ("Day " + currentTimes.size() + " submitted. Good job!");
        }

        if(currentTimes.size() >= 3) {
            DecimalFormat df = new DecimalFormat(".###");
            return ("Your average time per day is: " +  df.format(average) + " hour(s)");
        }

        return "";
    }

   /* public String Checker(){
        if(currentTimes.size() == expectedTime){
            return "Congrats! Your tracking period has ended";
            double avg = (total / currentTimes);
            if(myHabit.AverageTime() == expectedTime){
                return "You met your goal!";
            }
            if ( doubleme() > expectedTime){
                return "You exceeded your goal!";
            }
            else if(myHabit.AverageTime() < expectedTime){

            }
        }
    }
*/
    public static void main(String[] args) {

    }




}
