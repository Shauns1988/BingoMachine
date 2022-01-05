import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Game Size");
        int gameSize = Integer.valueOf(sc.nextLine());

        BingoMachine bingo = new BingoMachine(gameSize);

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
        sc.close();
    }
}
