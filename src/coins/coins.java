package coins;

public class coins {
    private int green=4;
    private int blue=4;
    private int black=4;
    private int white=4;
    private int red=4;
    private int gold=5;

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        if(green<0){
            green=0;
        }
        this.green = green;
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        if(blue<0){
            blue=0;
        }
        this.blue = blue;
    }

    public int getBlack() {
        return black;
    }

    public void setBlack(int black) {
        if(black<0){
            black=0;
        }
        this.black = black;
    }

    public int getWhite() {
        return white;
    }

    public void setWhite(int white) {
        if (white<0){
            white=0;
        }
        this.white = white;
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        if (red<0){
            red=0;
        }
        this.red = red;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        if(gold<0){
            gold=0;
        }
        this.gold = gold;
    }
}
