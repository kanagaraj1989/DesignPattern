package Prototype;

public abstract class Color implements Cloneable {
    public abstract void addColor();

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            System.out.println("CloneNotSupportedException==");
        }

        return clone;
    }
}
