package calculator;

import calculator.ACalculator.*;

public class ArithmeticCalculator extends Calculator {

    AddOperator add;
    SubtractOperator sub;
    DivideOperator div;
    MultiplyOperator mul;

    public ArithmeticCalculator(){
        this.add = new AddOperator();
        this.sub = new SubtractOperator();
        this.div = new DivideOperator();
        this.mul = new MultiplyOperator();
    }

    public int calculate(int a,int b, char sign) throws Exception {
        int ret=0;
        switch (sign){
            case '+':
                ret=add.operate(a, b);
                break;
            case '-':
                ret=sub.operate(a, b);
                break;
            case '*':
                ret=mul.operate(a, b);
                break;
            case '/':
                ret=div.operate(a, b);
                break;
        }
        return ret;
    }
}
