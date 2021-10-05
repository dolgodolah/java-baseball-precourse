package baseball;

import baseball.domain.BaseballManager;
import baseball.domain.Computer;
import baseball.domain.Player;
import baseball.domain.Status;
import baseball.util.AnswerGenerator;

public class Application {

    public static void main(String[] args) {
        Player player = new Player(Status.READY);

        while (player.isReady()) {
            String answer = AnswerGenerator.generateAnswer();
            Computer computer = new Computer(answer);
            BaseballManager baseballManager = new BaseballManager(player, computer);
            baseballManager.run();
        }
    }
}
