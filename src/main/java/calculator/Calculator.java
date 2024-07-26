package calculator;

import calculator.ACalculator.*;

import java.util.*;

public class Calculator {

    private final ArrayList<Double> arr;


    public Calculator(){
        this.arr = new ArrayList<>();
    }

    public ArrayList<Double> getArr() {
        return arr;
    }

    public void setArr(Double ret) {
        this.arr.add(ret);
    }

    public void removeResult(){
        this.arr.remove(0);
    }

    public void inquiryResults(){
        for(Double val: this.arr)
            System.out.print(val+" ");
        System.out.println();
    }




}
