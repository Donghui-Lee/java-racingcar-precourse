package racing.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    void 생성_테스트() {
        // given
        String test = "test1";
        Car car = Car.of(test);
        // when & then
        assertThat(car.name()).isEqualTo(Name.of(test));
        assertThat(car).isEqualTo(Car.of(test));
    }

    @Test
    void 이동_테스트() {
        // given
        Car car = Car.of("test1");
        // when
        car.move();
        // then
        assertThat(car.position()).isEqualTo(Position.of(1));
    }
}
