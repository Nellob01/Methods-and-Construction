package com.company;

/**
 * Created by noelaniekan on 11/15/16.
 */
public class Kids {
    private String name;
    private int age;
    private boolean isMale;

    public Kids() { name = "steven"; }

    public Kids(String k) { name = k; }

    public Kids(int age) {

    }

    public String getName() { return name; }

    public void setName(String k) {
        if(isValidName(k)) {
            name = k; }
    }

    public static boolean isValidName(String name) {
        return name.contains(" ") && !name.isEmpty() && name.length() <= 20;
    }

    public int getAge() { return age; }

    public void setAge(int y) {
        if(y > 2) {
            age = y;
        }
    }

    public boolean isMale() { return isMale; }

    public void setMale(boolean Male) {
        isMale = Male;
    }




}
