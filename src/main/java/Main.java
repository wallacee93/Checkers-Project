public class Main {

    public static void main(String[] args) {

        Checkers checkers = new Checkers();

        while (!checkers.isGameOver()) {
            checkers.makeMove();
            checkers.incrementNumberOfMoves();
        }

        checkers.endGame();

        System.out.println(checkers.getNumOfMoves());

    }

}
