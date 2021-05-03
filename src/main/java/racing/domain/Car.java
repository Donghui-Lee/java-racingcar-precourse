package racing.domain;

public class Car {
    private final Name name;
    private final Position position;

    private Car(String name) {
        this.name = Name.of(name);
        this.position = Position.init();
    }

    public static Car of(String name) {
        return new Car(name);
    }

    public Name name() {
        return this.name;
    }

    public void move() {
    }

    public Position position() {
        return this.position;
    }
}
