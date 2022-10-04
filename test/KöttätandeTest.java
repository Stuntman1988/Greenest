import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KöttätandeTest {

    Köttätande testKöttätande = new Köttätande("Nisse", 1.5, 34);

    @Test
    void testRäknaUtMängdVätska() {
        assert (testKöttätande.räknaUtMängdVätska() == 0.4);
        assert !(testKöttätande.räknaUtMängdVätska() == 1.5);
    }
}