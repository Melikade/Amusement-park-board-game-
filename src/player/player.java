package player;

public class player {
    public static int turnPlayer = 1;
    public int greenRegCoin = 0;
    public int blueRegCoin = 0;
    public int whiteRegCoin = 0;
    public int blackRegCoin = 9;
    public int redRegCoin = 0;
    public int greenSpecCoin = 0;
    public int blueSpecCoin = 0;
    public int whiteSpecCoin = 0;
    public int blackSpecCoin = 0;
    public int redSpecCoin = 0;
    public int goldCoin = 0;
    private int points = 0;
    private int numOfReserves = 0;
    private int numOfCards = 0;
    public int[] reserveRank = new int[3];
    public String[] reserveSpecial = new String[3];
    public String[] reservePrice = new String[3];
    public String[] coinMax10 = {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "};

    public static int showPlayerTurn() {
        if (turnPlayer % 2 == 1) {
            return 1;
        } else {
            return 2;
        }
    }

    public void coinArray() {
        int i, j, k, l, m, f;
        for (j = 0; j < blackRegCoin; j++) {
            coinMax10[j] = "Black";
        }
        for (k = j; k < whiteRegCoin + blackRegCoin; k++) {
            coinMax10[k] = "White";
        }
        for (l = k; l < whiteRegCoin + blackRegCoin + greenRegCoin; l++) {
            coinMax10[l] = "Green";
        }
        for (m = l; m < whiteRegCoin + blackRegCoin + greenRegCoin + blueRegCoin; m++) {
            coinMax10[m] = "Blue";
        }
        for (f = m; f < whiteRegCoin + blackRegCoin + greenRegCoin + blueRegCoin + redRegCoin; f++) {
            coinMax10[f] = "Red";
        }
        for (i = f; i < 13; i++) {
            coinMax10[f] = " ";
        }
    }

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

    public void setBlackRegCoin(int blackRegCoin) {
        if (blackRegCoin < 0) {
            blackRegCoin = 0;
        }
        this.blackRegCoin = blackRegCoin;
    }

    public void setBlueRegCoin(int blueRegCoin) {
        if (blueRegCoin < 0) {
            blueRegCoin = 0;
        }
        this.blueRegCoin = blueRegCoin;
    }

    public void setGoldCoin(int goldCoin) {
        if (goldCoin < 0) {
            goldCoin = 0;
        }
        this.goldCoin = goldCoin;
    }

    public void setGreenRegCoin(int greenRegCoin) {
        if (greenRegCoin < 0) {
            greenRegCoin = 0;
        }
        this.greenRegCoin = greenRegCoin;
    }

    public void setRedRegCoin(int redRegCoin) {
        if (redRegCoin < 0) {
            redRegCoin = 0;
        }
        this.redRegCoin = redRegCoin;
    }

    public void setWhiteRegCoin(int whiteRegCoin) {
        if (whiteRegCoin < 0) {
            whiteRegCoin = 0;
        }
        this.whiteRegCoin = whiteRegCoin;
    }
}
