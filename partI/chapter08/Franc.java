
class Franc extends Money {

	Franc(int amount) {
		this.amount = amount;
	}

	@Override
	Money times(int multiplier) {
		return new Franc(this.amount * multiplier);
	}
}
