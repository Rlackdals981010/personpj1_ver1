package calculator.ACalculator;

public class AddOperator  implements InterOperator<Double, Double> {
    @Override
    public Double operate(Double a, Double b) {
        return a+b;
    }
}
