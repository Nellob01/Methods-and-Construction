package com.company;

/**
 * Created by noelaniekan on 11/15/16.
 */
public class Phones {
    private String type;
    private boolean isRefurblished;

    public Phones() { type = "Samsung"; }

    public Phones(String t) { type = t; }

    public String getType() { return type; }

    public void setType(String t) {
        if(isValidType(t)) {
            type = t;
        }

    }
    public static boolean isValidType(String type) {
        return type.contains(" ") && !type.isEmpty() && type.length() <=20;
    }

    public boolean isRefurblished() { return isRefurblished; }

    public void setRefurblished( boolean Refurblished ) {
        isRefurblished = Refurblished;
    }
}
