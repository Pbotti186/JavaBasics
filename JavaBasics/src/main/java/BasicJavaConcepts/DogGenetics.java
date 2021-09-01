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
        //init code
        String[] dogTypes = {"Afghan Hound", "Akita", "American Bulldog", "Appenzeller Sennenhund", "Azawakh", "Basset Hound", "Beagle",
        "Bichon Frise", "Bloodhound", "Braque du Bourbonnais", "Cardigan Welsh Corgi", "Doge"};
        String[] dogChoices = new String[5];
        int[] dogPercentages = new int[5];
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        String name;
        int random = 0;
        
        
        System.out.println("What is your dog's name?");
        name = scan.nextLine(); //get dog 
        
        System.out.println("Well then, I have this highly reliable report on " + name + "'s prestigious background right here.");
        System.out.println(name + " is: ");
        
        int i =0;
        int percentSum = 0;
        for (i = 0; i < dogChoices.length; i ++){
            if(i == 0) //first iteration, we have 100% to choose from
                dogPercentages[i] = (rand.nextInt(100) + 1);
            else{
                if(i == 5){ // last iteration we have to take whatevers left to add to 100%
                    dogPercentages[i] = 100 - percentSum;
                }
                else{
                    if(100-percentSum <= 0) //have to account for cases when there is no more percentage to take
                        dogPercentages[i] = 0;
                    else//take a random percentage of whats left
                        dogPercentages[i] = (rand.nextInt(100-percentSum) + 1);
                }
            }
            percentSum += dogPercentages[i]; //make sure to keep track of how much percentage we used already
            random = rand.nextInt(dogTypes.length);
            dogChoices[i] = dogTypes[random];//get a random breed from our initial list
            System.out.println(dogPercentages[i] + "% " + dogChoices[i]);
        }
        System.out.println("\nThat's a weird looking dog!");
        
    }
}
