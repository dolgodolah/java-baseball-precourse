package baseball;

import baseball.domain.BaseballManager;
import baseball.domain.Computer;
import baseball.domain.Player;
import baseball.domain.Status;

public class Application {
    public static void main(String[] args) {
        Player player = new Player(Status.READY);
        Computer computer = new Computer();
        BaseballManager baseballManager = new BaseballManager(player, computer);

        while (player.isReady()) {
            baseballManager.run();
        }
    }
}
