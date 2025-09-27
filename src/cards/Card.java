package cards;

import enums.EAttribute;
import enums.EOrientation;
import model.CardCredentials;
import model.CardModel;
import utils.ArrayList;
import utils.ImageView;
import utils.Interfaces.IImageViewAble;

public abstract class Card implements IImageViewAble {

	private CardModel cardModel = null;

	public Card() {

		this.cardModel = new CardModel();

		createImageView();

		addEAttribues(this.cardModel.getEAttributes());

		setCardCredentialsEOrientationNormal(
				this.cardModel.getCardCredentials(EOrientation.NORMAL));

		setCardCredentialsEOrientationUpsideDown(
				this.cardModel.getCardCredentials(EOrientation.UPSIDE_DOWN));

	}

	protected abstract void addEAttribues(ArrayList<EAttribute> eAttributes);

	protected abstract void setCardCredentialsEOrientationNormal(CardCredentials cardCredentials);

	protected abstract void setCardCredentialsEOrientationUpsideDown(
			CardCredentials cardCredentials);

	private void createImageView() {

		String fileName = this.getClass().getSimpleName();
		fileName = fileName.substring(4);

		String filePath = "";
		filePath += "cards/";
		filePath += fileName;
		filePath += ".png";

		new ImageView(filePath, this);

	}

	public final void print() {

	}

	public final CardModel getCardModel() {
		return this.cardModel;
	}

}
