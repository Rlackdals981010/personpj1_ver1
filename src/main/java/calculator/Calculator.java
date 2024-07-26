package calculator;

import java.util.*;

public class Calculator {

    static final double PI =3.14;

    private ArrayList<Integer> arr;

    private ArrayList<Double> cir_arr;

    public Calculator(){
        this.arr = new ArrayList<>();
        this.cir_arr = new ArrayList<>();
    }

    public ArrayList<Integer> getArr() {
        return arr;
    }

    public void setArr(int ret) {
        this.arr.add(ret);
    }

    public ArrayList<Double> getCir_arr() {
        return cir_arr;
    }

    public void setCir_arr(double ret) {
        this.cir_arr.add(ret);
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

    public double calculateCircleArea(int r){
        return Math.pow(r,2)*PI;
    }

    public void removeCirResult(){
        this.cir_arr.remove(0);
    }

    public void inquiryCirResults(){
        for(double val: this.cir_arr)
            System.out.print(val+" ");
        System.out.println();
    }

}
