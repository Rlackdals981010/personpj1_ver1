package calculator;

import java.util.*;

public class Calculator {

    private ArrayList<Integer> arr = new ArrayList<>();

    public ArrayList<Integer> getArr() {
        return arr;
    }

    public void setArr(int ret) {
        this.arr.add(ret);
    }


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

    public void removeResult(){
        this.arr.remove(0);
    }

    public void inquiryResults(){
        for(int val: this.arr)
            System.out.print(val+" ");
        System.out.println();
    }
}
