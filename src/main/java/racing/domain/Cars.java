package racing.domain;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private final List<Car> cars;

    public Cars() {
        this.cars = new ArrayList<>();
    }

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public void add(Car car) {
        this.cars.add(car);
    }

    public List<Car> toList() {
        return this.cars;
    }

    public List<Car> findWinners() {
        return winners(farthestPosition());
    }

    private List<Car> winners(Position maxPosition) {
        List<Car> winners = new ArrayList<>();
        cars.forEach(car -> addWinner(winners, car, maxPosition));
        return winners;
    }

    private void addWinner(List<Car> winner, Car car, Position maxPosition) {
        if (!car.position().isLessThan(maxPosition)) {
            winner.add(car);
        }
    }

    private Position farthestPosition() {
        Position farthest = Position.init();
        for (Car car : cars) {
            farthest = car.fartherPosition(farthest);
        }
        return farthest;
    }
}
