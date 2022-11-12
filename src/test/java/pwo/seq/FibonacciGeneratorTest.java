package pwo.seq;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciGeneratorTest {

    @Test
    public void testReset() {
        System.out.println("reset");

        FibonacciGenerator instance = new FibonacciGenerator();
        instance.reset();

        BigDecimal expected = new BigDecimal(0);
        BigDecimal result = instance.nextTerm();

        assertEquals(expected, result);
    }

    @Test
    public void testNextTerm() {
        System.out.println("nextTerm");

        FibonacciGenerator instance = new FibonacciGenerator();
        instance.nextTerm();

        BigDecimal expected = new BigDecimal(1);
        BigDecimal result = instance.nextTerm();

        assertEquals(expected, result);
    }

    @Test void testGetTerm() {
        System.out.println("getTerm");

        FibonacciGenerator instance = new FibonacciGenerator();
        BigDecimal expected = new BigDecimal(55);
        BigDecimal result = instance.getTerm(10);

        assertEquals(expected, result);
    }

}