import static org.junit.Assert.*;

import org.junit.Test;


public class TestClass {

	// (-) $5 + 10 CHF = $10 se taxa e de 2:1
	// (+) $5 * 2 = $10
	// (-) tornar a quantidade privada
	// (-) efeitos colaterais em Dollar
	// (-) Arredondamento de dinheiro
	
	@Test
	public void testMultiplication() {
		Dollar five = new Dollar(5);
		five.times(2);
		assertEquals(10, five.amount);
	}

}
