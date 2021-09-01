/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BasicJavaConcepts;

import java.util.Scanner;

/**
 *
 * @author pbott
 */
public class HealthyHearts {
    public static void main(String args[]){
        //init code
        Scanner scan = new Scanner(System.in);
        int age, maxHeartRate, targetZoneLow, targetZoneHigh;
        
        
        System.out.println("What is your age?");
        age = Integer.parseInt(scan.nextLine()); //get our main value for this program
        maxHeartRate = 220 - age;
        targetZoneLow = maxHeartRate / 2; //calculate lower bound of heart rate
        targetZoneHigh = maxHeartRate * 17 / 20; //calculate upper bound of heart rate
        System.out.println("Your maximum heart rate should be: " + maxHeartRate + 
                " beats per minute.");
        System.out.println("Your target Heart Rate is " + targetZoneLow + " - " + targetZoneHigh +
                " beats per minute.");
    }
}
