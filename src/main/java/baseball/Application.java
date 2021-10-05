package baseball;

import baseball.domain.BaseballManager;
import baseball.domain.Computer;
import baseball.domain.Player;
import baseball.domain.Status;

public class Application {

    private static final String INIT_ANSWER = "";

    public static void main(String[] args) {
        Player player = new Player(Status.READY);

        while (player.isReady()) {
            Computer computer = new Computer(INIT_ANSWER);
            BaseballManager baseballManager = new BaseballManager(player, computer);
            baseballManager.run();
        }
    }
}
