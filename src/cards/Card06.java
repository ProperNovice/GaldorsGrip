package cards;

import enums.EAttribute;
import model.CardCredentials;
import utils.ArrayList;

public class Card06 extends Card {

	@Override
	protected void addEAttribues(ArrayList<EAttribute> eAttributes) {

		eAttributes.addLast(EAttribute.STAR);
		eAttributes.addLast(EAttribute.BOOK_AND_PENCIL);
		eAttributes.addLast(EAttribute.PUZZLE_PIECE);

	}

	@Override
	protected void setCardCredentialsEOrientationNormal(CardCredentials cardCredentials) {

		cardCredentials.setValueIsWildcard();

	}

	@Override
	protected void setCardCredentialsEOrientationUpsideDown(CardCredentials cardCredentials) {

		cardCredentials.setHasNotValue();
		cardCredentials.setStars(1);

	}

}
