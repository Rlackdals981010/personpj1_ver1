package calculator.ACalculator;

public class ModOperator implements InterOperator<Double,Double> {

    @Override
    public Double operate(Double a, Double b) {
        double ret = 0;
        try{
            ret = a%(double)b;
        }
        catch(ArithmeticException e){
            System.out.println("0은 분모에 위치할 수 없습니다.");
        }
         return ret;
    }
}
