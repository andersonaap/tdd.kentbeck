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
	// (+) 5 CHF * 2 = 10 CHF
	// (-) Duplicacao de Dolar/Franco
	// (+) Igualdade comum
	// (+) Multiplicacao comum
	// (+) Comparar Francos com Dolares
	// (+) Moeda?
	// (-) Deletar testFrancMultiplication
	
	
	@Test
	public void testMultiplication() {
		Money five = Money.dollar(5);
		assertEquals(Money.dollar(10), five.times(2));
		assertEquals(Money.dollar(15), five.times(3));
	}

	@Test
	public void testFrancMultiplication() {
		Franc five = Money.franc(5);
		assertEquals(Money.franc(10), five.times(2));
		assertEquals(Money.franc(15), five.times(3));
	}
	
	@Test
	public void testEquality() {
		assertTrue(Money.dollar(5).equals(Money.dollar(5)));
		assertFalse(Money.dollar(5).equals(Money.dollar(6)));
		assertTrue(Money.franc(5).equals(Money.franc(5)));
		assertFalse(Money.franc(5).equals(Money.franc(6)));
		assertFalse(Money.franc(5).equals(Money.dollar(5)));
	}
	
	@Test
	public void testCurrency() {
		assertEquals("USD", Money.dollar(1).currency());
		assertEquals("CHF", Money.franc(1).currency());
	}
	
	@Test
	public void testDifferentClassEquality() {
		assertTrue(new Money(10, "CHF").equals(new Franc(10, "CHF")));
	}
}
