package com.company;

/**
 * Created by noelaniekan on 11/15/16.
 */
public class Automobiles {
    private String make;
    private int yearMade;
    private boolean isNew;

    public static String color = "Black";

    public Automobiles() { make = "BMW"; }

    public Automobiles(String m) { make = m; }

    public Automobiles(int yearMade) {

    }

    public String getMake() { return make; }

    public void setMake(String m) {
        if(isValidMake(m)) {
            make = m;
        }
    }

    public static boolean isValidMake (String make) {
        return !make.isEmpty();
    }

    public int getYearMade() { return yearMade; }

    public void setYearMade( int x) {
        if(x > 2014) {
            yearMade = x;
        }
    }

    public boolean isNew() { return isNew; }

    public void setNew ( boolean New) {
        isNew = New;
    }





}
