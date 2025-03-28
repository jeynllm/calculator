import java.util.Scanner;
public class calculator {




        public static void main(String[] args) {
            try (Scanner sc = new Scanner(System.in)) {
                System.out.print("Enter two numbers: ");
                double a = sc.nextDouble(), b = sc.nextDouble();

                menu();
                int operation = sc.nextInt();

                switch (operation) {
                    case 1 -> System.out.println(a + " * " + b + " = " + multiply(a, b));
                    case 2 -> {
                        double div = divide(a, b);
                        if (b != 0) {
                            System.out.println(a + " / " + b + " = " + String.format("%.3f", div));
                        }
                    }
                    case 3 -> System.out.println(a + " - " + b + " = " + subtract(a, b));
                    case 4 -> System.out.println(a + " + " + b + " = " + add(a, b));
                    case 5 -> System.out.println(a + " % " + b + " = " + modulus(a, b));
                    case 6 -> {
                        System.out.print("Enter base and exponent: ");
                        double base = sc.nextDouble(), exponent = sc.nextDouble();
                        System.out.println(base + "^" + exponent + " = " + power(base, exponent));
                    }
                    case 7 -> {
                        System.out.print("Enter number for square root: ");
                        double num = sc.nextDouble();
                        System.out.println("√" + num + " = " + sqrt(num));
                    }
                    case 8 -> {
                        System.out.print("Enter number for absolute value: ");
                        double num = sc.nextDouble();
                        System.out.println("|" + num + "| = " + abs(num));
                    }
                    case 9 -> {
                        System.out.print("Enter number to round: ");
                        double num = sc.nextDouble();
                        System.out.println("Round(" + num + ") = " + round(num));
                    }
                    default -> System.out.println("Invalid operation.");
                }
            }
        }

        public static void menu() {
            System.out.print("""
                         Select an operation:
                         1- Multiplication
                         2- Division
                         3- Subtraction
                         4- Addition
                         5- Modulus
                         6- Power (base^exponent)
                         7- Square Root
                         8- Absolute Value
                         9- Round
                         Enter your choice: """);
        }

        public static double multiply(double a, double b) {
            return a * b;
        }

        public static double divide(double a, double b) {
            if (b == 0) {
                System.out.println("Error: Cannot divide by zero.");
                return 0;
            }
            return a / b;
        }

        public static double subtract(double a, double b) {
            return a - b;
        }

        public static double add(double a, double b) {
            return a + b;
        }

        public static double modulus(double a, double b) {
            return a % b;
        }

        public static double power(double base, double exponent) {
            return Math.pow(base, exponent);
        }

        public static double sqrt(double number) {
            if (number < 0) {
                System.out.println("Error: Cannot take the square root of a negative number.");
                return 0;
            }
            return Math.sqrt(number);
        }

        public static double abs(double number) {
            return Math.abs(number);
        }

        public static long round(double number) {
            return Math.round(number);
        }
    }

