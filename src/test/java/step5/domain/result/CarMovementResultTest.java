package step5.domain.result;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import step5.domain.Car;

import static org.assertj.core.api.Assertions.assertThat;

public class CarMovementResultTest {

    @DisplayName("자동차의 움직임 결과는 자동차 이름을 갖고 있으며, 움직임이 없었을 경우 움직임 횟수는 0이다")
    @Test
    void movementResult() {
        final String carName = "test";
        final Car car = Car.withName(carName);

        final CarMovementResult result = car.move(() -> false);

        assertThat(result).isNotNull()
                .satisfies(r -> {
                    assertThat(r.carName()).isEqualTo(carName);
                    assertThat(r.moveCount()).isEqualTo(0);
                });
    }

}
