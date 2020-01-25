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

    }




    public static void main(String[] args) {
        HabitModel myHabit = new HabitModel("Yoga", "14", "5", "5", "30");
        System.out.println()

    }




}
