package baseball.util;

import nextstep.utils.Randoms;

public class AnswerGenerator {

    private static int ANSWER_LENGTH = 3;
    private static int START_NUMBER = 1;
    private static int END_NUMBER = 9;


    public static String generateAnswer() {
        StringBuilder sb = new StringBuilder();

        while (sb.length() < ANSWER_LENGTH) {
            int randomNumber = Randoms.pickNumberInRange(START_NUMBER, END_NUMBER);
            appendNumber(sb, randomNumber);
        }

        return sb.toString();
    }

    private static void appendNumber(StringBuilder sb, int randomNumber) {
        if (!isDuplicateNumber(sb, randomNumber)) {
            sb.append(randomNumber);
        }
    }

    private static boolean isDuplicateNumber(StringBuilder sb, int randomNumber) {
        return sb.indexOf(String.valueOf(randomNumber)) != -1;
    }

}
