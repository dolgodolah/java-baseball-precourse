package baseball;

import baseball.domain.BaseballManager;
import baseball.domain.Player;
import baseball.domain.Status;

public class Application {
    public static void main(String[] args) {
        Player player = new Player(Status.READY);
        BaseballManager baseballManager = new BaseballManager(player);
        while (player.isReady()) {
            baseballManager.run();
        }
    }
}
