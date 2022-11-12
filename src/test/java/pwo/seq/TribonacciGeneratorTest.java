package pwo.seq;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class TribonacciGeneratorTest {

    @Test
    public void testReset() {
        System.out.println("reset");

        TribonacciGenerator instance = new TribonacciGenerator();
        instance.reset();

        BigDecimal expected = new BigDecimal(0);
        BigDecimal result = instance.nextTerm();

        assertEquals(expected, result);
    }

    @Test
    public void testNextTerm() {
        System.out.println("nextTerm");

        TribonacciGenerator instance = new TribonacciGenerator();
        instance.nextTerm();

        BigDecimal expected = new BigDecimal(0);
        BigDecimal result = instance.nextTerm();

        assertEquals(expected, result);
    }

    @Test void testGetTerm() {
        System.out.println("getTerm");

        TribonacciGenerator instance = new TribonacciGenerator();
        BigDecimal expected = new BigDecimal(81);
        BigDecimal result = instance.getTerm(10);

        assertEquals(expected, result);
    }

}