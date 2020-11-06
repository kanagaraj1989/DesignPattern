package Composite;

public class Engineer implements Employee {
    private String desc;
    public Engineer(String desc) {
        this.desc = desc;
    }
    @Override
    public void showDetails() {
        System.out.println("Engineer="+ desc);
    }
}
