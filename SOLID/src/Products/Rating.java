package Products;

import java.util.Random;

public class Rating {
    private double rating;           // рейтинг
    private double minLimit = 4.0;   // нижняя граница рейтинга
    private double maxLimit = 5.0;   // верхняя граница рейтинга

    public void randomRating() {
        Random random = new Random();
        rating = random.nextDouble(minLimit, maxLimit);
    }

    @Override
    public String toString() {
        return String.format("%.1f", rating);
    }

    public double getRating() {
        return rating;
    }
}