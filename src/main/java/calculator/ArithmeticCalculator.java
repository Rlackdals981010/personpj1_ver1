package calculator;

import calculator.ACalculator.*;

public class ArithmeticCalculator<T> extends Calculator {

    private final InterOperator<Double, Double> add;
    private final InterOperator<Double, Double> sub;
    private final InterOperator<Double, Double> div;
    private final InterOperator<Double, Double> mul;
    private final InterOperator<Double, Double> mod;

    public ArithmeticCalculator(){

        this.add = new AddOperator();
        this.sub = new SubtractOperator();
        this.div = new DivideOperator();
        this.mul = new MultiplyOperator();
        this.mod = new ModOperator();
    }

    public Double calculate(Double a,Double b, char sign){
        return calculate(a,b,OperatorType.findType(sign));
    }

    public Double calculate(Double a,Double b, OperatorType ot) {
         return  switch (ot) {
            case ADD -> add.operate(a, b);
            case SUB -> sub.operate(a, b);
            case MUL -> mul.operate(a, b);
            case DIV -> div.operate(a, b);
            case MOD -> mod.operate(a, b);
        };
    }
}
