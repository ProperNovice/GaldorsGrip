package model;

import enums.EAttribute;
import enums.EOrientation;
import utils.ArrayList;
import utils.HashMap;
import utils.Logger;

public class CardModel {

	private ArrayList<EAttribute> eAttributes = new ArrayList<>();
	private HashMap<EOrientation, CardCredentials> cardCredentials = new HashMap<>();
	private EOrientation eOrientationCurrent = EOrientation.NORMAL;

	public CardModel() {

		this.cardCredentials.put(EOrientation.NORMAL, new CardCredentials());
		this.cardCredentials.put(EOrientation.UPSIDE_DOWN, new CardCredentials());

	}

	public void print() {

		Logger.INSTANCE.log("attributes");

		for (EAttribute eAttribute : this.eAttributes)
			Logger.INSTANCE.log(eAttribute);

		Logger.INSTANCE.newLine();

		Logger.INSTANCE.log("orientation normal");
		this.cardCredentials.getValue(EOrientation.NORMAL).print();

		Logger.INSTANCE.log("orientation upside down");
		this.cardCredentials.getValue(EOrientation.UPSIDE_DOWN).print();

	}

	public CardCredentials getCardCredentials(EOrientation eOrientation) {
		return this.cardCredentials.getValue(eOrientation);
	}

	public CardCredentials getCardCredentialsCurrentOrientation() {
		return this.cardCredentials.getValue(this.eOrientationCurrent);
	}

	public void setCurrentEOrientation(EOrientation eOrientation) {
		this.eOrientationCurrent = eOrientation;
	}

	public ArrayList<EAttribute> getEAttributes() {
		return this.eAttributes;
	}

}
