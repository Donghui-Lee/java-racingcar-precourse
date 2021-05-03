package racing.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RoundTest {

    @Test
    void 생성_테스트() {
        // given
        Round round = Round.of(5);
        // when & then
        assertThat(round).isEqualTo(Round.of(5));
    }

    @Test
    void 유효성_테스트() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Round.of(""));
        Assertions.assertThrows(IllegalArgumentException.class, () -> Round.of(-1));
    }
}
