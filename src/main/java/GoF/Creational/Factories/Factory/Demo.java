package GoF.Creational.Factories.Factory;

import GoF.Creational.Factories.Factory.dialogs.Dialog;
import GoF.Creational.Factories.Factory.dialogs.HtmlDialog;
import GoF.Creational.Factories.Factory.dialogs.WindowsDialog;

public class Demo {

    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    private static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    private static void runBusinessLogic() {
        dialog.renderWindow();
    }

}
