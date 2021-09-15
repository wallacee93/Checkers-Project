public class Main {

    public static void main(String[] args) throws InterruptedException {

        Checkers checkers = new Checkers();

        while (!checkers.isGameOver()) {
            Thread.sleep(3000);
            checkers.makeMove();

            checkers.incrementNumberOfMoves();
        }

        checkers.endGame();

        System.out.println(checkers.getNumOfMoves());

    }
}
