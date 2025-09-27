package model;

import cards.Card;
import utils.Animation;
import utils.Enums.AnimationSynchEnum;
import utils.ShutDown;
import utils.Vector2;

public class CardSlot {

	private Vector2 vector2 = null;
	private Card card = null;

	public CardSlot(Vector2 vector2) {
		this.vector2 = vector2;
	}

	public void addCardRelocate(Card card) {

		if (this.card != null)
			ShutDown.INSTANCE.execute();

		this.card = card;
		this.card.getImageView().relocateCenter(this.vector2);

	}

	public void addCardAnimateSynchronous(Card card) {

		if (this.card != null)
			ShutDown.INSTANCE.execute();

		this.card = card;
		Animation.INSTANCE.animateCenter(this.card, this.vector2, AnimationSynchEnum.SYNCHRONOUS);

	}

	public Card getCard() {
		return this.card;
	}

	public Card removeCard() {

		Card card = this.card;
		this.card = null;
		return card;

	}

}
