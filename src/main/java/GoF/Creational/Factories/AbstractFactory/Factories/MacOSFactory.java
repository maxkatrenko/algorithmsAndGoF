package GoF.Creational.Factories.AbstractFactory.Factories;

import GoF.Creational.Factories.AbstractFactory.buttons.Button;
import GoF.Creational.Factories.AbstractFactory.buttons.MacOSButton;
import GoF.Creational.Factories.AbstractFactory.checkboxes.Checkbox;
import GoF.Creational.Factories.AbstractFactory.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
