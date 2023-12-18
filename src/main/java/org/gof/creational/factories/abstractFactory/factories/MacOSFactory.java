package org.gof.creational.factories.abstractFactory.factories;

import org.gof.creational.factories.abstractFactory.buttons.Button;
import org.gof.creational.factories.abstractFactory.buttons.MacOSButton;
import org.gof.creational.factories.abstractFactory.checkboxes.Checkbox;
import org.gof.creational.factories.abstractFactory.checkboxes.MacOSCheckbox;

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
