package com.example.deltahack;

import java.util.ArrayList;
import java.util.List;

public class HabitModel {

    private double originalTime;
    protected List<Double> currentTimes = new ArrayList<>();;
    private double expectedTime;
    private int timeFrame;
    private String name;

    public HabitModel(String n, String tF, String oT, String eT) {
        this.originalTime = Double.parseDouble(oT);
        this.expectedTime = Double.parseDouble(eT);
        this.timeFrame = Integer.parseInt(tF);
        this.name = n;
        currentTimes.add(this.originalTime);
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
            System.out.println(currentTime + " ");
        }
    }

    /** print the average current time the user spending on the target activities from
     * start to current
     * @return
     */
//    public String printAverage() {
//        if(currentTimes.size() > 3) {
//
//        }
//    }
    public static void main(String[] args) {

    }




}
