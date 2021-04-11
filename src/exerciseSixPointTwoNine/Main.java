package exerciseSixPointTwoNine;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        CoinTossing coinTossing = new CoinTossing();

        int number = 0;
        int numberOfHeads = 0;
        int numberOfTails = 0;
        Coin tossedCoin;
        Scanner input = new Scanner(System.in);

        try {
            while (number != -1) {
                System.out.println("Enter 1 to toss a coin, 2 to quit: ");
                number = input.nextInt();

                if (number == 1) {
                    tossedCoin = coinTossing.flip();
                    System.out.println(tossedCoin);
                    if (tossedCoin == Coin.HEADS){
                        numberOfHeads ++;
                    }
                    if (tossedCoin == Coin.TAILS){
                        numberOfTails ++;
                    }
                }else {
                    System.out.println("You have ended the program...");
                }

            }
            System.out.println("number of heads is " + numberOfHeads);
            System.out.println("Number of tails is " + numberOfTails);
        }catch (InputMismatchException e){
            System.out.println("You need to enter a number");
        }

    }
}
