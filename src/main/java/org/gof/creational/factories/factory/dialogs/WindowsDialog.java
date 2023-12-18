package org.gof.creational.factories.factory.dialogs;

import org.gof.creational.factories.factory.buttons.Button;
import org.gof.creational.factories.factory.buttons.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
