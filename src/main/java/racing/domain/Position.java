package racing.domain;

import java.util.Objects;

public class Position {
    private static final int INCREASE_MOVE = 1;

    private final int position;

    private Position(int position) {
        validate(position);
        this.position = position;
    }

    public static Position of(int position) {
        return new Position(position);
    }

    private void validate(int position) {
        if (position < 0) {
            throw new IllegalArgumentException("위치 정보는 음수 값을 가질수 없습니다.");
        }
    }

    public Position move() {
        return new Position(this.position + INCREASE_MOVE);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Position position1 = (Position)o;
        return position == position1.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }
}
