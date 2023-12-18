package GoF.Creational.Factories.AbstractFactory.Factories;

import GoF.Creational.Factories.AbstractFactory.buttons.Button;
import GoF.Creational.Factories.AbstractFactory.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();

    Checkbox createCheckbox();
}
