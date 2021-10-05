package baseball.domain;

import baseball.ui.Input;

public class BaseballManager {

    private Player player;

    public BaseballManager(Player player) {
        this.player = player;
    }

    public void run() {
        player.play();

        while (player.isPlay()) {
            playBaseball();
        }
    }

    private void playBaseball() {
        String input = Input.inputNumber();
    }
}
