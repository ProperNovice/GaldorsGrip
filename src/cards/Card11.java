package cards;

import enums.EAttribute;
import model.CardCredentials;
import utils.ArrayList;

public class Card11 extends Card {

	@Override
	protected void addEAttribues(ArrayList<EAttribute> eAttributes) {

		eAttributes.addLast(EAttribute.STAR);
		eAttributes.addLast(EAttribute.SKULL);
		eAttributes.addLast(EAttribute.PUZZLE_PIECE);

	}

	@Override
	protected void setCardCredentialsEOrientationNormal(CardCredentials cardCredentials) {

		cardCredentials.setValue(5);

	}

	@Override
	protected void setCardCredentialsEOrientationUpsideDown(CardCredentials cardCredentials) {

		cardCredentials.setValue(5);
		cardCredentials.setStars(1);

	}

}
