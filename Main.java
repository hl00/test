import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("欢迎使用简单计算器！");
        System.out.println("请输入操作（add, subtract, multiply, divide）:");
        String operation = scanner.nextLine();

        System.out.println("请输入第一个数字:");
        double num1 = scanner.nextDouble();

        System.out.println("请输入第二个数字:");
        double num2 = scanner.nextDouble();

        try {
            double result;
            switch (operation.toLowerCase()) {
                case "add":
                    result = calculator.add(num1, num2);
                    break;
                case "subtract":
                    result = calculator.subtract(num1, num2);
                    break;
                case "multiply":
                    result = calculator.multiply(num1, num2);
                    break;
                case "divide":
                    result = calculator.divide(num1, num2);
                    break;
                default:
                    System.out.println("无效的操作！");
                    return;
            }
            System.out.println("结果是: " + result);
        } catch (ArithmeticException e) {
            System.out.println("错误: " + e.getMessage());
        }

        scanner.close();
    }
}
