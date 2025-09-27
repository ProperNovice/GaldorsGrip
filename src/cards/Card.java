package cards;

import model.CardModel;
import utils.ImageView;
import utils.Interfaces.IImageViewAble;

public abstract class Card implements IImageViewAble {

	protected CardModel cardModel = new CardModel();

	public Card() {

		createImageView();
		createCardModel();

	}

	protected abstract void createCardModel();

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

}
