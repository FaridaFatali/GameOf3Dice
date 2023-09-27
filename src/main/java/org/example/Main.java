package org.example;

import java.util.*;

/**
 * @author Farida Fatali
 * Practice: <a href="https://www.youtube.com/watch?v=3CpfGYgBSeg">...</a>
 * Game of 3 dice in Java
 * The game tosses 3 dice for five times. It records the number of times of occurring your target point.
 * The computer then plays the same game. If you get more target occurrences than the computer does, you win.
 */

public class Main {
    public static void main(String[] args) {
        int numDice = 3, trials = 5;
        int playerPoints, computerPoints;

        Random choice = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose your target number:");
        int playerTarget = scanner.nextInt();

        Game player = new Game(numDice, trials);
        playerPoints = player.play("Player", playerTarget);

        int computerTarget = choice.nextInt(6) + 1; // 1 to 6
        System.out.println("Computer's target is " + computerTarget);
        System.out.println();

        Game computer = new Game(numDice, trials);
        computerPoints = computer.play("Computer", computerTarget);

        if (playerPoints > computerPoints) {
            System.out.println("You win");
        } else if (playerPoints < computerPoints) {
            System.out.println("Computer wins");
        } else {
            System.out.println("Draw");
        }

        scanner.close();
    }
}