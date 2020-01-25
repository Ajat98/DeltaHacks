package com.example.habit;

public class HabitModel {

    private double originalTime;
    private double currentTime;
    private double expectedTime;
    private int timeFrame;
    private String name;

    public HabitModel(String n, String tF, String oT, String cT, String eT) {
        this.originalTime = Double.parseDouble(oT);
        this.currentTime = Double.parseDouble(cT);
        this.expectedTime = Double.parseDouble(eT);
        this.timeFrame = Integer.parseInt(tF);
        this.name = n;


    }

    public String printHabit(){
        double originalTime = this.originalTime;
        double currentTime = this.currentTime;
        double expectedTime = this.expectedTime;
        int timeFrame = this.timeFrame;
        String name = this.name;

        String result = String.format("Your new habit is " + name + "." + " Current time spent per day is: " + currentTime + " hours, Goal time per day is: "
        + expectedTime + "hours, Time-Frame for this habit is " +timeFrame + " days.");

        return result;

    }


    public static void main(String[] args) {
        HabitModel myHabit = new HabitModel("Yoga", "14", "5", "5", "30");
        System.out.println(myHabit.printHabit());

    }




}
