package racing.domain;

import java.util.ArrayList;
import java.util.List;

import racing.domain.strategy.MoveStrategy;

public class Cars {
    private final List<Car> cars;

    public Cars() {
        this.cars = new ArrayList<>();
    }

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public Cars(String[] carNames) {
        cars = new ArrayList<>();
        for (String name : carNames) {
            cars.add(Car.of(name));
        }
    }

    public void add(Car car) {
        this.cars.add(car);
    }

    public void run(MoveStrategy moveStrategy) {
        cars.forEach(car -> car.move(moveStrategy));
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

    public List<Car> toList() {
        return this.cars;
    }
}
