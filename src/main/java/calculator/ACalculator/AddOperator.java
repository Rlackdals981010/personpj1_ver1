package calculator.ACalculator;

public class AddOperator  implements InterOperator {
    @Override
    public double operate(int a, int b) {
        return a+b;
    }
}
