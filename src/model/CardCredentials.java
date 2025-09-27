package model;

import utils.Logger;

public class CardCredentials {

	private int value = -1, stars = 0;
	private boolean hasValue = true, valueIsWildcard = false, hasRotateSymbol = false;

	public CardCredentials() {

	}

	public void print() {

		String value = "";

		if (this.hasValue && !this.valueIsWildcard)
			value += this.value;
		else if (this.hasValue && this.valueIsWildcard)
			value += "wildcard";
		else
			value += "null";

		Logger.INSTANCE.log("value -> " + value);

		if (this.stars > 0)
			Logger.INSTANCE.log("stars -> " + this.stars);

		if (this.hasRotateSymbol)
			Logger.INSTANCE.log("has rotate symbol");

		Logger.INSTANCE.newLine();

	}

	public void setValue(int value) {
		this.value = value;
	}

	public void setHasNotValue() {
		this.hasValue = false;
	}

	public void setValueIsWildcard() {
		this.valueIsWildcard = true;
	}

	public void setStars(int stars) {
		this.stars = stars;
	}

	public void setHasRotateSymbol() {
		this.hasRotateSymbol = true;
	}

	public boolean hasRotateSymbol() {
		return this.hasRotateSymbol;
	}

	public int getStars() {
		return this.stars;
	}

	public boolean valueIsStar() {
		return this.valueIsWildcard;
	}

	public boolean hasValue() {
		return this.hasValue;
	}

	public int getValue() {
		return this.value;
	}

}
