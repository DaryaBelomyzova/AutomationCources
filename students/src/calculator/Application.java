package calculator;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        float number1, number2, result;
        do {
            System.out.println("Enter two numbers: ");

            Scanner sc = new Scanner(System.in);
            number1 = sc.nextFloat();
            number2 = sc.nextFloat();

            System.out.println("1.Addition\n2.Subtract\nEnter a choice number: ");
            int choice;
            choice = sc.nextInt();
            switch(choice) {
                case 1: {
                    result = add(number1, number2);
                    System.out.println("Addition is " + result);
                    break;
                }
                case 2: {
                    result = sub(number1, number2);
                    System.out.println(2
                            "Subtraction is " + result);
                    break;
                }

            }
        } while (true);

    }


    public static float add(float a, float b){
        return a + b;
    }
    public static float sub(float a, float b){
        return a - b;
    }
    }
