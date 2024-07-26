package calculator.ACalculator;

public class SubtractOperator  implements InterOperator {
    @Override
    public double operate(int a, int b) {
        return a-b;
    }
}
