package com.csc;

public class Converter {

  // This function converts ounces to pounds. The return is pounds as a decimal
  public String toPounds(int ounces) {
    double conversion = ounces/16.0;
    if(conversion == 1.0) {
      return conversion + "lb";
    }
    else {
      return conversion + "lbs";
    }
  }

  // This function converts ounces to pounds and ounces. The return is a formatted lbs and oz ints. 
  public String toPoundsAndOunces(int ounces) {
    int remainingOunces = ounces % 16;
    int pounds = ounces / 16;
    if(pounds == 1) {
      return pounds + " lb " + remainingOunces + " oz";
    }
    else {
      return pounds + " lbs " + remainingOunces + " oz";
    }
  } 

}

