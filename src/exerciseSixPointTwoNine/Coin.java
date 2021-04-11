package exerciseSixPointTwoNine;

public enum Coin {
    HEADS,
    TAILS;


    @Override
    public String toString() {
        String result ="";
        switch (this){
            case TAILS -> {result = "TAILS";}
            case HEADS -> {result ="HEAD";}
        }
        return result;
    }


}
