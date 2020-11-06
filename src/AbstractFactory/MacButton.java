package AbstractFactory;

public class MacButton implements UIComponent {
    private String style;
    @Override
    public void setStyle(String style) {
        this.style = style;
    }

    @Override
    public void render() {
        System.out.println("Mac Button render called");
    }
}
