import static org.junit.Assert.*;

import org.junit.Test;


public class TestClass {

	// (-) $5 + 10 CHF = $10 se taxa e de 2:1
	// (+) $5 * 2 = $10
	// (+) tornar a quantidade privada
	// (+) efeitos colaterais em Dollar
	// (-) Arredondamento de dinheiro
	// (+) equals
	// (-) hashCode
	// (-) Igualdade de null
	// (-) Igualdade de objeto
	
	@Test
	public void testMultiplication() {
		Dollar five = new Dollar(5);
		assertEquals(new Dollar(10), five.times(2));
		assertEquals(new Dollar(15), five.times(3));
	}
	
	@Test
	public void testEquality() {
		assertTrue(new Dollar(5).equals(new Dollar(5)));
		assertFalse(new Dollar(5).equals(new Dollar(6)));
	}
}
