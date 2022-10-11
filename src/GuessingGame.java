import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    //Create a public GuessingGame constructor
    public GuessingGame() {
        //Create a scanner variable named input that will store the user input
        Scanner input = new Scanner(System.in);
        //Create a boolean object called correctGuess, set it equal to false
        boolean correctGuess = false;
        //Create 2 int variables, guess and increment, set both to 0
        int guess = 0;
        int increment = 0;
        System.out.println("Hello user, What is your name?");
        //Create a String Variable called name to store the users input
        String name = input.nextLine();
        System.out.println("Hello " + name + " I'm thinking of a number between 1 and 100.");
        //Create a new random object by calling the random constructor
        Random rand = new Random();
        //Create an int called number and set it to equal rand.nextInt(100) - it will choose the next number between 1-100 generated by rand
        int number = rand.nextInt(100);
        System.out.println("Try to guess my number.");
        //Create a while loop and set the condition to correctGuess to equal false
        while (correctGuess == false) {
            //increase the increment by 1
            increment++;
            //Create a try catch statement to catch exception e
            try {
                //Set guess equal to input.nextInt()
                guess = input.nextInt();
            } catch (Exception e) {
                //Create a new string called badInput and set it to input.next()
                String badInput = input.next(); //necessary for moving past the bad input
                System.out.println("That's not an integer, try again");
                //Use continue to skip back to the beginning of the while loop
                continue;
            }
            //Use an if statement to see if the guess is greater than 100 or less than 1
            if (guess > 100 || guess < 1) {
                System.out.println("Your guess is out of range. Please try again.");
            } else if (guess > number) {
                System.out.println("Your guess is too high. Please try again.");
            } else if (guess < number) {
                System.out.println("Your guess is too low. Please try again.");
            } else if (guess == number) {
                System.out.println("Well done, " + name + "! You found my number in " + increment + "tries!");
                //Set correct guess to true
                correctGuess = true;
            }
        }
    }
}