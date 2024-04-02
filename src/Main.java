import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.text.StyledEditorKit;
import java.awt.*;

public class Main extends JFrame {
    public Main() {
        setSize(1200,950);
        setLocationRelativeTo(null);
        setTitle("Amusement Park Game");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        initLeftPanel();
        initRightpanel();
        this.setVisible(true);
    }
    private void initLeftPanel(){
        JPanel leftPanel = new JPanel(new GridLayout(10,1,0,10));
        JLabel player1 = new JLabel("<Player one>");
        JLabel coins = new JLabel("Coins:");
        JLabel specialCoins = new JLabel("Special coins:");
        JLabel reservation = new JLabel("Reserved cards:");
        JLabel points = new JLabel("Points:");
        JLabel player2 = new JLabel("<Player two>");
        JLabel coins2= new JLabel("Coins:");
        JLabel specialCoins2 = new JLabel("Special coins:");
        JLabel reservation2 = new JLabel("Reserved cards:");
        JLabel points2 = new JLabel("Points:");
        Font font = new Font(Font.SERIF, Font.PLAIN,  15);
        labels(player1, coins, specialCoins, reservation, points, font, Color.BLUE);
        labels(player2, coins2, specialCoins2, reservation2, points2, font, Color.DARK_GRAY);
        leftPanel.add(player1);
        leftPanel.add(coins);
        leftPanel.add(specialCoins);
        leftPanel.add(reservation);
        leftPanel.add(points);
        leftPanel.add(player2);
        leftPanel.add(coins2);
        leftPanel.add(specialCoins2);
        leftPanel.add(reservation2);
        leftPanel.add(points2);
        leftPanel.setBorder(new EmptyBorder(10,10,10,10));
        add(leftPanel,BorderLayout.WEST);
    }

    public void labels (JLabel player1, JLabel coins, JLabel specialCoins, JLabel reservation, JLabel points, Font font, Color color) {
        player1.setFont(font);
        player1.setHorizontalTextPosition(SwingConstants.HORIZONTAL);
        player1.setForeground(color);
        reservation.setFont(font);
        reservation.setHorizontalTextPosition(SwingConstants.HORIZONTAL);
        reservation.setForeground(color);
        coins.setFont(font);
        coins.setHorizontalTextPosition(SwingConstants.HORIZONTAL);
        coins.setForeground(color);
        points.setFont(font);
        points.setHorizontalTextPosition(SwingConstants.HORIZONTAL);
        points.setForeground(color);
        specialCoins.setFont(font);
        specialCoins.setHorizontalTextPosition(SwingConstants.HORIZONTAL);
        specialCoins.setForeground(color);
    }

    private void initRightpanel(){

    }
    public static void main(String[] args){
        new Main();
    }
}