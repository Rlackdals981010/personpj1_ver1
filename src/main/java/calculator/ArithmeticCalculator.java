package calculator;

public class ArithmeticCalculator extends Calculator {

    public int calculate(int a,int b, char sign)throws Exception{
        int ret=0;
        switch (sign){
            case '+':
                ret=a+b;
                break;
            case '-':
                ret=a-b;
                break;
            case '*':
                ret=a*b;
                break;
            case '/':
                try{
                    ret = a/b;
                }
                catch (ArithmeticException e){
                    System.out.println("0은 분모에 위치할 수 없습니다.");
                }
                break;
        }
        return ret;
    }
}
