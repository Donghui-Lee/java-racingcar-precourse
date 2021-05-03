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
        assertThat(car).isEqualTo(Car.of(test, 0));
    }

    @Test
    void 이동_테스트() {
        // given
        Car car = Car.of("test1");
        // when
        car.move(() -> true);
        // then
        assertThat(car.position()).isEqualTo(Position.of(1));
    }

    @Test
    void 멈춤_테스트() {
        // given
        Car car = Car.of("test1");
        // when
        car.move(() -> false);
        // then
        assertThat(car.position()).isEqualTo(Position.of(0));
    }

    @Test
    void 위치_비교_테스트() {
        // given
        Car test = Car.of("test1", 5);
        Car test2 = Car.of("test2", 2);
        // when & then
        assertThat(test.fartherPosition(Position.of(3))).isEqualTo(Position.of(5));
        assertThat(test2.fartherPosition(Position.of(3))).isEqualTo(Position.of(3));
    }
}
