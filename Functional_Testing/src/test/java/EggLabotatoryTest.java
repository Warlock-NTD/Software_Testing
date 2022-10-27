import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EggLabotatoryTest {

    @Test
    void eggCollector() {
        assertEquals(26, EggLabotatory.eggCollector(11, 6));
        assertEquals(21, EggLabotatory.eggCollector(11, 5));
        assertEquals(14, EggLabotatory.eggCollector(10, 6));
    }
}