package baseball.domain;

import baseball.ui.Input;

public class BaseballManager {

    private Player player;
    private Computer computer;

    public BaseballManager(Player player, Computer computer) {
        this.player = player;
        this.computer = computer;
    }

    public void run() {
        player.play();
        computer.generateAnswer();

        while (player.isPlay()) {
            playBaseball();
        }
    }

    private void playBaseball() {
        String input = Input.inputNumber();
    }
}
