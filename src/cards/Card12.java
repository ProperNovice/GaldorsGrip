package cards;

import enums.EAttribute;
import model.CardCredentials;
import utils.ArrayList;

public class Card12 extends Card {

	@Override
	protected void addEAttribues(ArrayList<EAttribute> eAttributes) {

		eAttributes.addLast(EAttribute.BOOK_AND_PENCIL);
		eAttributes.addLast(EAttribute.SKULL);
		eAttributes.addLast(EAttribute.PUZZLE_PIECE);

	}

	@Override
	protected void setCardCredentialsEOrientationNormal(CardCredentials cardCredentials) {

		cardCredentials.setValue(1);
		cardCredentials.setHasRotateSymbol();

	}

	@Override
	protected void setCardCredentialsEOrientationUpsideDown(CardCredentials cardCredentials) {

		cardCredentials.setValue(6);
		cardCredentials.setHasRotateSymbol();

	}

}
