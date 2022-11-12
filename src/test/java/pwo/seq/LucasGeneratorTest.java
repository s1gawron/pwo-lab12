package pwo.seq;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class LucasGeneratorTest {

    @Test
    public void testReset() {
        System.out.println("reset");

        LucasGenerator instance = new LucasGenerator();
        instance.reset();

        BigDecimal expected = new BigDecimal(2);
        BigDecimal result = instance.nextTerm();

        assertEquals(expected, result);
    }

    @Test
    public void testNextTerm() {
        System.out.println("nextTerm");

        LucasGenerator instance = new LucasGenerator();
        instance.nextTerm();

        BigDecimal expected = new BigDecimal(1);
        BigDecimal result = instance.nextTerm();

        assertEquals(expected, result);
    }

    @Test void testGetTerm() {
        System.out.println("getTerm");

        LucasGenerator instance = new LucasGenerator();
        BigDecimal expected = new BigDecimal(123);
        BigDecimal result = instance.getTerm(10);

        assertEquals(expected, result);
    }

}