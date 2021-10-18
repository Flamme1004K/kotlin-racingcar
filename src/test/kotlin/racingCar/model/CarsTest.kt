package racingCar.model

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class CarsTest {
    @ParameterizedTest
    @ValueSource(ints = [3, 4, 5])
    fun `자동차 수가 똑같은지 확인한다`(input: Int) {
        assertThat(Cars(input).list.size).isEqualTo(input)
    }

    @ParameterizedTest
    @ValueSource(ints = [3, 4, 5])
    fun `모든 차가 자동차 룰에 맞추어 움직이는지 테스트`(input: Int) {
        val cars = Cars(input) { 4 }
        cars.move()
        cars.list.forEach {
            assertThat(it.mileage).isEqualTo(1)
        }
    }
}