package model;

public class CardCredentials {

	private int value = -1;
	private boolean hasValue = true, valueIsStar = false;

	public CardCredentials() {

	}

	public void setValue(int value) {
		this.value = value;
	}

	public void setHasNotValue() {
		this.hasValue = false;
	}

	public void setValueIsStar() {
		this.valueIsStar = true;
	}

	public boolean valueIsStar() {
		return this.valueIsStar;
	}

	public boolean hasValue() {
		return this.hasValue;
	}

	public int getValue() {
		return this.value;
	}

}
