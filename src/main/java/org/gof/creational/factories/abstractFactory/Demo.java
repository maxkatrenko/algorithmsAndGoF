package org.gof.creational.factories.abstractFactory;

import org.gof.creational.factories.abstractFactory.factories.GUIFactory;
import org.gof.creational.factories.abstractFactory.factories.MacOSFactory;
import org.gof.creational.factories.abstractFactory.factories.WindowsFactory;
import org.gof.creational.factories.abstractFactory.app.Application;

public class Demo {
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application application = configureApplication();
        application.paint();
    }
}
