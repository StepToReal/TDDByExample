package tdd.exam;

import org.junit.Test;

import static org.junit.Assert.*;

public class StockPriceCalculationTest {

    @Test
    public void testMultiplication() {
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));
    }

    @Test
    public void testEquality() {
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(5).equals(Money.dollar(6)));
        assertTrue(Money.france(5).equals(Money.france(5)));
        assertFalse(Money.france(5).equals(Money.france(6)));
        assertFalse(Money.france(5).equals(Money.dollar(5)));
    }

    @Test
    public void testFranceMultiplication() {
        France five = Money.france(5);
        assertEquals(Money.france(10), five.times(2));
        assertEquals(Money.france(15), five.times(3));
    }
}
