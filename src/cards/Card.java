package cards;

import controller.Credentials;
import enums.EAttribute;
import enums.EOrientation;
import model.CardCredentials;
import model.CardModel;
import utils.ArrayList;
import utils.ImageView;
import utils.Interfaces.IImageViewAble;
import utils.Logger;

public abstract class Card implements IImageViewAble {

	private CardModel cardModel = null;

	public Card() {

		createImageView();

		this.cardModel = new CardModel();

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

		getImageView().setBack("cards/back.png");
		getImageView().setDimensions(Credentials.INSTANCE.dCard);

	}

	public final void print() {

		Logger.INSTANCE.logNewLine("/*");
		Logger.INSTANCE.logNewLine("printing card");

		this.cardModel.print();

		Logger.INSTANCE.logNewLine("*/");

	}

	public final CardModel getCardModel() {
		return this.cardModel;
	}

}
