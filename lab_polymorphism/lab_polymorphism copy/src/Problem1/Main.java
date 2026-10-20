package Problem1;

public class Main {
    public static void main(String[] args) {
            Movie a = new Movie(1, "title1", 2021);
            Movie b = new Movie(1, "title2", 2021);

            if (a.equalsTo(b)) {
                    System.out.print("Both movies are equal");
                    System.out.print("\n");
            } else {
                    System.out.print("Both movies are not equal");
                    System.out.print("\n");
            }

            Action c = new Action(3, "tite3", 2021);

            // Late fee calculation
            System.out.print(c.calcLateFee(5));
            System.out.print("\n");

    }
}