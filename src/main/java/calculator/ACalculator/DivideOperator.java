package calculator.ACalculator;

public class DivideOperator {
    public int operate(int a, int b)throws Exception {
        int ret=0;
        try{
            ret=a/b;
        }
        catch (ArithmeticException e){
            System.out.println("0은 분모에 위치할 수 없습니다.");
        }
        return ret;
    }
}
