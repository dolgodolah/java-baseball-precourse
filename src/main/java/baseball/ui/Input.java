package baseball.ui;

import nextstep.utils.Console;

public class Input {

    public static String inputNumber() {
        Output.printInputNumberMessage();
        return Console.readLine();
    }

    public static String inputRestartStatus() {
        Output.printRestartStatusMessage();
        return Console.readLine();
    }
}
