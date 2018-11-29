import java.util.Scanner;

public class Income {
    private static final double taxBasic = .13;
    private static final double taxExtra = .6;
    private static final double taxReward = .34;

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        do {
            System.out.print("Enter basic income: ");
            var sumBasic = scanner.nextFloat();
            System.out.print("Enter extra income: ");
            var sumExtra = scanner.nextFloat();
            System.out.print("Enter reward income: ");
            var sumReward = scanner.nextFloat();

            var totalTaxes =
                    sumBasic * taxBasic
                    + sumExtra * taxExtra
                    + sumReward * taxReward;

            System.out.println("Total taxes: " + totalTaxes);
        }
        while (true);
    }
}