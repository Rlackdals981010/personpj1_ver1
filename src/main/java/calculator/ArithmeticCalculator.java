package calculator;

import calculator.ACalculator.*;

public class ArithmeticCalculator extends Calculator {

    InterOperator add;
    InterOperator sub;
    InterOperator div;
    InterOperator mul;
    InterOperator mod;

    public ArithmeticCalculator(){

        this.add = new AddOperator();
        this.sub = new SubtractOperator();
        this.div = new DivideOperator();
        this.mul = new MultiplyOperator();
        this.mod = new ModOperator();
    }

    public double calculate(int a,int b, char sign){
        return calculate(a,b,OperatorType.findType(sign));
    }

    public double calculate(int a,int b, OperatorType ot) {
        double ret = switch (ot) {
            case ADD -> add.operate(a, b);
            case SUB -> sub.operate(a, b);
            case MUL -> mul.operate(a, b);
            case DIV -> div.operate(a, b);
            case MOD -> mod.operate(a, b);
        };
        return ret;
    }
}
