import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AwardTest {

    @Test
    void awardValidation() {
        assertEquals("invalid input", Award.awardValidation(4.1, 10.0));
        assertEquals("invalid input", Award.awardValidation(2.0, 100.1));
        assertEquals("Not Award", Award.awardValidation(2.0, 50.0));
        assertEquals("Awarded", Award.awardValidation(3.8, 90.0));
    }
}