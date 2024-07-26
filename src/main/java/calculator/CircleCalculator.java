package calculator;

public class CircleCalculator extends Calculator{

    static final double PI =3.14;

    public double calculate(int r){
        return Math.pow(r,2)*PI;
    }

}
