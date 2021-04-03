package exerciseSixPointThreeZero;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int min = 1;
        int max = 1000;
        int guessedNumber = 0;
        int randomInt = 1;


        while ( guessedNumber !=  randomInt){
             randomInt = (int) Math.floor(Math.random() * (max - min + 1) + min);
//            System.out.println(randomInt);
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a number between 1 and 1000: ");
              guessedNumber = input.nextInt();
            if (guessedNumber < randomInt){
                System.out.println("Number guessed is too low. Try again");
            }
            if (guessedNumber > randomInt){
                System.out.println("Number guessed is too high. Try again");
            }
            if (guessedNumber == randomInt){
                System.out.println("Congratulations! You guessed the number");
            }

        }

        }
    }

