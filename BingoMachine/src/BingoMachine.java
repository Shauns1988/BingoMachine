import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class BingoMachine {
    private List<Ball> balls = new ArrayList<Ball>();
    private List<Ball> drawnBalls = new ArrayList<Ball>();


    public BingoMachine(int gameSize) {
        for(int i = 0; i < gameSize; i++) {
            balls.add(new Ball(i+1));
        }
    }

    public Ball drawBall() {
        Collections.shuffle(balls);
        Ball drawn = balls.get(0);
        drawnBalls.add(drawn);
        balls.remove(drawn);
        return drawn;
    }
    public int getGameSize() {
        return balls.size();
    }

    public String getDrawnBalls() {
        StringBuilder drawnBallsString = new StringBuilder();
        for (Ball ball : drawnBalls) {
            drawnBallsString.append(ball.toString() + " ");
        }
        return drawnBallsString.toString();
    }

}
