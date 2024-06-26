import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

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
    JLabel coin1;
    JLabel specialCoins1;
    JLabel reservation1;
    JLabel points1;
    JLabel numCard1;
    JLabel coin2;
    JLabel specialCoins2;
    JLabel reservation2;
    JLabel points2;
    JLabel numCard2;
    JLabel underMachLabel1;
    JLabel underMachLabel2;
    JLabel underMachLabel3;
    JLabel underMachLabel4;
    JLabel underMachLabel5;
    JLabel underLabel1;
    JLabel underLabel2;
    JLabel underLabel3;
    JLabel underLabel4;
    JLabel underLabel5;
    JLabel underLabel6;
    JLabel underLabel7;
    JLabel underLabel8;
    JLabel underLabel9;
    JLabel underLabel10;
    JLabel underLabel11;
    JLabel underLabel12;
    JLabel underLabelClaw1;
    JLabel underLabelClaw2;
    JLabel underLabelClaw3;
    JLabel turn_player;


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

    public void initLeftPanel() {
        JPanel leftPanel = new JPanel(new GridLayout(13, 0, 0, 10));
        turn_player = new JLabel("PLAYER " + player.showPlayerTurn() + "'S TURN");
        JLabel playerOne = new JLabel("«PLAYER ONE»");
        coin1 = new JLabel("Coins: " + "Green=" + player1.greenRegCoin + ", White=" + player1.whiteRegCoin + ", Black=" + player1.blackRegCoin + ", red=" + player1.redRegCoin + ", blue=" + player1.blueRegCoin + " ");
        specialCoins1 = new JLabel("Special coins: " + "Green=" + player1.greenSpecCoin + ", White=" + player1.whiteSpecCoin + ", Black=" + player1.blackSpecCoin + ", red=" + player1.redSpecCoin + ", blue=" + player1.blueSpecCoin + ", Gold=" + player1.goldCoin + " ");
        reservation1 = new JLabel("Reserves:(Rank SpecialCoin)" + player1.reserveRank[0] + " " + player1.reserveSpecial[0] + "," + player1.reserveRank[1] + " " + player1.reserveSpecial[1] + "," + player1.reserveRank[2] + " " + player1.reserveSpecial[2] + " ");
        points1 = new JLabel("Points:" + player1.getPoints());
        numCard1 = new JLabel("Number of cards=" + player1.getNumOfCards());
        JLabel playerTwo = new JLabel("«PLAYER TWO»");
        coin2 = new JLabel("Coins: " + "Green=" + player2.greenRegCoin + ", White=" + player2.whiteRegCoin + ", Black=" + player2.blackRegCoin + ", red=" + player2.redRegCoin + ", blue=" + player2.blueRegCoin + " ");
        specialCoins2 = new JLabel("Special coins: " + "Green=" + player2.greenSpecCoin + ", White=" + player2.whiteSpecCoin + ", Black=" + player2.blackSpecCoin + ", red=" + player2.redSpecCoin + ", blue=" + player2.blueSpecCoin + ", Gold=" + player2.goldCoin + " ");
        reservation2 = new JLabel("Reserves:(Rank SpecialCoin)" + player2.reserveRank[0] + " " + player2.reserveSpecial[0] + "," + player2.reserveRank[1] + " " + player2.reserveSpecial[1] + "," + player2.reserveRank[2] + " " + player2.reserveSpecial[2] + " ");
        points2 = new JLabel("Points:" + player2.getPoints());
        numCard2 = new JLabel("Number of cards=" + player2.getNumOfCards());
        Font font = new Font(Font.DIALOG, Font.PLAIN, 15);
        labels(playerOne, coin1, specialCoins1, reservation1, points1, numCard1, font, Color.red, Color.pink);
        labels(playerTwo, coin2, specialCoins2, reservation2, points2, numCard2, font, Color.BLACK, Color.GRAY);
        turn_player.setFont(font);
        turn_player.setHorizontalTextPosition(SwingConstants.HORIZONTAL);
        turn_player.setForeground(Color.white);
        turn_player.setOpaque(true);
        turn_player.setBackground(Color.black);
        leftPanel.add(turn_player);
        leftPanel.add(playerOne);
        leftPanel.add(coin1);
        leftPanel.add(specialCoins1);
        leftPanel.add(reservation1);
        leftPanel.add(points1);
        leftPanel.add(numCard1);
        leftPanel.add(playerTwo);
        leftPanel.add(coin2);
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

    public void initRightPanel() {
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

        JLabel claw1rank = new JLabel(cards.clawRank1);
        JLabel claw2rank = new JLabel(cards.clawRank2);
        JLabel claw3rank = new JLabel(cards.clawRank3);
        JLabel claw1price = new JLabel(cards.claw1price);
        JLabel claw2price = new JLabel(cards.claw2price);
        JLabel claw3price = new JLabel(cards.claw3price);
        JLabel special = new JLabel();

        addComponent(rightPanel, claw, gbc, 0, 0, true, true, special, claw1rank, claw1price, Color.MAGENTA, prizeClaw.getClaw1(), "claw1");
        addComponent(rightPanel, claw, gbc, 1, 0, true, true, special, claw2rank, claw2price, Color.MAGENTA, prizeClaw.getClaw2(), "claw2");
        addComponent(rightPanel, claw, gbc, 2, 0, true, true, special, claw3rank, claw3price, Color.MAGENTA, prizeClaw.getClaw3(), "claw3");

        JLabel tent1rank = new JLabel(cards.tent1rank);
        JLabel tent2rank = new JLabel(cards.tent2rank);
        JLabel tent3rank = new JLabel(cards.tent3rank);
        JLabel tent4rank = new JLabel(cards.tent4rank);
        JLabel tent1price = new JLabel(cards.tent1price);
        JLabel tent2price = new JLabel(cards.tent2price);
        JLabel tent3price = new JLabel(cards.tent3price);
        JLabel tent4price = new JLabel(cards.tent4price);
        JLabel tent1special = new JLabel(cards.tent1special);
        JLabel tent2special = new JLabel(cards.tent2special);
        JLabel tent3special = new JLabel(cards.tent3special);
        JLabel tent4special = new JLabel(cards.tent4special);

        addComponent(rightPanel, tent, gbc, 0, 1, true, false, tent1special, tent1rank, tent1price, Color.BLUE, true, cards.getTent1(), 0, "tent1");
        addComponent(rightPanel, tent, gbc, 1, 1, true, false, tent2special, tent2rank, tent2price, Color.BLUE, true, cards.getTent2(), 0, "tent2");
        addComponent(rightPanel, tent, gbc, 2, 1, true, false, tent3special, tent3rank, tent3price, Color.BLUE, true, cards.getTent3(), 0, "tent3");
        addComponent(rightPanel, tent, gbc, 3, 1, true, false, tent4special, tent4rank, tent4price, Color.BLUE, true, cards.getTent4(), 0, "tent4");

        JLabel ferris1rank = new JLabel(cards.ferris1rank);
        JLabel ferris2rank = new JLabel(cards.ferris2rank);
        JLabel ferris3rank = new JLabel(cards.ferris3rank);
        JLabel ferris4rank = new JLabel(cards.ferris4rank);
        JLabel ferris1price = new JLabel(cards.ferris1price);
        JLabel ferris2price = new JLabel(cards.ferris2price);
        JLabel ferris3price = new JLabel(cards.ferris3price);
        JLabel ferris4price = new JLabel(cards.ferris4price);
        JLabel ferris1special = new JLabel(cards.ferris1special);
        JLabel ferris2special = new JLabel(cards.ferris2special);
        JLabel ferris3special = new JLabel(cards.ferris3special);
        JLabel ferris4special = new JLabel(cards.ferris4special);

        addComponent(rightPanel, ferris, gbc, 0, 2, true, false, ferris1special, ferris1rank, ferris1price, Color.RED, true, cards.getFerris1(), 0, "ferris1");
        addComponent(rightPanel, ferris, gbc, 1, 2, true, false, ferris2special, ferris2rank, ferris2price, Color.RED, true, cards.getFerris2(), 0, "ferris2");
        addComponent(rightPanel, ferris, gbc, 2, 2, true, false, ferris3special, ferris3rank, ferris3price, Color.RED, true, cards.getFerris3(), 0, "ferris3");
        addComponent(rightPanel, ferris, gbc, 3, 2, true, false, ferris4special, ferris4rank, ferris4price, Color.RED, true, cards.getFerris4(), 0, "ferris4");

        JLabel coaster1rank = new JLabel(cards.coaster1rank);
        JLabel coaster2rank = new JLabel(cards.coaster2rank);
        JLabel coaster3rank = new JLabel(cards.coaster3rank);
        JLabel coaster4rank = new JLabel(cards.coaster4rank);
        JLabel coaster1price = new JLabel(cards.coaster1price);
        JLabel coaster2price = new JLabel(cards.coaster2price);
        JLabel coaster3price = new JLabel(cards.coaster3price);
        JLabel coaster4price = new JLabel(cards.coaster4price);
        JLabel coaster1special = new JLabel(cards.coaster1special);
        JLabel coaster2special = new JLabel(cards.coaster2special);
        JLabel coaster3special = new JLabel(cards.coaster3special);
        JLabel coaster4special = new JLabel(cards.coaster4special);

        addComponent(rightPanel, coaster, gbc, 0, 3, true, false, coaster1special, coaster1rank, coaster1price, Color.DARK_GRAY, true, cards.getCoaster1(), 0, "coaster1");
        addComponent(rightPanel, coaster, gbc, 1, 3, true, false, coaster2special, coaster2rank, coaster2price, Color.DARK_GRAY, true, cards.getCoaster2(), 0, "coaster2");
        addComponent(rightPanel, coaster, gbc, 2, 3, true, false, coaster3special, coaster3rank, coaster3price, Color.DARK_GRAY, true, cards.getCoaster3(), 0, "coaster3");
        addComponent(rightPanel, coaster, gbc, 3, 3, true, false, coaster4special, coaster4rank, coaster4price, Color.DARK_GRAY, true, cards.getCoaster4(), 0, "coaster4");

        addComponent(rightPanel, black, gbc, 0, 4, false, false, special, special, special, Color.BLACK, false, 0, coins.getBlack(), "black");
        addComponent(rightPanel, white, gbc, 1, 4, false, false, special, special, special, Color.BLACK, false, 0, coins.getWhite(), "white");
        addComponent(rightPanel, green, gbc, 2, 4, false, false, special, special, special, Color.BLACK, false, 0, coins.getGreen(), "green");
        addComponent(rightPanel, blue, gbc, 3, 4, false, false, special, special, special, Color.BLACK, false, 0, coins.getBlue(), "blue");
        addComponent(rightPanel, red, gbc, 4, 4, false, false, special, special, special, Color.BLACK, false, 0, coins.getRed(), "red");
        JButton button1 = new JButton("Buy Reserve '1'");
        gbc.gridx = 0;
        gbc.gridy = 5;
        button1.setForeground(Color.red);
        button1.setOpaque(true);
        button1.setBackground(Color.pink);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (player.turnPlayer % 2 == 1) {
                    reserveBuy(player1);
                } else {
                    reserveBuy(player2);
                }
                coin1.setText("Coins: " + "Green=" + player1.greenRegCoin + ", White=" + player1.whiteRegCoin + ", Black=" + player1.blackRegCoin + ", red=" + player1.redRegCoin + ", blue=" + player1.blueRegCoin + " ");
                specialCoins1.setText("Special coins: " + "Green=" + player1.greenSpecCoin + ", White=" + player1.whiteSpecCoin + ", Black=" + player1.blackSpecCoin + ", red=" + player1.redSpecCoin + ", blue=" + player1.blueSpecCoin + ", Gold=" + player1.goldCoin + " ");
                reservation1.setText("Reserves:(Rank SpecialCoin)" + player1.reserveRank[0] + " " + player1.reserveSpecial[0] + "," + player1.reserveRank[1] + " " + player1.reserveSpecial[1] + "," + player1.reserveRank[2] + " " + player1.reserveSpecial[2] + " ");
                points1.setText("Points:" + player1.getPoints());
                numCard1.setText("Number of cards=" + player1.getNumOfCards());
                coin2.setText("Coins: " + "Green=" + player2.greenRegCoin + ", White=" + player2.whiteRegCoin + ", Black=" + player2.blackRegCoin + ", red=" + player2.redRegCoin + ", blue=" + player2.blueRegCoin + " ");
                specialCoins2.setText("Special coins: " + "Green=" + player2.greenSpecCoin + ", White=" + player2.whiteSpecCoin + ", Black=" + player2.blackSpecCoin + ", red=" + player2.redSpecCoin + ", blue=" + player2.blueSpecCoin + ", Gold=" + player2.goldCoin + " ");
                reservation2.setText("Reserves:(Rank SpecialCoin)" + player2.reserveRank[0] + " " + player2.reserveSpecial[0] + "," + player2.reserveRank[1] + " " + player2.reserveSpecial[1] + "," + player2.reserveRank[2] + " " + player2.reserveSpecial[2] + " ");
                points2.setText("Points:" + player2.getPoints());
                numCard2.setText("Number of cards=" + player2.getNumOfCards());
                underMachLabel1.setText(" Remaining coins = " + coins.getBlack());
                underMachLabel2.setText(" Remaining coins = " + coins.getWhite());
                underMachLabel3.setText(" Remaining coins = " + coins.getGreen());
                underMachLabel4.setText(" Remaining coins = " + coins.getBlue());
                underMachLabel5.setText(" Remaining coins = " + coins.getRed());
            }
        });
        rightPanel.add(button1, gbc);
        JButton button2 = new JButton("Buy Reserve '2'");
        gbc.gridx = 1;
        gbc.gridy = 5;
        button2.setForeground(Color.red);
        button2.setOpaque(true);
        button2.setBackground(Color.pink);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (player.turnPlayer % 2 == 1) {
                    reserveBuy2(player1);
                } else {
                    reserveBuy2(player2);
                }
                coin1.setText("Coins: " + "Green=" + player1.greenRegCoin + ", White=" + player1.whiteRegCoin + ", Black=" + player1.blackRegCoin + ", red=" + player1.redRegCoin + ", blue=" + player1.blueRegCoin + " ");
                specialCoins1.setText("Special coins: " + "Green=" + player1.greenSpecCoin + ", White=" + player1.whiteSpecCoin + ", Black=" + player1.blackSpecCoin + ", red=" + player1.redSpecCoin + ", blue=" + player1.blueSpecCoin + ", Gold=" + player1.goldCoin + " ");
                reservation1.setText("Reserves:(Rank SpecialCoin)" + player1.reserveRank[0] + " " + player1.reserveSpecial[0] + "," + player1.reserveRank[1] + " " + player1.reserveSpecial[1] + "," + player1.reserveRank[2] + " " + player1.reserveSpecial[2] + " ");
                points1.setText("Points:" + player1.getPoints());
                numCard1.setText("Number of cards=" + player1.getNumOfCards());
                coin2.setText("Coins: " + "Green=" + player2.greenRegCoin + ", White=" + player2.whiteRegCoin + ", Black=" + player2.blackRegCoin + ", red=" + player2.redRegCoin + ", blue=" + player2.blueRegCoin + " ");
                specialCoins2.setText("Special coins: " + "Green=" + player2.greenSpecCoin + ", White=" + player2.whiteSpecCoin + ", Black=" + player2.blackSpecCoin + ", red=" + player2.redSpecCoin + ", blue=" + player2.blueSpecCoin + ", Gold=" + player2.goldCoin + " ");
                reservation2.setText("Reserves:(Rank SpecialCoin)" + player2.reserveRank[0] + " " + player2.reserveSpecial[0] + "," + player2.reserveRank[1] + " " + player2.reserveSpecial[1] + "," + player2.reserveRank[2] + " " + player2.reserveSpecial[2] + " ");
                points2.setText("Points:" + player2.getPoints());
                numCard2.setText("Number of cards=" + player2.getNumOfCards());
                underMachLabel1.setText(" Remaining coins = " + coins.getBlack());
                underMachLabel2.setText(" Remaining coins = " + coins.getWhite());
                underMachLabel3.setText(" Remaining coins = " + coins.getGreen());
                underMachLabel4.setText(" Remaining coins = " + coins.getBlue());
                underMachLabel5.setText(" Remaining coins = " + coins.getRed());
            }
        });
        rightPanel.add(button2, gbc);
        JButton button3 = new JButton("Buy Reserve '3'");
        gbc.gridx = 2;
        gbc.gridy = 5;
        button3.setForeground(Color.red);
        button3.setOpaque(true);
        button3.setBackground(Color.pink);
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (player.turnPlayer % 2 == 1) {
                    reserveBuy3(player1);
                } else {
                    reserveBuy3(player2);
                }
                coin1.setText("Coins: " + "Green=" + player1.greenRegCoin + ", White=" + player1.whiteRegCoin + ", Black=" + player1.blackRegCoin + ", red=" + player1.redRegCoin + ", blue=" + player1.blueRegCoin + " ");
                specialCoins1.setText("Special coins: " + "Green=" + player1.greenSpecCoin + ", White=" + player1.whiteSpecCoin + ", Black=" + player1.blackSpecCoin + ", red=" + player1.redSpecCoin + ", blue=" + player1.blueSpecCoin + ", Gold=" + player1.goldCoin + " ");
                reservation1.setText("Reserves:(Rank SpecialCoin)" + player1.reserveRank[0] + " " + player1.reserveSpecial[0] + "," + player1.reserveRank[1] + " " + player1.reserveSpecial[1] + "," + player1.reserveRank[2] + " " + player1.reserveSpecial[2] + " ");
                points1.setText("Points:" + player1.getPoints());
                numCard1.setText("Number of cards=" + player1.getNumOfCards());
                coin2.setText("Coins: " + "Green=" + player2.greenRegCoin + ", White=" + player2.whiteRegCoin + ", Black=" + player2.blackRegCoin + ", red=" + player2.redRegCoin + ", blue=" + player2.blueRegCoin + " ");
                specialCoins2.setText("Special coins: " + "Green=" + player2.greenSpecCoin + ", White=" + player2.whiteSpecCoin + ", Black=" + player2.blackSpecCoin + ", red=" + player2.redSpecCoin + ", blue=" + player2.blueSpecCoin + ", Gold=" + player2.goldCoin + " ");
                reservation2.setText("Reserves:(Rank SpecialCoin)" + player2.reserveRank[0] + " " + player2.reserveSpecial[0] + "," + player2.reserveRank[1] + " " + player2.reserveSpecial[1] + "," + player2.reserveRank[2] + " " + player2.reserveSpecial[2] + " ");
                points2.setText("Points:" + player2.getPoints());
                numCard2.setText("Number of cards=" + player2.getNumOfCards());
                underMachLabel1.setText(" Remaining coins = " + coins.getBlack());
                underMachLabel2.setText(" Remaining coins = " + coins.getWhite());
                underMachLabel3.setText(" Remaining coins = " + coins.getGreen());
                underMachLabel4.setText(" Remaining coins = " + coins.getBlue());
                underMachLabel5.setText(" Remaining coins = " + coins.getRed());
            }
        });
        rightPanel.add(button3, gbc);
        rightPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        add(rightPanel, BorderLayout.EAST);
    }

    private void reserveArray(player player1) {
        player1.reservePrice[0] = player1.reservePrice[1];
        player1.reserveRank[0] = player1.reserveRank[1];
        player1.reserveSpecial[0] = player1.reserveSpecial[1];
        player1.reservePrice[1] = player1.reservePrice[2];
        player1.reserveRank[1] = player1.reserveRank[2];
        player1.reserveSpecial[1] = player1.reserveSpecial[2];
        player1.reservePrice[2] = null;
        player1.reserveRank[2] = 0;
        player1.reserveSpecial[2] = null;
    }

    private void reserveArray2(player player1) {
        player1.reservePrice[1] = player1.reservePrice[2];
        player1.reserveRank[1] = player1.reserveRank[2];
        player1.reserveSpecial[1] = player1.reserveSpecial[2];
        player1.reservePrice[2] = null;
        player1.reserveRank[2] = 0;
        player1.reserveSpecial[2] = null;
    }

    private void reserveArray3(player player1) {
        player1.reservePrice[2] = null;
        player1.reserveRank[2] = 0;
        player1.reserveSpecial[2] = null;
    }

    private void reserveBuy(player player1) {
        if (player1.reservePrice[0] == null) {
            JOptionPane.showMessageDialog(Main.this, "You haven't reserved a card yet");
        } else if (player1.reservePrice[0] == null) {
            JOptionPane.showMessageDialog(Main.this, "You haven't reserved a card yet");
        } else if (player1.reservePrice[0].equals("4 Red")) {
            if (player1.redRegCoin >= 4) {
                int point = player1.getPoints();
                point += 0;
                player1.setPoints(point);
                player1.redRegCoin -= 4;
                int coin = coins.getRed();
                coin += 4;
                coins.setRed(coin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.redSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                reserveArray(player1);
            } else if (player1.redSpecCoin + player1.redRegCoin >= 4) {
                int point = player1.getPoints();
                point += 0;
                player1.setPoints(point);
                int coin = coins.getRed();
                coin += player1.redRegCoin;
                coins.setRed(coin);
                player1.redRegCoin = 0;
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.redSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                reserveArray(player1);
            } else if (player1.redRegCoin + player1.goldCoin >= 4) {
                int point = player1.getPoints();
                point += 0;
                player1.setPoints(point);
                int coin = coins.getRed();
                coin += player1.redRegCoin;
                coins.setRed(coin);
                player1.goldCoin -= (4 - player1.redRegCoin);
                int gold = coins.getGold();
                gold += (4 - player1.redRegCoin);
                coins.setGold(gold);
                player1.redRegCoin = 0;
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.redSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                reserveArray(player1);
            } else {
                JOptionPane.showMessageDialog(Main.this, "You dont have enough coins to buy this card!");
            }
        } else if (player1.reservePrice[0].equals("2 White + 3 Blue")) {
            if (player1.blueRegCoin + player1.blueSpecCoin >= 3 && player1.whiteRegCoin + player1.whiteSpecCoin >= 2) {
                int point = player1.getPoints();
                point += 1;
                player1.setPoints(point);
                player1.whiteRegCoin -= 2;
                player1.blueRegCoin -= 3;
                int coin = coins.getWhite();
                if (player1.whiteRegCoin < 0)
                    coin += (player1.whiteRegCoin + 2);
                else
                    coin += 2;
                coins.setWhite(coin);
                coin = coins.getBlue();
                if (player1.blueRegCoin < 0)
                    coin += (player1.blueRegCoin + 3);
                else
                    coin += 3;
                coins.setBlue(coin);
                player1.setWhiteRegCoin(player1.whiteRegCoin);
                player1.setBlueRegCoin(player1.blueRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.blueSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                reserveArray(player1);
            } else if (player1.blueRegCoin + player1.goldCoin >= 3 && player1.whiteRegCoin + player1.goldCoin >= 2) {
                int point = player1.getPoints();
                point += 1;
                player1.setPoints(point);
                player1.whiteRegCoin -= 2;
                player1.blueRegCoin -= 3;
                int coin = coins.getWhite();
                if (player1.whiteRegCoin < 0)
                    coin += (player1.whiteRegCoin + 2);
                else
                    coin += 2;
                coins.setWhite(coin);
                coin = coins.getBlue();
                if (player1.blueRegCoin < 0)
                    coin += (player1.blueRegCoin + 3);
                else
                    coin += 3;
                coins.setBlue(coin);
                int gold = coins.getGold();
                if (player1.whiteRegCoin < 0) {
                    gold += (-player1.whiteRegCoin);
                    player1.goldCoin -= (-player1.whiteRegCoin);
                }
                if (player1.blueRegCoin < 0) {
                    gold += (-player1.blueRegCoin);
                    player1.goldCoin -= (-player1.blueRegCoin);
                }
                coins.setGold(gold);
                player1.setGreenRegCoin(player1.whiteRegCoin);
                player1.setBlackRegCoin(player1.blueRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.blueSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                reserveArray(player1);
            } else {
                JOptionPane.showMessageDialog(Main.this, "You dont have enough coins to buy this card!");
            }
        } else if (player1.reservePrice[0].equals("1 Green + 5 Black")) {
            if (player1.greenRegCoin + player1.greenSpecCoin >= 1 && player1.blackRegCoin + player1.blackSpecCoin >= 5) {
                int point = player1.getPoints();
                point += 1;
                player1.setPoints(point);
                player1.greenRegCoin -= 1;
                player1.blackRegCoin -= 5;
                int coin = coins.getGreen();
                if (player1.greenRegCoin < 0)
                    coin += (player1.greenRegCoin + 1);
                else
                    coin += 2;
                coins.setGreen(coin);
                coin = coins.getBlack();
                if (player1.blackRegCoin < 0)
                    coin += (player1.blackRegCoin + 5);
                else
                    coin += 5;
                coins.setBlack(coin);
                player1.setBlackRegCoin(player1.blackRegCoin);
                player1.setGreenRegCoin(player1.greenRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.greenSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                reserveArray(player1);
            } else if (player1.blackRegCoin + player1.goldCoin >= 5 && player1.greenRegCoin + player1.goldCoin >= 1) {
                int point = player1.getPoints();
                point += 0;
                player1.setPoints(point);
                player1.greenRegCoin -= 1;
                player1.blackRegCoin -= 5;
                int coin = coins.getGreen();
                if (player1.greenRegCoin < 0)
                    coin += (player1.greenRegCoin + 1);
                else
                    coin += 1;
                coins.setGreen(coin);
                coin = coins.getBlack();
                if (player1.blackRegCoin < 0)
                    coin += (player1.blackRegCoin + 5);
                else
                    coin += 5;
                coins.setBlack(coin);
                int gold = coins.getGold();
                if (player1.greenRegCoin < 0) {
                    gold += (-player1.greenRegCoin);
                    player1.goldCoin -= (-player1.greenRegCoin);
                }
                if (player1.blackRegCoin < 0) {
                    gold += (-player1.blackRegCoin);
                    player1.goldCoin -= (-player1.blackRegCoin);
                }
                coins.setGold(gold);
                player1.setWhiteRegCoin(player1.greenRegCoin);
                player1.setBlueRegCoin(player1.blackRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.greenSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                reserveArray(player1);
            } else {
                JOptionPane.showMessageDialog(Main.this, "You dont have enough coins to buy this card!");
            }
        } else if (player1.reservePrice[0].equals("2 Red + 2 Green")) {
            if (player1.redRegCoin + player1.redSpecCoin >= 2 && player1.greenRegCoin + player1.greenSpecCoin >= 2) {
                int point = player1.getPoints();
                point += 0;
                player1.setPoints(point);
                player1.redRegCoin -= 2;
                player1.greenRegCoin -= 2;
                int coin = coins.getRed();
                if (player1.redRegCoin < 0)
                    coin += (player1.redRegCoin + 2);
                else
                    coin += 2;
                coins.setRed(coin);
                coin = coins.getGreen();
                if (player1.greenRegCoin < 0)
                    coin += (player1.greenRegCoin + 2);
                else
                    coin += 2;
                coins.setGreen(coin);
                player1.setRedRegCoin(player1.redRegCoin);
                player1.setGreenRegCoin(player1.greenRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.blackSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                reserveArray(player1);
            } else if (player1.greenRegCoin + player1.goldCoin >= 2 && player1.redRegCoin + player1.goldCoin >= 2) {
                int point = player1.getPoints();
                point += 0;
                player1.setPoints(point);
                player1.redRegCoin -= 2;
                player1.greenRegCoin -= 2;
                int coin = coins.getRed();
                if (player1.redRegCoin < 0)
                    coin += (player1.redRegCoin + 2);
                else
                    coin += 2;
                coins.setRed(coin);
                coin = coins.getGreen();
                if (player1.greenRegCoin < 0)
                    coin += (player1.greenRegCoin + 3);
                else
                    coin += 2;
                coins.setGreen(coin);
                int gold = coins.getGold();
                if (player1.redRegCoin < 0) {
                    gold += (-player1.redRegCoin);
                    player1.goldCoin -= (-player1.redRegCoin);
                }
                if (player1.greenRegCoin < 0) {
                    gold += (-player1.greenRegCoin);
                    player1.goldCoin -= (-player1.greenRegCoin);
                }
                coins.setGold(gold);
                player1.setGreenRegCoin(player1.greenRegCoin);
                player1.setRedRegCoin(player1.redRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.blackSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                reserveArray(player1);
            } else {
                JOptionPane.showMessageDialog(Main.this, "You dont have enough coins to buy this card!");
            }
        } else if (player1.reservePrice[0].equals("2 Red + 2 Blue + 2 White")) {
            if (player1.redRegCoin + player1.redSpecCoin >= 2 && player1.blueRegCoin + player1.blueSpecCoin >= 2 && player1.whiteRegCoin + player1.whiteSpecCoin >= 2) {
                int point = player1.getPoints();
                point += 2;
                player1.setPoints(point);
                player1.redRegCoin -= 2;
                player1.blueRegCoin -= 2;
                player1.whiteRegCoin -= 2;
                int coin = coins.getRed();
                if (player1.redRegCoin < 0)
                    coin += (player1.redRegCoin + 2);
                else
                    coin += 2;
                coins.setRed(coin);
                coin = coins.getBlue();
                if (player1.blueRegCoin < 0)
                    coin += (player1.blueRegCoin + 2);
                else
                    coin += 2;
                coins.setBlue(coin);
                coin = coins.getWhite();
                if (player1.whiteRegCoin < 0)
                    coin += (player1.whiteRegCoin + 2);
                else
                    coin += 2;
                coins.setWhite(coin);
                player1.setRedRegCoin(player1.redRegCoin);
                player1.setBlueRegCoin(player1.blueRegCoin);
                player1.setWhiteRegCoin(player1.whiteRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.redSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                reserveArray(player1);
            } else if (player1.redRegCoin + player1.goldCoin >= 2 && player1.whiteRegCoin + player1.goldCoin >= 2 && player1.blueRegCoin + player1.goldCoin >= 2) {
                int point = player1.getPoints();
                point += 2;
                player1.setPoints(point);
                player1.redRegCoin -= 2;
                player1.blueRegCoin -= 2;
                player1.whiteRegCoin -= 2;
                int coin = coins.getRed();
                if (player1.redRegCoin < 0)
                    coin += (player1.redRegCoin + 2);
                else
                    coin += 2;
                coins.setRed(coin);
                coin = coins.getBlue();
                if (player1.blueRegCoin < 0)
                    coin += (player1.blueRegCoin + 2);
                else
                    coin += 2;
                coins.setBlue(coin);
                coin = coins.getWhite();
                if (player1.whiteRegCoin < 0)
                    coin += (player1.whiteRegCoin + 2);
                else
                    coin += 2;
                coins.setWhite(coin);
                int gold = coins.getGold();
                if (player1.redRegCoin < 0) {
                    gold += (-player1.redRegCoin);
                    player1.goldCoin -= (-player1.redRegCoin);
                }
                if (player1.blueRegCoin < 0) {
                    gold += (-player1.blueRegCoin);
                    player1.goldCoin -= (-player1.blueRegCoin);
                }
                if (player1.whiteRegCoin < 0) {
                    gold += (-player1.whiteRegCoin);
                    player1.goldCoin -= (-player1.whiteRegCoin);
                }
                coins.setGold(gold);
                player1.setBlueRegCoin(player1.blueRegCoin);
                player1.setRedRegCoin(player1.redRegCoin);
                player1.setWhiteRegCoin(player1.whiteRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.redSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                reserveArray(player1);
            }
        } else if (player1.reservePrice[0].equals("6 Black + 2 Green")) {
            if (player1.blackRegCoin + player1.blackSpecCoin >= 6 && player1.greenRegCoin + player1.greenSpecCoin >= 2) {
                int point = player1.getPoints();
                point += 3;
                player1.setPoints(point);
                player1.blackRegCoin -= 6;
                player1.greenRegCoin -= 2;
                int coin = coins.getBlack();
                if (player1.blackRegCoin < 0)
                    coin += (player1.blackRegCoin + 6);
                else
                    coin += 6;
                coins.setBlack(coin);
                coin = coins.getGreen();
                if (player1.greenRegCoin < 0)
                    coin += (player1.greenRegCoin + 2);
                else
                    coin += 2;
                coins.setGreen(coin);
                player1.setGreenRegCoin(player1.greenRegCoin);
                player1.setBlackRegCoin(player1.blackRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.blackSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                reserveArray(player1);
            } else if (player1.greenRegCoin + player1.goldCoin >= 2 && player1.blackRegCoin + player1.goldCoin >= 6) {
                int point = player1.getPoints();
                point += 2;
                player1.setPoints(point);
                player1.blackRegCoin -= 6;
                player1.greenRegCoin -= 2;
                int coin = coins.getGreen();
                if (player1.greenRegCoin < 0)
                    coin += (player1.greenRegCoin + 2);
                else
                    coin += 2;
                coins.setGreen(coin);
                coin = coins.getBlack();
                if (player1.blackRegCoin < 0)
                    coin += (player1.blackRegCoin + 6);
                else
                    coin += 6;
                coins.setBlack(coin);
                int gold = coins.getGold();
                if (player1.greenRegCoin < 0) {
                    gold += (-player1.greenRegCoin);
                    player1.goldCoin -= (-player1.greenRegCoin);
                }
                if (player1.blackRegCoin < 0) {
                    gold += (-player1.blackRegCoin);
                    player1.goldCoin -= (-player1.blackRegCoin);
                }
                coins.setGold(gold);
                player1.setBlackRegCoin(player1.blackRegCoin);
                player1.setGreenRegCoin(player1.greenRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.blackSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                reserveArray(player1);
            } else {
                JOptionPane.showMessageDialog(Main.this, "You dont have enough coins to buy this card!");
            }
        } else if (player1.reservePrice[0].equals("4 Blue + 3 White")) {
            if (player1.blueRegCoin + player1.blueSpecCoin >= 4 && player1.whiteRegCoin + player1.whiteSpecCoin >= 3) {
                int point = player1.getPoints();
                point += 4;
                player1.setPoints(point);
                player1.blueRegCoin -= 4;
                player1.whiteRegCoin -= 3;
                int coin = coins.getBlue();
                if (player1.blueRegCoin < 0)
                    coin += (player1.blueRegCoin + 4);
                else
                    coin += 4;
                coins.setBlue(coin);
                coin = coins.getWhite();
                if (player1.whiteRegCoin < 0)
                    coin += (player1.whiteRegCoin + 3);
                else
                    coin += 3;
                coins.setWhite(coin);
                player1.setWhiteRegCoin(player1.whiteRegCoin);
                player1.setBlueRegCoin(player1.blueRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.greenSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                reserveArray(player1);
            } else if (player1.whiteRegCoin + player1.goldCoin >= 3 && player1.blueRegCoin + player1.goldCoin >= 4) {
                int point = player1.getPoints();
                point += 4;
                player1.setPoints(point);
                player1.blueRegCoin -= 4;
                player1.whiteRegCoin -= 3;
                int coin = coins.getWhite();
                if (player1.whiteRegCoin < 0)
                    coin += (player1.whiteRegCoin + 3);
                else
                    coin += 3;
                coins.setWhite(coin);
                coin = coins.getBlue();
                if (player1.blueRegCoin < 0)
                    coin += (player1.blueRegCoin + 4);
                else
                    coin += 4;
                coins.setBlue(coin);
                int gold = coins.getGold();
                if (player1.whiteRegCoin < 0) {
                    gold += (-player1.whiteRegCoin);
                    player1.goldCoin -= (-player1.whiteRegCoin);
                }
                if (player1.blueRegCoin < 0) {
                    gold += (-player1.blueRegCoin);
                    player1.goldCoin -= (-player1.blueRegCoin);
                }
                coins.setGold(gold);
                player1.setBlueRegCoin(player1.blueRegCoin);
                player1.setWhiteRegCoin(player1.whiteRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.greenSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                reserveArray(player1);
            } else {
                JOptionPane.showMessageDialog(Main.this, "You dont have enough coins to buy this card!");
            }
        } else if (player1.reservePrice[0].equals("3 Red + 3 White")) {
            if (player1.redRegCoin + player1.redSpecCoin >= 3 && player1.whiteRegCoin + player1.whiteSpecCoin >= 3) {
                int point = player1.getPoints();
                point += 2;
                player1.setPoints(point);
                player1.redRegCoin -= 3;
                player1.whiteRegCoin -= 3;
                int coin = coins.getRed();
                if (player1.redRegCoin < 0)
                    coin += (player1.redRegCoin + 3);
                else
                    coin += 3;
                coins.setRed(coin);
                coin = coins.getWhite();
                if (player1.whiteRegCoin < 0)
                    coin += (player1.whiteRegCoin + 3);
                else
                    coin += 3;
                coins.setWhite(coin);
                player1.setWhiteRegCoin(player1.whiteRegCoin);
                player1.setRedRegCoin(player1.redRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.whiteSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                reserveArray(player1);
            } else if (player1.whiteRegCoin + player1.goldCoin >= 3 && player1.redRegCoin + player1.goldCoin >= 3) {
                int point = player1.getPoints();
                point += 2;
                player1.setPoints(point);
                player1.redRegCoin -= 3;
                player1.whiteRegCoin -= 3;
                int coin = coins.getWhite();
                if (player1.whiteRegCoin < 0)
                    coin += (player1.whiteRegCoin + 3);
                else
                    coin += 3;
                coins.setWhite(coin);
                coin = coins.getRed();
                if (player1.redRegCoin < 0)
                    coin += (player1.redRegCoin + 3);
                else
                    coin += 3;
                coins.setRed(coin);
                int gold = coins.getGold();
                if (player1.whiteRegCoin < 0) {
                    gold += (-player1.whiteRegCoin);
                    player1.goldCoin -= (-player1.whiteRegCoin);
                }
                if (player1.redRegCoin < 0) {
                    gold += (-player1.redRegCoin);
                    player1.goldCoin -= (-player1.redRegCoin);
                }
                coins.setGold(gold);
                player1.setRedRegCoin(player1.redRegCoin);
                player1.setWhiteRegCoin(player1.whiteRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.whiteSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                reserveArray(player1);
            } else {
                JOptionPane.showMessageDialog(Main.this, "You dont have enough coins to buy this card!");
            }
        } else if (player1.reservePrice[0].equals("4 Green + 3 Blue")) {
            if (player1.blueRegCoin + player1.blueSpecCoin >= 3 && player1.greenRegCoin + player1.greenSpecCoin >= 4) {
                int point = player1.getPoints();
                point += 3;
                player1.setPoints(point);
                player1.blueRegCoin -= 3;
                player1.greenRegCoin -= 4;
                int coin = coins.getBlue();
                if (player1.blueRegCoin < 0)
                    coin += (player1.blueRegCoin + 3);
                else
                    coin += 3;
                coins.setBlue(coin);
                coin = coins.getGreen();
                if (player1.greenRegCoin < 0)
                    coin += (player1.greenRegCoin + 4);
                else
                    coin += 4;
                coins.setGreen(coin);
                player1.setGreenRegCoin(player1.greenRegCoin);
                player1.setBlueRegCoin(player1.blueRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.whiteSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                reserveArray(player1);
            } else if (player1.greenRegCoin + player1.goldCoin >= 4 && player1.blueRegCoin + player1.goldCoin >= 3) {
                int point = player1.getPoints();
                point += 3;
                player1.setPoints(point);
                player1.blueRegCoin -= 3;
                player1.greenRegCoin -= 4;
                int coin = coins.getGreen();
                if (player1.greenRegCoin < 0)
                    coin += (player1.whiteRegCoin + 4);
                else
                    coin += 4;
                coins.setGreen(coin);
                coin = coins.getBlue();
                if (player1.blueRegCoin < 0)
                    coin += (player1.blueRegCoin + 3);
                else
                    coin += 3;
                coins.setBlue(coin);
                int gold = coins.getGold();
                if (player1.greenRegCoin < 0) {
                    gold += (-player1.greenRegCoin);
                    player1.goldCoin -= (-player1.greenRegCoin);
                }
                if (player1.blueRegCoin < 0) {
                    gold += (-player1.blueRegCoin);
                    player1.goldCoin -= (-player1.blueRegCoin);
                }
                coins.setGold(gold);
                player1.setBlueRegCoin(player1.blueRegCoin);
                player1.setGreenRegCoin(player1.greenRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.whiteSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                reserveArray(player1);
            } else {
                JOptionPane.showMessageDialog(Main.this, "You dont have enough coins to buy this card!");
            }
        } else if (player1.reservePrice[0].equals("5 White + 3 Blue")) {
            if (player1.blueRegCoin + player1.blueSpecCoin >= 3 && player1.whiteRegCoin + player1.whiteSpecCoin >= 5) {
                int point = player1.getPoints();
                point += 4;
                player1.setPoints(point);
                player1.blueRegCoin -= 3;
                player1.whiteRegCoin -= 5;
                int coin = coins.getBlue();
                if (player1.blueRegCoin < 0)
                    coin += (player1.blueRegCoin + 3);
                else
                    coin += 3;
                coins.setBlue(coin);
                coin = coins.getWhite();
                if (player1.whiteRegCoin < 0)
                    coin += (player1.whiteRegCoin + 5);
                else
                    coin += 5;
                coins.setWhite(coin);
                player1.setWhiteRegCoin(player1.whiteRegCoin);
                player1.setBlueRegCoin(player1.blueRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.blueSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                reserveArray(player1);
            } else if (player1.whiteRegCoin + player1.goldCoin >= 5 && player1.blueRegCoin + player1.goldCoin >= 3) {
                int point = player1.getPoints();
                point += 4;
                player1.setPoints(point);
                player1.blueRegCoin -= 3;
                player1.whiteRegCoin -= 5;
                int coin = coins.getWhite();
                if (player1.whiteRegCoin < 0)
                    coin += (player1.whiteRegCoin + 5);
                else
                    coin += 5;
                coins.setWhite(coin);
                coin = coins.getBlue();
                if (player1.blueRegCoin < 0)
                    coin += (player1.blueRegCoin + 3);
                else
                    coin += 3;
                coins.setBlue(coin);
                int gold = coins.getGold();
                if (player1.whiteRegCoin < 0) {
                    gold += (-player1.whiteRegCoin);
                    player1.goldCoin -= (-player1.whiteRegCoin);
                }
                if (player1.blueRegCoin < 0) {
                    gold += (-player1.blueRegCoin);
                    player1.goldCoin -= (-player1.blueRegCoin);
                }
                coins.setGold(gold);
                player1.setBlueRegCoin(player1.blueRegCoin);
                player1.setWhiteRegCoin(player1.whiteRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.blueSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                reserveArray(player1);
            } else {
                JOptionPane.showMessageDialog(Main.this, "You dont have enough coins to buy this card!");
            }
        } else if (player1.reservePrice[0].equals("4 Red + 3 Black + 2 White")) {
            if (player1.redRegCoin + player1.redSpecCoin >= 4 && player1.blackRegCoin + player1.blackSpecCoin >= 3 && player1.whiteRegCoin + player1.whiteSpecCoin >= 2) {
                int point = player1.getPoints();
                point += 4;
                player1.setPoints(point);
                player1.redRegCoin -= 4;
                player1.blackRegCoin -= 3;
                player1.whiteRegCoin -= 2;
                int coin = coins.getRed();
                if (player1.redRegCoin < 0)
                    coin += (player1.redRegCoin + 4);
                else
                    coin += 4;
                coins.setRed(coin);
                coin = coins.getBlack();
                if (player1.blackRegCoin < 0)
                    coin += (player1.blueRegCoin + 3);
                else
                    coin += 3;
                coins.setBlack(coin);
                coin = coins.getWhite();
                if (player1.whiteRegCoin < 0)
                    coin += (player1.whiteRegCoin + 2);
                else
                    coin += 2;
                coins.setWhite(coin);
                player1.setRedRegCoin(player1.redRegCoin);
                player1.setBlackRegCoin(player1.blackRegCoin);
                player1.setWhiteRegCoin(player1.whiteRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.redSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                reserveArray(player1);
            } else if (player1.redRegCoin + player1.goldCoin >= 4 && player1.whiteRegCoin + player1.goldCoin >= 2 && player1.blackRegCoin + player1.goldCoin >= 3) {
                int point = player1.getPoints();
                point += 4;
                player1.setPoints(point);
                player1.redRegCoin -= 4;
                player1.blackRegCoin -= 3;
                player1.whiteRegCoin -= 2;
                int coin = coins.getRed();
                if (player1.redRegCoin < 0)
                    coin += (player1.redRegCoin + 4);
                else
                    coin += 4;
                coins.setRed(coin);
                coin = coins.getBlack();
                if (player1.blackRegCoin < 0)
                    coin += (player1.blackRegCoin + 3);
                else
                    coin += 3;
                coins.setBlack(coin);
                coin = coins.getWhite();
                if (player1.whiteRegCoin < 0)
                    coin += (player1.whiteRegCoin + 2);
                else
                    coin += 2;
                coins.setWhite(coin);
                int gold = coins.getGold();
                if (player1.redRegCoin < 0) {
                    gold += (-player1.redRegCoin);
                    player1.goldCoin -= (-player1.redRegCoin);
                }
                if (player1.blackRegCoin < 0) {
                    gold += (-player1.blackRegCoin);
                    player1.goldCoin -= (-player1.blackRegCoin);
                }
                if (player1.whiteRegCoin < 0) {
                    gold += (-player1.whiteRegCoin);
                    player1.goldCoin -= (-player1.whiteRegCoin);
                }
                coins.setGold(gold);
                player1.setBlackRegCoin(player1.blackRegCoin);
                player1.setRedRegCoin(player1.redRegCoin);
                player1.setWhiteRegCoin(player1.whiteRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.redSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                reserveArray(player1);
            } else {
                JOptionPane.showMessageDialog(Main.this, "You dont have enough coins to buy this card!");
            }
        } else if (player1.reservePrice[0].equals("3 Red + 4 Green + 3 Black")) {
            if (player1.redRegCoin + player1.redSpecCoin >= 3 && player1.blackRegCoin + player1.blackSpecCoin >= 3 && player1.greenRegCoin + player1.greenSpecCoin >= 4) {
                int point = player1.getPoints();
                point += 5;
                player1.setPoints(point);
                player1.redRegCoin -= 3;
                player1.blackRegCoin -= 3;
                player1.greenRegCoin -= 4;
                int coin = coins.getRed();
                if (player1.redRegCoin < 0)
                    coin += (player1.redRegCoin + 3);
                else
                    coin += 3;
                coins.setRed(coin);
                coin = coins.getBlack();
                if (player1.blackRegCoin < 0)
                    coin += (player1.blueRegCoin + 3);
                else
                    coin += 3;
                coins.setBlack(coin);
                coin = coins.getGreen();
                if (player1.greenRegCoin < 0)
                    coin += (player1.greenRegCoin + 4);
                else
                    coin += 4;
                coins.setGreen(coin);
                player1.setRedRegCoin(player1.redRegCoin);
                player1.setBlackRegCoin(player1.blackRegCoin);
                player1.setGreenRegCoin(player1.greenRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.blackSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                reserveArray(player1);
            } else if (player1.redRegCoin + player1.goldCoin >= 3 && player1.greenRegCoin + player1.goldCoin >= 4 && player1.blackRegCoin + player1.goldCoin >= 3) {
                int point = player1.getPoints();
                point += 4;
                player1.setPoints(point);
                player1.redRegCoin -= 3;
                player1.blackRegCoin -= 3;
                player1.greenRegCoin -= 4;
                int coin = coins.getRed();
                if (player1.redRegCoin < 0)
                    coin += (player1.redRegCoin + 3);
                else
                    coin += 3;
                coins.setRed(coin);
                coin = coins.getBlack();
                if (player1.blackRegCoin < 0)
                    coin += (player1.blackRegCoin + 3);
                else
                    coin += 3;
                coins.setBlack(coin);
                coin = coins.getGreen();
                if (player1.greenRegCoin < 0)
                    coin += (player1.greenRegCoin + 4);
                else
                    coin += 4;
                coins.setGreen(coin);
                int gold = coins.getGold();
                if (player1.redRegCoin < 0) {
                    gold += (-player1.redRegCoin);
                    player1.goldCoin -= (-player1.redRegCoin);
                }
                if (player1.blackRegCoin < 0) {
                    gold += (-player1.blackRegCoin);
                    player1.goldCoin -= (-player1.blackRegCoin);
                }
                if (player1.greenRegCoin < 0) {
                    gold += (-player1.greenRegCoin);
                    player1.goldCoin -= (-player1.greenRegCoin);
                }
                coins.setGold(gold);
                player1.setBlackRegCoin(player1.blackRegCoin);
                player1.setRedRegCoin(player1.redRegCoin);
                player1.setGreenRegCoin(player1.greenRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.blackSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                reserveArray(player1);
            } else {
                JOptionPane.showMessageDialog(Main.this, "You dont have enough coins to buy this card!");
            }
        }
    }

    private void reserveBuy2(player player1) {
        if (player1.reservePrice[1] == null) {
            JOptionPane.showMessageDialog(Main.this, "You haven't reserved a card yet");
        } else if (player1.reservePrice[1].equals("4 Red")) {
            if (player1.redRegCoin >= 4) {
                int point = player1.getPoints();
                point += 0;
                player1.setPoints(point);
                player1.redRegCoin -= 4;
                int coin = coins.getRed();
                coin += 4;
                coins.setRed(coin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.redSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                reserveArray2(player1);
            } else if (player1.redSpecCoin + player1.redRegCoin >= 4) {
                int point = player1.getPoints();
                point += 0;
                player1.setPoints(point);
                int coin = coins.getRed();
                coin += player1.redRegCoin;
                coins.setRed(coin);
                player1.redRegCoin = 0;
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.redSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                reserveArray2(player1);
            } else if (player1.redRegCoin + player1.goldCoin >= 4) {
                int point = player1.getPoints();
                point += 0;
                player1.setPoints(point);
                int coin = coins.getRed();
                coin += player1.redRegCoin;
                coins.setRed(coin);
                player1.goldCoin -= (4 - player1.redRegCoin);
                int gold = coins.getGold();
                gold += (4 - player1.redRegCoin);
                coins.setGold(gold);
                player1.redRegCoin = 0;
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.redSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                reserveArray2(player1);
            } else {
                JOptionPane.showMessageDialog(Main.this, "You dont have enough coins to buy this card!");
            }
        } else if (player1.reservePrice[1].equals("2 White + 3 Blue")) {
            if (player1.blueRegCoin + player1.blueSpecCoin >= 3 && player1.whiteRegCoin + player1.whiteSpecCoin >= 2) {
                int point = player1.getPoints();
                point += 1;
                player1.setPoints(point);
                player1.whiteRegCoin -= 2;
                player1.blueRegCoin -= 3;
                int coin = coins.getWhite();
                if (player1.whiteRegCoin < 0)
                    coin += (player1.whiteRegCoin + 2);
                else
                    coin += 2;
                coins.setWhite(coin);
                coin = coins.getBlue();
                if (player1.blueRegCoin < 0)
                    coin += (player1.blueRegCoin + 3);
                else
                    coin += 3;
                coins.setBlue(coin);
                player1.setWhiteRegCoin(player1.whiteRegCoin);
                player1.setBlueRegCoin(player1.blueRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.blueSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                reserveArray2(player1);
            } else if (player1.blueRegCoin + player1.goldCoin >= 3 && player1.whiteRegCoin + player1.goldCoin >= 2) {
                int point = player1.getPoints();
                point += 1;
                player1.setPoints(point);
                player1.whiteRegCoin -= 2;
                player1.blueRegCoin -= 3;
                int coin = coins.getWhite();
                if (player1.whiteRegCoin < 0)
                    coin += (player1.whiteRegCoin + 2);
                else
                    coin += 2;
                coins.setWhite(coin);
                coin = coins.getBlue();
                if (player1.blueRegCoin < 0)
                    coin += (player1.blueRegCoin + 3);
                else
                    coin += 3;
                coins.setBlue(coin);
                int gold = coins.getGold();
                if (player1.whiteRegCoin < 0) {
                    gold += (-player1.whiteRegCoin);
                    player1.goldCoin -= (-player1.whiteRegCoin);
                }
                if (player1.blueRegCoin < 0) {
                    gold += (-player1.blueRegCoin);
                    player1.goldCoin -= (-player1.blueRegCoin);
                }
                coins.setGold(gold);
                player1.setGreenRegCoin(player1.whiteRegCoin);
                player1.setBlackRegCoin(player1.blueRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.blueSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                reserveArray2(player1);
            } else {
                JOptionPane.showMessageDialog(Main.this, "You dont have enough coins to buy this card!");
            }
        } else if (player1.reservePrice[1].equals("1 Green + 5 Black")) {
            if (player1.greenRegCoin + player1.greenSpecCoin >= 1 && player1.blackRegCoin + player1.blackSpecCoin >= 5) {
                int point = player1.getPoints();
                point += 1;
                player1.setPoints(point);
                player1.greenRegCoin -= 1;
                player1.blackRegCoin -= 5;
                int coin = coins.getGreen();
                if (player1.greenRegCoin < 0)
                    coin += (player1.greenRegCoin + 1);
                else
                    coin += 2;
                coins.setGreen(coin);
                coin = coins.getBlack();
                if (player1.blackRegCoin < 0)
                    coin += (player1.blackRegCoin + 5);
                else
                    coin += 5;
                coins.setBlack(coin);
                player1.setBlackRegCoin(player1.blackRegCoin);
                player1.setGreenRegCoin(player1.greenRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.greenSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                reserveArray2(player1);
            } else if (player1.blackRegCoin + player1.goldCoin >= 5 && player1.greenRegCoin + player1.goldCoin >= 1) {
                int point = player1.getPoints();
                point += 0;
                player1.setPoints(point);
                player1.greenRegCoin -= 1;
                player1.blackRegCoin -= 5;
                int coin = coins.getGreen();
                if (player1.greenRegCoin < 0)
                    coin += (player1.greenRegCoin + 1);
                else
                    coin += 1;
                coins.setGreen(coin);
                coin = coins.getBlack();
                if (player1.blackRegCoin < 0)
                    coin += (player1.blackRegCoin + 5);
                else
                    coin += 5;
                coins.setBlack(coin);
                int gold = coins.getGold();
                if (player1.greenRegCoin < 0) {
                    gold += (-player1.greenRegCoin);
                    player1.goldCoin -= (-player1.greenRegCoin);
                }
                if (player1.blackRegCoin < 0) {
                    gold += (-player1.blackRegCoin);
                    player1.goldCoin -= (-player1.blackRegCoin);
                }
                coins.setGold(gold);
                player1.setWhiteRegCoin(player1.greenRegCoin);
                player1.setBlueRegCoin(player1.blackRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.greenSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                reserveArray2(player1);
            } else {
                JOptionPane.showMessageDialog(Main.this, "You dont have enough coins to buy this card!");
            }
        } else if (player1.reservePrice[1].equals("2 Red + 2 Green")) {
            if (player1.redRegCoin + player1.redSpecCoin >= 2 && player1.greenRegCoin + player1.greenSpecCoin >= 2) {
                int point = player1.getPoints();
                point += 0;
                player1.setPoints(point);
                player1.redRegCoin -= 2;
                player1.greenRegCoin -= 2;
                int coin = coins.getRed();
                if (player1.redRegCoin < 0)
                    coin += (player1.redRegCoin + 2);
                else
                    coin += 2;
                coins.setRed(coin);
                coin = coins.getGreen();
                if (player1.greenRegCoin < 0)
                    coin += (player1.greenRegCoin + 2);
                else
                    coin += 2;
                coins.setGreen(coin);
                player1.setRedRegCoin(player1.redRegCoin);
                player1.setGreenRegCoin(player1.greenRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.blackSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                reserveArray2(player1);
            } else if (player1.greenRegCoin + player1.goldCoin >= 2 && player1.redRegCoin + player1.goldCoin >= 2) {
                int point = player1.getPoints();
                point += 0;
                player1.setPoints(point);
                player1.redRegCoin -= 2;
                player1.greenRegCoin -= 2;
                int coin = coins.getRed();
                if (player1.redRegCoin < 0)
                    coin += (player1.redRegCoin + 2);
                else
                    coin += 2;
                coins.setRed(coin);
                coin = coins.getGreen();
                if (player1.greenRegCoin < 0)
                    coin += (player1.greenRegCoin + 3);
                else
                    coin += 2;
                coins.setGreen(coin);
                int gold = coins.getGold();
                if (player1.redRegCoin < 0) {
                    gold += (-player1.redRegCoin);
                    player1.goldCoin -= (-player1.redRegCoin);
                }
                if (player1.greenRegCoin < 0) {
                    gold += (-player1.greenRegCoin);
                    player1.goldCoin -= (-player1.greenRegCoin);
                }
                coins.setGold(gold);
                player1.setGreenRegCoin(player1.greenRegCoin);
                player1.setRedRegCoin(player1.redRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.blackSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                reserveArray2(player1);
            } else {
                JOptionPane.showMessageDialog(Main.this, "You dont have enough coins to buy this card!");
            }
        } else if (player1.reservePrice[1].equals("2 Red + 2 Blue + 2 White")) {
            if (player1.redRegCoin + player1.redSpecCoin >= 2 && player1.blueRegCoin + player1.blueSpecCoin >= 2 && player1.whiteRegCoin + player1.whiteSpecCoin >= 2) {
                int point = player1.getPoints();
                point += 2;
                player1.setPoints(point);
                player1.redRegCoin -= 2;
                player1.blueRegCoin -= 2;
                player1.whiteRegCoin -= 2;
                int coin = coins.getRed();
                if (player1.redRegCoin < 0)
                    coin += (player1.redRegCoin + 2);
                else
                    coin += 2;
                coins.setRed(coin);
                coin = coins.getBlue();
                if (player1.blueRegCoin < 0)
                    coin += (player1.blueRegCoin + 2);
                else
                    coin += 2;
                coins.setBlue(coin);
                coin = coins.getWhite();
                if (player1.whiteRegCoin < 0)
                    coin += (player1.whiteRegCoin + 2);
                else
                    coin += 2;
                coins.setWhite(coin);
                player1.setRedRegCoin(player1.redRegCoin);
                player1.setBlueRegCoin(player1.blueRegCoin);
                player1.setWhiteRegCoin(player1.whiteRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.redSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                reserveArray2(player1);
            } else if (player1.redRegCoin + player1.goldCoin >= 2 && player1.whiteRegCoin + player1.goldCoin >= 2 && player1.blueRegCoin + player1.goldCoin >= 2) {
                int point = player1.getPoints();
                point += 2;
                player1.setPoints(point);
                player1.redRegCoin -= 2;
                player1.blueRegCoin -= 2;
                player1.whiteRegCoin -= 2;
                int coin = coins.getRed();
                if (player1.redRegCoin < 0)
                    coin += (player1.redRegCoin + 2);
                else
                    coin += 2;
                coins.setRed(coin);
                coin = coins.getBlue();
                if (player1.blueRegCoin < 0)
                    coin += (player1.blueRegCoin + 2);
                else
                    coin += 2;
                coins.setBlue(coin);
                coin = coins.getWhite();
                if (player1.whiteRegCoin < 0)
                    coin += (player1.whiteRegCoin + 2);
                else
                    coin += 2;
                coins.setWhite(coin);
                int gold = coins.getGold();
                if (player1.redRegCoin < 0) {
                    gold += (-player1.redRegCoin);
                    player1.goldCoin -= (-player1.redRegCoin);
                }
                if (player1.blueRegCoin < 0) {
                    gold += (-player1.blueRegCoin);
                    player1.goldCoin -= (-player1.blueRegCoin);
                }
                if (player1.whiteRegCoin < 0) {
                    gold += (-player1.whiteRegCoin);
                    player1.goldCoin -= (-player1.whiteRegCoin);
                }
                coins.setGold(gold);
                player1.setBlueRegCoin(player1.blueRegCoin);
                player1.setRedRegCoin(player1.redRegCoin);
                player1.setWhiteRegCoin(player1.whiteRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.redSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                reserveArray2(player1);
            } else {
                JOptionPane.showMessageDialog(Main.this, "You dont have enough coins to buy this card!");
            }
        } else if (player1.reservePrice[1].equals("6 Black + 2 Green")) {
            if (player1.blackRegCoin + player1.blackSpecCoin >= 6 && player1.greenRegCoin + player1.greenSpecCoin >= 2) {
                int point = player1.getPoints();
                point += 3;
                player1.setPoints(point);
                player1.blackRegCoin -= 6;
                player1.greenRegCoin -= 2;
                int coin = coins.getBlack();
                if (player1.blackRegCoin < 0)
                    coin += (player1.blackRegCoin + 6);
                else
                    coin += 6;
                coins.setBlack(coin);
                coin = coins.getGreen();
                if (player1.greenRegCoin < 0)
                    coin += (player1.greenRegCoin + 2);
                else
                    coin += 2;
                coins.setGreen(coin);
                player1.setGreenRegCoin(player1.greenRegCoin);
                player1.setBlackRegCoin(player1.blackRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.blackSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                reserveArray2(player1);
            } else if (player1.greenRegCoin + player1.goldCoin >= 2 && player1.blackRegCoin + player1.goldCoin >= 6) {
                int point = player1.getPoints();
                point += 2;
                player1.setPoints(point);
                player1.blackRegCoin -= 6;
                player1.greenRegCoin -= 2;
                int coin = coins.getGreen();
                if (player1.greenRegCoin < 0)
                    coin += (player1.greenRegCoin + 2);
                else
                    coin += 2;
                coins.setGreen(coin);
                coin = coins.getBlack();
                if (player1.blackRegCoin < 0)
                    coin += (player1.blackRegCoin + 6);
                else
                    coin += 6;
                coins.setBlack(coin);
                int gold = coins.getGold();
                if (player1.greenRegCoin < 0) {
                    gold += (-player1.greenRegCoin);
                    player1.goldCoin -= (-player1.greenRegCoin);
                }
                if (player1.blackRegCoin < 0) {
                    gold += (-player1.blackRegCoin);
                    player1.goldCoin -= (-player1.blackRegCoin);
                }
                coins.setGold(gold);
                player1.setBlackRegCoin(player1.blackRegCoin);
                player1.setGreenRegCoin(player1.greenRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.blackSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                reserveArray2(player1);
            } else {
                JOptionPane.showMessageDialog(Main.this, "You dont have enough coins to buy this card!");
            }
        } else if (player1.reservePrice[1].equals("4 Blue + 3 White")) {
            if (player1.blueRegCoin + player1.blueSpecCoin >= 4 && player1.whiteRegCoin + player1.whiteSpecCoin >= 3) {
                int point = player1.getPoints();
                point += 4;
                player1.setPoints(point);
                player1.blueRegCoin -= 4;
                player1.whiteRegCoin -= 3;
                int coin = coins.getBlue();
                if (player1.blueRegCoin < 0)
                    coin += (player1.blueRegCoin + 4);
                else
                    coin += 4;
                coins.setBlue(coin);
                coin = coins.getWhite();
                if (player1.whiteRegCoin < 0)
                    coin += (player1.whiteRegCoin + 3);
                else
                    coin += 3;
                coins.setWhite(coin);
                player1.setWhiteRegCoin(player1.whiteRegCoin);
                player1.setBlueRegCoin(player1.blueRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.greenSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                reserveArray2(player1);
            } else if (player1.whiteRegCoin + player1.goldCoin >= 3 && player1.blueRegCoin + player1.goldCoin >= 4) {
                int point = player1.getPoints();
                point += 4;
                player1.setPoints(point);
                player1.blueRegCoin -= 4;
                player1.whiteRegCoin -= 3;
                int coin = coins.getWhite();
                if (player1.whiteRegCoin < 0)
                    coin += (player1.whiteRegCoin + 3);
                else
                    coin += 3;
                coins.setWhite(coin);
                coin = coins.getBlue();
                if (player1.blueRegCoin < 0)
                    coin += (player1.blueRegCoin + 4);
                else
                    coin += 4;
                coins.setBlue(coin);
                int gold = coins.getGold();
                if (player1.whiteRegCoin < 0) {
                    gold += (-player1.whiteRegCoin);
                    player1.goldCoin -= (-player1.whiteRegCoin);
                }
                if (player1.blueRegCoin < 0) {
                    gold += (-player1.blueRegCoin);
                    player1.goldCoin -= (-player1.blueRegCoin);
                }
                coins.setGold(gold);
                player1.setBlueRegCoin(player1.blueRegCoin);
                player1.setWhiteRegCoin(player1.whiteRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.greenSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                reserveArray2(player1);
            } else {
                JOptionPane.showMessageDialog(Main.this, "You dont have enough coins to buy this card!");
            }
        } else if (player1.reservePrice[1].equals("3 Red + 3 White")) {
            if (player1.redRegCoin + player1.redSpecCoin >= 3 && player1.whiteRegCoin + player1.whiteSpecCoin >= 3) {
                int point = player1.getPoints();
                point += 2;
                player1.setPoints(point);
                player1.redRegCoin -= 3;
                player1.whiteRegCoin -= 3;
                int coin = coins.getRed();
                if (player1.redRegCoin < 0)
                    coin += (player1.redRegCoin + 3);
                else
                    coin += 3;
                coins.setRed(coin);
                coin = coins.getWhite();
                if (player1.whiteRegCoin < 0)
                    coin += (player1.whiteRegCoin + 3);
                else
                    coin += 3;
                coins.setWhite(coin);
                player1.setWhiteRegCoin(player1.whiteRegCoin);
                player1.setRedRegCoin(player1.redRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.whiteSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                reserveArray2(player1);
            } else if (player1.whiteRegCoin + player1.goldCoin >= 3 && player1.redRegCoin + player1.goldCoin >= 3) {
                int point = player1.getPoints();
                point += 2;
                player1.setPoints(point);
                player1.redRegCoin -= 3;
                player1.whiteRegCoin -= 3;
                int coin = coins.getWhite();
                if (player1.whiteRegCoin < 0)
                    coin += (player1.whiteRegCoin + 3);
                else
                    coin += 3;
                coins.setWhite(coin);
                coin = coins.getRed();
                if (player1.redRegCoin < 0)
                    coin += (player1.redRegCoin + 3);
                else
                    coin += 3;
                coins.setRed(coin);
                int gold = coins.getGold();
                if (player1.whiteRegCoin < 0) {
                    gold += (-player1.whiteRegCoin);
                    player1.goldCoin -= (-player1.whiteRegCoin);
                }
                if (player1.redRegCoin < 0) {
                    gold += (-player1.redRegCoin);
                    player1.goldCoin -= (-player1.redRegCoin);
                }
                coins.setGold(gold);
                player1.setRedRegCoin(player1.redRegCoin);
                player1.setWhiteRegCoin(player1.whiteRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.whiteSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                reserveArray2(player1);
            } else {
                JOptionPane.showMessageDialog(Main.this, "You dont have enough coins to buy this card!");
            }
        } else if (player1.reservePrice[1].equals("4 Green + 3 Blue")) {
            if (player1.blueRegCoin + player1.blueSpecCoin >= 3 && player1.greenRegCoin + player1.greenSpecCoin >= 4) {
                int point = player1.getPoints();
                point += 3;
                player1.setPoints(point);
                player1.blueRegCoin -= 3;
                player1.greenRegCoin -= 4;
                int coin = coins.getBlue();
                if (player1.blueRegCoin < 0)
                    coin += (player1.blueRegCoin + 3);
                else
                    coin += 3;
                coins.setBlue(coin);
                coin = coins.getGreen();
                if (player1.greenRegCoin < 0)
                    coin += (player1.greenRegCoin + 4);
                else
                    coin += 4;
                coins.setGreen(coin);
                player1.setGreenRegCoin(player1.greenRegCoin);
                player1.setBlueRegCoin(player1.blueRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.whiteSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                reserveArray2(player1);
            } else if (player1.greenRegCoin + player1.goldCoin >= 4 && player1.blueRegCoin + player1.goldCoin >= 3) {
                int point = player1.getPoints();
                point += 3;
                player1.setPoints(point);
                player1.blueRegCoin -= 3;
                player1.greenRegCoin -= 4;
                int coin = coins.getGreen();
                if (player1.greenRegCoin < 0)
                    coin += (player1.whiteRegCoin + 4);
                else
                    coin += 4;
                coins.setGreen(coin);
                coin = coins.getBlue();
                if (player1.blueRegCoin < 0)
                    coin += (player1.blueRegCoin + 3);
                else
                    coin += 3;
                coins.setBlue(coin);
                int gold = coins.getGold();
                if (player1.greenRegCoin < 0) {
                    gold += (-player1.greenRegCoin);
                    player1.goldCoin -= (-player1.greenRegCoin);
                }
                if (player1.blueRegCoin < 0) {
                    gold += (-player1.blueRegCoin);
                    player1.goldCoin -= (-player1.blueRegCoin);
                }
                coins.setGold(gold);
                player1.setBlueRegCoin(player1.blueRegCoin);
                player1.setGreenRegCoin(player1.greenRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.whiteSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                reserveArray2(player1);
            } else {
                JOptionPane.showMessageDialog(Main.this, "You dont have enough coins to buy this card!");
            }
        } else if (player1.reservePrice[1].equals("5 White + 3 Blue")) {
            if (player1.blueRegCoin + player1.blueSpecCoin >= 3 && player1.whiteRegCoin + player1.whiteSpecCoin >= 5) {
                int point = player1.getPoints();
                point += 4;
                player1.setPoints(point);
                player1.blueRegCoin -= 3;
                player1.whiteRegCoin -= 5;
                int coin = coins.getBlue();
                if (player1.blueRegCoin < 0)
                    coin += (player1.blueRegCoin + 3);
                else
                    coin += 3;
                coins.setBlue(coin);
                coin = coins.getWhite();
                if (player1.whiteRegCoin < 0)
                    coin += (player1.whiteRegCoin + 5);
                else
                    coin += 5;
                coins.setWhite(coin);
                player1.setWhiteRegCoin(player1.whiteRegCoin);
                player1.setBlueRegCoin(player1.blueRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.blueSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                reserveArray2(player1);
            } else if (player1.whiteRegCoin + player1.goldCoin >= 5 && player1.blueRegCoin + player1.goldCoin >= 3) {
                int point = player1.getPoints();
                point += 4;
                player1.setPoints(point);
                player1.blueRegCoin -= 3;
                player1.whiteRegCoin -= 5;
                int coin = coins.getWhite();
                if (player1.whiteRegCoin < 0)
                    coin += (player1.whiteRegCoin + 5);
                else
                    coin += 5;
                coins.setWhite(coin);
                coin = coins.getBlue();
                if (player1.blueRegCoin < 0)
                    coin += (player1.blueRegCoin + 3);
                else
                    coin += 3;
                coins.setBlue(coin);
                int gold = coins.getGold();
                if (player1.whiteRegCoin < 0) {
                    gold += (-player1.whiteRegCoin);
                    player1.goldCoin -= (-player1.whiteRegCoin);
                }
                if (player1.blueRegCoin < 0) {
                    gold += (-player1.blueRegCoin);
                    player1.goldCoin -= (-player1.blueRegCoin);
                }
                coins.setGold(gold);
                player1.setBlueRegCoin(player1.blueRegCoin);
                player1.setWhiteRegCoin(player1.whiteRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.blueSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                reserveArray2(player1);
            } else {
                JOptionPane.showMessageDialog(Main.this, "You dont have enough coins to buy this card!");
            }
        } else if (player1.reservePrice[1].equals("4 Red + 3 Black + 2 White")) {
            if (player1.redRegCoin + player1.redSpecCoin >= 4 && player1.blackRegCoin + player1.blackSpecCoin >= 3 && player1.whiteRegCoin + player1.whiteSpecCoin >= 2) {
                int point = player1.getPoints();
                point += 4;
                player1.setPoints(point);
                player1.redRegCoin -= 4;
                player1.blackRegCoin -= 3;
                player1.whiteRegCoin -= 2;
                int coin = coins.getRed();
                if (player1.redRegCoin < 0)
                    coin += (player1.redRegCoin + 4);
                else
                    coin += 4;
                coins.setRed(coin);
                coin = coins.getBlack();
                if (player1.blackRegCoin < 0)
                    coin += (player1.blueRegCoin + 3);
                else
                    coin += 3;
                coins.setBlack(coin);
                coin = coins.getWhite();
                if (player1.whiteRegCoin < 0)
                    coin += (player1.whiteRegCoin + 2);
                else
                    coin += 2;
                coins.setWhite(coin);
                player1.setRedRegCoin(player1.redRegCoin);
                player1.setBlackRegCoin(player1.blackRegCoin);
                player1.setWhiteRegCoin(player1.whiteRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.redSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                reserveArray2(player1);
            } else if (player1.redRegCoin + player1.goldCoin >= 4 && player1.whiteRegCoin + player1.goldCoin >= 2 && player1.blackRegCoin + player1.goldCoin >= 3) {
                int point = player1.getPoints();
                point += 4;
                player1.setPoints(point);
                player1.redRegCoin -= 4;
                player1.blackRegCoin -= 3;
                player1.whiteRegCoin -= 2;
                int coin = coins.getRed();
                if (player1.redRegCoin < 0)
                    coin += (player1.redRegCoin + 4);
                else
                    coin += 4;
                coins.setRed(coin);
                coin = coins.getBlack();
                if (player1.blackRegCoin < 0)
                    coin += (player1.blackRegCoin + 3);
                else
                    coin += 3;
                coins.setBlack(coin);
                coin = coins.getWhite();
                if (player1.whiteRegCoin < 0)
                    coin += (player1.whiteRegCoin + 2);
                else
                    coin += 2;
                coins.setWhite(coin);
                int gold = coins.getGold();
                if (player1.redRegCoin < 0) {
                    gold += (-player1.redRegCoin);
                    player1.goldCoin -= (-player1.redRegCoin);
                }
                if (player1.blackRegCoin < 0) {
                    gold += (-player1.blackRegCoin);
                    player1.goldCoin -= (-player1.blackRegCoin);
                }
                if (player1.whiteRegCoin < 0) {
                    gold += (-player1.whiteRegCoin);
                    player1.goldCoin -= (-player1.whiteRegCoin);
                }
                coins.setGold(gold);
                player1.setBlackRegCoin(player1.blackRegCoin);
                player1.setRedRegCoin(player1.redRegCoin);
                player1.setWhiteRegCoin(player1.whiteRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.redSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                reserveArray2(player1);
            } else {
                JOptionPane.showMessageDialog(Main.this, "You dont have enough coins to buy this card!");
            }
        } else if (player1.reservePrice[1].equals("3 Red + 4 Green + 3 Black")) {
            if (player1.redRegCoin + player1.redSpecCoin >= 3 && player1.blackRegCoin + player1.blackSpecCoin >= 3 && player1.greenRegCoin + player1.greenSpecCoin >= 4) {
                int point = player1.getPoints();
                point += 5;
                player1.setPoints(point);
                player1.redRegCoin -= 3;
                player1.blackRegCoin -= 3;
                player1.greenRegCoin -= 4;
                int coin = coins.getRed();
                if (player1.redRegCoin < 0)
                    coin += (player1.redRegCoin + 3);
                else
                    coin += 3;
                coins.setRed(coin);
                coin = coins.getBlack();
                if (player1.blackRegCoin < 0)
                    coin += (player1.blueRegCoin + 3);
                else
                    coin += 3;
                coins.setBlack(coin);
                coin = coins.getGreen();
                if (player1.greenRegCoin < 0)
                    coin += (player1.greenRegCoin + 4);
                else
                    coin += 4;
                coins.setGreen(coin);
                player1.setRedRegCoin(player1.redRegCoin);
                player1.setBlackRegCoin(player1.blackRegCoin);
                player1.setGreenRegCoin(player1.greenRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.blackSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                reserveArray2(player1);
            } else if (player1.redRegCoin + player1.goldCoin >= 3 && player1.greenRegCoin + player1.goldCoin >= 4 && player1.blackRegCoin + player1.goldCoin >= 3) {
                int point = player1.getPoints();
                point += 4;
                player1.setPoints(point);
                player1.redRegCoin -= 3;
                player1.blackRegCoin -= 3;
                player1.greenRegCoin -= 4;
                int coin = coins.getRed();
                if (player1.redRegCoin < 0)
                    coin += (player1.redRegCoin + 3);
                else
                    coin += 3;
                coins.setRed(coin);
                coin = coins.getBlack();
                if (player1.blackRegCoin < 0)
                    coin += (player1.blackRegCoin + 3);
                else
                    coin += 3;
                coins.setBlack(coin);
                coin = coins.getGreen();
                if (player1.greenRegCoin < 0)
                    coin += (player1.greenRegCoin + 4);
                else
                    coin += 4;
                coins.setGreen(coin);
                int gold = coins.getGold();
                if (player1.redRegCoin < 0) {
                    gold += (-player1.redRegCoin);
                    player1.goldCoin -= (-player1.redRegCoin);
                }
                if (player1.blackRegCoin < 0) {
                    gold += (-player1.blackRegCoin);
                    player1.goldCoin -= (-player1.blackRegCoin);
                }
                if (player1.greenRegCoin < 0) {
                    gold += (-player1.greenRegCoin);
                    player1.goldCoin -= (-player1.greenRegCoin);
                }
                coins.setGold(gold);
                player1.setBlackRegCoin(player1.blackRegCoin);
                player1.setRedRegCoin(player1.redRegCoin);
                player1.setGreenRegCoin(player1.greenRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.blackSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                reserveArray2(player1);
            } else {
                JOptionPane.showMessageDialog(Main.this, "You dont have enough coins to buy this card!");
            }
        }
    }

    private void reserveBuy3(player player1) {
        if (player1.reservePrice[2] == null) {
            JOptionPane.showMessageDialog(Main.this, "You haven't reserved a card yet");
        } else if (player1.reservePrice[2].equals("4 Red")) {
            if (player1.redRegCoin >= 4) {
                int point = player1.getPoints();
                point += 0;
                player1.setPoints(point);
                player1.redRegCoin -= 4;
                int coin = coins.getRed();
                coin += 4;
                coins.setRed(coin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.redSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                reserveArray3(player1);
            } else if (player1.redSpecCoin + player1.redRegCoin >= 4) {
                int point = player1.getPoints();
                point += 0;
                player1.setPoints(point);
                int coin = coins.getRed();
                coin += player1.redRegCoin;
                coins.setRed(coin);
                player1.redRegCoin = 0;
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.redSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                reserveArray3(player1);
            } else if (player1.redRegCoin + player1.goldCoin >= 4) {
                int point = player1.getPoints();
                point += 0;
                player1.setPoints(point);
                int coin = coins.getRed();
                coin += player1.redRegCoin;
                coins.setRed(coin);
                player1.goldCoin -= (4 - player1.redRegCoin);
                int gold = coins.getGold();
                gold += (4 - player1.redRegCoin);
                coins.setGold(gold);
                player1.redRegCoin = 0;
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.redSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                reserveArray3(player1);
            } else {
                JOptionPane.showMessageDialog(Main.this, "You dont have enough coins to buy this card!");
            }
        } else if (player1.reservePrice[2].equals("2 White + 3 Blue")) {
            if (player1.blueRegCoin + player1.blueSpecCoin >= 3 && player1.whiteRegCoin + player1.whiteSpecCoin >= 2) {
                int point = player1.getPoints();
                point += 1;
                player1.setPoints(point);
                player1.whiteRegCoin -= 2;
                player1.blueRegCoin -= 3;
                int coin = coins.getWhite();
                if (player1.whiteRegCoin < 0)
                    coin += (player1.whiteRegCoin + 2);
                else
                    coin += 2;
                coins.setWhite(coin);
                coin = coins.getBlue();
                if (player1.blueRegCoin < 0)
                    coin += (player1.blueRegCoin + 3);
                else
                    coin += 3;
                coins.setBlue(coin);
                player1.setWhiteRegCoin(player1.whiteRegCoin);
                player1.setBlueRegCoin(player1.blueRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.blueSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                reserveArray3(player1);
            } else if (player1.blueRegCoin + player1.goldCoin >= 3 && player1.whiteRegCoin + player1.goldCoin >= 2) {
                int point = player1.getPoints();
                point += 1;
                player1.setPoints(point);
                player1.whiteRegCoin -= 2;
                player1.blueRegCoin -= 3;
                int coin = coins.getWhite();
                if (player1.whiteRegCoin < 0)
                    coin += (player1.whiteRegCoin + 2);
                else
                    coin += 2;
                coins.setWhite(coin);
                coin = coins.getBlue();
                if (player1.blueRegCoin < 0)
                    coin += (player1.blueRegCoin + 3);
                else
                    coin += 3;
                coins.setBlue(coin);
                int gold = coins.getGold();
                if (player1.whiteRegCoin < 0) {
                    gold += (-player1.whiteRegCoin);
                    player1.goldCoin -= (-player1.whiteRegCoin);
                }
                if (player1.blueRegCoin < 0) {
                    gold += (-player1.blueRegCoin);
                    player1.goldCoin -= (-player1.blueRegCoin);
                }
                coins.setGold(gold);
                player1.setGreenRegCoin(player1.whiteRegCoin);
                player1.setBlackRegCoin(player1.blueRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.blueSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                reserveArray3(player1);
            } else {
                JOptionPane.showMessageDialog(Main.this, "You dont have enough coins to buy this card!");
            }
        } else if (player1.reservePrice[2].equals("1 Green + 5 Black")) {
            if (player1.greenRegCoin + player1.greenSpecCoin >= 1 && player1.blackRegCoin + player1.blackSpecCoin >= 5) {
                int point = player1.getPoints();
                point += 1;
                player1.setPoints(point);
                player1.greenRegCoin -= 1;
                player1.blackRegCoin -= 5;
                int coin = coins.getGreen();
                if (player1.greenRegCoin < 0)
                    coin += (player1.greenRegCoin + 1);
                else
                    coin += 2;
                coins.setGreen(coin);
                coin = coins.getBlack();
                if (player1.blackRegCoin < 0)
                    coin += (player1.blackRegCoin + 5);
                else
                    coin += 5;
                coins.setBlack(coin);
                player1.setBlackRegCoin(player1.blackRegCoin);
                player1.setGreenRegCoin(player1.greenRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.greenSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                reserveArray3(player1);
            } else if (player1.blackRegCoin + player1.goldCoin >= 5 && player1.greenRegCoin + player1.goldCoin >= 1) {
                int point = player1.getPoints();
                point += 0;
                player1.setPoints(point);
                player1.greenRegCoin -= 1;
                player1.blackRegCoin -= 5;
                int coin = coins.getGreen();
                if (player1.greenRegCoin < 0)
                    coin += (player1.greenRegCoin + 1);
                else
                    coin += 1;
                coins.setGreen(coin);
                coin = coins.getBlack();
                if (player1.blackRegCoin < 0)
                    coin += (player1.blackRegCoin + 5);
                else
                    coin += 5;
                coins.setBlack(coin);
                int gold = coins.getGold();
                if (player1.greenRegCoin < 0) {
                    gold += (-player1.greenRegCoin);
                    player1.goldCoin -= (-player1.greenRegCoin);
                }
                if (player1.blackRegCoin < 0) {
                    gold += (-player1.blackRegCoin);
                    player1.goldCoin -= (-player1.blackRegCoin);
                }
                coins.setGold(gold);
                player1.setWhiteRegCoin(player1.greenRegCoin);
                player1.setBlueRegCoin(player1.blackRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.greenSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                reserveArray3(player1);
            } else {
                JOptionPane.showMessageDialog(Main.this, "You dont have enough coins to buy this card!");
            }
        } else if (player1.reservePrice[2].equals("2 Red + 2 Green")) {
            if (player1.redRegCoin + player1.redSpecCoin >= 2 && player1.greenRegCoin + player1.greenSpecCoin >= 2) {
                int point = player1.getPoints();
                point += 0;
                player1.setPoints(point);
                player1.redRegCoin -= 2;
                player1.greenRegCoin -= 2;
                int coin = coins.getRed();
                if (player1.redRegCoin < 0)
                    coin += (player1.redRegCoin + 2);
                else
                    coin += 2;
                coins.setRed(coin);
                coin = coins.getGreen();
                if (player1.greenRegCoin < 0)
                    coin += (player1.greenRegCoin + 2);
                else
                    coin += 2;
                coins.setGreen(coin);
                player1.setRedRegCoin(player1.redRegCoin);
                player1.setGreenRegCoin(player1.greenRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.blackSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                reserveArray3(player1);
            } else if (player1.greenRegCoin + player1.goldCoin >= 2 && player1.redRegCoin + player1.goldCoin >= 2) {
                int point = player1.getPoints();
                point += 0;
                player1.setPoints(point);
                player1.redRegCoin -= 2;
                player1.greenRegCoin -= 2;
                int coin = coins.getRed();
                if (player1.redRegCoin < 0)
                    coin += (player1.redRegCoin + 2);
                else
                    coin += 2;
                coins.setRed(coin);
                coin = coins.getGreen();
                if (player1.greenRegCoin < 0)
                    coin += (player1.greenRegCoin + 3);
                else
                    coin += 2;
                coins.setGreen(coin);
                int gold = coins.getGold();
                if (player1.redRegCoin < 0) {
                    gold += (-player1.redRegCoin);
                    player1.goldCoin -= (-player1.redRegCoin);
                }
                if (player1.greenRegCoin < 0) {
                    gold += (-player1.greenRegCoin);
                    player1.goldCoin -= (-player1.greenRegCoin);
                }
                coins.setGold(gold);
                player1.setGreenRegCoin(player1.greenRegCoin);
                player1.setRedRegCoin(player1.redRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.blackSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                reserveArray3(player1);
            } else {
                JOptionPane.showMessageDialog(Main.this, "You dont have enough coins to buy this card!");
            }
        } else if (player1.reservePrice[2].equals("2 Red + 2 Blue + 2 White")) {
            if (player1.redRegCoin + player1.redSpecCoin >= 2 && player1.blueRegCoin + player1.blueSpecCoin >= 2 && player1.whiteRegCoin + player1.whiteSpecCoin >= 2) {
                int point = player1.getPoints();
                point += 2;
                player1.setPoints(point);
                player1.redRegCoin -= 2;
                player1.blueRegCoin -= 2;
                player1.whiteRegCoin -= 2;
                int coin = coins.getRed();
                if (player1.redRegCoin < 0)
                    coin += (player1.redRegCoin + 2);
                else
                    coin += 2;
                coins.setRed(coin);
                coin = coins.getBlue();
                if (player1.blueRegCoin < 0)
                    coin += (player1.blueRegCoin + 2);
                else
                    coin += 2;
                coins.setBlue(coin);
                coin = coins.getWhite();
                if (player1.whiteRegCoin < 0)
                    coin += (player1.whiteRegCoin + 2);
                else
                    coin += 2;
                coins.setWhite(coin);
                player1.setRedRegCoin(player1.redRegCoin);
                player1.setBlueRegCoin(player1.blueRegCoin);
                player1.setWhiteRegCoin(player1.whiteRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.redSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                reserveArray3(player1);
            } else if (player1.redRegCoin + player1.goldCoin >= 2 && player1.whiteRegCoin + player1.goldCoin >= 2 && player1.blueRegCoin + player1.goldCoin >= 2) {
                int point = player1.getPoints();
                point += 2;
                player1.setPoints(point);
                player1.redRegCoin -= 2;
                player1.blueRegCoin -= 2;
                player1.whiteRegCoin -= 2;
                int coin = coins.getRed();
                if (player1.redRegCoin < 0)
                    coin += (player1.redRegCoin + 2);
                else
                    coin += 2;
                coins.setRed(coin);
                coin = coins.getBlue();
                if (player1.blueRegCoin < 0)
                    coin += (player1.blueRegCoin + 2);
                else
                    coin += 2;
                coins.setBlue(coin);
                coin = coins.getWhite();
                if (player1.whiteRegCoin < 0)
                    coin += (player1.whiteRegCoin + 2);
                else
                    coin += 2;
                coins.setWhite(coin);
                int gold = coins.getGold();
                if (player1.redRegCoin < 0) {
                    gold += (-player1.redRegCoin);
                    player1.goldCoin -= (-player1.redRegCoin);
                }
                if (player1.blueRegCoin < 0) {
                    gold += (-player1.blueRegCoin);
                    player1.goldCoin -= (-player1.blueRegCoin);
                }
                if (player1.whiteRegCoin < 0) {
                    gold += (-player1.whiteRegCoin);
                    player1.goldCoin -= (-player1.whiteRegCoin);
                }
                coins.setGold(gold);
                player1.setBlueRegCoin(player1.blueRegCoin);
                player1.setRedRegCoin(player1.redRegCoin);
                player1.setWhiteRegCoin(player1.whiteRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.redSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                reserveArray3(player1);
            } else {
                JOptionPane.showMessageDialog(Main.this, "You dont have enough coins to buy this card!");
            }
        } else if (player1.reservePrice[2].equals("6 Black + 2 Green")) {
            if (player1.blackRegCoin + player1.blackSpecCoin >= 6 && player1.greenRegCoin + player1.greenSpecCoin >= 2) {
                int point = player1.getPoints();
                point += 3;
                player1.setPoints(point);
                player1.blackRegCoin -= 6;
                player1.greenRegCoin -= 2;
                int coin = coins.getBlack();
                if (player1.blackRegCoin < 0)
                    coin += (player1.blackRegCoin + 6);
                else
                    coin += 6;
                coins.setBlack(coin);
                coin = coins.getGreen();
                if (player1.greenRegCoin < 0)
                    coin += (player1.greenRegCoin + 2);
                else
                    coin += 2;
                coins.setGreen(coin);
                player1.setGreenRegCoin(player1.greenRegCoin);
                player1.setBlackRegCoin(player1.blackRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.blackSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                reserveArray3(player1);
            } else if (player1.greenRegCoin + player1.goldCoin >= 2 && player1.blackRegCoin + player1.goldCoin >= 6) {
                int point = player1.getPoints();
                point += 2;
                player1.setPoints(point);
                player1.blackRegCoin -= 6;
                player1.greenRegCoin -= 2;
                int coin = coins.getGreen();
                if (player1.greenRegCoin < 0)
                    coin += (player1.greenRegCoin + 2);
                else
                    coin += 2;
                coins.setGreen(coin);
                coin = coins.getBlack();
                if (player1.blackRegCoin < 0)
                    coin += (player1.blackRegCoin + 6);
                else
                    coin += 6;
                coins.setBlack(coin);
                int gold = coins.getGold();
                if (player1.greenRegCoin < 0) {
                    gold += (-player1.greenRegCoin);
                    player1.goldCoin -= (-player1.greenRegCoin);
                }
                if (player1.blackRegCoin < 0) {
                    gold += (-player1.blackRegCoin);
                    player1.goldCoin -= (-player1.blackRegCoin);
                }
                coins.setGold(gold);
                player1.setBlackRegCoin(player1.blackRegCoin);
                player1.setGreenRegCoin(player1.greenRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.blackSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                reserveArray3(player1);
            } else {
                JOptionPane.showMessageDialog(Main.this, "You dont have enough coins to buy this card!");
            }
        } else if (player1.reservePrice[2].equals("4 Blue + 3 White")) {
            if (player1.blueRegCoin + player1.blueSpecCoin >= 4 && player1.whiteRegCoin + player1.whiteSpecCoin >= 3) {
                int point = player1.getPoints();
                point += 4;
                player1.setPoints(point);
                player1.blueRegCoin -= 4;
                player1.whiteRegCoin -= 3;
                int coin = coins.getBlue();
                if (player1.blueRegCoin < 0)
                    coin += (player1.blueRegCoin + 4);
                else
                    coin += 4;
                coins.setBlue(coin);
                coin = coins.getWhite();
                if (player1.whiteRegCoin < 0)
                    coin += (player1.whiteRegCoin + 3);
                else
                    coin += 3;
                coins.setWhite(coin);
                player1.setWhiteRegCoin(player1.whiteRegCoin);
                player1.setBlueRegCoin(player1.blueRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.greenSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                reserveArray3(player1);
            } else if (player1.whiteRegCoin + player1.goldCoin >= 3 && player1.blueRegCoin + player1.goldCoin >= 4) {
                int point = player1.getPoints();
                point += 4;
                player1.setPoints(point);
                player1.blueRegCoin -= 4;
                player1.whiteRegCoin -= 3;
                int coin = coins.getWhite();
                if (player1.whiteRegCoin < 0)
                    coin += (player1.whiteRegCoin + 3);
                else
                    coin += 3;
                coins.setWhite(coin);
                coin = coins.getBlue();
                if (player1.blueRegCoin < 0)
                    coin += (player1.blueRegCoin + 4);
                else
                    coin += 4;
                coins.setBlue(coin);
                int gold = coins.getGold();
                if (player1.whiteRegCoin < 0) {
                    gold += (-player1.whiteRegCoin);
                    player1.goldCoin -= (-player1.whiteRegCoin);
                }
                if (player1.blueRegCoin < 0) {
                    gold += (-player1.blueRegCoin);
                    player1.goldCoin -= (-player1.blueRegCoin);
                }
                coins.setGold(gold);
                player1.setBlueRegCoin(player1.blueRegCoin);
                player1.setWhiteRegCoin(player1.whiteRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.greenSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                reserveArray3(player1);
            } else {
                JOptionPane.showMessageDialog(Main.this, "You dont have enough coins to buy this card!");
            }
        } else if (player1.reservePrice[2].equals("3 Red + 3 White")) {
            if (player1.redRegCoin + player1.redSpecCoin >= 3 && player1.whiteRegCoin + player1.whiteSpecCoin >= 3) {
                int point = player1.getPoints();
                point += 2;
                player1.setPoints(point);
                player1.redRegCoin -= 3;
                player1.whiteRegCoin -= 3;
                int coin = coins.getRed();
                if (player1.redRegCoin < 0)
                    coin += (player1.redRegCoin + 3);
                else
                    coin += 3;
                coins.setRed(coin);
                coin = coins.getWhite();
                if (player1.whiteRegCoin < 0)
                    coin += (player1.whiteRegCoin + 3);
                else
                    coin += 3;
                coins.setWhite(coin);
                player1.setWhiteRegCoin(player1.whiteRegCoin);
                player1.setRedRegCoin(player1.redRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.whiteSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                reserveArray3(player1);
            } else if (player1.whiteRegCoin + player1.goldCoin >= 3 && player1.redRegCoin + player1.goldCoin >= 3) {
                int point = player1.getPoints();
                point += 2;
                player1.setPoints(point);
                player1.redRegCoin -= 3;
                player1.whiteRegCoin -= 3;
                int coin = coins.getWhite();
                if (player1.whiteRegCoin < 0)
                    coin += (player1.whiteRegCoin + 3);
                else
                    coin += 3;
                coins.setWhite(coin);
                coin = coins.getRed();
                if (player1.redRegCoin < 0)
                    coin += (player1.redRegCoin + 3);
                else
                    coin += 3;
                coins.setRed(coin);
                int gold = coins.getGold();
                if (player1.whiteRegCoin < 0) {
                    gold += (-player1.whiteRegCoin);
                    player1.goldCoin -= (-player1.whiteRegCoin);
                }
                if (player1.redRegCoin < 0) {
                    gold += (-player1.redRegCoin);
                    player1.goldCoin -= (-player1.redRegCoin);
                }
                coins.setGold(gold);
                player1.setRedRegCoin(player1.redRegCoin);
                player1.setWhiteRegCoin(player1.whiteRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.whiteSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                reserveArray3(player1);
            } else {
                JOptionPane.showMessageDialog(Main.this, "You dont have enough coins to buy this card!");
            }
        } else if (player1.reservePrice[2].equals("4 Green + 3 Blue")) {
            if (player1.blueRegCoin + player1.blueSpecCoin >= 3 && player1.greenRegCoin + player1.greenSpecCoin >= 4) {
                int point = player1.getPoints();
                point += 3;
                player1.setPoints(point);
                player1.blueRegCoin -= 3;
                player1.greenRegCoin -= 4;
                int coin = coins.getBlue();
                if (player1.blueRegCoin < 0)
                    coin += (player1.blueRegCoin + 3);
                else
                    coin += 3;
                coins.setBlue(coin);
                coin = coins.getGreen();
                if (player1.greenRegCoin < 0)
                    coin += (player1.greenRegCoin + 4);
                else
                    coin += 4;
                coins.setGreen(coin);
                player1.setGreenRegCoin(player1.greenRegCoin);
                player1.setBlueRegCoin(player1.blueRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.whiteSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                reserveArray3(player1);
            } else if (player1.greenRegCoin + player1.goldCoin >= 4 && player1.blueRegCoin + player1.goldCoin >= 3) {
                int point = player1.getPoints();
                point += 3;
                player1.setPoints(point);
                player1.blueRegCoin -= 3;
                player1.greenRegCoin -= 4;
                int coin = coins.getGreen();
                if (player1.greenRegCoin < 0)
                    coin += (player1.whiteRegCoin + 4);
                else
                    coin += 4;
                coins.setGreen(coin);
                coin = coins.getBlue();
                if (player1.blueRegCoin < 0)
                    coin += (player1.blueRegCoin + 3);
                else
                    coin += 3;
                coins.setBlue(coin);
                int gold = coins.getGold();
                if (player1.greenRegCoin < 0) {
                    gold += (-player1.greenRegCoin);
                    player1.goldCoin -= (-player1.greenRegCoin);
                }
                if (player1.blueRegCoin < 0) {
                    gold += (-player1.blueRegCoin);
                    player1.goldCoin -= (-player1.blueRegCoin);
                }
                coins.setGold(gold);
                player1.setBlueRegCoin(player1.blueRegCoin);
                player1.setGreenRegCoin(player1.greenRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.whiteSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                reserveArray3(player1);
            } else {
                JOptionPane.showMessageDialog(Main.this, "You dont have enough coins to buy this card!");
            }
        } else if (player1.reservePrice[2].equals("5 White + 3 Blue")) {
            if (player1.blueRegCoin + player1.blueSpecCoin >= 3 && player1.whiteRegCoin + player1.whiteSpecCoin >= 5) {
                int point = player1.getPoints();
                point += 4;
                player1.setPoints(point);
                player1.blueRegCoin -= 3;
                player1.whiteRegCoin -= 5;
                int coin = coins.getBlue();
                if (player1.blueRegCoin < 0)
                    coin += (player1.blueRegCoin + 3);
                else
                    coin += 3;
                coins.setBlue(coin);
                coin = coins.getWhite();
                if (player1.whiteRegCoin < 0)
                    coin += (player1.whiteRegCoin + 5);
                else
                    coin += 5;
                coins.setWhite(coin);
                player1.setWhiteRegCoin(player1.whiteRegCoin);
                player1.setBlueRegCoin(player1.blueRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.blueSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                reserveArray3(player1);
            } else if (player1.whiteRegCoin + player1.goldCoin >= 5 && player1.blueRegCoin + player1.goldCoin >= 3) {
                int point = player1.getPoints();
                point += 4;
                player1.setPoints(point);
                player1.blueRegCoin -= 3;
                player1.whiteRegCoin -= 5;
                int coin = coins.getWhite();
                if (player1.whiteRegCoin < 0)
                    coin += (player1.whiteRegCoin + 5);
                else
                    coin += 5;
                coins.setWhite(coin);
                coin = coins.getBlue();
                if (player1.blueRegCoin < 0)
                    coin += (player1.blueRegCoin + 3);
                else
                    coin += 3;
                coins.setBlue(coin);
                int gold = coins.getGold();
                if (player1.whiteRegCoin < 0) {
                    gold += (-player1.whiteRegCoin);
                    player1.goldCoin -= (-player1.whiteRegCoin);
                }
                if (player1.blueRegCoin < 0) {
                    gold += (-player1.blueRegCoin);
                    player1.goldCoin -= (-player1.blueRegCoin);
                }
                coins.setGold(gold);
                player1.setBlueRegCoin(player1.blueRegCoin);
                player1.setWhiteRegCoin(player1.whiteRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.blueSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                reserveArray3(player1);
            } else {
                JOptionPane.showMessageDialog(Main.this, "You dont have enough coins to buy this card!");
            }
        } else if (player1.reservePrice[2].equals("4 Red + 3 Black + 2 White")) {
            if (player1.redRegCoin + player1.redSpecCoin >= 4 && player1.blackRegCoin + player1.blackSpecCoin >= 3 && player1.whiteRegCoin + player1.whiteSpecCoin >= 2) {
                int point = player1.getPoints();
                point += 4;
                player1.setPoints(point);
                player1.redRegCoin -= 4;
                player1.blackRegCoin -= 3;
                player1.whiteRegCoin -= 2;
                int coin = coins.getRed();
                if (player1.redRegCoin < 0)
                    coin += (player1.redRegCoin + 4);
                else
                    coin += 4;
                coins.setRed(coin);
                coin = coins.getBlack();
                if (player1.blackRegCoin < 0)
                    coin += (player1.blueRegCoin + 3);
                else
                    coin += 3;
                coins.setBlack(coin);
                coin = coins.getWhite();
                if (player1.whiteRegCoin < 0)
                    coin += (player1.whiteRegCoin + 2);
                else
                    coin += 2;
                coins.setWhite(coin);
                player1.setRedRegCoin(player1.redRegCoin);
                player1.setBlackRegCoin(player1.blackRegCoin);
                player1.setWhiteRegCoin(player1.whiteRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.redSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                reserveArray3(player1);
            } else if (player1.redRegCoin + player1.goldCoin >= 4 && player1.whiteRegCoin + player1.goldCoin >= 2 && player1.blackRegCoin + player1.goldCoin >= 3) {
                int point = player1.getPoints();
                point += 4;
                player1.setPoints(point);
                player1.redRegCoin -= 4;
                player1.blackRegCoin -= 3;
                player1.whiteRegCoin -= 2;
                int coin = coins.getRed();
                if (player1.redRegCoin < 0)
                    coin += (player1.redRegCoin + 4);
                else
                    coin += 4;
                coins.setRed(coin);
                coin = coins.getBlack();
                if (player1.blackRegCoin < 0)
                    coin += (player1.blackRegCoin + 3);
                else
                    coin += 3;
                coins.setBlack(coin);
                coin = coins.getWhite();
                if (player1.whiteRegCoin < 0)
                    coin += (player1.whiteRegCoin + 2);
                else
                    coin += 2;
                coins.setWhite(coin);
                int gold = coins.getGold();
                if (player1.redRegCoin < 0) {
                    gold += (-player1.redRegCoin);
                    player1.goldCoin -= (-player1.redRegCoin);
                }
                if (player1.blackRegCoin < 0) {
                    gold += (-player1.blackRegCoin);
                    player1.goldCoin -= (-player1.blackRegCoin);
                }
                if (player1.whiteRegCoin < 0) {
                    gold += (-player1.whiteRegCoin);
                    player1.goldCoin -= (-player1.whiteRegCoin);
                }
                coins.setGold(gold);
                player1.setBlackRegCoin(player1.blackRegCoin);
                player1.setRedRegCoin(player1.redRegCoin);
                player1.setWhiteRegCoin(player1.whiteRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.redSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                reserveArray3(player1);
            } else {
                JOptionPane.showMessageDialog(Main.this, "You dont have enough coins to buy this card!");
            }
        } else if (player1.reservePrice[2].equals("3 Red + 4 Green + 3 Black")) {
            if (player1.redRegCoin + player1.redSpecCoin >= 3 && player1.blackRegCoin + player1.blackSpecCoin >= 3 && player1.greenRegCoin + player1.greenSpecCoin >= 4) {
                int point = player1.getPoints();
                point += 5;
                player1.setPoints(point);
                player1.redRegCoin -= 3;
                player1.blackRegCoin -= 3;
                player1.greenRegCoin -= 4;
                int coin = coins.getRed();
                if (player1.redRegCoin < 0)
                    coin += (player1.redRegCoin + 3);
                else
                    coin += 3;
                coins.setRed(coin);
                coin = coins.getBlack();
                if (player1.blackRegCoin < 0)
                    coin += (player1.blueRegCoin + 3);
                else
                    coin += 3;
                coins.setBlack(coin);
                coin = coins.getGreen();
                if (player1.greenRegCoin < 0)
                    coin += (player1.greenRegCoin + 4);
                else
                    coin += 4;
                coins.setGreen(coin);
                player1.setRedRegCoin(player1.redRegCoin);
                player1.setBlackRegCoin(player1.blackRegCoin);
                player1.setGreenRegCoin(player1.greenRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.blackSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                reserveArray3(player1);
            } else if (player1.redRegCoin + player1.goldCoin >= 3 && player1.greenRegCoin + player1.goldCoin >= 4 && player1.blackRegCoin + player1.goldCoin >= 3) {
                int point = player1.getPoints();
                point += 4;
                player1.setPoints(point);
                player1.redRegCoin -= 3;
                player1.blackRegCoin -= 3;
                player1.greenRegCoin -= 4;
                int coin = coins.getRed();
                if (player1.redRegCoin < 0)
                    coin += (player1.redRegCoin + 3);
                else
                    coin += 3;
                coins.setRed(coin);
                coin = coins.getBlack();
                if (player1.blackRegCoin < 0)
                    coin += (player1.blackRegCoin + 3);
                else
                    coin += 3;
                coins.setBlack(coin);
                coin = coins.getGreen();
                if (player1.greenRegCoin < 0)
                    coin += (player1.greenRegCoin + 4);
                else
                    coin += 4;
                coins.setGreen(coin);
                int gold = coins.getGold();
                if (player1.redRegCoin < 0) {
                    gold += (-player1.redRegCoin);
                    player1.goldCoin -= (-player1.redRegCoin);
                }
                if (player1.blackRegCoin < 0) {
                    gold += (-player1.blackRegCoin);
                    player1.goldCoin -= (-player1.blackRegCoin);
                }
                if (player1.greenRegCoin < 0) {
                    gold += (-player1.greenRegCoin);
                    player1.goldCoin -= (-player1.greenRegCoin);
                }
                coins.setGold(gold);
                player1.setBlackRegCoin(player1.blackRegCoin);
                player1.setRedRegCoin(player1.redRegCoin);
                player1.setGreenRegCoin(player1.greenRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.blackSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                reserveArray3(player1);
            } else {
                JOptionPane.showMessageDialog(Main.this, "You dont have enough coins to buy this card!");
            }
        }
    }

    private void addComponent(JPanel panel, ImageIcon icon, GridBagConstraints gbc, int x, int y, boolean m, boolean j, JLabel specialCoin, JLabel rank, JLabel price, Color color, boolean cardOrMach, int cardRemaining, int coinRemaining, String cardOrMachInfo) {
        JPanel cardCase = new JPanel(new BorderLayout());
        //making the buttons
        JButton button = new JButton(icon);
        if (!m) {
            button.setPreferredSize(new Dimension(icon.getIconWidth(), icon.getIconHeight()));
        } else {
            if (j) {
                button.setPreferredSize(new Dimension(icon.getIconWidth() + 150, icon.getIconHeight()));
            } else {
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
        button.add(price, BorderLayout.SOUTH);
        button.add(rank, BorderLayout.NORTH);
        button.add(specialCoin, BorderLayout.WEST);
        //adding labels under the cards
        if (cardOrMach) {
            if (cardOrMachInfo.equals("tent1")) {
                underLabel1 = new JLabel(" Remaining cards = " + cards.getTent1());
                underLabel1.setFont(font);
                underLabel1.setForeground(color);
                cardCase.add(underLabel1, BorderLayout.SOUTH);
            } else if (cardOrMachInfo.equals("tent2")) {
                underLabel2 = new JLabel(" Remaining cards = " + cards.getTent2());
                underLabel2.setFont(font);
                underLabel2.setForeground(color);
                cardCase.add(underLabel2, BorderLayout.SOUTH);
            } else if (cardOrMachInfo.equals("tent3")) {
                underLabel3 = new JLabel(" Remaining cards = " + cards.getTent3());
                underLabel3.setFont(font);
                underLabel3.setForeground(color);
                cardCase.add(underLabel3, BorderLayout.SOUTH);
            } else if (cardOrMachInfo.equals("tent4")) {
                underLabel4 = new JLabel(" Remaining cards = " + cards.getTent4());
                underLabel4.setFont(font);
                underLabel4.setForeground(color);
                cardCase.add(underLabel4, BorderLayout.SOUTH);
            } else if (cardOrMachInfo.equals("ferris1")) {
                underLabel5 = new JLabel(" Remaining cards = " + cards.getFerris1());
                underLabel5.setFont(font);
                underLabel5.setForeground(color);
                cardCase.add(underLabel5, BorderLayout.SOUTH);
            } else if (cardOrMachInfo.equals("ferris2")) {
                underLabel6 = new JLabel(" Remaining cards = " + cards.getFerris2());
                underLabel6.setFont(font);
                underLabel6.setForeground(color);
                cardCase.add(underLabel6, BorderLayout.SOUTH);
            } else if (cardOrMachInfo.equals("ferris3")) {
                underLabel7 = new JLabel(" Remaining cards = " + cards.getFerris3());
                underLabel7.setFont(font);
                underLabel7.setForeground(color);
                cardCase.add(underLabel7, BorderLayout.SOUTH);
            } else if (cardOrMachInfo.equals("ferris4")) {
                underLabel8 = new JLabel(" Remaining cards = " + cards.getFerris4());
                underLabel8.setFont(font);
                underLabel8.setForeground(color);
                cardCase.add(underLabel8, BorderLayout.SOUTH);
            } else if (cardOrMachInfo.equals("coaster1")) {
                underLabel9 = new JLabel(" Remaining cards = " + cards.getCoaster1());
                underLabel9.setFont(font);
                underLabel9.setForeground(color);
                cardCase.add(underLabel9, BorderLayout.SOUTH);
            } else if (cardOrMachInfo.equals("coaster2")) {
                underLabel10 = new JLabel(" Remaining cards = " + cards.getCoaster2());
                underLabel10.setFont(font);
                underLabel10.setForeground(color);
                cardCase.add(underLabel10, BorderLayout.SOUTH);
            } else if (cardOrMachInfo.equals("coaster3")) {
                underLabel11 = new JLabel(" Remaining cards = " + cards.getCoaster3());
                underLabel11.setFont(font);
                underLabel11.setForeground(color);
                cardCase.add(underLabel11, BorderLayout.SOUTH);
            } else {
                underLabel12 = new JLabel(" Remaining cards = " + cards.getCoaster4());
                underLabel12.setFont(font);
                underLabel12.setForeground(color);
                cardCase.add(underLabel12, BorderLayout.SOUTH);
            }
        } else {
            if (cardOrMachInfo.equals("black")) {
                underMachLabel1 = new JLabel(" Remaining coins = " + coins.getBlack());
                underMachLabel1.setFont(font);
                underMachLabel1.setForeground(color);
                cardCase.add(underMachLabel1, BorderLayout.SOUTH);
            } else if (cardOrMachInfo.equals("white")) {
                underMachLabel2 = new JLabel(" Remaining coins = " + coins.getWhite());
                underMachLabel2.setFont(font);
                underMachLabel2.setForeground(color);
                cardCase.add(underMachLabel2, BorderLayout.SOUTH);
            } else if (cardOrMachInfo.equals("green")) {
                underMachLabel3 = new JLabel(" Remaining coins = " + coins.getGreen());
                underMachLabel3.setFont(font);
                underMachLabel3.setForeground(color);
                cardCase.add(underMachLabel3, BorderLayout.SOUTH);
            } else if (cardOrMachInfo.equals("blue")) {
                underMachLabel4 = new JLabel(" Remaining coins = " + coins.getBlue());
                underMachLabel4.setFont(font);
                underMachLabel4.setForeground(color);
                cardCase.add(underMachLabel4, BorderLayout.SOUTH);
            } else {
                underMachLabel5 = new JLabel(" Remaining coins = " + coins.getRed());
                underMachLabel5.setFont(font);
                underMachLabel5.setForeground(color);
                cardCase.add(underMachLabel5, BorderLayout.SOUTH);
            }

        }
        //action listeners
        if (!cardOrMach) {
            button.addActionListener(e -> slotMachOpt(cardOrMachInfo));
        } else {

            button.addActionListener(e -> cardOpt(cardOrMachInfo));
        }
        cardCase.add(button, BorderLayout.CENTER);
        panel.add(cardCase, gbc);

    }


    //add component for prize claw cards
    public void addComponent(JPanel panel, ImageIcon icon, GridBagConstraints gbc, int x, int y, boolean m, boolean j, JLabel specialCoin, JLabel rank, JLabel price, Color color, int clawRemaining, String clawInfo) {
        JPanel cardCase = new JPanel(new BorderLayout());
        //making the buttons
        JButton button = new JButton(icon);
        if (!m) {
            button.setPreferredSize(new Dimension(icon.getIconWidth(), icon.getIconHeight()));
        } else {
            if (j) {
                button.setPreferredSize(new Dimension(icon.getIconWidth() + 150, icon.getIconHeight()));
            } else {
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
        button.add(price, BorderLayout.SOUTH);
        button.add(rank, BorderLayout.NORTH);
        button.add(specialCoin, BorderLayout.WEST);
        //adding labels under the cards
        if (clawInfo.equals("claw1")) {
            underLabelClaw1 = new JLabel(" Remaining cards = " + prizeClaw.getClaw1());
            underLabelClaw1.setFont(font);
            underLabelClaw1.setForeground(color);
            cardCase.add(underLabelClaw1, BorderLayout.SOUTH);
        } else if (clawInfo.equals("claw2")) {
            underLabelClaw2 = new JLabel(" Remaining cards = " + prizeClaw.getClaw2());
            underLabelClaw2.setFont(font);
            underLabelClaw2.setForeground(color);
            cardCase.add(underLabelClaw2, BorderLayout.SOUTH);
        } else {
            underLabelClaw3 = new JLabel(" Remaining cards = " + prizeClaw.getClaw3());
            underLabelClaw3.setFont(font);
            underLabelClaw3.setForeground(color);
            cardCase.add(underLabelClaw3, BorderLayout.SOUTH);
        }
        button.addActionListener(e -> clawOpt(clawInfo));
        cardCase.add(button, BorderLayout.CENTER);
        panel.add(cardCase, gbc);

    }


    //if a slot machine is clicked on
    public void slotMachOpt(String colorOfMach) {
        JFrame frame1 = new JFrame();
        frame1.setSize(700, 700);
        frame1.setVisible(true);
        JPanel slotMach = new JPanel(new GridLayout(1, 2, 50, 50));
        JButton coin_2 = new JButton("Pick 2 coins from one machine");
        JButton coin3 = new JButton("Pick 3 coins from 3 different machines");
        coin_2.addActionListener(e -> {
            if (colorOfMach.equals("blue") && coins.getBlue() == 4) {
                if (player.turnPlayer % 2 == 1) {
                    coinDeduct(player1, colorOfMach, true);

                } else {
                    coinDeduct(player2, colorOfMach, false);
                }
                frame1.setVisible(false);
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
            } else if (colorOfMach.equals("black") && coins.getBlack() == 4) {
                if (player.turnPlayer % 2 == 1) {
                    coinDeduct(player1, colorOfMach, true);

                } else {
                    coinDeduct(player2, colorOfMach, false);
                }
                frame1.setVisible(false);
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
            } else if (colorOfMach.equals("red") && coins.getRed() == 4) {
                if (player.turnPlayer % 2 == 1) {
                    coinDeduct(player1, colorOfMach, true);

                } else {
                    coinDeduct(player2, colorOfMach, false);
                }
                frame1.setVisible(false);
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
            } else if (colorOfMach.equals("white") && coins.getWhite() == 4) {
                if (player.turnPlayer % 2 == 1) {
                    coinDeduct(player1, colorOfMach, true);

                } else {
                    coinDeduct(player2, colorOfMach, false);
                }
                frame1.setVisible(false);
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
            } else if (colorOfMach.equals("green") && coins.getGreen() == 4) {
                if (player.turnPlayer % 2 == 1) {
                    coinDeduct(player1, colorOfMach, true);

                } else {
                    coinDeduct(player2, colorOfMach, false);
                }
                frame1.setVisible(false);
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
            } else {
                JOptionPane.showMessageDialog(Main.this, "There isn't enough coins in the machine!");
            }
        });
        coin3.addActionListener(e -> {
            JFrame frame2 = new JFrame();
            frame2.setSize(600, 600);
            frame2.setVisible(true);
            JPanel coin3Options = new JPanel(new GridLayout(11, 1, 5, 5));
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
            opt1.addActionListener(e1 -> {
                if (coins.getBlack() > 0 && coins.getBlue() > 0 && coins.getWhite() > 0) {
                    if (player.turnPlayer % 2 == 1) {
                        coinDeduct1(player1);
                        underMachLabel1.setText(" Remaining coins = " + coins.getBlack());
                        underMachLabel4.setText(" Remaining coins = " + coins.getBlue());
                        underMachLabel2.setText(" Remaining coins = " + coins.getWhite());
                        coin1.setText("Coins: " + "Green=" + player1.greenRegCoin + ", White=" + player1.whiteRegCoin + ", Black=" + player1.blackRegCoin + ", red=" + player1.redRegCoin + ", blue=" + player1.blueRegCoin + " ");
                    } else {
                        coinDeduct1(player2);
                        underMachLabel1.setText(" Remaining coins = " + coins.getBlack());
                        underMachLabel4.setText(" Remaining coins = " + coins.getBlue());
                        underMachLabel2.setText(" Remaining coins = " + coins.getWhite());
                        coin2.setText("Coins: " + "Green=" + player2.greenRegCoin + ", White=" + player2.whiteRegCoin + ", Black=" + player2.blackRegCoin + ", red=" + player2.redRegCoin + ", blue=" + player2.blueRegCoin + " ");
                    }
                    frame2.setVisible(false);
                    frame1.setVisible(false);
                    player.turnPlayer++;
                    turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                } else {
                    JOptionPane.showMessageDialog(Main.this, "There isn't enough coins in the machines!");
                }
            });
            opt2.addActionListener(e12 -> {
                if (coins.getBlack() > 0 && coins.getGreen() > 0 && coins.getWhite() > 0) {
                    if (player.turnPlayer % 2 == 1) {
                        coinDeduct2(player1);
                        underMachLabel1.setText(" Remaining coins = " + coins.getBlack());
                        underMachLabel3.setText(" Remaining coins = " + coins.getGreen());
                        underMachLabel2.setText(" Remaining coins = " + coins.getWhite());
                        coin1.setText("Coins: " + "Green=" + player1.greenRegCoin + ", White=" + player1.whiteRegCoin + ", Black=" + player1.blackRegCoin + ", red=" + player1.redRegCoin + ", blue=" + player1.blueRegCoin + " ");

                    } else {
                        coinDeduct2(player2);
                        underMachLabel1.setText(" Remaining coins = " + coins.getBlack());
                        underMachLabel3.setText(" Remaining coins = " + coins.getGreen());
                        underMachLabel2.setText(" Remaining coins = " + coins.getWhite());
                        coin2.setText("Coins: " + "Green=" + player2.greenRegCoin + ", White=" + player2.whiteRegCoin + ", Black=" + player2.blackRegCoin + ", red=" + player2.redRegCoin + ", blue=" + player2.blueRegCoin + " ");
                    }
                    frame2.setVisible(false);
                    frame1.setVisible(false);
                    player.turnPlayer++;
                    turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                } else {
                    JOptionPane.showMessageDialog(Main.this, "There isn't enough coins in the machines!");
                }
            });
            opt3.addActionListener(e13 -> {
                if (coins.getBlack() > 0 && coins.getRed() > 0 && coins.getWhite() > 0) {
                    if (player.turnPlayer % 2 == 1) {
                        coinDeduct3(player1);
                        underMachLabel1.setText(" Remaining coins = " + coins.getBlack());
                        underMachLabel5.setText(" Remaining coins = " + coins.getRed());
                        underMachLabel2.setText(" Remaining coins = " + coins.getWhite());
                        coin1.setText("Coins: " + "Green=" + player1.greenRegCoin + ", White=" + player1.whiteRegCoin + ", Black=" + player1.blackRegCoin + ", red=" + player1.redRegCoin + ", blue=" + player1.blueRegCoin + " ");
                    } else {
                        coinDeduct3(player2);
                        underMachLabel1.setText(" Remaining coins = " + coins.getBlack());
                        underMachLabel5.setText(" Remaining coins = " + coins.getRed());
                        underMachLabel2.setText(" Remaining coins = " + coins.getWhite());
                        coin2.setText("Coins: " + "Green=" + player2.greenRegCoin + ", White=" + player2.whiteRegCoin + ", Black=" + player2.blackRegCoin + ", red=" + player2.redRegCoin + ", blue=" + player2.blueRegCoin + " ");
                    }
                    frame2.setVisible(false);
                    frame1.setVisible(false);
                    player.turnPlayer++;
                    turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                } else {
                    JOptionPane.showMessageDialog(Main.this, "There isn't enough coins in the machines!");
                }
            });
            opt4.addActionListener(e14 -> {
                if (coins.getBlack() > 0 && coins.getGreen() > 0 && coins.getBlue() > 0) {
                    if (player.turnPlayer % 2 == 1) {
                        coinDeduct4(player1);
                        underMachLabel1.setText(" Remaining coins = " + coins.getBlack());
                        underMachLabel3.setText(" Remaining coins = " + coins.getGreen());
                        underMachLabel4.setText(" Remaining coins = " + coins.getBlue());
                        coin1.setText("Coins: " + "Green=" + player1.greenRegCoin + ", White=" + player1.whiteRegCoin + ", Black=" + player1.blackRegCoin + ", red=" + player1.redRegCoin + ", blue=" + player1.blueRegCoin + " ");

                    } else {
                        coinDeduct4(player2);
                        underMachLabel1.setText(" Remaining coins = " + coins.getBlack());
                        underMachLabel3.setText(" Remaining coins = " + coins.getGreen());
                        underMachLabel4.setText(" Remaining coins = " + coins.getBlue());
                        coin2.setText("Coins: " + "Green=" + player2.greenRegCoin + ", White=" + player2.whiteRegCoin + ", Black=" + player2.blackRegCoin + ", red=" + player2.redRegCoin + ", blue=" + player2.blueRegCoin + " ");

                    }
                    frame2.setVisible(false);
                    frame1.setVisible(false);
                    player.turnPlayer++;
                    turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                } else {
                    JOptionPane.showMessageDialog(Main.this, "There isn't enough coins in the machines!");
                }
            });
            opt5.addActionListener(e15 -> {
                if (coins.getBlack() > 0 && coins.getBlue() > 0 && coins.getRed() > 0) {
                    if (player.turnPlayer % 2 == 1) {
                        coinDeduct5(player1);
                        underMachLabel1.setText(" Remaining coins = " + coins.getBlack());
                        underMachLabel5.setText(" Remaining coins = " + coins.getRed());
                        underMachLabel4.setText(" Remaining coins = " + coins.getBlue());
                        coin1.setText("Coins: " + "Green=" + player1.greenRegCoin + ", White=" + player1.whiteRegCoin + ", Black=" + player1.blackRegCoin + ", red=" + player1.redRegCoin + ", blue=" + player1.blueRegCoin + " ");

                    } else {
                        coinDeduct5(player2);
                        underMachLabel1.setText(" Remaining coins = " + coins.getBlack());
                        underMachLabel5.setText(" Remaining coins = " + coins.getRed());
                        underMachLabel4.setText(" Remaining coins = " + coins.getBlue());
                        coin2.setText("Coins: " + "Green=" + player2.greenRegCoin + ", White=" + player2.whiteRegCoin + ", Black=" + player2.blackRegCoin + ", red=" + player2.redRegCoin + ", blue=" + player2.blueRegCoin + " ");

                    }
                    frame2.setVisible(false);
                    frame1.setVisible(false);
                    player.turnPlayer++;
                    turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                } else {
                    JOptionPane.showMessageDialog(Main.this, "There isn't enough coins in the machines!");
                }
            });
            opt6.addActionListener(e16 -> {
                if (coins.getBlack() > 0 && coins.getGreen() > 0 && coins.getRed() > 0) {
                    if (player.turnPlayer % 2 == 1) {
                        coinDeduct6(player1);
                        underMachLabel1.setText(" Remaining coins = " + coins.getBlack());
                        underMachLabel5.setText(" Remaining coins = " + coins.getRed());
                        underMachLabel3.setText(" Remaining coins = " + coins.getGreen());
                        coin1.setText("Coins: " + "Green=" + player1.greenRegCoin + ", White=" + player1.whiteRegCoin + ", Black=" + player1.blackRegCoin + ", red=" + player1.redRegCoin + ", blue=" + player1.blueRegCoin + " ");

                    } else {
                        coinDeduct6(player2);
                        underMachLabel1.setText(" Remaining coins = " + coins.getBlack());
                        underMachLabel5.setText(" Remaining coins = " + coins.getRed());
                        underMachLabel3.setText(" Remaining coins = " + coins.getGreen());
                        coin2.setText("Coins: " + "Green=" + player2.greenRegCoin + ", White=" + player2.whiteRegCoin + ", Black=" + player2.blackRegCoin + ", red=" + player2.redRegCoin + ", blue=" + player2.blueRegCoin + " ");

                    }
                    frame2.setVisible(false);
                    frame1.setVisible(false);
                    player.turnPlayer++;
                    turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                } else {
                    JOptionPane.showMessageDialog(Main.this, "There isn't enough coins in the machines!");
                }
            });
            opt7.addActionListener(e17 -> {
                if (coins.getBlue() > 0 && coins.getGreen() > 0 && coins.getWhite() > 0) {
                    if (player.turnPlayer % 2 == 1) {
                        coinDeduct7(player1);
                        underMachLabel4.setText(" Remaining coins = " + coins.getBlue());
                        underMachLabel2.setText(" Remaining coins = " + coins.getWhite());
                        underMachLabel3.setText(" Remaining coins = " + coins.getGreen());
                        coin1.setText("Coins: " + "Green=" + player1.greenRegCoin + ", White=" + player1.whiteRegCoin + ", Black=" + player1.blackRegCoin + ", red=" + player1.redRegCoin + ", blue=" + player1.blueRegCoin + " ");

                    } else {
                        coinDeduct7(player2);
                        underMachLabel4.setText(" Remaining coins = " + coins.getBlue());
                        underMachLabel2.setText(" Remaining coins = " + coins.getWhite());
                        underMachLabel3.setText(" Remaining coins = " + coins.getGreen());
                        coin2.setText("Coins: " + "Green=" + player2.greenRegCoin + ", White=" + player2.whiteRegCoin + ", Black=" + player2.blackRegCoin + ", red=" + player2.redRegCoin + ", blue=" + player2.blueRegCoin + " ");

                    }
                    frame2.setVisible(false);
                    frame1.setVisible(false);
                    player.turnPlayer++;
                    turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                } else {
                    JOptionPane.showMessageDialog(Main.this, "There isn't enough coins in the machines!");
                }
            });
            opt8.addActionListener(e18 -> {
                if (coins.getBlue() > 0 && coins.getRed() > 0 && coins.getWhite() > 0) {
                    if (player.turnPlayer % 2 == 1) {
                        coinDeduct8(player1);
                        underMachLabel4.setText(" Remaining coins = " + coins.getBlue());
                        underMachLabel2.setText(" Remaining coins = " + coins.getWhite());
                        underMachLabel5.setText(" Remaining coins = " + coins.getRed());
                        coin1.setText("Coins: " + "Green=" + player1.greenRegCoin + ", White=" + player1.whiteRegCoin + ", Black=" + player1.blackRegCoin + ", red=" + player1.redRegCoin + ", blue=" + player1.blueRegCoin + " ");

                    } else {
                        coinDeduct8(player2);
                        underMachLabel4.setText(" Remaining coins = " + coins.getBlue());
                        underMachLabel2.setText(" Remaining coins = " + coins.getWhite());
                        underMachLabel5.setText(" Remaining coins = " + coins.getRed());
                        coin2.setText("Coins: " + "Green=" + player2.greenRegCoin + ", White=" + player2.whiteRegCoin + ", Black=" + player2.blackRegCoin + ", red=" + player2.redRegCoin + ", blue=" + player2.blueRegCoin + " ");

                    }
                    frame2.setVisible(false);
                    frame1.setVisible(false);
                    player.turnPlayer++;
                    turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                } else {
                    JOptionPane.showMessageDialog(Main.this, "There isn't enough coins in the machines!");
                }
            });
            opt9.addActionListener(e19 -> {
                if (coins.getRed() > 0 && coins.getGreen() > 0 && coins.getWhite() > 0) {
                    if (player.turnPlayer % 2 == 1) {
                        coinDeduct9(player1);
                        underMachLabel3.setText(" Remaining coins = " + coins.getGreen());
                        underMachLabel2.setText(" Remaining coins = " + coins.getWhite());
                        underMachLabel5.setText(" Remaining coins = " + coins.getRed());
                        coin1.setText("Coins: " + "Green=" + player1.greenRegCoin + ", White=" + player1.whiteRegCoin + ", Black=" + player1.blackRegCoin + ", red=" + player1.redRegCoin + ", blue=" + player1.blueRegCoin + " ");

                    } else {
                        coinDeduct9(player2);
                        underMachLabel3.setText(" Remaining coins = " + coins.getGreen());
                        underMachLabel2.setText(" Remaining coins = " + coins.getWhite());
                        underMachLabel5.setText(" Remaining coins = " + coins.getRed());
                        coin2.setText("Coins: " + "Green=" + player2.greenRegCoin + ", White=" + player2.whiteRegCoin + ", Black=" + player2.blackRegCoin + ", red=" + player2.redRegCoin + ", blue=" + player2.blueRegCoin + " ");

                    }
                    frame2.setVisible(false);
                    frame1.setVisible(false);
                    player.turnPlayer++;
                    turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                } else {
                    JOptionPane.showMessageDialog(Main.this, "There isn't enough coins in the machines!");
                }
            });
            opt10.addActionListener(e110 -> {
                if (coins.getBlue() > 0 && coins.getGreen() > 0 && coins.getRed() > 0) {
                    if (player.turnPlayer % 2 == 1) {
                        coinDeduct10(player1);
                        underMachLabel3.setText(" Remaining coins = " + coins.getGreen());
                        underMachLabel4.setText(" Remaining coins = " + coins.getBlue());
                        underMachLabel5.setText(" Remaining coins = " + coins.getRed());
                        coin1.setText("Coins: " + "Green=" + player1.greenRegCoin + ", White=" + player1.whiteRegCoin + ", Black=" + player1.blackRegCoin + ", red=" + player1.redRegCoin + ", blue=" + player1.blueRegCoin + " ");

                    } else {
                        coinDeduct10(player2);
                        underMachLabel3.setText(" Remaining coins = " + coins.getGreen());
                        underMachLabel4.setText(" Remaining coins = " + coins.getBlue());
                        underMachLabel5.setText(" Remaining coins = " + coins.getRed());
                        coin2.setText("Coins: " + "Green=" + player2.greenRegCoin + ", White=" + player2.whiteRegCoin + ", Black=" + player2.blackRegCoin + ", red=" + player2.redRegCoin + ", blue=" + player2.blueRegCoin + " ");

                    }
                    frame2.setVisible(false);
                    frame1.setVisible(false);
                    player.turnPlayer++;
                    turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                } else {
                    JOptionPane.showMessageDialog(Main.this, "There isn't enough coins in the machines!");
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
            frame2.add(coin3Options);
        });
        slotMach.add(coin_2);
        slotMach.add(coin3);
        frame1.add(slotMach);
    }

    public void coinDeduct1(player player1) {
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
        coinMax10();
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
        coinMax10();
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
        coinMax10();
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
        coinMax10();
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
        coinMax10();
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
        coinMax10();
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
        coinMax10();
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
        coinMax10();
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
        coinMax10();
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
        coinMax10();
    }

    private void coinDeduct(player player1, String colorOfMach, boolean a) {
        if (colorOfMach.equals("red")) {
            player1.redRegCoin += 2;
            int coin = coins.getRed();
            coin -= 2;
            coins.setRed(coin);
            if (a) {
                coin1.setText("Coins: " + "Green=" + player1.greenRegCoin + ", White=" + player1.whiteRegCoin + ", Black=" + player1.blackRegCoin + ", red=" + player1.redRegCoin + ", blue=" + player1.blueRegCoin + " ");
            } else {
                coin2.setText("Coins: " + "Green=" + player2.greenRegCoin + ", White=" + player2.whiteRegCoin + ", Black=" + player2.blackRegCoin + ", red=" + player2.redRegCoin + ", blue=" + player2.blueRegCoin + " ");
            }
            underMachLabel5.setText(" Remaining coins = " + coins.getRed());
        } else if (colorOfMach.equals("black")) {
            player1.blackRegCoin += 2;
            int coin = coins.getBlack();
            coin -= 2;
            coins.setBlack(coin);
            if (a) {
                coin1.setText("Coins: " + "Green=" + player1.greenRegCoin + ", White=" + player1.whiteRegCoin + ", Black=" + player1.blackRegCoin + ", red=" + player1.redRegCoin + ", blue=" + player1.blueRegCoin + " ");
            } else {
                coin2.setText("Coins: " + "Green=" + player2.greenRegCoin + ", White=" + player2.whiteRegCoin + ", Black=" + player2.blackRegCoin + ", red=" + player2.redRegCoin + ", blue=" + player2.blueRegCoin + " ");
            }
            underMachLabel1.setText(" Remaining coins = " + coins.getBlack());
        } else if (colorOfMach.equals("white")) {
            player1.whiteRegCoin += 2;
            int coin = coins.getWhite();
            coin -= 2;
            coins.setWhite(coin);
            if (a) {
                coin1.setText("Coins: " + "Green=" + player1.greenRegCoin + ", White=" + player1.whiteRegCoin + ", Black=" + player1.blackRegCoin + ", red=" + player1.redRegCoin + ", blue=" + player1.blueRegCoin + " ");
            } else {
                coin2.setText("Coins: " + "Green=" + player2.greenRegCoin + ", White=" + player2.whiteRegCoin + ", Black=" + player2.blackRegCoin + ", red=" + player2.redRegCoin + ", blue=" + player2.blueRegCoin + " ");
            }
            underMachLabel2.setText(" Remaining coins = " + coins.getWhite());
        } else if (colorOfMach.equals("blue")) {
            player1.blueRegCoin += 2;
            int coin = coins.getBlue();
            coin -= 2;
            coins.setBlue(coin);
            if (a) {
                coin1.setText("Coins: " + "Green=" + player1.greenRegCoin + ", White=" + player1.whiteRegCoin + ", Black=" + player1.blackRegCoin + ", red=" + player1.redRegCoin + ", blue=" + player1.blueRegCoin + " ");
            } else {
                coin2.setText("Coins: " + "Green=" + player2.greenRegCoin + ", White=" + player2.whiteRegCoin + ", Black=" + player2.blackRegCoin + ", red=" + player2.redRegCoin + ", blue=" + player2.blueRegCoin + " ");
            }
            underMachLabel4.setText(" Remaining coins = " + coins.getBlue());
        } else {
            player1.greenRegCoin += 2;
            int coin = coins.getGreen();
            coin -= 2;
            coins.setGreen(coin);
            if (a) {
                coin1.setText("Coins: " + "Green=" + player1.greenRegCoin + ", White=" + player1.whiteRegCoin + ", Black=" + player1.blackRegCoin + ", red=" + player1.redRegCoin + ", blue=" + player1.blueRegCoin + " ");
            } else {
                coin2.setText("Coins: " + "Green=" + player2.greenRegCoin + ", White=" + player2.whiteRegCoin + ", Black=" + player2.blackRegCoin + ", red=" + player2.redRegCoin + ", blue=" + player2.blueRegCoin + " ");
            }
            underMachLabel3.setText(" Remaining coins = " + coins.getGreen());
        }
        coinMax10();
    }

    //clicked on a prize claw card
    private void clawOpt(String clawInfo) {
        if (player.turnPlayer % 2 == 0) {
            if (clawInfo.equals("claw1")) {
                if (prizeClaw.getClaw1() > 0) {
                    if (player1.whiteSpecCoin >= 4 && player1.blueSpecCoin >= 4) {
                        int points = player1.getPoints();
                        points += 3;
                        player1.setPoints(points);
                        int claw = prizeClaw.getClaw1();
                        claw--;
                        prizeClaw.setClaw1(claw);
                        int num = player1.getNumOfCards();
                        num++;
                        player1.setNumOfCards(num);
                        underLabelClaw1.setText(" Remaining cards = " + prizeClaw.getClaw1());
                        points1.setText("Points:" + player1.getPoints());
                        numCard1.setText("Number of cards=" + player1.getNumOfCards());
                        winningCondition();
                    } else {
                        JOptionPane.showMessageDialog(Main.this, "You dont have enough special coins to buy this card!");
                    }
                } else {
                    JOptionPane.showMessageDialog(Main.this, "Sorry, this card is out of stock!");
                }
            } else if (clawInfo.equals("claw2")) {
                if (prizeClaw.getClaw2() > 0) {
                    if (player1.redSpecCoin >= 5 && player1.blackSpecCoin >= 4) {
                        int points = player1.getPoints();
                        points += 4;
                        player1.setPoints(points);
                        int claw = prizeClaw.getClaw2();
                        claw--;
                        prizeClaw.setClaw2(claw);
                        int num = player1.getNumOfCards();
                        num++;
                        player1.setNumOfCards(num);
                        underLabelClaw2.setText(" Remaining cards = " + prizeClaw.getClaw2());
                        points1.setText("Points:" + player1.getPoints());
                        numCard1.setText("Number of cards=" + player1.getNumOfCards());
                        winningCondition();
                    } else {
                        JOptionPane.showMessageDialog(Main.this, "You dont have enough special coins to buy this card!");
                    }
                } else {
                    JOptionPane.showMessageDialog(Main.this, "Sorry, this card is out of stock!");
                }
            } else {
                if (prizeClaw.getClaw3() > 0) {
                    if (player1.redSpecCoin >= 8 && player1.greenSpecCoin >= 2) {
                        int points = player1.getPoints();
                        points += 4;
                        player1.setPoints(points);
                        int claw = prizeClaw.getClaw3();
                        claw--;
                        prizeClaw.setClaw3(claw);
                        int num = player1.getNumOfCards();
                        num++;
                        player1.setNumOfCards(num);
                        underLabelClaw3.setText(" Remaining cards = " + prizeClaw.getClaw3());
                        points1.setText("Points:" + player1.getPoints());
                        numCard1.setText("Number of cards=" + player1.getNumOfCards());
                        winningCondition();
                    } else {
                        JOptionPane.showMessageDialog(Main.this, "You dont have enough special coins to buy this card!");
                    }
                } else {
                    JOptionPane.showMessageDialog(Main.this, "Sorry, this card is out of stock!");
                }
            }
        } else {
            if (clawInfo.equals("claw1")) {
                if (prizeClaw.getClaw1() > 0) {
                    if (player2.whiteSpecCoin >= 4 && player2.blueSpecCoin >= 4) {
                        int points = player2.getPoints();
                        points += 3;
                        player2.setPoints(points);
                        int claw = prizeClaw.getClaw1();
                        claw--;
                        prizeClaw.setClaw1(claw);
                        int num = player2.getNumOfCards();
                        num++;
                        player2.setNumOfCards(num);
                        underLabelClaw1.setText(" Remaining cards = " + prizeClaw.getClaw1());
                        points2.setText("Points:" + player2.getPoints());
                        numCard2.setText("Number of cards=" + player2.getNumOfCards());
                        winningCondition();
                    } else {
                        JOptionPane.showMessageDialog(Main.this, "You dont have enough special coins to buy this card!");
                    }
                } else {
                    JOptionPane.showMessageDialog(Main.this, "Sorry, this card is out of stock!");
                }
            } else if (clawInfo.equals("claw2")) {
                if (prizeClaw.getClaw2() > 0) {
                    if (player2.redSpecCoin >= 5 && player2.blackSpecCoin >= 4) {
                        int points = player2.getPoints();
                        points += 4;
                        player2.setPoints(points);
                        int claw = prizeClaw.getClaw2();
                        claw--;
                        prizeClaw.setClaw2(claw);
                        int num = player2.getNumOfCards();
                        num++;
                        player2.setNumOfCards(num);
                        underLabelClaw2.setText(" Remaining cards = " + prizeClaw.getClaw2());
                        points2.setText("Points:" + player2.getPoints());
                        numCard2.setText("Number of cards=" + player2.getNumOfCards());
                        winningCondition();
                    } else {
                        JOptionPane.showMessageDialog(Main.this, "You dont have enough special coins to buy this card!");
                    }
                } else {
                    JOptionPane.showMessageDialog(Main.this, "Sorry, this card is out of stock!");
                }
            } else {
                if (prizeClaw.getClaw3() > 0) {
                    if (player2.redSpecCoin >= 8 && player2.greenSpecCoin >= 2) {
                        int points = player2.getPoints();
                        points += 4;
                        player2.setPoints(points);
                        int claw = prizeClaw.getClaw3();
                        claw--;
                        prizeClaw.setClaw3(claw);
                        int num = player2.getNumOfCards();
                        num++;
                        player2.setNumOfCards(num);
                        underLabelClaw3.setText(" Remaining cards = " + prizeClaw.getClaw3());
                        points2.setText("Points:" + player2.getPoints());
                        numCard2.setText("Number of cards=" + player2.getNumOfCards());
                        winningCondition();
                    } else {
                        JOptionPane.showMessageDialog(Main.this, "You dont have enough special coins to buy this card!");
                    }
                } else {
                    JOptionPane.showMessageDialog(Main.this, "Sorry, this card is out of stock!");
                }
            }
        }
    }

    // clicked on a card
    private void cardOpt(String cardInfo) {
        JFrame frame3 = new JFrame();
        frame3.setVisible(true);
        frame3.setSize(500, 500);
        JPanel cardPanel = new JPanel(new GridLayout(3, 1, 10, 10));
        JLabel choose = new JLabel(" Do you want to reserve this card or purchase it?");
        JButton reserve = new JButton("Reserve");
        JButton buy = new JButton("Purchase");
        reserve.addActionListener(e -> {
            if (player.turnPlayer % 2 == 1) {
                reserveSetText(cardInfo, frame3, player1, reservation1, specialCoins1);
            } else {
                reserveSetText(cardInfo, frame3, player2, reservation2, specialCoins2);
            }
        });
        buy.addActionListener(e -> {
            if (player.turnPlayer % 2 == 1) {
                buySetText(player1, coin1, specialCoins1, points1, numCard1, frame3, cardInfo);
                winningCondition();
            } else {
                buySetText(player2, coin2, specialCoins2, points2, numCard2, frame3, cardInfo);
                winningCondition();
            }
        });
        cardPanel.add(choose);
        cardPanel.add(reserve);
        cardPanel.add(buy);
        frame3.add(cardPanel);
    }

    //setting the text of labels when reserving cards
    private void reserveSetText(String cardInfo, JFrame frame3, player player1, JLabel reservation1, JLabel specialCoins1) {
        cardIdRes(player1, cardInfo);
        reservation1.setText("Reserves:(Rank SpecialCoin)" + player1.reserveRank[0] + " " + player1.reserveSpecial[0] + "," + player1.reserveRank[1] + " " + player1.reserveSpecial[1] + "," + player1.reserveRank[2] + " " + player1.reserveSpecial[2] + " ");
        specialCoins1.setText("Special coins: " + "Green=" + player1.greenSpecCoin + ", White=" + player1.whiteSpecCoin + ", Black=" + player1.blackSpecCoin + ", red=" + player1.redSpecCoin + ", blue=" + player1.blueSpecCoin + ", Gold=" + player1.goldCoin + " ");
        underLabel1.setText(" Remaining cards = " + cards.getTent1());
        underLabel2.setText(" Remaining cards = " + cards.getTent2());
        underLabel3.setText(" Remaining cards = " + cards.getTent3());
        underLabel4.setText(" Remaining cards = " + cards.getTent4());
        underLabel5.setText(" Remaining cards = " + cards.getFerris1());
        underLabel6.setText(" Remaining cards = " + cards.getFerris2());
        underLabel7.setText(" Remaining cards = " + cards.getFerris3());
        underLabel8.setText(" Remaining cards = " + cards.getFerris4());
        underLabel9.setText(" Remaining cards = " + cards.getCoaster1());
        underLabel10.setText(" Remaining cards = " + cards.getCoaster2());
        underLabel11.setText(" Remaining cards = " + cards.getCoaster3());
        underLabel12.setText(" Remaining cards = " + cards.getCoaster4());
        frame3.setVisible(false);
    }

    //setting the text of labels when buying cards
    private void buySetText(player player1, JLabel coin1, JLabel specialCoins1, JLabel points1, JLabel numCard1, JFrame frame3, String cardInfo) {
        cardIdBuy(frame3, player1, cardInfo);
        coin1.setText("Coins: " + "Green=" + player1.greenRegCoin + ", White=" + player1.whiteRegCoin + ", Black=" + player1.blackRegCoin + ", red=" + player1.redRegCoin + ", blue=" + player1.blueRegCoin + " ");
        specialCoins1.setText("Special coins: " + "Green=" + player1.greenSpecCoin + ", White=" + player1.whiteSpecCoin + ", Black=" + player1.blackSpecCoin + ", red=" + player1.redSpecCoin + ", blue=" + player1.blueSpecCoin + ", Gold=" + player1.goldCoin + " ");
        points1.setText("Points:" + player1.getPoints());
        numCard1.setText("Number of cards=" + player1.getNumOfCards());
        underLabel1.setText(" Remaining cards = " + cards.getTent1());
        underLabel2.setText(" Remaining cards = " + cards.getTent2());
        underLabel3.setText(" Remaining cards = " + cards.getTent3());
        underLabel4.setText(" Remaining cards = " + cards.getTent4());
        underLabel5.setText(" Remaining cards = " + cards.getFerris1());
        underLabel6.setText(" Remaining cards = " + cards.getFerris2());
        underLabel7.setText(" Remaining cards = " + cards.getFerris3());
        underLabel8.setText(" Remaining cards = " + cards.getFerris4());
        underLabel9.setText(" Remaining cards = " + cards.getCoaster1());
        underLabel10.setText(" Remaining cards = " + cards.getCoaster2());
        underLabel11.setText(" Remaining cards = " + cards.getCoaster3());
        underLabel12.setText(" Remaining cards = " + cards.getCoaster4());
        underMachLabel1.setText(" Remaining coins = " + coins.getBlack());
        underMachLabel2.setText(" Remaining coins = " + coins.getWhite());
        underMachLabel3.setText(" Remaining coins = " + coins.getGreen());
        underMachLabel4.setText(" Remaining coins = " + coins.getBlue());
        underMachLabel5.setText(" Remaining coins = " + coins.getRed());
    }

    //buying cards functions
    private void cardIdBuy(JFrame frame, player player1, String cardInfo) {
        if (cardInfo.equals("tent1")) {
            if (player1.redRegCoin >= 4) {
                int point = player1.getPoints();
                point += 0;
                player1.setPoints(point);
                player1.redRegCoin -= 4;
                int coin = coins.getRed();
                coin += 4;
                coins.setRed(coin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.redSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                int card = cards.getTent1();
                card--;
                cards.setTent1(card);
                frame.setVisible(false);
            } else if (player1.redSpecCoin + player1.redRegCoin >= 4) {
                int point = player1.getPoints();
                point += 0;
                player1.setPoints(point);
                int coin = coins.getRed();
                coin += player1.redRegCoin;
                coins.setRed(coin);
                player1.redRegCoin = 0;
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.redSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                int card = cards.getTent1();
                card--;
                cards.setTent1(card);
                frame.setVisible(false);
            } else if (player1.redRegCoin + player1.goldCoin >= 4) {
                int point = player1.getPoints();
                point += 0;
                player1.setPoints(point);
                int coin = coins.getRed();
                coin += player1.redRegCoin;
                coins.setRed(coin);
                player1.goldCoin -= (4 - player1.redRegCoin);
                int gold = coins.getGold();
                gold += (4 - player1.redRegCoin);
                coins.setGold(gold);
                player1.redRegCoin = 0;
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.redSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                int card = cards.getTent1();
                card--;
                cards.setTent1(card);
                frame.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(Main.this, "You dont have enough coins to buy this card!");
            }
        } else if (cardInfo.equals("tent3")) {
            if (player1.greenRegCoin + player1.greenSpecCoin >= 1 && player1.blackRegCoin + player1.blackSpecCoin >= 5) {
                int point = player1.getPoints();
                point += 1;
                player1.setPoints(point);
                player1.greenRegCoin -= 1;
                player1.blackRegCoin -= 5;
                int coin = coins.getGreen();
                if (player1.greenRegCoin < 0)
                    coin += (player1.greenRegCoin + 1);
                else
                    coin += 2;
                coins.setGreen(coin);
                coin = coins.getBlack();
                if (player1.blackRegCoin < 0)
                    coin += (player1.blackRegCoin + 5);
                else
                    coin += 5;
                coins.setBlack(coin);
                player1.setBlackRegCoin(player1.blackRegCoin);
                player1.setGreenRegCoin(player1.greenRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.greenSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                int card = cards.getTent3();
                card--;
                cards.setTent3(card);
                frame.setVisible(false);
            } else if (player1.blackRegCoin + player1.goldCoin >= 5 && player1.greenRegCoin + player1.goldCoin >= 1) {
                int point = player1.getPoints();
                point += 0;
                player1.setPoints(point);
                player1.greenRegCoin -= 1;
                player1.blackRegCoin -= 5;
                int coin = coins.getGreen();
                if (player1.greenRegCoin < 0)
                    coin += (player1.greenRegCoin + 1);
                else
                    coin += 1;
                coins.setGreen(coin);
                coin = coins.getBlack();
                if (player1.blackRegCoin < 0)
                    coin += (player1.blackRegCoin + 5);
                else
                    coin += 5;
                coins.setBlack(coin);
                int gold = coins.getGold();
                if (player1.greenRegCoin < 0) {
                    gold += (-player1.greenRegCoin);
                    player1.goldCoin -= (-player1.greenRegCoin);
                }
                if (player1.blackRegCoin < 0) {
                    gold += (-player1.blackRegCoin);
                    player1.goldCoin -= (-player1.blackRegCoin);
                }
                coins.setGold(gold);
                player1.setWhiteRegCoin(player1.greenRegCoin);
                player1.setBlueRegCoin(player1.blackRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.greenSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                int card = cards.getTent3();
                card--;
                cards.setTent3(card);
                frame.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(Main.this, "You dont have enough coins to buy this card!");
            }
        } else if (cardInfo.equals("tent2")) {
            if (player1.blueRegCoin + player1.blueSpecCoin >= 3 && player1.whiteRegCoin + player1.whiteSpecCoin >= 2) {
                int point = player1.getPoints();
                point += 1;
                player1.setPoints(point);
                player1.whiteRegCoin -= 2;
                player1.blueRegCoin -= 3;
                int coin = coins.getWhite();
                if (player1.whiteRegCoin < 0)
                    coin += (player1.whiteRegCoin + 2);
                else
                    coin += 2;
                coins.setWhite(coin);
                coin = coins.getBlue();
                if (player1.blueRegCoin < 0)
                    coin += (player1.blueRegCoin + 3);
                else
                    coin += 3;
                coins.setBlue(coin);
                player1.setWhiteRegCoin(player1.whiteRegCoin);
                player1.setBlueRegCoin(player1.blueRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.blueSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                int card = cards.getTent2();
                card--;
                cards.setTent2(card);
                frame.setVisible(false);
            } else if (player1.blueRegCoin + player1.goldCoin >= 3 && player1.whiteRegCoin + player1.goldCoin >= 2) {
                int point = player1.getPoints();
                point += 1;
                player1.setPoints(point);
                player1.whiteRegCoin -= 2;
                player1.blueRegCoin -= 3;
                int coin = coins.getWhite();
                if (player1.whiteRegCoin < 0)
                    coin += (player1.whiteRegCoin + 2);
                else
                    coin += 2;
                coins.setWhite(coin);
                coin = coins.getBlue();
                if (player1.blueRegCoin < 0)
                    coin += (player1.blueRegCoin + 3);
                else
                    coin += 3;
                coins.setBlue(coin);
                int gold = coins.getGold();
                if (player1.whiteRegCoin < 0) {
                    gold += (-player1.whiteRegCoin);
                    player1.goldCoin -= (-player1.whiteRegCoin);
                }
                if (player1.blueRegCoin < 0) {
                    gold += (-player1.blueRegCoin);
                    player1.goldCoin -= (-player1.blueRegCoin);
                }
                coins.setGold(gold);
                player1.setGreenRegCoin(player1.whiteRegCoin);
                player1.setBlackRegCoin(player1.blueRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.blueSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                int card = cards.getTent2();
                card--;
                cards.setTent2(card);
                frame.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(Main.this, "You dont have enough coins to buy this card!");
            }
        } else if (cardInfo.equals("tent4")) {
            if (player1.redRegCoin + player1.redSpecCoin >= 2 && player1.greenRegCoin + player1.greenSpecCoin >= 2) {
                int point = player1.getPoints();
                point += 0;
                player1.setPoints(point);
                player1.redRegCoin -= 2;
                player1.greenRegCoin -= 2;
                int coin = coins.getRed();
                if (player1.redRegCoin < 0)
                    coin += (player1.redRegCoin + 2);
                else
                    coin += 2;
                coins.setRed(coin);
                coin = coins.getGreen();
                if (player1.greenRegCoin < 0)
                    coin += (player1.greenRegCoin + 2);
                else
                    coin += 2;
                coins.setGreen(coin);
                player1.setRedRegCoin(player1.redRegCoin);
                player1.setGreenRegCoin(player1.greenRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.blackSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                int card = cards.getTent4();
                card--;
                cards.setTent4(card);
                frame.setVisible(false);
            } else if (player1.greenRegCoin + player1.goldCoin >= 2 && player1.redRegCoin + player1.goldCoin >= 2) {
                int point = player1.getPoints();
                point += 0;
                player1.setPoints(point);
                player1.redRegCoin -= 2;
                player1.greenRegCoin -= 2;
                int coin = coins.getRed();
                if (player1.redRegCoin < 0)
                    coin += (player1.redRegCoin + 2);
                else
                    coin += 2;
                coins.setRed(coin);
                coin = coins.getGreen();
                if (player1.greenRegCoin < 0)
                    coin += (player1.greenRegCoin + 3);
                else
                    coin += 2;
                coins.setGreen(coin);
                int gold = coins.getGold();
                if (player1.redRegCoin < 0) {
                    gold += (-player1.redRegCoin);
                    player1.goldCoin -= (-player1.redRegCoin);
                }
                if (player1.greenRegCoin < 0) {
                    gold += (-player1.greenRegCoin);
                    player1.goldCoin -= (-player1.greenRegCoin);
                }
                coins.setGold(gold);
                player1.setGreenRegCoin(player1.greenRegCoin);
                player1.setRedRegCoin(player1.redRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.blackSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                int card = cards.getTent4();
                card--;
                cards.setTent4(card);
                frame.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(Main.this, "You dont have enough coins to buy this card!");
            }
        } else if (cardInfo.equals("ferris1")) {
            if (player1.redRegCoin + player1.redSpecCoin >= 2 && player1.blueRegCoin + player1.blueSpecCoin >= 2 && player1.whiteRegCoin + player1.whiteSpecCoin >= 2) {
                int point = player1.getPoints();
                point += 2;
                player1.setPoints(point);
                player1.redRegCoin -= 2;
                player1.blueRegCoin -= 2;
                player1.whiteRegCoin -= 2;
                int coin = coins.getRed();
                if (player1.redRegCoin < 0)
                    coin += (player1.redRegCoin + 2);
                else
                    coin += 2;
                coins.setRed(coin);
                coin = coins.getBlue();
                if (player1.blueRegCoin < 0)
                    coin += (player1.blueRegCoin + 2);
                else
                    coin += 2;
                coins.setBlue(coin);
                coin = coins.getWhite();
                if (player1.whiteRegCoin < 0)
                    coin += (player1.whiteRegCoin + 2);
                else
                    coin += 2;
                coins.setWhite(coin);
                player1.setRedRegCoin(player1.redRegCoin);
                player1.setBlueRegCoin(player1.blueRegCoin);
                player1.setWhiteRegCoin(player1.whiteRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.redSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                int card = cards.getFerris1();
                card--;
                cards.setFerris1(card);
                frame.setVisible(false);
            } else if (player1.redRegCoin + player1.goldCoin >= 2 && player1.whiteRegCoin + player1.goldCoin >= 2 && player1.blueRegCoin + player1.goldCoin >= 2) {
                int point = player1.getPoints();
                point += 2;
                player1.setPoints(point);
                player1.redRegCoin -= 2;
                player1.blueRegCoin -= 2;
                player1.whiteRegCoin -= 2;
                int coin = coins.getRed();
                if (player1.redRegCoin < 0)
                    coin += (player1.redRegCoin + 2);
                else
                    coin += 2;
                coins.setRed(coin);
                coin = coins.getBlue();
                if (player1.blueRegCoin < 0)
                    coin += (player1.blueRegCoin + 2);
                else
                    coin += 2;
                coins.setBlue(coin);
                coin = coins.getWhite();
                if (player1.whiteRegCoin < 0)
                    coin += (player1.whiteRegCoin + 2);
                else
                    coin += 2;
                coins.setWhite(coin);
                int gold = coins.getGold();
                if (player1.redRegCoin < 0) {
                    gold += (-player1.redRegCoin);
                    player1.goldCoin -= (-player1.redRegCoin);
                }
                if (player1.blueRegCoin < 0) {
                    gold += (-player1.blueRegCoin);
                    player1.goldCoin -= (-player1.blueRegCoin);
                }
                if (player1.whiteRegCoin < 0) {
                    gold += (-player1.whiteRegCoin);
                    player1.goldCoin -= (-player1.whiteRegCoin);
                }
                coins.setGold(gold);
                player1.setBlueRegCoin(player1.blueRegCoin);
                player1.setRedRegCoin(player1.redRegCoin);
                player1.setWhiteRegCoin(player1.whiteRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.redSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                int card = cards.getFerris1();
                card--;
                cards.setFerris1(card);
                frame.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(Main.this, "You dont have enough coins to buy this card!");
            }
        } else if (cardInfo.equals("ferris2")) {
            if (player1.blackRegCoin + player1.blackSpecCoin >= 6 && player1.greenRegCoin + player1.greenSpecCoin >= 2) {
                int point = player1.getPoints();
                point += 3;
                player1.setPoints(point);
                player1.blackRegCoin -= 6;
                player1.greenRegCoin -= 2;
                int coin = coins.getBlack();
                if (player1.blackRegCoin < 0)
                    coin += (player1.blackRegCoin + 6);
                else
                    coin += 6;
                coins.setBlack(coin);
                coin = coins.getGreen();
                if (player1.greenRegCoin < 0)
                    coin += (player1.greenRegCoin + 2);
                else
                    coin += 2;
                coins.setGreen(coin);
                player1.setGreenRegCoin(player1.greenRegCoin);
                player1.setBlackRegCoin(player1.blackRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.blackSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                int card = cards.getFerris2();
                card--;
                cards.setFerris2(card);
                frame.setVisible(false);
            } else if (player1.greenRegCoin + player1.goldCoin >= 2 && player1.blackRegCoin + player1.goldCoin >= 6) {
                int point = player1.getPoints();
                point += 2;
                player1.setPoints(point);
                player1.blackRegCoin -= 6;
                player1.greenRegCoin -= 2;
                int coin = coins.getGreen();
                if (player1.greenRegCoin < 0)
                    coin += (player1.greenRegCoin + 2);
                else
                    coin += 2;
                coins.setGreen(coin);
                coin = coins.getBlack();
                if (player1.blackRegCoin < 0)
                    coin += (player1.blackRegCoin + 6);
                else
                    coin += 6;
                coins.setBlack(coin);
                int gold = coins.getGold();
                if (player1.greenRegCoin < 0) {
                    gold += (-player1.greenRegCoin);
                    player1.goldCoin -= (-player1.greenRegCoin);
                }
                if (player1.blackRegCoin < 0) {
                    gold += (-player1.blackRegCoin);
                    player1.goldCoin -= (-player1.blackRegCoin);
                }
                coins.setGold(gold);
                player1.setBlackRegCoin(player1.blackRegCoin);
                player1.setGreenRegCoin(player1.greenRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.blackSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                int card = cards.getFerris2();
                card--;
                cards.setFerris2(card);
                frame.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(Main.this, "You dont have enough coins to buy this card!");
            }
        } else if (cardInfo.equals("ferris3")) {
            if (player1.blueRegCoin + player1.blueSpecCoin >= 4 && player1.whiteRegCoin + player1.whiteSpecCoin >= 3) {
                int point = player1.getPoints();
                point += 4;
                player1.setPoints(point);
                player1.blueRegCoin -= 4;
                player1.whiteRegCoin -= 3;
                int coin = coins.getBlue();
                if (player1.blueRegCoin < 0)
                    coin += (player1.blueRegCoin + 4);
                else
                    coin += 4;
                coins.setBlue(coin);
                coin = coins.getWhite();
                if (player1.whiteRegCoin < 0)
                    coin += (player1.whiteRegCoin + 3);
                else
                    coin += 3;
                coins.setWhite(coin);
                player1.setWhiteRegCoin(player1.whiteRegCoin);
                player1.setBlueRegCoin(player1.blueRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.greenSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                int card = cards.getFerris3();
                card--;
                cards.setFerris3(card);
                frame.setVisible(false);
            } else if (player1.whiteRegCoin + player1.goldCoin >= 3 && player1.blueRegCoin + player1.goldCoin >= 4) {
                int point = player1.getPoints();
                point += 4;
                player1.setPoints(point);
                player1.blueRegCoin -= 4;
                player1.whiteRegCoin -= 3;
                int coin = coins.getWhite();
                if (player1.whiteRegCoin < 0)
                    coin += (player1.whiteRegCoin + 3);
                else
                    coin += 3;
                coins.setWhite(coin);
                coin = coins.getBlue();
                if (player1.blueRegCoin < 0)
                    coin += (player1.blueRegCoin + 4);
                else
                    coin += 4;
                coins.setBlue(coin);
                int gold = coins.getGold();
                if (player1.whiteRegCoin < 0) {
                    gold += (-player1.whiteRegCoin);
                    player1.goldCoin -= (-player1.whiteRegCoin);
                }
                if (player1.blueRegCoin < 0) {
                    gold += (-player1.blueRegCoin);
                    player1.goldCoin -= (-player1.blueRegCoin);
                }
                coins.setGold(gold);
                player1.setBlueRegCoin(player1.blueRegCoin);
                player1.setWhiteRegCoin(player1.whiteRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.greenSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                int card = cards.getFerris3();
                card--;
                cards.setFerris3(card);
                frame.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(Main.this, "You dont have enough coins to buy this card!");
            }
        } else if (cardInfo.equals("ferris4")) {
            if (player1.redRegCoin + player1.redSpecCoin >= 3 && player1.whiteRegCoin + player1.whiteSpecCoin >= 3) {
                int point = player1.getPoints();
                point += 2;
                player1.setPoints(point);
                player1.redRegCoin -= 3;
                player1.whiteRegCoin -= 3;
                int coin = coins.getRed();
                if (player1.redRegCoin < 0)
                    coin += (player1.redRegCoin + 3);
                else
                    coin += 3;
                coins.setRed(coin);
                coin = coins.getWhite();
                if (player1.whiteRegCoin < 0)
                    coin += (player1.whiteRegCoin + 3);
                else
                    coin += 3;
                coins.setWhite(coin);
                player1.setWhiteRegCoin(player1.whiteRegCoin);
                player1.setRedRegCoin(player1.redRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.whiteSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                int card = cards.getFerris4();
                card--;
                cards.setFerris4(card);
                frame.setVisible(false);
            } else if (player1.whiteRegCoin + player1.goldCoin >= 3 && player1.redRegCoin + player1.goldCoin >= 3) {
                int point = player1.getPoints();
                point += 2;
                player1.setPoints(point);
                player1.redRegCoin -= 3;
                player1.whiteRegCoin -= 3;
                int coin = coins.getWhite();
                if (player1.whiteRegCoin < 0)
                    coin += (player1.whiteRegCoin + 3);
                else
                    coin += 3;
                coins.setWhite(coin);
                coin = coins.getRed();
                if (player1.redRegCoin < 0)
                    coin += (player1.redRegCoin + 3);
                else
                    coin += 3;
                coins.setRed(coin);
                int gold = coins.getGold();
                if (player1.whiteRegCoin < 0) {
                    gold += (-player1.whiteRegCoin);
                    player1.goldCoin -= (-player1.whiteRegCoin);
                }
                if (player1.redRegCoin < 0) {
                    gold += (-player1.redRegCoin);
                    player1.goldCoin -= (-player1.redRegCoin);
                }
                coins.setGold(gold);
                player1.setRedRegCoin(player1.redRegCoin);
                player1.setWhiteRegCoin(player1.whiteRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.whiteSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                int card = cards.getFerris4();
                card--;
                cards.setFerris4(card);
                frame.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(Main.this, "You dont have enough coins to buy this card!");
            }
        } else if (cardInfo.equals("coaster1")) {
            if (player1.blueRegCoin + player1.blueSpecCoin >= 3 && player1.greenRegCoin + player1.greenSpecCoin >= 4) {
                int point = player1.getPoints();
                point += 3;
                player1.setPoints(point);
                player1.blueRegCoin -= 3;
                player1.greenRegCoin -= 4;
                int coin = coins.getBlue();
                if (player1.blueRegCoin < 0)
                    coin += (player1.blueRegCoin + 3);
                else
                    coin += 3;
                coins.setBlue(coin);
                coin = coins.getGreen();
                if (player1.greenRegCoin < 0)
                    coin += (player1.greenRegCoin + 4);
                else
                    coin += 4;
                coins.setGreen(coin);
                player1.setGreenRegCoin(player1.greenRegCoin);
                player1.setBlueRegCoin(player1.blueRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.whiteSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                int card = cards.getCoaster1();
                card--;
                cards.setCoaster1(card);
                frame.setVisible(false);
            } else if (player1.greenRegCoin + player1.goldCoin >= 4 && player1.blueRegCoin + player1.goldCoin >= 3) {
                int point = player1.getPoints();
                point += 3;
                player1.setPoints(point);
                player1.blueRegCoin -= 3;
                player1.greenRegCoin -= 4;
                int coin = coins.getGreen();
                if (player1.greenRegCoin < 0)
                    coin += (player1.whiteRegCoin + 4);
                else
                    coin += 4;
                coins.setGreen(coin);
                coin = coins.getBlue();
                if (player1.blueRegCoin < 0)
                    coin += (player1.blueRegCoin + 3);
                else
                    coin += 3;
                coins.setBlue(coin);
                int gold = coins.getGold();
                if (player1.greenRegCoin < 0) {
                    gold += (-player1.greenRegCoin);
                    player1.goldCoin -= (-player1.greenRegCoin);
                }
                if (player1.blueRegCoin < 0) {
                    gold += (-player1.blueRegCoin);
                    player1.goldCoin -= (-player1.blueRegCoin);
                }
                coins.setGold(gold);
                player1.setBlueRegCoin(player1.blueRegCoin);
                player1.setGreenRegCoin(player1.greenRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.whiteSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                int card = cards.getCoaster1();
                card--;
                cards.setCoaster1(card);
                frame.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(Main.this, "You dont have enough coins to buy this card!");
            }
        } else if (cardInfo.equals("coaster2")) {
            if (player1.blueRegCoin + player1.blueSpecCoin >= 3 && player1.whiteRegCoin + player1.whiteSpecCoin >= 5) {
                int point = player1.getPoints();
                point += 4;
                player1.setPoints(point);
                player1.blueRegCoin -= 3;
                player1.whiteRegCoin -= 5;
                int coin = coins.getBlue();
                if (player1.blueRegCoin < 0)
                    coin += (player1.blueRegCoin + 3);
                else
                    coin += 3;
                coins.setBlue(coin);
                coin = coins.getWhite();
                if (player1.whiteRegCoin < 0)
                    coin += (player1.whiteRegCoin + 5);
                else
                    coin += 5;
                coins.setWhite(coin);
                player1.setWhiteRegCoin(player1.whiteRegCoin);
                player1.setBlueRegCoin(player1.blueRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.blueSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                int card = cards.getCoaster2();
                card--;
                cards.setCoaster2(card);
                frame.setVisible(false);
            } else if (player1.whiteRegCoin + player1.goldCoin >= 5 && player1.blueRegCoin + player1.goldCoin >= 3) {
                int point = player1.getPoints();
                point += 4;
                player1.setPoints(point);
                player1.blueRegCoin -= 3;
                player1.whiteRegCoin -= 5;
                int coin = coins.getWhite();
                if (player1.whiteRegCoin < 0)
                    coin += (player1.whiteRegCoin + 5);
                else
                    coin += 5;
                coins.setWhite(coin);
                coin = coins.getBlue();
                if (player1.blueRegCoin < 0)
                    coin += (player1.blueRegCoin + 3);
                else
                    coin += 3;
                coins.setBlue(coin);
                int gold = coins.getGold();
                if (player1.whiteRegCoin < 0) {
                    gold += (-player1.whiteRegCoin);
                    player1.goldCoin -= (-player1.whiteRegCoin);
                }
                if (player1.blueRegCoin < 0) {
                    gold += (-player1.blueRegCoin);
                    player1.goldCoin -= (-player1.blueRegCoin);
                }
                coins.setGold(gold);
                player1.setBlueRegCoin(player1.blueRegCoin);
                player1.setWhiteRegCoin(player1.whiteRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.blueSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                int card = cards.getCoaster2();
                card--;
                cards.setCoaster2(card);
                frame.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(Main.this, "You dont have enough coins to buy this card!");
            }
        } else if (cardInfo.equals("coaster3")) {
            if (player1.redRegCoin + player1.redSpecCoin >= 4 && player1.blackRegCoin + player1.blackSpecCoin >= 3 && player1.whiteRegCoin + player1.whiteSpecCoin >= 2) {
                int point = player1.getPoints();
                point += 4;
                player1.setPoints(point);
                player1.redRegCoin -= 4;
                player1.blackRegCoin -= 3;
                player1.whiteRegCoin -= 2;
                int coin = coins.getRed();
                if (player1.redRegCoin < 0)
                    coin += (player1.redRegCoin + 4);
                else
                    coin += 4;
                coins.setRed(coin);
                coin = coins.getBlack();
                if (player1.blackRegCoin < 0)
                    coin += (player1.blueRegCoin + 3);
                else
                    coin += 3;
                coins.setBlack(coin);
                coin = coins.getWhite();
                if (player1.whiteRegCoin < 0)
                    coin += (player1.whiteRegCoin + 2);
                else
                    coin += 2;
                coins.setWhite(coin);
                player1.setRedRegCoin(player1.redRegCoin);
                player1.setBlackRegCoin(player1.blackRegCoin);
                player1.setWhiteRegCoin(player1.whiteRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.redSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                int card = cards.getCoaster3();
                card--;
                cards.setCoaster3(card);
                frame.setVisible(false);
            } else if (player1.redRegCoin + player1.goldCoin >= 4 && player1.whiteRegCoin + player1.goldCoin >= 2 && player1.blackRegCoin + player1.goldCoin >= 3) {
                int point = player1.getPoints();
                point += 4;
                player1.setPoints(point);
                player1.redRegCoin -= 4;
                player1.blackRegCoin -= 3;
                player1.whiteRegCoin -= 2;
                int coin = coins.getRed();
                if (player1.redRegCoin < 0)
                    coin += (player1.redRegCoin + 4);
                else
                    coin += 4;
                coins.setRed(coin);
                coin = coins.getBlack();
                if (player1.blackRegCoin < 0)
                    coin += (player1.blackRegCoin + 3);
                else
                    coin += 3;
                coins.setBlack(coin);
                coin = coins.getWhite();
                if (player1.whiteRegCoin < 0)
                    coin += (player1.whiteRegCoin + 2);
                else
                    coin += 2;
                coins.setWhite(coin);
                int gold = coins.getGold();
                if (player1.redRegCoin < 0) {
                    gold += (-player1.redRegCoin);
                    player1.goldCoin -= (-player1.redRegCoin);
                }
                if (player1.blackRegCoin < 0) {
                    gold += (-player1.blackRegCoin);
                    player1.goldCoin -= (-player1.blackRegCoin);
                }
                if (player1.whiteRegCoin < 0) {
                    gold += (-player1.whiteRegCoin);
                    player1.goldCoin -= (-player1.whiteRegCoin);
                }
                coins.setGold(gold);
                player1.setBlackRegCoin(player1.blackRegCoin);
                player1.setRedRegCoin(player1.redRegCoin);
                player1.setWhiteRegCoin(player1.whiteRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.redSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                int card = cards.getCoaster3();
                card--;
                cards.setCoaster3(card);
                frame.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(Main.this, "You dont have enough coins to buy this card!");
            }
        } else {
            if (player1.redRegCoin + player1.redSpecCoin >= 3 && player1.blackRegCoin + player1.blackSpecCoin >= 3 && player1.greenRegCoin + player1.greenSpecCoin >= 4) {
                int point = player1.getPoints();
                point += 5;
                player1.setPoints(point);
                player1.redRegCoin -= 3;
                player1.blackRegCoin -= 3;
                player1.greenRegCoin -= 4;
                int coin = coins.getRed();
                if (player1.redRegCoin < 0)
                    coin += (player1.redRegCoin + 3);
                else
                    coin += 3;
                coins.setRed(coin);
                coin = coins.getBlack();
                if (player1.blackRegCoin < 0)
                    coin += (player1.blueRegCoin + 3);
                else
                    coin += 3;
                coins.setBlack(coin);
                coin = coins.getGreen();
                if (player1.greenRegCoin < 0)
                    coin += (player1.greenRegCoin + 4);
                else
                    coin += 4;
                coins.setGreen(coin);
                player1.setRedRegCoin(player1.redRegCoin);
                player1.setBlackRegCoin(player1.blackRegCoin);
                player1.setGreenRegCoin(player1.greenRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.blackSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                int card = cards.getCoaster4();
                card--;
                cards.setCoaster4(card);
                frame.setVisible(false);
            } else if (player1.redRegCoin + player1.goldCoin >= 3 && player1.greenRegCoin + player1.goldCoin >= 4 && player1.blackRegCoin + player1.goldCoin >= 3) {
                int point = player1.getPoints();
                point += 4;
                player1.setPoints(point);
                player1.redRegCoin -= 3;
                player1.blackRegCoin -= 3;
                player1.greenRegCoin -= 4;
                int coin = coins.getRed();
                if (player1.redRegCoin < 0)
                    coin += (player1.redRegCoin + 3);
                else
                    coin += 3;
                coins.setRed(coin);
                coin = coins.getBlack();
                if (player1.blackRegCoin < 0)
                    coin += (player1.blackRegCoin + 3);
                else
                    coin += 3;
                coins.setBlack(coin);
                coin = coins.getGreen();
                if (player1.greenRegCoin < 0)
                    coin += (player1.greenRegCoin + 4);
                else
                    coin += 4;
                coins.setGreen(coin);
                int gold = coins.getGold();
                if (player1.redRegCoin < 0) {
                    gold += (-player1.redRegCoin);
                    player1.goldCoin -= (-player1.redRegCoin);
                }
                if (player1.blackRegCoin < 0) {
                    gold += (-player1.blackRegCoin);
                    player1.goldCoin -= (-player1.blackRegCoin);
                }
                if (player1.greenRegCoin < 0) {
                    gold += (-player1.greenRegCoin);
                    player1.goldCoin -= (-player1.greenRegCoin);
                }
                coins.setGold(gold);
                player1.setBlackRegCoin(player1.blackRegCoin);
                player1.setRedRegCoin(player1.redRegCoin);
                player1.setGreenRegCoin(player1.greenRegCoin);
                int num = player1.getNumOfCards();
                num++;
                player1.setNumOfCards(num);
                player1.blackSpecCoin++;
                player.turnPlayer++;
                turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
                int card = cards.getCoaster4();
                card--;
                cards.setCoaster4(card);
                frame.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(Main.this, "You dont have enough coins to buy this card!");
            }
        }
    }


    //reserve cards functions
    private void cardIdRes(player player1, String cardInfo) {
        if (player1.getNumOfReserves() >= 3) {
            JOptionPane.showMessageDialog(Main.this, "You have used up all of your reserves!");
        } else if (cardInfo.equals("tent1")) {
            tent1(player1);
        } else if (cardInfo.equals("tent2")) {
            tent2(player1);
        } else if (cardInfo.equals("tent3")) {
            tent3(player1);
        } else if (cardInfo.equals("tent4")) {
            tent4(player1);
        } else if (cardInfo.equals("ferris1")) {
            ferris1(player1);
        } else if (cardInfo.equals("ferris2")) {
            ferris2(player1);
        } else if (cardInfo.equals("ferris3")) {
            ferris3(player1);
        } else if (cardInfo.equals("ferris4")) {
            ferris4(player1);
        } else if (cardInfo.equals("coaster1")) {
            coaster1(player1);
        } else if (cardInfo.equals("coaster2")) {
            coaster2(player1);
        } else if (cardInfo.equals("coaster3")) {
            coaster3(player1);
        } else {
            coaster4(player1);
        }
    }

    public void tent1(player player1) {
        if (cards.getTent1() > 0) {
            int card = cards.getTent1();
            card--;
            cards.setTent1(card);
            player1.reserveSpecial[player1.getNumOfReserves()] = "RED";
            player1.reserveRank[player1.getNumOfReserves()] = 0;
            player1.reservePrice[player1.getNumOfReserves()] = "4 Red";
            goldCoinCheck(player1);
        } else {
            JOptionPane.showMessageDialog(Main.this, "Sorry, this card is out of stock!");
        }
    }

    public void tent2(player player1) {
        if (cards.getTent2() > 0) {
            int card = cards.getTent2();
            card--;
            cards.setTent2(card);
            player1.reserveSpecial[player1.getNumOfReserves()] = "BLUE";
            player1.reserveRank[player1.getNumOfReserves()] = 1;
            player1.reservePrice[player1.getNumOfReserves()] = "2 White + 3 Blue";
            goldCoinCheck(player1);
        } else {
            JOptionPane.showMessageDialog(Main.this, "Sorry, this card is out of stock!");
        }
    }

    public void tent3(player player1) {
        if (cards.getTent3() > 0) {
            int card = cards.getTent3();
            card--;
            cards.setTent3(card);
            player1.reserveSpecial[player1.getNumOfReserves()] = "GREEN";
            player1.reserveRank[player1.getNumOfReserves()] = 1;
            player1.reservePrice[player1.getNumOfReserves()] = "1 Green + 5 Black";
            goldCoinCheck(player1);
        } else {
            JOptionPane.showMessageDialog(Main.this, "Sorry, this card is out of stock!");
        }
    }

    public void tent4(player player1) {
        if (cards.getTent4() > 0) {
            int card = cards.getTent4();
            card--;
            cards.setTent4(card);
            player1.reserveSpecial[player1.getNumOfReserves()] = "BLACK";
            player1.reserveRank[player1.getNumOfReserves()] = 0;
            player1.reservePrice[player1.getNumOfReserves()] = "2 Red + 2 Green";
            goldCoinCheck(player1);
        } else {
            JOptionPane.showMessageDialog(Main.this, "Sorry, this card is out of stock!");
        }
    }

    public void ferris1(player player1) {
        if (cards.getFerris1() > 0) {
            int card = cards.getFerris1();
            card--;
            cards.setFerris1(card);
            player1.reserveSpecial[player1.getNumOfReserves()] = "RED";
            player1.reserveRank[player1.getNumOfReserves()] = 2;
            player1.reservePrice[player1.getNumOfReserves()] = "2 Red + 2 Blue + 2 White";
            goldCoinCheck(player1);
        } else {
            JOptionPane.showMessageDialog(Main.this, "Sorry, this card is out of stock!");
        }
    }

    public void ferris2(player player1) {
        if (cards.getFerris2() > 0) {
            int card = cards.getFerris2();
            card--;
            cards.setFerris2(card);
            player1.reserveSpecial[player1.getNumOfReserves()] = "BLACK";
            player1.reserveRank[player1.getNumOfReserves()] = 3;
            player1.reservePrice[player1.getNumOfReserves()] = "6 Black + 2 Green";
            goldCoinCheck(player1);
        } else {
            JOptionPane.showMessageDialog(Main.this, "Sorry, this card is out of stock!");
        }
    }

    public void ferris3(player player1) {
        if (cards.getFerris3() > 0) {
            int card = cards.getFerris3();
            card--;
            cards.setFerris3(card);
            player1.reserveSpecial[player1.getNumOfReserves()] = "GREEN";
            player1.reserveRank[player1.getNumOfReserves()] = 4;
            player1.reservePrice[player1.getNumOfReserves()] = "4 Blue + 3 White";
            goldCoinCheck(player1);
        } else {
            JOptionPane.showMessageDialog(Main.this, "Sorry, this card is out of stock!");
        }
    }

    public void ferris4(player player1) {
        if (cards.getFerris4() > 0) {
            int card = cards.getFerris4();
            card--;
            cards.setFerris4(card);
            player1.reserveSpecial[player1.getNumOfReserves()] = "WHITE";
            player1.reserveRank[player1.getNumOfReserves()] = 2;
            player1.reservePrice[player1.getNumOfReserves()] = "3 Red + 3 White";
            goldCoinCheck(player1);
        } else {
            JOptionPane.showMessageDialog(Main.this, "Sorry, this card is out of stock!");
        }
    }

    public void coaster1(player player1) {
        if (cards.getCoaster1() > 0) {
            int card = cards.getCoaster1();
            card--;
            cards.setCoaster1(card);
            player1.reserveSpecial[player1.getNumOfReserves()] = "WHITE";
            player1.reserveRank[player1.getNumOfReserves()] = 3;
            player1.reservePrice[player1.getNumOfReserves()] = "4 Green + 3 Blue";
            goldCoinCheck(player1);
        } else {
            JOptionPane.showMessageDialog(Main.this, "Sorry, this card is out of stock!");
        }
    }

    public void coaster2(player player1) {
        if (cards.getCoaster2() > 0) {
            int card = cards.getCoaster2();
            card--;
            cards.setCoaster2(card);
            player1.reserveSpecial[player1.getNumOfReserves()] = "BLUE";
            player1.reserveRank[player1.getNumOfReserves()] = 4;
            player1.reservePrice[player1.getNumOfReserves()] = "5 White + 3 Blue";
            goldCoinCheck(player1);
        } else {
            JOptionPane.showMessageDialog(Main.this, "Sorry, this card is out of stock!");
        }
    }

    public void coaster3(player player1) {
        if (cards.getCoaster3() > 0) {
            int card = cards.getCoaster3();
            card--;
            cards.setCoaster3(card);
            player1.reserveSpecial[player1.getNumOfReserves()] = "RED";
            player1.reserveRank[player1.getNumOfReserves()] = 4;
            player1.reservePrice[player1.getNumOfReserves()] = "4 Red + 3 Black + 2 White";
            goldCoinCheck(player1);
        } else {
            JOptionPane.showMessageDialog(Main.this, "Sorry, this card is out of stock!");
        }
    }

    public void coaster4(player player1) {
        if (cards.getCoaster4() > 0) {
            int card = cards.getCoaster4();
            card--;
            cards.setCoaster4(card);
            player1.reserveSpecial[player1.getNumOfReserves()] = "BLACK";
            player1.reserveRank[player1.getNumOfReserves()] = 5;
            player1.reservePrice[player1.getNumOfReserves()] = "3 Red + 4 Green + 3 Black";
            goldCoinCheck(player1);
        } else {
            JOptionPane.showMessageDialog(Main.this, "Sorry, this card is out of stock!");
        }
    }

    private void goldCoinCheck(player player1) {
        int num = player1.getNumOfReserves();
        num++;
        player1.setNumOfReserves(num);
        player.turnPlayer++;
        turn_player.setText("PLAYER " + player.showPlayerTurn() + "'S TURN");
        if (coins.getGold() > 0) {
            player1.goldCoin++;
            int coin = coins.getGold();
            coin--;
            coins.setGold(coin);
        }
    }

    private void winningCondition() {
        if (player1.getPoints() >= 15) {
            JOptionPane.showMessageDialog(Main.this, "**Player one has won the game!**");
            System.exit(0);
        }
        if (player2.getPoints() >= 15) {
            JOptionPane.showMessageDialog(Main.this, "**Player two has won the game!**");
            System.exit(0);
        }
    }

    private void coinMax10() {
        if (player1.blueRegCoin + player1.blackRegCoin + player1.redRegCoin + player1.whiteRegCoin + player1.greenRegCoin > 10) {
            JFrame frame10 = new JFrame();
            JPanel coin10Opt = new JPanel(new GridLayout(15, 1, 10, 10));
            frame10.setSize(800, 800);
            frame10.setVisible(true);
            JLabel question = new JLabel("Player one, please select the coins which you want to return to the slot machine in order to have less than 11 coins");
            player1.coinArray();
            JButton button0 = new JButton(player1.coinMax10[0]);
            JButton button1 = new JButton(player1.coinMax10[1]);
            JButton button2 = new JButton(player1.coinMax10[2]);
            JButton button3 = new JButton(player1.coinMax10[3]);
            JButton button4 = new JButton(player1.coinMax10[4]);
            JButton button5 = new JButton(player1.coinMax10[5]);
            JButton button6 = new JButton(player1.coinMax10[6]);
            JButton button7 = new JButton(player1.coinMax10[7]);
            JButton button8 = new JButton(player1.coinMax10[8]);
            JButton button9 = new JButton(player1.coinMax10[9]);
            JButton button10 = new JButton(player1.coinMax10[10]);
            JButton button11 = new JButton(player1.coinMax10[11]);
            JButton button12 = new JButton(player1.coinMax10[12]);
            JButton end = new JButton("Done!");
            button0.addActionListener(e -> {
                reduceCoin(0);
                player1.coinArray();
                button0.setText(player1.coinMax10[0]);
                button1.setText(player1.coinMax10[1]);
                button2.setText(player1.coinMax10[2]);
                button3.setText(player1.coinMax10[3]);
                button4.setText(player1.coinMax10[4]);
                button5.setText(player1.coinMax10[5]);
                button6.setText(player1.coinMax10[6]);
                button7.setText(player1.coinMax10[7]);
                button8.setText(player1.coinMax10[8]);
                button9.setText(player1.coinMax10[9]);
                button10.setText(player1.coinMax10[10]);
                button11.setText(player1.coinMax10[11]);
                button12.setText(player1.coinMax10[12]);

            });
            button1.addActionListener(e -> {
                reduceCoin(1);
                player1.coinArray();
                button0.setText(player1.coinMax10[0]);
                button1.setText(player1.coinMax10[1]);
                button2.setText(player1.coinMax10[2]);
                button3.setText(player1.coinMax10[3]);
                button4.setText(player1.coinMax10[4]);
                button5.setText(player1.coinMax10[5]);
                button6.setText(player1.coinMax10[6]);
                button7.setText(player1.coinMax10[7]);
                button8.setText(player1.coinMax10[8]);
                button9.setText(player1.coinMax10[9]);
                button10.setText(player1.coinMax10[10]);
                button11.setText(player1.coinMax10[11]);
                button12.setText(player1.coinMax10[12]);
            });
            button2.addActionListener(e -> {
                reduceCoin(2);
                player1.coinArray();
                button0.setText(player1.coinMax10[0]);
                button1.setText(player1.coinMax10[1]);
                button2.setText(player1.coinMax10[2]);
                button3.setText(player1.coinMax10[3]);
                button4.setText(player1.coinMax10[4]);
                button5.setText(player1.coinMax10[5]);
                button6.setText(player1.coinMax10[6]);
                button7.setText(player1.coinMax10[7]);
                button8.setText(player1.coinMax10[8]);
                button9.setText(player1.coinMax10[9]);
                button10.setText(player1.coinMax10[10]);
                button11.setText(player1.coinMax10[11]);
                button12.setText(player1.coinMax10[12]);

            });
            button3.addActionListener(e -> {
                reduceCoin(3);
                player1.coinArray();
                button0.setText(player1.coinMax10[0]);
                button1.setText(player1.coinMax10[1]);
                button2.setText(player1.coinMax10[2]);
                button3.setText(player1.coinMax10[3]);
                button4.setText(player1.coinMax10[4]);
                button5.setText(player1.coinMax10[5]);
                button6.setText(player1.coinMax10[6]);
                button7.setText(player1.coinMax10[7]);
                button8.setText(player1.coinMax10[8]);
                button9.setText(player1.coinMax10[9]);
                button10.setText(player1.coinMax10[10]);
                button11.setText(player1.coinMax10[11]);
                button12.setText(player1.coinMax10[12]);

            });
            button4.addActionListener(e -> {
                reduceCoin(4);
                player1.coinArray();
                button0.setText(player1.coinMax10[0]);
                button1.setText(player1.coinMax10[1]);
                button2.setText(player1.coinMax10[2]);
                button3.setText(player1.coinMax10[3]);
                button4.setText(player1.coinMax10[4]);
                button5.setText(player1.coinMax10[5]);
                button6.setText(player1.coinMax10[6]);
                button7.setText(player1.coinMax10[7]);
                button8.setText(player1.coinMax10[8]);
                button9.setText(player1.coinMax10[9]);
                button10.setText(player1.coinMax10[10]);
                button11.setText(player1.coinMax10[11]);
                button12.setText(player1.coinMax10[12]);

            });
            button5.addActionListener(e -> {
                reduceCoin(5);
                player1.coinArray();
                button0.setText(player1.coinMax10[0]);
                button1.setText(player1.coinMax10[1]);
                button2.setText(player1.coinMax10[2]);
                button3.setText(player1.coinMax10[3]);
                button4.setText(player1.coinMax10[4]);
                button5.setText(player1.coinMax10[5]);
                button6.setText(player1.coinMax10[6]);
                button7.setText(player1.coinMax10[7]);
                button8.setText(player1.coinMax10[8]);
                button9.setText(player1.coinMax10[9]);
                button10.setText(player1.coinMax10[10]);
                button11.setText(player1.coinMax10[11]);
                button12.setText(player1.coinMax10[12]);

            });
            button6.addActionListener(e -> {
                reduceCoin(6);
                player1.coinArray();
                button0.setText(player1.coinMax10[0]);
                button1.setText(player1.coinMax10[1]);
                button2.setText(player1.coinMax10[2]);
                button3.setText(player1.coinMax10[3]);
                button4.setText(player1.coinMax10[4]);
                button5.setText(player1.coinMax10[5]);
                button6.setText(player1.coinMax10[6]);
                button7.setText(player1.coinMax10[7]);
                button8.setText(player1.coinMax10[8]);
                button9.setText(player1.coinMax10[9]);
                button10.setText(player1.coinMax10[10]);
                button11.setText(player1.coinMax10[11]);
                button12.setText(player1.coinMax10[12]);

            });
            button7.addActionListener(e -> {
                reduceCoin(7);
                player1.coinArray();
                button0.setText(player1.coinMax10[0]);
                button1.setText(player1.coinMax10[1]);
                button2.setText(player1.coinMax10[2]);
                button3.setText(player1.coinMax10[3]);
                button4.setText(player1.coinMax10[4]);
                button5.setText(player1.coinMax10[5]);
                button6.setText(player1.coinMax10[6]);
                button7.setText(player1.coinMax10[7]);
                button8.setText(player1.coinMax10[8]);
                button9.setText(player1.coinMax10[9]);
                button10.setText(player1.coinMax10[10]);
                button11.setText(player1.coinMax10[11]);
                button12.setText(player1.coinMax10[12]);

            });
            button8.addActionListener(e -> {
                reduceCoin(8);
                player1.coinArray();
                button0.setText(player1.coinMax10[0]);
                button1.setText(player1.coinMax10[1]);
                button2.setText(player1.coinMax10[2]);
                button3.setText(player1.coinMax10[3]);
                button4.setText(player1.coinMax10[4]);
                button5.setText(player1.coinMax10[5]);
                button6.setText(player1.coinMax10[6]);
                button7.setText(player1.coinMax10[7]);
                button8.setText(player1.coinMax10[8]);
                button9.setText(player1.coinMax10[9]);
                button10.setText(player1.coinMax10[10]);
                button11.setText(player1.coinMax10[11]);
                button12.setText(player1.coinMax10[12]);

            });
            button9.addActionListener(e -> {
                reduceCoin(9);
                player1.coinArray();
                button0.setText(player1.coinMax10[0]);
                button1.setText(player1.coinMax10[1]);
                button2.setText(player1.coinMax10[2]);
                button3.setText(player1.coinMax10[3]);
                button4.setText(player1.coinMax10[4]);
                button5.setText(player1.coinMax10[5]);
                button6.setText(player1.coinMax10[6]);
                button7.setText(player1.coinMax10[7]);
                button8.setText(player1.coinMax10[8]);
                button9.setText(player1.coinMax10[9]);
                button10.setText(player1.coinMax10[10]);
                button11.setText(player1.coinMax10[11]);
                button12.setText(player1.coinMax10[12]);

            });
            button10.addActionListener(e -> {
                reduceCoin(10);
                player1.coinArray();
                button0.setText(player1.coinMax10[0]);
                button1.setText(player1.coinMax10[1]);
                button2.setText(player1.coinMax10[2]);
                button3.setText(player1.coinMax10[3]);
                button4.setText(player1.coinMax10[4]);
                button5.setText(player1.coinMax10[5]);
                button6.setText(player1.coinMax10[6]);
                button7.setText(player1.coinMax10[7]);
                button8.setText(player1.coinMax10[8]);
                button9.setText(player1.coinMax10[9]);
                button10.setText(player1.coinMax10[10]);
                button11.setText(player1.coinMax10[11]);
                button12.setText(player1.coinMax10[12]);

            });
            button11.addActionListener(e -> {
                reduceCoin(11);
                player1.coinArray();
                button0.setText(player1.coinMax10[0]);
                button1.setText(player1.coinMax10[1]);
                button2.setText(player1.coinMax10[2]);
                button3.setText(player1.coinMax10[3]);
                button4.setText(player1.coinMax10[4]);
                button5.setText(player1.coinMax10[5]);
                button6.setText(player1.coinMax10[6]);
                button7.setText(player1.coinMax10[7]);
                button8.setText(player1.coinMax10[8]);
                button9.setText(player1.coinMax10[9]);
                button10.setText(player1.coinMax10[10]);
                button11.setText(player1.coinMax10[11]);
                button12.setText(player1.coinMax10[12]);

            });
            button12.addActionListener(e -> {
                reduceCoin(12);
                player1.coinArray();
                button0.setText(player1.coinMax10[0]);
                button1.setText(player1.coinMax10[1]);
                button2.setText(player1.coinMax10[2]);
                button3.setText(player1.coinMax10[3]);
                button4.setText(player1.coinMax10[4]);
                button5.setText(player1.coinMax10[5]);
                button6.setText(player1.coinMax10[6]);
                button7.setText(player1.coinMax10[7]);
                button8.setText(player1.coinMax10[8]);
                button9.setText(player1.coinMax10[9]);
                button10.setText(player1.coinMax10[10]);
                button11.setText(player1.coinMax10[11]);
                button12.setText(player1.coinMax10[12]);

            });
            end.addActionListener(e -> frame10.setVisible(false));
            coin10Opt.add(question);
            coin10Opt.add(button0);
            coin10Opt.add(button1);
            coin10Opt.add(button2);
            coin10Opt.add(button3);
            coin10Opt.add(button4);
            coin10Opt.add(button5);
            coin10Opt.add(button6);
            coin10Opt.add(button7);
            coin10Opt.add(button8);
            coin10Opt.add(button9);
            coin10Opt.add(button10);
            coin10Opt.add(button11);
            coin10Opt.add(button12);
            coin10Opt.add(end);
            frame10.add(coin10Opt);
        } else if (player2.blueRegCoin + player2.blackRegCoin + player2.redRegCoin + player2.whiteRegCoin + player2.greenRegCoin > 10) {
            JFrame frame10 = new JFrame();
            JPanel coin10Opt = new JPanel(new GridLayout(15, 1, 10, 10));
            frame10.setSize(800, 800);
            frame10.setVisible(true);
            player2.coinArray();
            JLabel question = new JLabel("Player two, please select the coins which you want to return to the slot machine in order to have less than 11 coins");
            JButton button0 = new JButton(player2.coinMax10[0]);
            JButton button1 = new JButton(player2.coinMax10[1]);
            JButton button2 = new JButton(player2.coinMax10[2]);
            JButton button3 = new JButton(player2.coinMax10[3]);
            JButton button4 = new JButton(player2.coinMax10[4]);
            JButton button5 = new JButton(player2.coinMax10[5]);
            JButton button6 = new JButton(player2.coinMax10[6]);
            JButton button7 = new JButton(player2.coinMax10[7]);
            JButton button8 = new JButton(player2.coinMax10[8]);
            JButton button9 = new JButton(player2.coinMax10[9]);
            JButton button10 = new JButton(player2.coinMax10[10]);
            JButton button11 = new JButton(player2.coinMax10[11]);
            JButton button12 = new JButton(player2.coinMax10[12]);
            JButton end = new JButton("Done!");
            button0.addActionListener(e -> {
                reduceCoin2(0);
                player2.coinArray();
                button0.setText(player2.coinMax10[0]);
                button1.setText(player2.coinMax10[1]);
                button2.setText(player2.coinMax10[2]);
                button3.setText(player2.coinMax10[3]);
                button4.setText(player2.coinMax10[4]);
                button5.setText(player2.coinMax10[5]);
                button6.setText(player2.coinMax10[6]);
                button7.setText(player2.coinMax10[7]);
                button8.setText(player2.coinMax10[8]);
                button9.setText(player2.coinMax10[9]);
                button10.setText(player2.coinMax10[10]);
                button11.setText(player2.coinMax10[11]);
                button12.setText(player2.coinMax10[12]);
            });
            button1.addActionListener(e -> {
                reduceCoin2(1);
                player2.coinArray();
                button0.setText(player2.coinMax10[0]);
                button1.setText(player2.coinMax10[1]);
                button2.setText(player2.coinMax10[2]);
                button3.setText(player2.coinMax10[3]);
                button4.setText(player2.coinMax10[4]);
                button5.setText(player2.coinMax10[5]);
                button6.setText(player2.coinMax10[6]);
                button7.setText(player2.coinMax10[7]);
                button8.setText(player2.coinMax10[8]);
                button9.setText(player2.coinMax10[9]);
                button10.setText(player2.coinMax10[10]);
                button11.setText(player2.coinMax10[11]);
                button12.setText(player2.coinMax10[12]);
            });
            button2.addActionListener(e -> {
                reduceCoin2(2);
                player2.coinArray();
                button0.setText(player2.coinMax10[0]);
                button1.setText(player2.coinMax10[1]);
                button2.setText(player2.coinMax10[2]);
                button3.setText(player2.coinMax10[3]);
                button4.setText(player2.coinMax10[4]);
                button5.setText(player2.coinMax10[5]);
                button6.setText(player2.coinMax10[6]);
                button7.setText(player2.coinMax10[7]);
                button8.setText(player2.coinMax10[8]);
                button9.setText(player2.coinMax10[9]);
                button10.setText(player2.coinMax10[10]);
                button11.setText(player2.coinMax10[11]);
                button12.setText(player2.coinMax10[12]);
            });
            button3.addActionListener(e -> {
                reduceCoin2(3);
                player2.coinArray();
                button0.setText(player2.coinMax10[0]);
                button1.setText(player2.coinMax10[1]);
                button2.setText(player2.coinMax10[2]);
                button3.setText(player2.coinMax10[3]);
                button4.setText(player2.coinMax10[4]);
                button5.setText(player2.coinMax10[5]);
                button6.setText(player2.coinMax10[6]);
                button7.setText(player2.coinMax10[7]);
                button8.setText(player2.coinMax10[8]);
                button9.setText(player2.coinMax10[9]);
                button10.setText(player2.coinMax10[10]);
                button11.setText(player2.coinMax10[11]);
                button12.setText(player2.coinMax10[12]);
            });
            button4.addActionListener(e -> {
                reduceCoin2(4);
                player2.coinArray();
                button0.setText(player2.coinMax10[0]);
                button1.setText(player2.coinMax10[1]);
                button2.setText(player2.coinMax10[2]);
                button3.setText(player2.coinMax10[3]);
                button4.setText(player2.coinMax10[4]);
                button5.setText(player2.coinMax10[5]);
                button6.setText(player2.coinMax10[6]);
                button7.setText(player2.coinMax10[7]);
                button8.setText(player2.coinMax10[8]);
                button9.setText(player2.coinMax10[9]);
                button10.setText(player2.coinMax10[10]);
                button11.setText(player2.coinMax10[11]);
                button12.setText(player2.coinMax10[12]);
            });
            button5.addActionListener(e -> {
                reduceCoin2(5);
                player2.coinArray();
                button0.setText(player2.coinMax10[0]);
                button1.setText(player2.coinMax10[1]);
                button2.setText(player2.coinMax10[2]);
                button3.setText(player2.coinMax10[3]);
                button4.setText(player2.coinMax10[4]);
                button5.setText(player2.coinMax10[5]);
                button6.setText(player2.coinMax10[6]);
                button7.setText(player2.coinMax10[7]);
                button8.setText(player2.coinMax10[8]);
                button9.setText(player2.coinMax10[9]);
                button10.setText(player2.coinMax10[10]);
                button11.setText(player2.coinMax10[11]);
                button12.setText(player2.coinMax10[12]);
            });
            button6.addActionListener(e -> {
                reduceCoin2(6);
                player2.coinArray();
                button0.setText(player2.coinMax10[0]);
                button1.setText(player2.coinMax10[1]);
                button2.setText(player2.coinMax10[2]);
                button3.setText(player2.coinMax10[3]);
                button4.setText(player2.coinMax10[4]);
                button5.setText(player2.coinMax10[5]);
                button6.setText(player2.coinMax10[6]);
                button7.setText(player2.coinMax10[7]);
                button8.setText(player2.coinMax10[8]);
                button9.setText(player2.coinMax10[9]);
                button10.setText(player2.coinMax10[10]);
                button11.setText(player2.coinMax10[11]);
                button12.setText(player2.coinMax10[12]);
            });
            button7.addActionListener(e -> {
                reduceCoin2(7);
                player2.coinArray();
                button0.setText(player2.coinMax10[0]);
                button1.setText(player2.coinMax10[1]);
                button2.setText(player2.coinMax10[2]);
                button3.setText(player2.coinMax10[3]);
                button4.setText(player2.coinMax10[4]);
                button5.setText(player2.coinMax10[5]);
                button6.setText(player2.coinMax10[6]);
                button7.setText(player2.coinMax10[7]);
                button8.setText(player2.coinMax10[8]);
                button9.setText(player2.coinMax10[9]);
                button10.setText(player2.coinMax10[10]);
                button11.setText(player2.coinMax10[11]);
                button12.setText(player2.coinMax10[12]);
            });
            button8.addActionListener(e -> {
                reduceCoin2(8);
                player2.coinArray();
                button0.setText(player2.coinMax10[0]);
                button1.setText(player2.coinMax10[1]);
                button2.setText(player2.coinMax10[2]);
                button3.setText(player2.coinMax10[3]);
                button4.setText(player2.coinMax10[4]);
                button5.setText(player2.coinMax10[5]);
                button6.setText(player2.coinMax10[6]);
                button7.setText(player2.coinMax10[7]);
                button8.setText(player2.coinMax10[8]);
                button9.setText(player2.coinMax10[9]);
                button10.setText(player2.coinMax10[10]);
                button11.setText(player2.coinMax10[11]);
                button12.setText(player2.coinMax10[12]);
            });
            button9.addActionListener(e -> {
                reduceCoin2(9);
                player2.coinArray();
                button0.setText(player2.coinMax10[0]);
                button1.setText(player2.coinMax10[1]);
                button2.setText(player2.coinMax10[2]);
                button3.setText(player2.coinMax10[3]);
                button4.setText(player2.coinMax10[4]);
                button5.setText(player2.coinMax10[5]);
                button6.setText(player2.coinMax10[6]);
                button7.setText(player2.coinMax10[7]);
                button8.setText(player2.coinMax10[8]);
                button9.setText(player2.coinMax10[9]);
                button10.setText(player2.coinMax10[10]);
                button11.setText(player2.coinMax10[11]);
                button12.setText(player2.coinMax10[12]);
            });
            button10.addActionListener(e -> {
                reduceCoin2(10);
                player2.coinArray();
                button0.setText(player2.coinMax10[0]);
                button1.setText(player2.coinMax10[1]);
                button2.setText(player2.coinMax10[2]);
                button3.setText(player2.coinMax10[3]);
                button4.setText(player2.coinMax10[4]);
                button5.setText(player2.coinMax10[5]);
                button6.setText(player2.coinMax10[6]);
                button7.setText(player2.coinMax10[7]);
                button8.setText(player2.coinMax10[8]);
                button9.setText(player2.coinMax10[9]);
                button10.setText(player2.coinMax10[10]);
                button11.setText(player2.coinMax10[11]);
                button12.setText(player2.coinMax10[12]);
            });
            button11.addActionListener(e -> {
                reduceCoin2(11);
                player2.coinArray();
                button0.setText(player2.coinMax10[0]);
                button1.setText(player2.coinMax10[1]);
                button2.setText(player2.coinMax10[2]);
                button3.setText(player2.coinMax10[3]);
                button4.setText(player2.coinMax10[4]);
                button5.setText(player2.coinMax10[5]);
                button6.setText(player2.coinMax10[6]);
                button7.setText(player2.coinMax10[7]);
                button8.setText(player2.coinMax10[8]);
                button9.setText(player2.coinMax10[9]);
                button10.setText(player2.coinMax10[10]);
                button11.setText(player2.coinMax10[11]);
                button12.setText(player2.coinMax10[12]);
            });
            button12.addActionListener(e -> {
                reduceCoin2(12);
                player2.coinArray();
                button0.setText(player2.coinMax10[0]);
                button1.setText(player2.coinMax10[1]);
                button2.setText(player2.coinMax10[2]);
                button3.setText(player2.coinMax10[3]);
                button4.setText(player2.coinMax10[4]);
                button5.setText(player2.coinMax10[5]);
                button6.setText(player2.coinMax10[6]);
                button7.setText(player2.coinMax10[7]);
                button8.setText(player2.coinMax10[8]);
                button9.setText(player2.coinMax10[9]);
                button10.setText(player2.coinMax10[10]);
                button11.setText(player2.coinMax10[11]);
                button12.setText(player2.coinMax10[12]);
            });
            end.addActionListener(e -> frame10.setVisible(false));
            coin10Opt.add(question);
            coin10Opt.add(button0);
            coin10Opt.add(button1);
            coin10Opt.add(button2);
            coin10Opt.add(button3);
            coin10Opt.add(button4);
            coin10Opt.add(button5);
            coin10Opt.add(button6);
            coin10Opt.add(button7);
            coin10Opt.add(button8);
            coin10Opt.add(button9);
            coin10Opt.add(button10);
            coin10Opt.add(button11);
            coin10Opt.add(button12);
            coin10Opt.add(end);
            frame10.add(coin10Opt);
        }
    }

    private void reduceCoin2(int i) {
        player2.coinArray();
        if (player2.coinMax10[i].equals("Black")) {
            player2.blackRegCoin--;
            int coin = coins.getBlack();
            coin++;
            coins.setBlack(coin);
            underMachLabel1.setText(" Remaining coins = " + coins.getBlack());
            coin2.setText("Coins: " + "Green=" + player2.greenRegCoin + ", White=" + player2.whiteRegCoin + ", Black=" + player2.blackRegCoin + ", red=" + player2.redRegCoin + ", blue=" + player2.blueRegCoin + " ");
        } else if (player2.coinMax10[i].equals("White")) {
            player2.whiteRegCoin--;
            int coin = coins.getWhite();
            coin++;
            coins.setWhite(coin);
            underMachLabel2.setText(" Remaining coins = " + coins.getWhite());
            coin2.setText("Coins: " + "Green=" + player2.greenRegCoin + ", White=" + player2.whiteRegCoin + ", Black=" + player2.blackRegCoin + ", red=" + player2.redRegCoin + ", blue=" + player2.blueRegCoin + " ");
        } else if (player2.coinMax10[i].equals("Green")) {
            player2.greenRegCoin--;
            int coin = coins.getGreen();
            coin++;
            coins.setGreen(coin);
            underMachLabel3.setText(" Remaining coins = " + coins.getGreen());
            coin2.setText("Coins: " + "Green=" + player2.greenRegCoin + ", White=" + player2.whiteRegCoin + ", Black=" + player2.blackRegCoin + ", red=" + player2.redRegCoin + ", blue=" + player2.blueRegCoin + " ");
        } else if (player2.coinMax10[i].equals("Blue")) {
            player2.blueRegCoin--;
            int coin = coins.getBlue();
            coin++;
            coins.setBlue(coin);
            underMachLabel4.setText(" Remaining coins = " + coins.getBlue());
            coin2.setText("Coins: " + "Green=" + player2.greenRegCoin + ", White=" + player2.whiteRegCoin + ", Black=" + player2.blackRegCoin + ", red=" + player2.redRegCoin + ", blue=" + player2.blueRegCoin + " ");
        } else if (player2.coinMax10[i].equals("Red")) {
            player2.redRegCoin--;
            int coin = coins.getRed();
            coin++;
            coins.setRed(coin);
            underMachLabel5.setText(" Remaining coins = " + coins.getRed());
            coin2.setText("Coins: " + "Green=" + player2.greenRegCoin + ", White=" + player2.whiteRegCoin + ", Black=" + player2.blackRegCoin + ", red=" + player2.redRegCoin + ", blue=" + player2.blueRegCoin + " ");
        } else {

        }
    }

    private void reduceCoin(int i) {
        player1.coinArray();
        if (player1.coinMax10[i].equals("Black")) {
            player1.blackRegCoin--;
            int coin = coins.getBlack();
            coin++;
            coins.setBlack(coin);
            underMachLabel1.setText(" Remaining coins = " + coins.getBlack());
            coin1.setText("Coins: " + "Green=" + player1.greenRegCoin + ", White=" + player1.whiteRegCoin + ", Black=" + player1.blackRegCoin + ", red=" + player1.redRegCoin + ", blue=" + player1.blueRegCoin + " ");
        } else if (player1.coinMax10[i].equals("White")) {
            player1.whiteRegCoin--;
            int coin = coins.getWhite();
            coin++;
            coins.setWhite(coin);
            underMachLabel2.setText(" Remaining coins = " + coins.getWhite());
            coin1.setText("Coins: " + "Green=" + player1.greenRegCoin + ", White=" + player1.whiteRegCoin + ", Black=" + player1.blackRegCoin + ", red=" + player1.redRegCoin + ", blue=" + player1.blueRegCoin + " ");
        } else if (player1.coinMax10[i].equals("Green")) {
            player1.greenRegCoin--;
            int coin = coins.getGreen();
            coin++;
            coins.setGreen(coin);
            underMachLabel3.setText(" Remaining coins = " + coins.getGreen());
            coin1.setText("Coins: " + "Green=" + player1.greenRegCoin + ", White=" + player1.whiteRegCoin + ", Black=" + player1.blackRegCoin + ", red=" + player1.redRegCoin + ", blue=" + player1.blueRegCoin + " ");
        } else if (player1.coinMax10[i].equals("Blue")) {
            player1.blueRegCoin--;
            int coin = coins.getBlue();
            coin++;
            coins.setBlue(coin);
            underMachLabel4.setText(" Remaining coins = " + coins.getBlue());
            coin1.setText("Coins: " + "Green=" + player1.greenRegCoin + ", White=" + player1.whiteRegCoin + ", Black=" + player1.blackRegCoin + ", red=" + player1.redRegCoin + ", blue=" + player1.blueRegCoin + " ");
        } else if (player1.coinMax10[i].equals("Red")) {
            player1.redRegCoin--;
            int coin = coins.getRed();
            coin++;
            coins.setRed(coin);
            underMachLabel5.setText(" Remaining coins = " + coins.getRed());
            coin1.setText("Coins: " + "Green=" + player1.greenRegCoin + ", White=" + player1.whiteRegCoin + ", Black=" + player1.blackRegCoin + ", red=" + player1.redRegCoin + ", blue=" + player1.blueRegCoin + " ");
        } else {

        }
    }

    public static void playSong(String fileName) {
        try {
            File file = new File(fileName);
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(file));
            clip.loop(Clip.LOOP_CONTINUOUSLY);

            while (true) {
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("Error playing song: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        playSong("/Users/melikadehestani/Desktop/uni/FOP advanced/midterm proj/Amusement park/song.wav");
        new Main();
    }
}
