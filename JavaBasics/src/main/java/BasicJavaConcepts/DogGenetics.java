/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BasicJavaConcepts;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author pbott
 */
public class DogGenetics {
    public static void main(String args[]){
        String[] dogTypes = {"Afghan Hound", "Akita", "American Bulldog", "Appenzeller Sennenhund", "Azawakh", "Basset Hound", "Beagle",
        "Bichon Frise", "Bloodhound", "Braque du Bourbonnais", "Cardigan Welsh Corgi", "Doge"};
        String[] dogChoices = new String[5];
        int[] dogPercentages = new int[5];
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        String name;
        int random = 0;
        System.out.println("What is your dog's name?");
        name = scan.nextLine();
        
        System.out.println("Well then, I have this highly reliable report on " + name + "'s prestigious background right here.");
        System.out.println(name + " is: ");
        
        int i =0;
        int percentSum = 0;
        for (i = 0; i < dogChoices.length; i ++){
            if(i == 0)
                dogPercentages[i] = (rand.nextInt(100) + 1);
            else{
                if(i == 5){
                    dogPercentages[i] = 100 - percentSum;
                }
                else{
                    if(100-percentSum <= 0)
                        dogPercentages[i] = 0;
                    else
                    dogPercentages[i] = (rand.nextInt(100-percentSum) + 1);
                }
            }
            percentSum += dogPercentages[i];
            random = rand.nextInt(dogTypes.length);
            dogChoices[i] = dogTypes[random];
            System.out.println(dogPercentages[i] + "% " + dogChoices[i]);
        }
        System.out.println("\nThat's a weird looking dog!");
        
    }
}
