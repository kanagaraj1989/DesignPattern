package AbstractFactory;

public abstract class FactoryProducer {

    public static AbstractUIFactory getFactory(String osType) {
        if (osType.equals("windows")) {
            return new WindowsUIFactory();
        }

        return new MacUIFactory();
    }
}
