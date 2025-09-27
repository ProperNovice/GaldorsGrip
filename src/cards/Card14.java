package cards;

import enums.EAttribute;
import model.CardCredentials;
import utils.ArrayList;

public class Card14 extends Card {

	@Override
	protected void addEAttribues(ArrayList<EAttribute> eAttributes) {

		eAttributes.addLast(EAttribute.BOOK_AND_PENCIL);

	}

	@Override
	protected void setCardCredentialsEOrientationNormal(CardCredentials cardCredentials) {

		cardCredentials.setValue(3);

	}

	@Override
	protected void setCardCredentialsEOrientationUpsideDown(CardCredentials cardCredentials) {

		cardCredentials.setValue(4);

	}

}
