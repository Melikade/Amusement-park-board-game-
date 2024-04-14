import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import coins.coins;
import cards.card;
import prizeClaw.prizeClawCards;
import player.player;

public class Main extends JFrame {
    card cards = new card();
    coins coins = new coins();
    prizeClawCards prizeClaw = new prizeClawCards();
    player player1 = new player();
    player player2 = new player();
    public Main() {
        setSize(1700, 955);
        setLocationRelativeTo(null);
        setTitle("Amusement Park Game");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        initLeftPanel();
        initRightPanel();
        this.setVisible(true);
    }

    private void initLeftPanel() {
        JPanel leftPanel = new JPanel(new GridLayout(12, 0, 0, 10));
        JLabel playerOne = new JLabel("«PLAYER ONE»");
        JLabel coins = new JLabel("Coins: "+"Green="+player1.greenRegCoin+", White="+player1.whiteRegCoin+", Black="+player1.blackRegCoin+", red="+player1.redRegCoin+", blue="+player1.blueRegCoin+" ");
        JLabel specialCoins = new JLabel("Special coins: "+"Green="+player1.greenSpecCoin+", White="+player1.whiteSpecCoin+", Black="+player1.blackSpecCoin+", red="+player1.redSpecCoin+", blue="+player1.blueSpecCoin+", Gold="+player1.goldCoin+" ");
        JLabel reservation = new JLabel("Reserves:(Rank Price SpecialCoin)" +player1.reserveRank[0]+" "+ player1.reservePrice[0]+" "+ player1.reserveSpecial[0]+","+player1.reserveRank[1]+" "+ player1.reservePrice[1]+" "+ player1.reserveSpecial[1]+","+player1.reserveRank[2]+" "+ player1.reservePrice[2]+" "+ player1.reserveSpecial[2]+" ");
        JLabel points = new JLabel("Points:"+player1.getPoints());
        JLabel numCard = new JLabel("Number of cards="+player1.getNumOfCards());
        JLabel playerTwo = new JLabel("«PLAYER TWO»");
        JLabel coins2 = new JLabel("Coins: "+"Green="+player2.greenRegCoin+", White="+player2.whiteRegCoin+", Black="+player2.blackRegCoin+", red="+player2.redRegCoin+", blue="+player2.blueRegCoin+" ");
        JLabel specialCoins2 = new JLabel("Special coins: "+"Green="+player2.greenSpecCoin+", White="+player2.whiteSpecCoin+", Black="+player2.blackSpecCoin+", red="+player2.redSpecCoin+", blue="+player2.blueSpecCoin+", Gold="+player2.goldCoin+" ");
        JLabel reservation2 = new JLabel("Reserves:(Rank Price SpecialCoin)" +player2.reserveRank[0]+" "+ player2.reservePrice[0]+" "+ player2.reserveSpecial[0]+","+player2.reserveRank[1]+" "+ player2.reservePrice[1]+" "+ player2.reserveSpecial[1]+","+player2.reserveRank[2]+" "+ player2.reservePrice[2]+" "+ player2.reserveSpecial[2]+" ");
        JLabel points2 = new JLabel("Points:"+player2.getPoints());
        JLabel numCard2 = new JLabel("Number of cards="+player2.getNumOfCards());
        Font font = new Font(Font.DIALOG, Font.PLAIN, 15);
        labels(playerOne, coins, specialCoins, reservation, points, numCard, font, Color.red, Color.pink);
        labels(playerTwo, coins2, specialCoins2, reservation2, points2, numCard2, font, Color.BLACK, Color.GRAY);
        leftPanel.add(playerOne);
        leftPanel.add(coins);
        leftPanel.add(specialCoins);
        leftPanel.add(reservation);
        leftPanel.add(points);
        leftPanel.add(numCard);
        leftPanel.add(playerTwo);
        leftPanel.add(coins2);
        leftPanel.add(specialCoins2);
        leftPanel.add(reservation2);
        leftPanel.add(points2);
        leftPanel.add(numCard2);
        leftPanel.setBorder(new EmptyBorder(10, 5, 10, 5));
        add(leftPanel, BorderLayout.WEST);
    }

    public void labels(JLabel player1, JLabel coins, JLabel specialCoins, JLabel reservation, JLabel points, JLabel numOfCards, Font font, Color color, Color color2) {
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
        numOfCards.setFont(font);
        numOfCards.setHorizontalTextPosition(SwingConstants.HORIZONTAL);
        numOfCards.setForeground(color);
        numOfCards.setOpaque(true);
        numOfCards.setBackground(color2);
    }

    private void initRightPanel() {
        JPanel rightPanel = new JPanel();
        rightPanel.setBackground(Color.GRAY);
        rightPanel.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

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

        addComponent(rightPanel, claw, gbc, 0, 0, true, true, special, claw1rank, claw1price, Color.MAGENTA, prizeClaw.getClaw1());
        addComponent(rightPanel, claw, gbc, 1, 0,true, true, special, claw2rank, claw2price, Color.MAGENTA, prizeClaw.getClaw2());
        addComponent(rightPanel, claw, gbc, 2, 0,true, true, special, claw3rank, claw3price, Color.MAGENTA, prizeClaw.getClaw3());

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

        addComponent(rightPanel, tent, gbc, 0, 1, true, false, tent1special, tent1rank, tent1price, Color.BLUE, true, cards.getTent1(), 0, player.turnPlayer, " ");
        addComponent(rightPanel, tent, gbc, 1, 1,true, false, tent2special, tent2rank, tent2price, Color.BLUE, true, cards.getTent2(), 0, player.turnPlayer, " ");
        addComponent(rightPanel, tent, gbc, 2, 1,true, false, tent3special, tent3rank , tent3price, Color.BLUE,true, cards.getTent3(), 0, player.turnPlayer, " ");
        addComponent(rightPanel, tent, gbc, 3, 1,true, false, tent4special, tent4rank, tent4price, Color.BLUE, true, cards.getTent4(), 0, player.turnPlayer, " ");

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

        addComponent(rightPanel, ferris, gbc, 0, 2,true, false, ferris1special, ferris1rank, ferris1price, Color.RED, true, cards.getFerris1(), 0, player.turnPlayer, " ");
        addComponent(rightPanel, ferris, gbc, 1, 2, true, false, ferris2special, ferris2rank, ferris2price, Color.RED, true, cards.getFerris2(), 0, player.turnPlayer, " ");
        addComponent(rightPanel, ferris, gbc, 2, 2,true, false, ferris3special, ferris3rank, ferris3price, Color.RED, true, cards.getFerris3(), 0, player.turnPlayer, " ");
        addComponent(rightPanel, ferris, gbc, 3, 2,true, false, ferris4special, ferris4rank, ferris4price, Color.RED, true, cards.getFerris4(), 0, player.turnPlayer, " ");

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

        addComponent(rightPanel, coaster, gbc, 0, 3,true, false, coaster1special, coaster1rank, coaster1price, Color.DARK_GRAY, true, cards.getCoaster1(), 0, player.turnPlayer, " ");
        addComponent(rightPanel, coaster, gbc, 1, 3,true, false, coaster2special, coaster2rank, coaster2price, Color.DARK_GRAY, true, cards.getCoaster2(), 0, player.turnPlayer, " ");
        addComponent(rightPanel, coaster, gbc, 2, 3,true, false, coaster3special, coaster3rank, coaster3price, Color.DARK_GRAY, true, cards.getCoaster3(), 0, player.turnPlayer, " ");
        addComponent(rightPanel, coaster, gbc, 3, 3,true, false, coaster4special, coaster4rank, coaster4price, Color.DARK_GRAY, true, cards.getCoaster4(), 0, player.turnPlayer," ");

        addComponent(rightPanel, black, gbc, 0, 4,false, false, special , special, special, Color.BLACK, false, 0, coins.getBlack(), player.turnPlayer,"black");
        addComponent(rightPanel, white, gbc, 1, 4,false, false, special, special, special, Color.BLACK, false, 0, coins.getWhite(), player.turnPlayer, "white");
        addComponent(rightPanel, green, gbc, 2, 4,false, false, special, special, special, Color.BLACK, false, 0, coins.getGreen(),player.turnPlayer, "green");
        addComponent(rightPanel, blue, gbc, 3, 4,false, false, special, special, special, Color.BLACK, false, 0, coins.getBlue(),player.turnPlayer, "blue");
        addComponent(rightPanel, red, gbc, 4, 4,false, false, special, special ,special, Color.BLACK, false, 0, coins.getRed(), player.turnPlayer, "red");

        rightPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        add(rightPanel, BorderLayout.EAST);
    }

    private void addComponent(JPanel panel, ImageIcon icon, GridBagConstraints gbc, int x, int y, boolean m, boolean j, JLabel specialCoin, JLabel rank, JLabel price, Color color, boolean cardOrMach, int cardRemaining, int coinRemaining, int playerTurn, String cardOrMachInfo) {
        JPanel cardCase = new JPanel(new BorderLayout());
        //making the buttons
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
        //adding labels on the card
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
        //adding labels under the cards
        if( cardOrMach ) {
            JLabel underLabel = new JLabel(" Remaining cards = "+cardRemaining);
            underLabel.setFont(font);
            underLabel.setForeground(color);
            cardCase.add(underLabel,BorderLayout.SOUTH);
        }
        else {
            JLabel underMachLabel = new JLabel(" Remaining coins = "+coinRemaining);
            underMachLabel.setFont(font);
            underMachLabel.setForeground(color);
            cardCase.add(underMachLabel,BorderLayout.SOUTH);
        }
        //action listeners
        if(!cardOrMach) {
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    slotMachOpt(panel ,coinRemaining, playerTurn, cardOrMachInfo);
                }
            });
        }
        else{

        }
        cardCase.add(button,BorderLayout.CENTER);
        panel.add(cardCase, gbc);

    }
    private void addComponent(JPanel panel, ImageIcon icon, GridBagConstraints gbc, int x, int y, boolean m, boolean j, JLabel specialCoin, JLabel rank, JLabel price, Color color, int clawRemaining) {
        JPanel cardCase = new JPanel(new BorderLayout());
        //making the buttons
        JButton button = new JButton(icon);
        if(!m){
            button.setPreferredSize(new Dimension(icon.getIconWidth(), icon.getIconHeight()));
        }
        else{
            if(j){
                button.setPreferredSize(new Dimension(icon.getIconWidth() + 150, icon.getIconHeight()));
            }
            else  {
                button.setPreferredSize(new Dimension(icon.getIconWidth() + 100, icon.getIconHeight()));
            }
        }
        gbc.gridx = x;
        gbc.gridy = y;
        //adding labels on the card
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
        //adding labels under the cards
        JLabel underLabel = new JLabel(" Remaining cards = "+clawRemaining);
        underLabel.setFont(font);
        underLabel.setForeground(color);
        cardCase.add(underLabel,BorderLayout.SOUTH);
        cardCase.add(button,BorderLayout.CENTER);
        panel.add(cardCase, gbc);

    }
    //if a slot machine is clicked on
    private void slotMachOpt(Container container, int coinRemaining, int turnPlayer, String colorOfMach){
        JPanel slotMach = new JPanel(new GridLayout(1,2,50,50));
        JButton coin2 = new JButton("Pick 2 coins from one machine");
        JButton coin3 = new JButton("Pick 3 coins from 3 different machines");
        coin2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (coinRemaining == 4){
                    if(turnPlayer%2==1){
                        coinDeduct(player1, colorOfMach);
                    }
                    else{
                        coinDeduct(player2, colorOfMach);

                    }
                    slotMach.setVisible(false);
                }
                else {
                    JOptionPane.showMessageDialog(Main.this,"There isn't enough coins in the machine!");
                }
            }
        });
        coin3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel coin3Options = new JPanel(new GridLayout(11,1,5,5));
                JLabel choose = new JLabel("From which 3 machines shown below do you want to extract your coins?");
                JButton opt1 = new JButton("Black White Blue");
                JButton opt2 = new JButton("Black White Green");
                JButton opt3 = new JButton("Black White Red");
                JButton opt4 = new JButton("Black Blue Green");
                JButton opt5 = new JButton("Black Blue Red");
                JButton opt6 = new JButton("Black Green Red");
                JButton opt7 = new JButton("White Blue Green");
                JButton opt8 = new JButton("White Blue Red");
                JButton opt9 = new JButton("White Green Red");
                JButton opt10 = new JButton("Blue Green Red");
                opt1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(coins.getBlack()>0 && coins.getBlue()>0 && coins.getWhite()>0){
                            if(turnPlayer%2==1){
                                coinDeduct1(player1);
                            }
                            else{
                                coinDeduct1(player2);
                            }
                            coin3Options.setVisible(false);
                            slotMach.setVisible(false);
                        }
                        else{
                            JOptionPane.showMessageDialog(Main.this,"There isn't enough coins in the machines!");
                        }
                    }
                });
                opt2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(coins.getBlack()>0 && coins.getGreen()>0 && coins.getWhite()>0){
                            if(turnPlayer%2==1){
                                coinDeduct2(player1);
                            }
                            else{
                                coinDeduct2(player2);
                            }
                            coin3Options.setVisible(false);
                            slotMach.setVisible(false);
                        }
                        else{
                            JOptionPane.showMessageDialog(Main.this,"There isn't enough coins in the machines!");
                        }
                    }
                });
                opt3.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(coins.getBlack()>0 && coins.getRed()>0 && coins.getWhite()>0){
                            if(turnPlayer%2==1){
                                coinDeduct3(player1);
                            }
                            else{
                                coinDeduct3(player2);
                            }
                            coin3Options.setVisible(false);
                            slotMach.setVisible(false);
                        }
                        else{
                            JOptionPane.showMessageDialog(Main.this,"There isn't enough coins in the machines!");
                        }
                    }
                });
                opt4.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(coins.getBlack()>0 && coins.getGreen()>0 && coins.getBlue()>0){
                            if(turnPlayer%2==1){
                                coinDeduct4(player1);
                            }
                            else{
                                coinDeduct4(player2);
                            }
                            coin3Options.setVisible(false);
                            slotMach.setVisible(false);
                        }
                        else{
                            JOptionPane.showMessageDialog(Main.this,"There isn't enough coins in the machines!");
                        }
                    }
                });
                opt5.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(coins.getBlack()>0 && coins.getBlue()>0 && coins.getRed()>0){
                            if(turnPlayer%2==1){
                                coinDeduct5(player1);
                            }
                            else{
                                coinDeduct5(player2);
                            }
                            coin3Options.setVisible(false);
                            slotMach.setVisible(false);
                        }
                        else{
                            JOptionPane.showMessageDialog(Main.this,"There isn't enough coins in the machines!");
                        }
                    }
                });
                opt6.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(coins.getBlack()>0 && coins.getGreen()>0 && coins.getRed()>0){
                            if(turnPlayer%2==1){
                                coinDeduct6(player1);
                            }
                            else{
                                coinDeduct6(player2);
                            }
                            coin3Options.setVisible(false);
                            slotMach.setVisible(false);
                        }
                        else{
                            JOptionPane.showMessageDialog(Main.this,"There isn't enough coins in the machines!");
                        }
                    }
                });
                opt7.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(coins.getBlue()>0 && coins.getGreen()>0 && coins.getWhite()>0){
                            if(turnPlayer%2==1){
                                coinDeduct7(player1);
                            }
                            else{
                                coinDeduct7(player2);
                            }
                            coin3Options.setVisible(false);
                            slotMach.setVisible(false);
                        }
                        else{
                            JOptionPane.showMessageDialog(Main.this,"There isn't enough coins in the machines!");
                        }
                    }
                });
                opt8.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(coins.getBlue()>0 && coins.getRed()>0 && coins.getWhite()>0){
                            if(turnPlayer%2==1){
                                coinDeduct8(player1);
                            }
                            else{
                                coinDeduct8(player2);
                            }
                            coin3Options.setVisible(false);
                            slotMach.setVisible(false);
                        }
                        else{
                            JOptionPane.showMessageDialog(Main.this,"There isn't enough coins in the machines!");
                        }
                    }
                });
                opt9.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(coins.getRed()>0 && coins.getGreen()>0 && coins.getWhite()>0){
                            if(turnPlayer%2==1){
                                coinDeduct9(player1);
                            }
                            else{
                                coinDeduct9(player2);
                            }
                            coin3Options.setVisible(false);
                            slotMach.setVisible(false);
                        }
                        else{
                            JOptionPane.showMessageDialog(Main.this,"There isn't enough coins in the machines!");
                        }
                    }
                });
                opt10.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(coins.getBlue()>0 && coins.getGreen()>0 && coins.getRed()>0){
                            if(turnPlayer%2==1){
                                coinDeduct10(player1);
                            }
                            else{
                                coinDeduct10(player2);
                            }
                            coin3Options.setVisible(false);
                            slotMach.setVisible(false);
                        }
                        else{
                            JOptionPane.showMessageDialog(Main.this,"There isn't enough coins in the machines!");
                        }
                    }
                });
                coin3Options.add(choose);
                coin3Options.add(opt1);
                coin3Options.add(opt2);
                coin3Options.add(opt3);
                coin3Options.add(opt4);
                coin3Options.add(opt5);
                coin3Options.add(opt6);
                coin3Options.add(opt7);
                coin3Options.add(opt8);
                coin3Options.add(opt9);
                coin3Options.add(opt10);
            }
        });
        slotMach.add(coin2);
        slotMach.add(coin3);
        container.add(slotMach);
    }

    private void coinDeduct1(player player1) {
        player1.blueRegCoin++;
        player1.blackRegCoin++;
        player1.whiteRegCoin++;
        int coin = coins.getBlue();
        coin--;
        coins.setBlue(coin);
        coin = coins.getBlack();
        coin--;
        coins.setBlack(coin);
        coin = coins.getWhite();
        coin--;
        coins.setWhite(coin);
    }
    private void coinDeduct2(player player1) {
        player1.greenRegCoin++;
        player1.blackRegCoin++;
        player1.whiteRegCoin++;
        int coin = coins.getGreen();
        coin--;
        coins.setGreen(coin);
        coin = coins.getBlack();
        coin--;
        coins.setBlack(coin);
        coin = coins.getWhite();
        coin--;
        coins.setWhite(coin);
    }
    private void coinDeduct3(player player1) {
        player1.redRegCoin++;
        player1.blackRegCoin++;
        player1.whiteRegCoin++;
        int coin = coins.getRed();
        coin--;
        coins.setRed(coin);
        coin = coins.getBlack();
        coin--;
        coins.setBlack(coin);
        coin = coins.getWhite();
        coin--;
        coins.setWhite(coin);
    }
    private void coinDeduct4(player player1) {
        player1.blueRegCoin++;
        player1.blackRegCoin++;
        player1.greenRegCoin++;
        int coin = coins.getBlue();
        coin--;
        coins.setBlue(coin);
        coin = coins.getBlack();
        coin--;
        coins.setBlack(coin);
        coin = coins.getGreen();
        coin--;
        coins.setGreen(coin);
    }
    private void coinDeduct5(player player1) {
        player1.blueRegCoin++;
        player1.blackRegCoin++;
        player1.redRegCoin++;
        int coin = coins.getBlue();
        coin--;
        coins.setBlue(coin);
        coin = coins.getBlack();
        coin--;
        coins.setBlack(coin);
        coin = coins.getRed();
        coin--;
        coins.setRed(coin);
    }
    private void coinDeduct6(player player1) {
        player1.greenRegCoin++;
        player1.blackRegCoin++;
        player1.redRegCoin++;
        int coin = coins.getGreen();
        coin--;
        coins.setGreen(coin);
        coin = coins.getBlack();
        coin--;
        coins.setBlack(coin);
        coin = coins.getRed();
        coin--;
        coins.setRed(coin);
    }
    private void coinDeduct7(player player1) {
        player1.blueRegCoin++;
        player1.greenRegCoin++;
        player1.whiteRegCoin++;
        int coin = coins.getBlue();
        coin--;
        coins.setBlue(coin);
        coin = coins.getGreen();
        coin--;
        coins.setGreen(coin);
        coin = coins.getWhite();
        coin--;
        coins.setWhite(coin);
    }
    private void coinDeduct8(player player1) {
        player1.blueRegCoin++;
        player1.redRegCoin++;
        player1.whiteRegCoin++;
        int coin = coins.getBlue();
        coin--;
        coins.setBlue(coin);
        coin = coins.getRed();
        coin--;
        coins.setRed(coin);
        coin = coins.getWhite();
        coin--;
        coins.setWhite(coin);
    }
    private void coinDeduct9(player player1) {
        player1.greenRegCoin++;
        player1.redRegCoin++;
        player1.whiteRegCoin++;
        int coin = coins.getGreen();
        coin--;
        coins.setGreen(coin);
        coin = coins.getRed();
        coin--;
        coins.setRed(coin);
        coin = coins.getWhite();
        coin--;
        coins.setWhite(coin);
    }
    private void coinDeduct10(player player1) {
        player1.blueRegCoin++;
        player1.greenRegCoin++;
        player1.redRegCoin++;
        int coin = coins.getBlue();
        coin--;
        coins.setBlue(coin);
        coin = coins.getGreen();
        coin--;
        coins.setGreen(coin);
        coin = coins.getRed();
        coin--;
        coins.setRed(coin);
    }

    private void coinDeduct(player player1, String colorOfMach) {
        if(colorOfMach.equals("red")){
            player1.redRegCoin += 2;
            int coin = coins.getRed();
            coin-=2;
            coins.setRed(coin);
        }
        else if(colorOfMach.equals("black")){
            player1.blackRegCoin += 2;
            int coin = coins.getBlack();
            coin-=2;
            coins.setBlack(coin);
        }
        else if(colorOfMach.equals("white")){
            player1.whiteRegCoin += 2;
            int coin = coins.getWhite();
            coin-=2;
            coins.setWhite(coin);
        }
        else if(colorOfMach.equals("blue")){
            player1.blueRegCoin += 2;
            int coin = coins.getBlue();
            coin-=2;
            coins.setBlue(coin);
        }
        else {
            player1.greenRegCoin += 2;
            int coin = coins.getGreen();
            coin-=2;
            coins.setGreen(coin);
        }
    }
    //یارو کم کردن تعداد سکه ها متودش رو بنویسم


    public static void main(String[] args) {
        new Main();
    }
}
