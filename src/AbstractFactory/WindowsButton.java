package AbstractFactory;

public class WindowsButton implements UIComponent {
    private String style;

    @Override
    public void setStyle(String style) {
        this.style = style;
    }

    @Override
    public void render() {
        System.out.println("Render Window Button on UI");
    }
}
