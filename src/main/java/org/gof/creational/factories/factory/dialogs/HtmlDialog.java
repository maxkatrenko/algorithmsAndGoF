package org.gof.creational.factories.factory.dialogs;

import org.gof.creational.factories.factory.buttons.Button;
import org.gof.creational.factories.factory.buttons.HtmlButton;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }

}
