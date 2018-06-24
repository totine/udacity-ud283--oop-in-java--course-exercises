package quessNum;


import java.util.Scanner;

public class Game {
    private int numberToGuess;
    private Scanner in = new Scanner(System.in);
    private boolean isCorrect = false;

    private void generateRandomNumberToGuess() {
        numberToGuess = (int) (Math.random() * 100) + 1;
    }

    private int askUserForNumber() {
        return in.nextInt();
    }

    private void intro() {
        System.out.println("I have randomly chosen a number between [1, 100]");
        System.out.println("Try to guess it.");
    }

    private void askLoop() {
        for (int i = 10; i > 0; i--) {
            System.out.printf("You have %d guess(es) left:\n", i);
            int answer = askUserForNumber();
            if (answer > numberToGuess) {
                System.out.printf("It's smaller than %d. \n", answer);
            } else if (answer < numberToGuess) {
                System.out.printf("It's greater than %d. \n", answer);
            } else {
                isCorrect = true;
                break;
            }
        }
    }

    private void showResult() {
        System.out.println(isCorrect ? "You won!" : "You lost. Correct number was" + numberToGuess);
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.generateRandomNumberToGuess();
        game.intro();
        game.askLoop();
        game.showResult();
    }


}
