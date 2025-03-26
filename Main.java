import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("欢迎使用简单计算器！");
        System.out.println("请输入操作（add, subtract, multiply, divide, modulus, power, sqrt）:");
        String operation = scanner.nextLine();

        double num1, num2, result;
        try {
            switch (operation.toLowerCase()) {
                case "add":
                case "subtract":
                case "multiply":
                case "divide":
                case "modulus":
                case "power":
                    System.out.println("请输入第一个数字:");
                    num1 = scanner.nextDouble();
                    System.out.println("请输入第二个数字:");
                    num2 = scanner.nextDouble();
                    result = switch (operation) {
                        case "add" -> calculator.add(num1, num2);
                        case "subtract" -> calculator.subtract(num1, num2);
                        case "multiply" -> calculator.multiply(num1, num2);
                        case "divide" -> calculator.divide(num1, num2);
                        case "modulus" -> calculator.modulus(num1, num2);
                        case "power" -> calculator.power(num1, num2);
                        default -> 0; // 不会到达这里
                    };
                    break;
                case "sqrt":
                    System.out.println("请输入一个数字:");
                    num1 = scanner.nextDouble();
                    result = calculator.sqrt(num1);
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
