import java.util.ArrayList;

public class BingoMachine {
    private int gameSize;
    private ArrayList<Ball> balls = new ArrayList<Ball>();
    private ArrayList<Ball> drawnBalls = new ArrayList<Ball>();


    public BingoMachine(int gameSize) {
        this.gameSize = gameSize;
        for(int i = 0; i < gameSize; i++) {
            balls.add(new Ball(i+1));
        }
    }

    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public Ball drawBall() {
        int random = getRandomNumber(0,this.gameSize);
        Ball drawn = balls.get(random);
        drawnBalls.add(drawn);
        balls.remove(drawn);
        gameSize--;
        return drawn;
    }
    public int getGameSize() {
        return this.gameSize;
    }

    public String getDrawnBalls() {
        String drawnBallsString = "";
        for (Ball ball : drawnBalls) {
            drawnBallsString += ball.toString() + " ";
        }
        return drawnBallsString;
    }

}
