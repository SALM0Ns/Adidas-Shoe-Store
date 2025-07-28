public class PriceCalculator {
    public static double calculateTotal(double[] prices) {
        double total = 0;
        for (double price : prices) {
            total += price;
        }
        return total;
    }

    public static double applyDiscount(double total, double discountPercent) {
        return total - (total * discountPercent / 100.0);
    }
}