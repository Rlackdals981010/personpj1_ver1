package calculator.ACalculator;

public class DivideOperator  implements InterOperator  {
    public double operate(int a, int b) {
        double ret=0;
        try{
            ret=a/(double)b;
        }
        catch (ArithmeticException e){
            System.out.println("0은 분모에 위치할 수 없습니다.");
        }
        return ret;
    }
}
