package GoF.Creational.Factories.AbstractFactory.Factories;

import GoF.Creational.Factories.AbstractFactory.buttons.Button;
import GoF.Creational.Factories.AbstractFactory.buttons.WindowsButton;
import GoF.Creational.Factories.AbstractFactory.checkboxes.Checkbox;
import GoF.Creational.Factories.AbstractFactory.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
