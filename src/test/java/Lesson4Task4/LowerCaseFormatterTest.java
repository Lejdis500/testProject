package Lesson4Task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LowerCaseFormatterTest {

    @Test
    void shouldGetToLowerCase() {
        // given
        String text = "Lubię pływać";
        // when
       LowerCaseFormatter formatter = new LowerCaseFormatter();
        String formattedText = formatter.formatText(text);
        // then
        Assertions.assertEquals("lubię pływać",formattedText);

    }
}

