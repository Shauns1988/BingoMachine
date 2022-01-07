import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Game Size");
        int gameSize = Integer.valueOf(sc.nextLine());
        
        BingoMachine bingo = new BingoMachine(gameSize);

        BingoConsole bingoConsole = new BingoConsole(sc, bingo);
        


        bingoConsole.runGame();

        sc.close();
    }
}
