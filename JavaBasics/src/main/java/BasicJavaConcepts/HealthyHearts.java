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
        Scanner scan = new Scanner(System.in);
        int age, maxHeartRate, targetZoneLow, targetZoneHigh;
        System.out.println("What is your age?");
        age = Integer.parseInt(scan.nextLine());
        maxHeartRate = 220 - age;
        targetZoneLow = maxHeartRate / 2;
        targetZoneHigh = maxHeartRate * 17 / 20;
        System.out.println("Your maximum heart rate should be: " + maxHeartRate + 
                " beats per minute.");
        System.out.println("Your target Heart Rate is " + targetZoneLow + " - " + targetZoneHigh +
                " beats per minute.");
    }
}
