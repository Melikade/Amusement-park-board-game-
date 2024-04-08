import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.net.URL;

public class Main extends JFrame {
    public Main() {
        setSize(1610, 950);
        setLocationRelativeTo(null);
        setTitle("Amusement Park Game");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        initLeftPanel();
        initRightPanel();
        this.setVisible(true);
    }

    private void initLeftPanel() {
        JPanel leftPanel = new JPanel(new GridLayout(10, 0, 0, 10));
        JLabel player1 = new JLabel("«PLAYER ONE»");
        int green1=0, white1=0, black1=0, red1=0, blue1=0;
        JLabel coins = new JLabel("Coins: "+"Green="+green1+", White="+white1+", Black="+black1+", red="+red1+", blue="+blue1+" ");
        //int green1=0, white1=0, black1=0, red1=0, blue1=0;
        JLabel specialCoins = new JLabel("Special Coins: "+"Green="+green1+", White="+white1+", Black="+black1+", red="+red1+", blue="+blue1+" ");
        JLabel reservation = new JLabel("Reserved cards:");
        JLabel points = new JLabel("Points:");
        JLabel player2 = new JLabel("«PLAYER TWO»");
        JLabel coins2 = new JLabel("Coins:");
        JLabel specialCoins2 = new JLabel("Special coins:");
        JLabel reservation2 = new JLabel("Reserved cards:");
        JLabel points2 = new JLabel("Points:");
        Font font = new Font(Font.DIALOG, Font.PLAIN, 15);
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
        leftPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        add(leftPanel, BorderLayout.WEST);
    }

    public void labels(JLabel player1, JLabel coins, JLabel specialCoins, JLabel reservation, JLabel points, Font font, Color color, Color color2) {
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

    private void initRightPanel() {
        JPanel rightPanel = new JPanel();
        rightPanel.setBackground(Color.GRAY);
        rightPanel.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        ImageIcon black = new ImageIcon("pictures/black.png");
        ImageIcon red = new ImageIcon("pictures/red.png");
        ImageIcon blue = new ImageIcon("pictures/blue.png");
        ImageIcon white = new ImageIcon("pictures/white.png");
        ImageIcon green = new ImageIcon("pictures/green.png");
        ImageIcon coaster = new ImageIcon("pictures/coaster.png");
        ImageIcon ferris = new ImageIcon("pictures/ferris.png");
        ImageIcon tent = new ImageIcon("pictures/tent.png");
        ImageIcon claw = new ImageIcon("pictures/claw.png");

        JLabel claw1rank = new JLabel("3");
        JLabel claw2rank = new JLabel("4");
        JLabel claw3rank = new JLabel("4");
        JLabel claw1price = new JLabel("4 White + 4 Blue");
        JLabel claw2price = new JLabel("5 Red + 4 Black");
        JLabel claw3price = new JLabel("2 Green + 8 Red");
        JLabel special = new JLabel();

        addComponent(rightPanel, claw, gbc, 0, 0, true, true, special, claw1rank, claw1price, Color.MAGENTA);
        addComponent(rightPanel, claw, gbc, 1, 0,true, true, special, claw2rank, claw2price, Color.MAGENTA);
        addComponent(rightPanel, claw, gbc, 2, 0,true, true, special, claw3rank, claw3price, Color.MAGENTA);

        JLabel tent1rank = new JLabel("0");
        JLabel tent2rank = new JLabel("1");
        JLabel tent3rank = new JLabel("1");
        JLabel tent4rank= new JLabel("0");
        JLabel tent1price = new JLabel("4 Red");
        JLabel tent2price = new JLabel("2 White + 3 Blue");
        JLabel tent3price = new JLabel("1 Green + 5 Black");
        JLabel tent4price = new JLabel("2 Red + 2 Green");
        JLabel tent1special = new JLabel("RED");
        JLabel tent2special = new JLabel("BLUE");
        JLabel tent3special = new JLabel("GREEN");
        JLabel tent4special = new JLabel("BLACK");

        addComponent(rightPanel, tent, gbc, 0, 1, true, false, tent1special, tent1rank, tent1price, Color.BLUE);
        addComponent(rightPanel, tent, gbc, 1, 1,true, false, tent2special, tent2rank, tent2price, Color.BLUE);
        addComponent(rightPanel, tent, gbc, 2, 1,true, false, tent3special, tent3rank , tent3price, Color.BLUE);
        addComponent(rightPanel, tent, gbc, 3, 1,true, false, tent4special, tent4rank, tent4price, Color.BLUE);

        JLabel ferris1rank = new JLabel("2");
        JLabel ferris2rank = new JLabel("3");
        JLabel ferris3rank = new JLabel("4");
        JLabel ferris4rank= new JLabel("2");
        JLabel ferris1price = new JLabel("2 Red + 2 Blue + 2 White");
        JLabel ferris2price = new JLabel("6 Black + 2 Green");
        JLabel ferris3price = new JLabel("4 Blue + 3 White");
        JLabel ferris4price = new JLabel("3 Red + 3 White");
        JLabel ferris1special = new JLabel("RED");
        JLabel ferris2special = new JLabel("BLACK");
        JLabel ferris3special = new JLabel("GREEN");
        JLabel ferris4special = new JLabel("WHITE");

        addComponent(rightPanel, ferris, gbc, 0, 2,true, false, ferris1special, ferris1rank, ferris1price, Color.RED);
        addComponent(rightPanel, ferris, gbc, 1, 2, true, false, ferris2special, ferris2rank, ferris2price, Color.RED);
        addComponent(rightPanel, ferris, gbc, 2, 2,true, false, ferris3special, ferris3rank, ferris3price, Color.RED);
        addComponent(rightPanel, ferris, gbc, 3, 2,true, false, ferris4special, ferris4rank, ferris4price, Color.RED);

        JLabel coaster1rank = new JLabel("3");
        JLabel coaster2rank = new JLabel("4");
        JLabel coaster3rank = new JLabel("4");
        JLabel coaster4rank= new JLabel("5");
        JLabel coaster1price = new JLabel("4 Green + 3 Blue");
        JLabel coaster2price = new JLabel("5 White + 3 Blue ");
        JLabel coaster3price = new JLabel("4 Red + 3 Black + 2 White");
        JLabel coaster4price = new JLabel("3 Red + 4 Green + 3 Black");
        JLabel coaster1special = new JLabel("WHITE");
        JLabel coaster2special = new JLabel("BLUE");
        JLabel coaster3special = new JLabel("RED");
        JLabel coaster4special = new JLabel("BLACK");

        addComponent(rightPanel, coaster, gbc, 0, 3,true, false, coaster1special, coaster1rank, coaster1price, Color.DARK_GRAY);
        addComponent(rightPanel, coaster, gbc, 1, 3,true, false, coaster2special, coaster2rank, coaster2price, Color.DARK_GRAY);
        addComponent(rightPanel, coaster, gbc, 2, 3,true, false, coaster3special, coaster3rank, coaster3price, Color.DARK_GRAY);
        addComponent(rightPanel, coaster, gbc, 3, 3,true, false, coaster4special, coaster4rank, coaster4price, Color.DARK_GRAY);

        addComponent(rightPanel, black, gbc, 0, 4,false, false, special , special, special, Color.white);
        addComponent(rightPanel, white, gbc, 1, 4,false, false, special, special, special, Color.white);
        addComponent(rightPanel, green, gbc, 2, 4,false, false, special, special, special, Color.white);
        addComponent(rightPanel, blue, gbc, 3, 4,false, false, special, special, special, Color.white);
        addComponent(rightPanel, red, gbc, 4, 4,false, false, special, special ,special, Color.white);

        rightPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        add(rightPanel, BorderLayout.EAST);
    }

    private void addComponent(JPanel panel, ImageIcon icon, GridBagConstraints gbc, int x, int y, boolean m, boolean j, JLabel specialCoin, JLabel rank, JLabel price, Color color ) {

        JButton button = new JButton(icon);
        if(!m){
            button.setPreferredSize(new Dimension(icon.getIconWidth(), icon.getIconHeight()));
        }
        else{
            if(j){
                button.setPreferredSize(new Dimension(icon.getIconWidth() + 150, icon.getIconHeight()));
            }
            else {
                button.setPreferredSize(new Dimension(icon.getIconWidth() + 100, icon.getIconHeight()));
            }
        }
        gbc.gridx = x;
        gbc.gridy = y;
        Font font = new Font(Font.SERIF, Font.PLAIN, 13);
        Font fontRank = new Font(Font.DIALOG, Font.BOLD, 20);
        specialCoin.setFont(font);
        rank.setFont(fontRank);
        price.setFont(font);
        specialCoin.setForeground(color);
        rank.setForeground(color);
        price.setForeground(color);
        button.setLayout(new BorderLayout());
        button.add(price,BorderLayout.SOUTH);
        button.add(rank,BorderLayout.NORTH);
        button.add(specialCoin,BorderLayout.WEST);
        panel.add(button, gbc);
    }


    public static void main(String[] args) {
        new Main();
    }
}
