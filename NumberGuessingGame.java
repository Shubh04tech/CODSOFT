import java.util.Scanner;
import java.util.Random;


public class NumberGuessingGame {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);

    //Create a Random Object to generate a Random Number
    Random random=new Random();

    //Define the lower and Upper Bounds for the range of numbers
    int lowerBound=1;
    int upperBound=100;

    //Generate a random number within the specified range
    int numberToGuess = random.nextInt(upperBound - lowerBound + 1);
    int attempts=0;
    int maxAttemts=10;
    
     System.out.println("Welcome to the number guessing game!");
     System.out.println("I have selected a number between "+ lowerBound + "and" + upperBound + ". Can you guess it ?");

    while (attempts < maxAttemts){
        System.out.println("Enter your guess number ");
        int userGuess = sc.nextInt();
        attempts++;
     
        if (userGuess == numberToGuess){
            System.out.println("Congratulations! You've guessed the correct number in "+ attempts +"attempts.");
            break;
        }
        else if (userGuess < numberToGuess){
            System.out.println("Try a Higher number.");
        }
        else if (userGuess > numberToGuess){
            System.out.println("Try a smaller number.");
        }
        
    }
    if(attempts == maxAttemts){
        System.out.println("Sorry you have reached the maximum number of attempts. The correct number was "+numberToGuess);

    }
    System.out.println("Thanks for Playing!");

    }
    
}

