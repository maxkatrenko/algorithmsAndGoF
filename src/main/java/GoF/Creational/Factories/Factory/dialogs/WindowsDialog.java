package GoF.Creational.Factories.Factory.dialogs;

import GoF.Creational.Factories.Factory.buttons.Button;
import GoF.Creational.Factories.Factory.buttons.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
