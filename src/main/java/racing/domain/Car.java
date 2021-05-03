package racing.domain;

import java.util.Objects;

public class Car {
    private final Name name;
    private Position position;

    private Car(String name) {
        this.name = Name.of(name);
        this.position = Position.init();
    }

    private Car(String name, int position) {
        this.name = Name.of(name);
        this.position = Position.of(position);
    }

    public static Car of(String name) {
        return new Car(name);
    }

    public static Car of(String name, int position) {
        return new Car(name, position);
    }

    public void move(MoveStrategy moveStrategy) {
        if (moveStrategy.movable()) {
            position = position.move();
        }
    }

    public Position fartherPosition(Position comparePosition) {
        if (this.position.isLessThan(comparePosition)) {
            return comparePosition;
        }
        return this.position;
    }

    public Name name() {
        return this.name;
    }

    public Position position() {
        return this.position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Car car = (Car)o;
        return Objects.equals(name, car.name) && Objects.equals(position, car.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position);
    }
}
