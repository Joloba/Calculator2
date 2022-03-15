package Calculator;

import java.util.InputMismatchException;

public class Calculator {

    public int calculated (int num1, int num2, char operation) {
        int res = 0;
        switch (operation) {
            case '+':
                res = num1 + num2;
                break;
            case '-':
                res = num1 - num2;
                break;
            case '*':
                res = num1 * num2;
                break;
            case '/':
                try {
                    res = num1 / num2;
                } catch (ArithmeticException | InputMismatchException e) {
                    System.out.println("Exception : " + e);
                    System.out.println("На 0 делить нельзя");
                    break;
                }
            default:
                throw new IllegalArgumentException("Не верный знак операции");
        }
        return res;
    }

}
