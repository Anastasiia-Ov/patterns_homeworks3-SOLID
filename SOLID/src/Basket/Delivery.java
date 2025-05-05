package Basket;

import java.util.Map;

public class Delivery {
    private final Map<String, Integer> streets = Map.of(
            "Ерофеевская", 120,
            "Молодёжная", 130,
            "Соколовская", 100,
            "Славы", 150,
            "Микуцкого", 140,
            "Светлова", 200,
            "Ольховая", 170,
            "Гриболевская", 160
    );

    public boolean isDelivery(String street) {
        return streets.containsKey(street);
    }

    public int calcDelivery(String street) {
        return streets.get(street);
    }
}