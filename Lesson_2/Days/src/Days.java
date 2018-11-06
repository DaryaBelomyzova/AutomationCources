import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        do {
            System.out.println("Enter the number of the day:");
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
            System.out.println("The day is: ");


            if (number >= 1 && number <= 7) {
                if (number <= 3) {
                    if (number >= 2) {
                        if (number == 2) {
                            System.out.println("вторник");
                        } else {
                            System.out.println("среда");
                        }
                    } else {
                        System.out.println("понедельник");
                    }
                } else {
                    if (number <= 5) {
                        if (number == 4) {
                            System.out.println("четверг");
                        } else {
                            System.out.print("пятница");
                        }
                    } else {
                        if (number == 6) {
                            System.out.println("суббота");
                        } else {
                            System.out.println("воскресенье");
                        }
                    }
                }

            } else {
                System.out.println("такого дня недели не существует");
            }

        } while (true);

    }
}