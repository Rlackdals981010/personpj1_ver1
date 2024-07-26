package calculator;

import java.util.*;

public class Calculator {
    ArrayList<Integer> arr = new ArrayList<>();

    public int calculate(int a,int b, char sign){
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
                if(b==0) System.out.println("0은 분모로 사용될 수 없다.");
                else ret=a/b;
                break;
        }
        return ret;
    }
}
