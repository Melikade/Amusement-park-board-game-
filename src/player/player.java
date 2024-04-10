package player;

public class player {
    public static int turnPlayer=1;
    public int greenRegCoin=0;
    public int blueRegCoin=0;
    public int whiteRegCoin=0;
    public int blackRegCoin=0;
    public int redRegCoin=0;
    public int greenSpecCoin=0;
    public int blueSpecCoin=0;
    public int whiteSpecCoin=0;
    public int blackSpecCoin=0;
    public int redSpecCoin=0;
    public int goldCoin=0;
    private int points=0;
    private int numOfReserves=0;
    private int numOfCards=0;
    public int[] reserveRank;
    public String[] reserveSpecial;
    public String[] reservePrice;


    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getNumOfReserves() {
        return numOfReserves;
    }

    public void setNumOfReserves(int numOfReserves) {
        this.numOfReserves = numOfReserves;
    }

    public int getNumOfCards() {
        return numOfCards;
    }

    public void setNumOfCards(int numOfCards) {
        this.numOfCards = numOfCards;
    }
}
