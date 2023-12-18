package org.gof.creational.factories.abstractFactory.factories;

import org.gof.creational.factories.abstractFactory.buttons.Button;
import org.gof.creational.factories.abstractFactory.buttons.WindowsButton;
import org.gof.creational.factories.abstractFactory.checkboxes.Checkbox;
import org.gof.creational.factories.abstractFactory.checkboxes.WindowsCheckbox;

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
