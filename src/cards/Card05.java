package cards;

import enums.EAttribute;
import model.CardCredentials;
import utils.ArrayList;

public class Card05 extends Card {

	@Override
	protected void addEAttribues(ArrayList<EAttribute> eAttributes) {

		eAttributes.addLast(EAttribute.GRIP);
		eAttributes.addLast(EAttribute.PUZZLE_PIECE);

	}

	@Override
	protected void setCardCredentialsEOrientationNormal(CardCredentials cardCredentials) {

		cardCredentials.setValueIsWildcard();

	}

	@Override
	protected void setCardCredentialsEOrientationUpsideDown(CardCredentials cardCredentials) {

		cardCredentials.setValue(1);

	}

}
