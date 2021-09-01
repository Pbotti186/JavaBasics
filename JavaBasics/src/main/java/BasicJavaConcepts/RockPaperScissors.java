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
public class RockPaperScissors {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String response;
        boolean playGame = true;
        
        while(playGame){
            playGame();
            System.out.println("Would you like to play again?");
            response = scan.nextLine();
            if(response.equals("No")){
                System.out.println("Thank you for playing!");
                playGame = false;
            }
        }
        
        
    }
    
    public static void playGame(){
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int rounds = 1;
        int ties = 0;
        int playerWins = 0;
        int playerLosses = 0;
        
        System.out.println("How many rounds would you like to play? (Pick a value 1-10)");
        rounds = Integer.parseInt(scan.nextLine());
        if(rounds > 10 || rounds < 1){
            System.out.println(rounds + " is not a valid input.");
            System.exit(0);
        }
        
        int i;
        int choice = 0;
        int compChoice = 0;
        for (i = 0; i < rounds; i++){
            compChoice = rand.nextInt(3) + 1;
            System.out.println("Your choice? (1 = Rock, 2 = Paper, 3 = Scissors)");
            choice = Integer.parseInt(scan.nextLine());
            switch(choice){
                case 1:
                    switch (compChoice){
                        case 1:
                            ties++;
                            System.out.println("I choose rock!");
                            System.out.println("Its a tie!");
                            break;
                        case 2:
                            playerLosses++;
                            System.out.println("I choose Paper!");
                            System.out.println("You lose!");
                            break;
                        case 3:
                            playerWins++;
                            System.out.println("I choose Scissors!");
                            System.out.println("You win!");
                            break;
                        default:
                            System.out.println("I choose gun...");
                            System.out.println("You lose!");
                            break;
                    }
                    break;
                case 2:
                    switch (compChoice){
                        case 1:
                            playerWins++;
                            System.out.println("I choose rock!");
                            System.out.println("You win!");
                            break;
                        case 2:
                            ties++;
                            System.out.println("I choose Paper!");
                            System.out.println("It's a tie!");
                            break;
                        case 3:
                            playerLosses++;
                            System.out.println("I choose Scissors!");
                            System.out.println("You lose!");
                            break;
                        default:
                            System.out.println("I choose gun...");
                            System.out.println("You lose!");
                            break;
                    }
                    break;
                case 3:
                    switch (compChoice){
                        case 1:
                            playerLosses++;
                            System.out.println("I choose rock!");
                            System.out.println("You lose!");
                            break;
                        case 2:
                            playerWins++;
                            System.out.println("I choose Paper!");
                            System.out.println("You win!");
                            break;
                        case 3:
                            ties++;
                            System.out.println("I choose Scissors!");
                            System.out.println("It's a tie!");
                            break;
                        default:
                            System.out.println("I choose gun...");
                            System.out.println("You lose!");
                            break;
                    }
                    break;
            }
            
        }
        System.out.println("There were " + ties + " ties.");
        System.out.println("You won " + playerWins + " times.");
        System.out.println("I won " + playerLosses + " times.");
        if(playerWins > playerLosses){
            System.out.println("You won the most rounds!");
        }
        if(playerWins < playerLosses){
            System.out.println("I won the most rounds");
        }
        if(playerWins == playerLosses){
            System.out.println("It's a tie!");
        }
    }
}
