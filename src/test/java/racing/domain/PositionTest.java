package racing.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PositionTest {

    @Test
    void 생성_테스트() {
        // given
        Position position = Position.of(1);
        Position position2 = Position.init();
        // when & then
        assertThat(position).isEqualTo(Position.of(1));
        assertThat(position2).isEqualTo(Position.of(0));
    }

    @Test
    void 유효성_테스트() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Position.of(-1));
    }

    @Test
    void 이동_테스트() {
        // given
        Position position = Position.of(1);
        // when & then
        assertThat(position.move()).isEqualTo(Position.of(2));
        assertThat(position.move().move()).isEqualTo(Position.of(3));
    }

    @Test
    void 비교_테스트() {
        assertThat(Position.init().isLessThan(Position.of(2))).isTrue();
        assertThat(Position.of(3).isLessThan(Position.of(2))).isFalse();
        assertThat(Position.of(2).isLessThan(Position.of(2))).isFalse();
        assertThat(Position.of(3).isLessThan(Position.of(5))).isTrue();
    }
}
