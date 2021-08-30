package no.home;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumbers {

    @Test
    void shouldConvert1ToI() {
        assertEquals("I", new toRoman().convert());
    }
}


