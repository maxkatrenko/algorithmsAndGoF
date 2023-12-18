package org.gof.creational.factories.abstractFactory.factories;

import org.gof.creational.factories.abstractFactory.buttons.Button;
import org.gof.creational.factories.abstractFactory.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();

    Checkbox createCheckbox();
}
