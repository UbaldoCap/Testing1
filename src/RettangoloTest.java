import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class RettangoloTest {

    @org.junit.jupiter.api.Test
    void calcolaArea() {
        Rettangolo testing = new Rettangolo(4, 3);
        Integer result = testing.calcolaArea();
        assertEquals(12, result);
    }

    @org.junit.jupiter.api.Test
    void calcolaAreaNegativoOrNull() {
        Rettangolo testing = new Rettangolo(-3, 3);
        Integer result = testing.calcolaArea();
        assertNull(result);
    }
}