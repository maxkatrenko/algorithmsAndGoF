package org.gof.creational.factories.abstractFactory.app;

import org.gof.creational.factories.abstractFactory.factories.GUIFactory;
import org.gof.creational.factories.abstractFactory.buttons.Button;
import org.gof.creational.factories.abstractFactory.checkboxes.Checkbox;

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
