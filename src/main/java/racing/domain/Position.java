package racing.domain;

public class Position {

    private final int position;

    private Position(int position) {
        this.position = position;
    }

    public static Position of(int position) {
        return new Position(position);
    }

    public Position move() {
        return new Position(this.position + 1);
    }

}
