package Prototype;

import java.util.HashMap;
import java.util.Map;

public class ColorStore {
    private static Map<String, Color> mapColor = new HashMap<String, Color>();

    static {
        mapColor.put("black", new BlackColor());
        mapColor.put("blue", new BlueColor());
    }

    public static Color getColor(String type) {
        return (Color) mapColor.get(type).clone();
    }
}
