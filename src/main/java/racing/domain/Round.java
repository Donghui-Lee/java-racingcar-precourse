package racing.domain;

import java.util.Objects;

public class Round {
    private static final int MIN_ROUND = 0;
    private final int round;

    private Round(int round) {
        validate(round);
        this.round = round;
    }

    public static Round of(int round) {
        return new Round(round);
    }

    public static Round of(String round) {
        return new Round(Integer.parseInt(round.trim()));
    }

    private void validate(int round) {
        if (round < MIN_ROUND) {
            throw new IllegalArgumentException("유효하지 않은 시도할 회수 입니다.");
        }
    }

    public int toInteger() {
        return this.round;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Round round1 = (Round)o;
        return round == round1.round;
    }

    @Override
    public int hashCode() {
        return Objects.hash(round);
    }
}
