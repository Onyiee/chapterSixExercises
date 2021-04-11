package exerciseSixPointTwoNine;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoinTossingTest {
    CoinTossing coinTossing;
    Coin coin;

    @BeforeEach
    void setUp() {
        coinTossing = new CoinTossing();

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void coinCanBeSetAndGotten(){
        coinTossing.setCoin(coin);
        assertEquals(coin, coinTossing.getCoin());
    }

    @Test
    void coinCanBeTossed(){
        coinTossing.setCoin(Coin.TAILS);
        assertNotNull(coinTossing.flip());
        coinTossing.setCoin(Coin.HEADS);
        assertNotNull(coinTossing.flip());
    }

}