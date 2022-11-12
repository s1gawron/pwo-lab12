package pwo.seq;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeqTypeTest {

    @Test
    public void testValues() {
        System.out.println("values");

        SeqType[] expected = { SeqType.FIB, SeqType.LUC, SeqType.TRI };
        SeqType[] result = SeqType.values();

        assertArrayEquals(expected, result);
    }

    @Test
    public void testFromString() {
        System.out.println("fromString");

        String type = "fibonaci";
        SeqType expected = SeqType.FIB;
        SeqType result = SeqType.fromString(type);

        assertEquals(expected, result);
    }

    @Test
    public void testFromStringLuc() {
        System.out.println("fromString");

        String type = "lucas";
        SeqType expected = SeqType.LUC;
        SeqType result = SeqType.fromString(type);

        assertEquals(expected, result);
    }

    @Test
    public void testFromStringTri() {
        System.out.println("fromString");

        String type = "tribonacci";
        SeqType expected = SeqType.TRI;
        SeqType result = SeqType.fromString(type);

        assertEquals(expected, result);
    }

    @Test
    public void testGetGenerator() {
        System.out.println("getGenerator");

        SeqType instance = SeqType.FIB;
        Generator result = instance.getGenerator();

        assertEquals(FibonacciGenerator.class, result.getClass());
    }

    @Test
    public void testGetGeneratorLuc() {
        System.out.println("getGenerator");

        SeqType instance = SeqType.LUC;
        Generator result = instance.getGenerator();

        assertEquals(LucasGenerator.class, result.getClass());
    }

    @Test
    public void testGetGeneratorTri() {
        System.out.println("getGenerator");

        SeqType instance = SeqType.TRI;
        Generator result = instance.getGenerator();

        assertEquals(TribonacciGenerator.class, result.getClass());
    }

}