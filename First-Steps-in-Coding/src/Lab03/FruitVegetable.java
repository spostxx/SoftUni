package Lab03;

import java.util.Scanner;

public class FruitVegetable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();

        if (product.equals("banana")  || product.equals ("apple") || product.equals ("kiwi") || product.equals ("cherry") || product.equals ("lemon") || product.equals ("grapes")) {
            System.out.printf("fruit");
        } else if (product.equals ("tomato") || product.equals ("cucumber") || product.equals ("pepper") || product.equals( "carrot")) {
            System.out.printf("vegetable");
        } else {
            System.out.printf("unknown");
        }
    }
}
