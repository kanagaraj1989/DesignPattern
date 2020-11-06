package AbstractFactory;

public class WindowsUIFactory extends AbstractUIFactory{
    @Override
    public UIComponent getUIComponent(String type) {
        if (type.equals("button")) {
            return new WindowsButton();
        }
        return null;
    }
}
