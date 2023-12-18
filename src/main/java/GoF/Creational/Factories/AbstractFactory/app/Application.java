package GoF.Creational.Factories.AbstractFactory.app;

import GoF.Creational.Factories.AbstractFactory.Factories.GUIFactory;
import GoF.Creational.Factories.AbstractFactory.buttons.Button;
import GoF.Creational.Factories.AbstractFactory.checkboxes.Checkbox;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
