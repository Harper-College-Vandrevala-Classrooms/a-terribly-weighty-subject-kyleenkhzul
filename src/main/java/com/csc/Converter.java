package com.csc;

public class Converter {

  // This function converts ounces to pounds. The return is pounds as a decimal with four decimal places.
  public String toPounds(int ounces) {
    double conversion = ounces / 16.0;
    if (conversion == 1.0) {
        return String.format("%.4f lb", conversion);
    } else {
        return String.format("%.4f lbs", conversion);
    }
}

  // This function overloads the toPounds function to automatically set ounces to 0 if nothing is passed in. 
  public String toPounds() {
    return toPounds(0);
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

  // This function overloads the toPoundsAndOunces function to automatically set ounces to 0 if nothing is passed in. 
  public String toPoundsAndOunces() {
    return toPoundsAndOunces(0);
  } 

  // This function converts pounds and ounces to ounces. The return is a formatted # of oz.
  public String toOunces(int pounds, int ounces) {
    int totalOunces = pounds*16 + ounces;
    return totalOunces + " ounces";
  }

}

