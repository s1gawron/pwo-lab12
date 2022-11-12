package pwo.utils;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pwo.seq.FibonacciGenerator;

import static org.junit.jupiter.api.Assertions.*;

public class SequenceToolsTest {

    private static String expFibLine;

    private static String expFibColumn;

    private static SequenceGenerator fibGen;

    private static int from;

    private static int to;

    @BeforeAll
    public static void setUpClass() {
        expFibLine = "0 1 1 2 3 5 8 13 21 34 55";
        expFibColumn = "0\n1\n1\n2\n3\n5\n8\n13\n21\n34\n55";
        from = 0;
        to = 10;
        fibGen = new FibonacciGenerator();
    }

    @Test
    public void testGetTermsAsColumn() {
        System.out.println("getTermsAsColumn");
        String result = SequenceTools.getTermsAsColumn(fibGen, from, to);

        assertEquals(expFibColumn, result);
    }

    @Test
    public void testGetTermsAsLine() {
        System.out.println("getTermsAsLine");
        String result = SequenceTools.getTermsAsLine(fibGen, from, to);

        assertEquals(expFibLine, result);
    }

}
