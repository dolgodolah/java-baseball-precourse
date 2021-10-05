package baseball.domain;

public class Player {

    private Status status;

    public Player(Status status) {
        this.status = status;
    }

    public void ready() {
        this.status = Status.READY;
    }

    public void play() {
        this.status = Status.PLAY;
    }

    public void victory() {
        this.status = Status.VICTORY;
    }

    public void exit() {
        this.status = Status.EXIT;
    }

    public boolean isReady() {
        return this.status == Status.READY;
    }

    public boolean isPlay() {
        return this.status == Status.PLAY;
    }

    public boolean isVictory() {
        return this.status == Status.VICTORY;
    }
}
