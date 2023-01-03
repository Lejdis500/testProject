package Lesson3Task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TimeConverterTest {

    @Test
    void shouldConvert1MinuteTo60Seconds() {
        // given
        int minutes = 1;
        // when
        int result = TimeConverter.convertMinutesToSeconds(minutes);
        // then
        Assertions.assertEquals(60, result);

    }
}