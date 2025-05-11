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

    // проверка доставки на адрес
    public boolean isDelivery(String street) {
        if (streets.containsKey(street)) {
            return true;
        } else {
            System.out.println("Нет доставки по данному адресу");
            return false;
        }
    }

    // расчет стоимости доставки
    public int calcDelivery(String street) {
        return streets.get(street);
    }
}