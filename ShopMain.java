import java.util.*;

public class ShopMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<ShoeData> shoeList = new ArrayList<>();
        shoeList.add(new ShoeData("ADIDAS UltraBoost", 4500.0, 0));
        shoeList.add(new ShoeData("ADIDAS Predator", 6500.0, 0));
        shoeList.add(new ShoeData("ADIDAS Tempo", 5500.0, 0));
        shoeList.add(new ShoeData("ADIDAS X", 7500.0, 0));
        shoeList.add(new ShoeData("ADIDAS TrailRunner", 4500.0, 0));

        System.out.println("ADIDAS STORE");
        System.out.println("Please enter the quantity of each shoe:");

        for (ShoeData shoe : shoeList) {
            System.out.print(shoe.name + " (Price " + shoe.price + "): ");
            shoe.quantity = scanner.nextInt();
        }

        double[] totals = new double[shoeList.size()];
        for (int i = 0; i < shoeList.size(); i++) {
            totals[i] = shoeList.get(i).getTotal();
        }

        double grandTotal = PriceCalculator.calculateTotal(totals);
        System.out.println("Total Price: " + grandTotal + " Bath");

        double finalPrice = PriceCalculator.applyDiscount(grandTotal, 10);
        System.out.println("Total Price after 10% discount : " + finalPrice + " Bath");

        scanner.close();
    }
}