import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.text.StyledEditorKit;
import java.awt.*;
public class Main extends JFrame {
    public Main() {
        setSize(1400,950);
        setLocationRelativeTo(null);
        setTitle("Amusement Park Game");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        initLeftPanel();
        initRightpanel();
        this.setVisible(true);
    }
    private void initLeftPanel(){
        JPanel leftPanel = new JPanel(new GridLayout(10,1,15,10));
        JLabel player1 = new JLabel("«Player one»");
        JLabel coins = new JLabel("Coins:");
        JLabel specialCoins = new JLabel("Special coins:");
        JLabel reservation = new JLabel("Reserved cards:");
        JLabel points = new JLabel("Points:");
        JLabel player2 = new JLabel("«Player two»");
        JLabel coins2= new JLabel("Coins:");
        JLabel specialCoins2 = new JLabel("Special coins:");
        JLabel reservation2 = new JLabel("Reserved cards:");
        JLabel points2 = new JLabel("Points:");
        Font font = new Font(Font.SERIF, Font.PLAIN,  15);
        labels(player1, coins, specialCoins, reservation, points, font, Color.red, Color.pink);
        labels(player2, coins2, specialCoins2, reservation2, points2, font, Color.BLACK, Color.GRAY);
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

    public void labels (JLabel player1, JLabel coins, JLabel specialCoins, JLabel reservation, JLabel points, Font font, Color color, Color color2) {
        player1.setFont(font);
        player1.setHorizontalTextPosition(SwingConstants.HORIZONTAL);
        player1.setForeground(color);
        player1.setOpaque(true);
        player1.setBackground(color2);
        reservation.setFont(font);
        reservation.setHorizontalTextPosition(SwingConstants.HORIZONTAL);
        reservation.setForeground(color);
        reservation.setOpaque(true);
        reservation.setBackground(color2);
        coins.setFont(font);
        coins.setHorizontalTextPosition(SwingConstants.HORIZONTAL);
        coins.setForeground(color);
        coins.setOpaque(true);
        coins.setBackground(color2);
        points.setFont(font);
        points.setHorizontalTextPosition(SwingConstants.HORIZONTAL);
        points.setForeground(color);
        points.setOpaque(true);
        points.setBackground(color2);
        specialCoins.setFont(font);
        specialCoins.setHorizontalTextPosition(SwingConstants.HORIZONTAL);
        specialCoins.setForeground(color);
        specialCoins.setOpaque(true);
        specialCoins.setBackground(color2);
    }

    private void initRightpanel(){
        JPanel rightPanel = new JPanel();
        rightPanel.setBackground(Color.GRAY);
        rightPanel.setSize(1000,950);
        GridBagLayout layout = new GridBagLayout();
        ImageIcon black = new ImageIcon("pictures/black.png");
        ImageIcon red = new ImageIcon("pictures/red.png");
        ImageIcon blue = new ImageIcon("pictures/blue.png");
        ImageIcon white = new ImageIcon("pictures/green.png");
        ImageIcon green = new ImageIcon("pictures/green.png");
        ImageIcon coaster = new ImageIcon("pictures/coaster.png");
        ImageIcon ferris = new ImageIcon("pictures/ferris.png");
        ImageIcon tent = new ImageIcon("pictures/tent.png");
        ImageIcon claw = new ImageIcon("pictures/claw.png");
        rightPanel.setLayout(layout);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx=0;
        gbc.gridy=0;
        rightPanel.add(new JButton(claw),gbc);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx=0;
        gbc.gridy=1;
        rightPanel.add(new JButton(claw));


    }
    public static void main(String[] args){
        new Main();
    }
}