package com.company;

/**
 * Created by noelaniekan on 11/15/16.
 */
public class States {
    private String name;
    private int population;
    private boolean isItSpring;

    public States() { name = "Arizona"; }

    public States( String n) { name = n; }

    public States(int population) {

    }

    public String getName() { return name; }

    public void setName(String n) {
        if(n.length() <= 15) {
            name = n;
        }
    }

    public int getPopulation() { return population; }

    public void setPopulation(int a) {
        if(a > 0) {
            population = a;
        }
    }

    public boolean isItSpring() { return isItSpring; }

    public void setSpring( boolean spring) {
        isItSpring = spring;
    }
}
