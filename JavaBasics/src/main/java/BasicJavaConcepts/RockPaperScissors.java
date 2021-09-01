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
        //init code
        Scanner scan = new Scanner(System.in);
        String response;
        boolean playGame = true; //used to see if we want to keep running the game code
        
        while(playGame){ //a very basic REPL with one function, playing the game and then asking if the user wants to play again
            playGame(); //run the game
            System.out.println("Would you like to play again?");
            response = scan.nextLine();
            if(response.equals("No")){ //only check for a no, anything else will run game again (improvement opportunity)
                System.out.println("Thank you for playing!");
                playGame = false;
            }
        }
        
        
    }
    
    public static void playGame(){
        //init code
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int rounds = 1;
        int ties = 0;
        int playerWins = 0;
        int playerLosses = 0;
        
        System.out.println("How many rounds would you like to play? (Pick a value 1-10)");
        rounds = Integer.parseInt(scan.nextLine());
        if(rounds > 10 || rounds < 1){ //check if number input by player is valid (assuming integer input)
            System.out.println(rounds + " is not a valid input.");
            System.exit(0); //exit if it is not a valid number
        }
        //loop init
        int i;
        int choice = 0;//what option the player chooses
        int compChoice = 0;//what the computer chooses
        for (i = 0; i < rounds; i++){
            compChoice = rand.nextInt(3) + 1;
            System.out.println("Your choice? (1 = Rock, 2 = Paper, 3 = Scissors)");
            choice = Integer.parseInt(scan.nextLine());
            switch(choice){//have to consider all the possible matchups
                case 1://player chooses rock
                    switch (compChoice){
                        case 1://comp chooses rock
                            ties++;
                            System.out.println("I choose rock!");
                            System.out.println("Its a tie!");
                            break;
                        case 2://comp chooses paper
                            playerLosses++;
                            System.out.println("I choose Paper!");
                            System.out.println("You lose!");
                            break;
                        case 3://comp chooses scissors
                            playerWins++;
                            System.out.println("I choose Scissors!");
                            System.out.println("You win!");
                            break;
                        default://this code should never run
                            System.out.println("I choose gun...");
                            System.out.println("You lose!");
                            break;
                    }
                    break;
                case 2://player chooses paper
                    switch (compChoice){
                        case 1://comp chooses rock
                            playerWins++;
                            System.out.println("I choose rock!");
                            System.out.println("You win!");
                            break;
                        case 2://comp chooses paper
                            ties++;
                            System.out.println("I choose Paper!");
                            System.out.println("It's a tie!");
                            break;
                        case 3://comp chooses scissors
                            playerLosses++;
                            System.out.println("I choose Scissors!");
                            System.out.println("You lose!");
                            break;
                        default://this code should never run
                            System.out.println("I choose gun...");
                            System.out.println("You lose!");
                            break;
                    }
                    break;
                case 3://player chooses scissors
                    switch (compChoice){
                        case 1://comp chooses rock
                            playerLosses++;
                            System.out.println("I choose rock!");
                            System.out.println("You lose!");
                            break;
                        case 2://comp chooses paper
                            playerWins++;
                            System.out.println("I choose Paper!");
                            System.out.println("You win!");
                            break;
                        case 3://comp chooses scissors
                            ties++;
                            System.out.println("I choose Scissors!");
                            System.out.println("It's a tie!");
                            break;
                        default://this code should never run
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
        if(playerWins > playerLosses){//player won more than they lost, they win
            System.out.println("You won the most rounds!");
        }
        if(playerWins < playerLosses){//player lost more than they won, comp wins
            System.out.println("I won the most rounds");
        }
        if(playerWins == playerLosses){//equal amount of wins and losses, a tie
            System.out.println("It's a tie!");
        }
    }
}
