import java.util.Scanner;

enum Operation {

    PLUS("+") {
        @Override
        public double apply(double a, double b) {
            return a + b;
        }
    },
    MINUS("-") {
        @Override
        public double apply(double a, double b) {
            return a - b;
        }
    },
    MULTIPLY("*") {
        @Override
        public double apply(double a, double b) {
            return a * b;
        }
    },
    DIVIDE("/") {
        @Override
        public double apply(double a, double b) {
            if (b == 0) {
                System.out.println("Нөлгө бөлүүгө болбойт!");
                return 0;
            }
            return a / b;
        }
    };

    private String symbol;

    Operation(String symbol) {
        this.symbol = symbol;
    }

    public abstract double apply(double a, double b);


    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
}

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Биринчи санды киргизиңиз: ");
        double a = scanner.nextDouble();

        System.out.print("Экинчи санды киргизиңиз: ");
        double b = scanner.nextDouble();

        System.out.println("\nЖыйынтык:");

        for (Operation op : Operation.values()) {
            double result = op.apply(a, b);
            System.out.println(a + " " + op.getSymbol() + " " + b + " = " + result);
        }

        scanner.close();
    }
}