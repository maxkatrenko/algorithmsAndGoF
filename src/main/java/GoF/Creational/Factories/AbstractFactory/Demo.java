package GoF.Creational.Factories.AbstractFactory;

import GoF.Creational.Factories.AbstractFactory.Factories.GUIFactory;
import GoF.Creational.Factories.AbstractFactory.Factories.MacOSFactory;
import GoF.Creational.Factories.AbstractFactory.Factories.WindowsFactory;
import GoF.Creational.Factories.AbstractFactory.app.Application;

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
