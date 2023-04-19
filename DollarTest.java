public class DollarTest {
    public void testMultiplication() {
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assetEquals(Money.dollar(15), five.times(3));
    }

    public void testEquality() {
        assertTrue(Money.dollar(5).equals((Money.dollar(5))));
        assertFalse(Money.dollar(5).equals(Money.dollar(6)));
        assertFalse(Money.dollar(5).equals(Money.franc(5)));

    }
}
