import java.util.Scanner;

public class BingoConsole {
    private Scanner sc;
    private BingoMachine bingo;

    public BingoConsole(Scanner sc, BingoMachine bingo) {
        this.sc = sc;
        this.bingo = bingo;
    }

    public void runGame() {
        while (true) {
            if(bingo.getGameSize() == 0) {
                System.out.println(bingo.getDrawnBalls());
                break;
            }

            System.out.println("Menu: 1. Show Draw, 2. Draw Ball");

            int option = Integer.valueOf(sc.nextLine());
            if (option == 2) {
                System.out.println(bingo.drawBall());
            } else if (option == 1) {
                System.out.println(bingo.getDrawnBalls());
            }

        }
    }

    
}
