package model;

import enums.EAttribute;
import enums.EOrientation;
import utils.ArrayList;
import utils.HashMap;

public class CardModel {

	private ArrayList<EAttribute> eAttributes = new ArrayList<>();
	private HashMap<EOrientation, CardCredentials> cardCredentials = new HashMap<>();
	private EOrientation eOrientationCurrent = EOrientation.NORMAL;

	public CardModel() {

		this.cardCredentials.put(EOrientation.NORMAL, new CardCredentials());
		this.cardCredentials.put(EOrientation.UPSIDE_DOWN, new CardCredentials());

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
