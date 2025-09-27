package cards;

import enums.EAttribute;
import model.CardCredentials;
import utils.ArrayList;

public class Card16 extends Card {

	@Override
	protected void addEAttribues(ArrayList<EAttribute> eAttributes) {

		eAttributes.addLast(EAttribute.STAR);

	}

	@Override
	protected void setCardCredentialsEOrientationNormal(CardCredentials cardCredentials) {

		cardCredentials.setValue(6);
		cardCredentials.setHasRotateSymbol();

	}

	@Override
	protected void setCardCredentialsEOrientationUpsideDown(CardCredentials cardCredentials) {

		cardCredentials.setValue(1);
		cardCredentials.setHasRotateSymbol();

	}

}
