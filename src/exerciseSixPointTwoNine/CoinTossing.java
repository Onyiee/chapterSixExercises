package exerciseSixPointTwoNine;
//6.29 (Coin Tossing) Write an application that simulates coin tossing. Let the program toss a coin
//        each time the user chooses the “Toss Coin” menu option. Count the number of times each side of
//        the coin appears. Display the results. The program should call a separate method flip that
//        takes no
//        arguments and returns a value from a Coin enum (HEADS and TAILS). [Note: If the program
//        realistically
//        simulates coin tossing, each side of the coin should appear approximately half the time.

import java.util.Random;

public class CoinTossing{
    private Coin coin;
     int min = 0;
     int max = 1;


    public Coin flip() {
        int randomInt = (int) Math.floor(Math.random() * (max - min + 1) + min);
        if (randomInt == 1){
            return Coin.HEADS;
        }else {
            return Coin.TAILS;
        }
    }

    public void setCoin(Coin coin) {
        this.coin = coin;
    }

    public Coin getCoin() {
        return coin;
    }
}
 