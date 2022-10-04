import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalmTest {

    Palm testPalm = new Palm("Kalle", 2.5, true);

    @Test
    void testRäknaUtMängdVätska() {
        assert (testPalm.räknaUtMängdVätska() == 1.25);
        assert !(testPalm.räknaUtMängdVätska() == 2.5);
    }
}