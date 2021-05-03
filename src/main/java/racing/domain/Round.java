package racing.domain;

public class Round {
    private final int round;

    private Round(int round) {
        this.round = round;
    }

    public static Round of(int round) {
        return new Round(round);
    }

    public static Round of(String round) {
        return new Round(Integer.parseInt(round));
    }
}
