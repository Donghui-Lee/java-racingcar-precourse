package racing.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NameTest {

    @Test
    void 생성_테스트() {
        // given
        Name name = Name.of("ldh");
        // when & then
        assertThat(name).isEqualTo(Name.of("ldh"));
    }

    @Test
    void 글자수_초과_예외_테스트() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Name.of("123456"));
    }

    @Test
    void 빈값_예외_테스트() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Name.of(""));
        Assertions.assertThrows(IllegalArgumentException.class, () -> Name.of(" "));
    }
}
