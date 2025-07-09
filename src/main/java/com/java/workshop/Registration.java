package com.java.workshop;

import java.time.LocalTime;

public class Registration {
    public static void main(String[] args) {
        LocalTime currentTime=LocalTime.now();
        LocalTime RegistrationLocalTime=LocalTime.of(18, 59, 55);
        int hoursLeft=RegistrationLocalTime.getHour()-currentTime.getHour();
        int minuteLeft=RegistrationLocalTime.getMinute()-currentTime.getMinute();
        int secondLeft=RegistrationLocalTime.getSecond()-currentTime.getSecond();
        System.out.println("You have "+hoursLeft +"hours, "+minuteLeft +"minutes, "+secondLeft +"seconds,");
     
    
    
      }

}
