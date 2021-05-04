package racing.domain.strategy;

import java.util.Random;

public class RandomMoveStrategy implements MoveStrategy{
    private static final int RANDOM_RANGE = 10;
    private static final int MOVE_RESTRICT = 4;

    private final Random random = new Random();

    @Override
    public boolean movable() {
        return random.nextInt(RANDOM_RANGE) >= MOVE_RESTRICT;
    }
}
