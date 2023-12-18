package GoF.Creational.Factories.Factory.dialogs;

import GoF.Creational.Factories.Factory.buttons.Button;
import GoF.Creational.Factories.Factory.buttons.HtmlButton;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }

}
