package quessNum;


public class Game {
    private int numberToGuess;

    private void generateRandomNumberToGuess() {
        numberToGuess = (int) (Math.random()*100) + 1;
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.generateRandomNumberToGuess();
    }
}
