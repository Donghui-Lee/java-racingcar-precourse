package racing.domain;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class CarsTest {

    @Test
    void 자동차_추가_테스트() {
        // given
        String[] names = "test1,test2,test3".split(",");
        Cars cars = new Cars();
        // when
        Arrays.stream(names)
            .forEach(name -> cars.add(Car.of(name)));
        // then
        assertThat(cars.toList().size()).isEqualTo(3);
    }

    @Test
    void 우승자_찾기_테스트() {
        // given
        Car test1 = Car.of("test1", 1);
        Car test2 = Car.of("test2", 2);
        Car test3 = Car.of("test3", 3);

        List<Car> original = Arrays.asList(test1, test2, test3);
        Cars cars = new Cars(original);

        // when & then
        assertThat(cars.findWinners()).containsExactly(test3);
    }

    @Test
    void 우승자_찾기_테스트_2() {
        // given
        Car test1 = Car.of("test1", 3);
        Car test2 = Car.of("test2", 3);
        Car test3 = Car.of("test3", 2);

        List<Car> original = Arrays.asList(test1, test2, test3);
        Cars cars = new Cars(original);

        // when & then
        assertThat(cars.findWinners()).containsExactly(test1, test2);
    }
}
