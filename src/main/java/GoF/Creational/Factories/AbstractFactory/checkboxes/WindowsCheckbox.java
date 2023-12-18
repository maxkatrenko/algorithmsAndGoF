package GoF.Creational.Factories.AbstractFactory.checkboxes;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("You have created WindowsCheckbox.");
    }
}