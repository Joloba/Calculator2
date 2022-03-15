package Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        DataReader reader = new DataReader();
        Calculator calc = new Calculator();
        System.out.println("Введите выражение из 2 целых чисел или из двух римских чисел от I до X: ");
        String text = scanner.nextLine();
        reader.check(text);
        reader.read(text);
        int num1 = reader.getNum1();
        int num2 = reader.getNum2();
        char operation = reader.getOperation();
        int res = calc.calculated(num1, num2, operation);
        String result = reader.convertToRoman(res);

        if (reader.isFlag()) {
            result = String.valueOf(res);
        }

        System.out.println(result);


    }
}
