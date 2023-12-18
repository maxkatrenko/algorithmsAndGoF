package org.gof.creational.factories.factory;

import org.gof.creational.factories.factory.dialogs.Dialog;
import org.gof.creational.factories.factory.dialogs.HtmlDialog;
import org.gof.creational.factories.factory.dialogs.WindowsDialog;

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
