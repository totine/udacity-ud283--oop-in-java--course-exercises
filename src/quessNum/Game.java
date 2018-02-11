package quessNum;


import java.util.Scanner;

public class Game {
    private int numberToGuess;
    private Scanner in = new Scanner(System.in);
    boolean isCorrect = false;

    private void generateRandomNumberToGuess() {
        numberToGuess = (int) (Math.random()*100) + 1;
    }

    private int askUserForNumber(){
        System.out.println("Guess the number between 1 and 100");
        return in.nextInt();
    }

    private void askLoop() {
        for (int i=10; i>0; i--) {
            System.out.printf("It's your %d try", i);
            int answer = askUserForNumber();
            if (answer > numberToGuess) {
                System.out.println("Your number is too high");
            }
            else if (answer < numberToGuess) {
                System.out.println("Your number is too low");
            }
            else {
                isCorrect = true;
            }
        }
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.generateRandomNumberToGuess();
        game.askLoop();
    }
}
