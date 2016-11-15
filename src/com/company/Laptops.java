package com.company;

/**
 * Created by noelaniekan on 11/15/16.
 */
public class Laptops {
    private String brand;
    private boolean userFriendly;

    public Laptops() { brand = "apple"; }

    public Laptops(String b) { brand = b; }

    public String getBrand() { return brand; }

    public void setBrand(String b) {
        if(isValidBrand(b)) {
            brand = b;
        }
    }

    public static boolean isValidBrand(String brand) {
            return brand.contains("apple"); }

    public boolean userFriendly() { return userFriendly; }

    public void setUserFriendly( boolean userfriendly) {
        userFriendly = userfriendly;

    }

}
