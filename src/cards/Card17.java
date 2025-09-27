package cards;

import enums.EAttribute;
import model.CardCredentials;
import utils.ArrayList;

public class Card17 extends Card {

	@Override
	protected void addEAttribues(ArrayList<EAttribute> eAttributes) {

		eAttributes.addLast(EAttribute.STAR);

	}

	@Override
	protected void setCardCredentialsEOrientationNormal(CardCredentials cardCredentials) {

		cardCredentials.setValue(2);

	}

	@Override
	protected void setCardCredentialsEOrientationUpsideDown(CardCredentials cardCredentials) {

		cardCredentials.setValue(5);

	}

}
