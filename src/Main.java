import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.net.URL;

public class Main extends JFrame {
    public Main() {
        setSize(1400, 950);
        setLocationRelativeTo(null);
        setTitle("Amusement Park Game");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        initLeftPanel();
        initRightPanel();
        this.setVisible(true);
    }

    private void initLeftPanel() {
        JPanel leftPanel = new JPanel(new GridLayout(10, 1, 15, 10));
        JLabel player1 = new JLabel("«Player one»");
        JLabel coins = new JLabel("Coins:");
        JLabel specialCoins = new JLabel("Special coins:");
        JLabel reservation = new JLabel("Reserved cards:");
        JLabel points = new JLabel("Points:");
        JLabel player2 = new JLabel("«Player two»");
        JLabel coins2 = new JLabel("Coins:");
        JLabel specialCoins2 = new JLabel("Special coins:");
        JLabel reservation2 = new JLabel("Reserved cards:");
        JLabel points2 = new JLabel("Points:");
        Font font = new Font(Font.SERIF, Font.PLAIN, 15);
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

        addComponent(rightPanel, claw, gbc, 0, 0, true);
        addComponent(rightPanel, claw, gbc, 1, 0,true);
        addComponent(rightPanel, claw, gbc, 2, 0,true);

        addComponent(rightPanel, tent, gbc, 0, 1, false);
        addComponent(rightPanel, tent, gbc, 1, 1,false);
        addComponent(rightPanel, tent, gbc, 2, 1,false);
        addComponent(rightPanel, tent, gbc, 3, 1,false);

        addComponent(rightPanel, ferris, gbc, 0, 2,true);
        addComponent(rightPanel, ferris, gbc, 1, 2, true);
        addComponent(rightPanel, ferris, gbc, 2, 2,true);
        addComponent(rightPanel, ferris, gbc, 3, 2,true);

        addComponent(rightPanel, coaster, gbc, 0, 3,false);
        addComponent(rightPanel, coaster, gbc, 1, 3,false);
        addComponent(rightPanel, coaster, gbc, 2, 3,false);
        addComponent(rightPanel, coaster, gbc, 3, 3,false);

        addComponent(rightPanel, black, gbc, 0, 4,false);
        addComponent(rightPanel, white, gbc, 1, 4,false);
        addComponent(rightPanel, green, gbc, 2, 4,false);
        addComponent(rightPanel, blue, gbc, 4, 4,false);
        addComponent(rightPanel, red, gbc, 3, 4,false);

        rightPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        add(rightPanel, BorderLayout.EAST);
    }

    private void addComponent(JPanel panel, ImageIcon icon, GridBagConstraints gbc, int x, int y, boolean m) {
        JButton button = new JButton(icon);
        if(m){
            button.setPreferredSize(new Dimension(icon.getIconWidth()+100, icon.getIconHeight()));
        }
        else{
            button.setPreferredSize(new Dimension(icon.getIconWidth(), icon.getIconHeight()));
        }
        gbc.gridx = x;
        gbc.gridy = y;
        panel.add(button, gbc);
    }


    public static void main(String[] args) {
        new Main();
    }
}
