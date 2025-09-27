package cards;

import enums.EAttribute;
import model.CardCredentials;
import utils.ArrayList;

public class Card03 extends Card {

	@Override
	protected void addEAttribues(ArrayList<EAttribute> eAttributes) {

		eAttributes.addLast(EAttribute.STAR);
		eAttributes.addLast(EAttribute.GRIP);
		eAttributes.addLast(EAttribute.PUZZLE_PIECE);

	}

	@Override
	protected void setCardCredentialsEOrientationNormal(CardCredentials cardCredentials) {

		cardCredentials.setValue(3);
		cardCredentials.setHasRotateSymbol();

	}

	@Override
	protected void setCardCredentialsEOrientationUpsideDown(CardCredentials cardCredentials) {

		cardCredentials.setValue(4);
		cardCredentials.setHasRotateSymbol();

	}

}
