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

    public int calculate(int a,int b, char sign) {
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
            case '%':
                ret = mod.operate(a, b);
                break;
            default:
                System.out.println("해당 문자는 연산자가 아닙니다.");
        }
        return ret;
    }
}
