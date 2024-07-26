package calculator.ACalculator;

public class MultiplyOperator implements InterOperator<Double,Double> {
    @Override
    public Double operate(Double a, Double b) {
        return a*b;
    }
}
