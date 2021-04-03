package exerciseSixPointThreeZero;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberGuesserTest {
    NumberGuesser numberGuesser;

    @BeforeEach
    void setUp() {
        numberGuesser = new NumberGuesser();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void numberCanBeSet(){
        numberGuesser.setNumber(1);
        assertEquals(1, numberGuesser.getNumber());
    }




}