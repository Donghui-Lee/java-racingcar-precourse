package racing.view;

import java.util.List;
import java.util.StringJoiner;
import java.util.stream.IntStream;

import racing.domain.Car;
import racing.domain.Name;
import racing.domain.Position;

public class ResultView {
    private final static String MESSAGE_RACING_RESULT = "\n실행 결과";
    private final static String MESSAGE_RACING_WINNER = "가 최종 우승하였습니다.";
    private final static String SYMBOL_DISTANCE = "-";

    public static void printRacingResult() {
        System.out.println(MESSAGE_RACING_RESULT);
    }

    public static void printRacingCars(List<Car> carList) {
        carList.stream().forEach(ResultView::printRacingCar);
        System.out.println();
    }

    private static void printRacingCar(Car car) {
        printRacingCarStatus(car.name(), car.position());
    }

    private static void printRacingCarStatus(Name name, Position position) {
        StringBuilder message = new StringBuilder(name + " : ");

        IntStream.range(0, position.toInteger())
            .forEach(i->message.append(SYMBOL_DISTANCE));

        System.out.println(message.toString());
    }

    public static void printRacingWinner(List<Car> winnerCars) {
        StringJoiner winner = new StringJoiner(",");
        for (Car car : winnerCars) {
            winner.add(car.name().toString());
        }
        System.out.println(winner.toString() + MESSAGE_RACING_WINNER);
    }
}
