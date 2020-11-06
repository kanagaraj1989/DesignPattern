package AbstractFactory;

public class MacUIFactory extends AbstractUIFactory {
    @Override
    public UIComponent getUIComponent(String type) {
        if (type.equals("button")) {
            return new MacButton();
        }
        return null;
    }
}
