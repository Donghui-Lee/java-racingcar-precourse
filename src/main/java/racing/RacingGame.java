package racing;

import racing.domain.Cars;
import racing.domain.strategy.RandomMoveStrategy;
import racing.domain.Round;
import racing.view.InputView;
import racing.view.ResultView;

public class RacingGame {
    private final Cars cars;
    private final Round round;

    public RacingGame() {
        this.cars = new Cars(InputView.inputCarNames());
        this.round = Round.of(InputView.inputRound());
    }

    public void play() {
        ResultView.printRacingResult();
        for (int i = 0; i < round.toInteger(); i++) {
            cars.run(new RandomMoveStrategy());
            ResultView.printRacingCars(cars.toList());
        }
        ResultView.printRacingWinner(cars.findWinners());
    }
}
