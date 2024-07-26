package calculator.ACalculator;

public class AddOperator  implements InterOperator {
    @Override
    public int operate(int a, int b) {
        return a+b;
    }
}
