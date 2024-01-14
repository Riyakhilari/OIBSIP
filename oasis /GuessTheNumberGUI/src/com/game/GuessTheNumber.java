package com.game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessTheNumber extends JFrame {
    private static final int LOWER_BOUND = 1;
    private static final int UPPER_BOUND = 100;
    private static int MAX_ATTEMPTS = 5;
    private static final int MAX_ROUNDS = 3;

    private int totalScore = 0;
    private int currentRound = 1;

    private JLabel promptLabel;
    private JTextField guessTextField;
    private JButton submitButton;
    private JLabel resultLabel;
    private JLabel scoreLabel;
    private JLabel answerLabel;

    public GuessTheNumber() {
        setTitle("Guess the Number");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 1));
        setLocationRelativeTo(null); 


        promptLabel = new JLabel("Guess number btw " + LOWER_BOUND + " and " + UPPER_BOUND);
        promptLabel.setHorizontalAlignment(SwingConstants.CENTER);

        guessTextField = new JTextField();
        submitButton = new JButton("Submit Guess");
        resultLabel = new JLabel("");
        resultLabel.setHorizontalAlignment(SwingConstants.CENTER);

        scoreLabel = new JLabel("Score: " + totalScore);
        scoreLabel.setHorizontalAlignment(SwingConstants.CENTER);

        answerLabel = new JLabel("");
        answerLabel.setHorizontalAlignment(SwingConstants.CENTER);

        add(promptLabel);
        add(guessTextField);
        add(submitButton);
        add(resultLabel);
        add(scoreLabel);
        add(answerLabel);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleGuess();
            }
        });
    }

    private void handleGuess() {
        int numberToGuess = generateRandomNumber(LOWER_BOUND, UPPER_BOUND);
        int userGuess = Integer.parseInt(guessTextField.getText());
        int score = 0;

        answerLabel.setText("Answer is "+numberToGuess);

        if (userGuess == numberToGuess) {
            resultLabel.setText("Congratulations! You guessed the number!");
            score += MAX_ATTEMPTS;
        } else if (userGuess < numberToGuess) {
            resultLabel.setText("Too low! Try again.");
        } else {
            resultLabel.setText("Too high! Try again.");
        }

        totalScore += score;
        scoreLabel.setText("Score: " + totalScore);

        if (score > 0 || MAX_ATTEMPTS == 0) {
            if (currentRound < MAX_ROUNDS) {
                currentRound++;
                promptLabel.setText("Round " + currentRound + ": Guess the number 0-100 " +
                        LOWER_BOUND + " and " + UPPER_BOUND);
                resultLabel.setText("");
                guessTextField.setText("");
                MAX_ATTEMPTS = 5; // Reset attempts for the next round
            } else {
                showGameOverDialog();
            }
        } else {
            MAX_ATTEMPTS--;
        }
    }

    private void showGameOverDialog() {
        JOptionPane.showMessageDialog(this, "Game Over! Your final score is: " + totalScore, "Game Over",
                JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    private int generateRandomNumber(int lowerBound, int upperBound) {
        Random random = new Random();
        return random.nextInt(upperBound - lowerBound + 1) + lowerBound;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GuessTheNumber().setVisible(true);
            }
        });
    }
}
