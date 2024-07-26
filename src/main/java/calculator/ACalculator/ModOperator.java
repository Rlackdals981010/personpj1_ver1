package calculator.ACalculator;

public class ModOperator implements InterOperator{

    @Override
    public int operate(int a, int b) {
        int ret = 0;
        try{
            ret = a%b;
        }
        catch(ArithmeticException e){
            System.out.println("0은 분모에 위치할 수 없습니다.");
        }
         return ret;
    }
}
