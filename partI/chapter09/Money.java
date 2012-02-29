
abstract class Money {
	protected int amount;
	protected String currency;
	
	public Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}

	@Override
	public boolean equals(Object object) {
		Money money = (Money)object;
		return amount == money.amount
			&& getClass().equals(money.getClass());
	}

	static Money dollar(int amount) {
		return new Dollar(amount, "USD");
	}

	static Franc franc(int amount) {
		return new Franc(amount, "CHF");
	}
	
	abstract Money times(int multiplier);
	abstract String currency();
}
