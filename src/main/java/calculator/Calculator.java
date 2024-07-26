package calculator;



import java.util.*;

public class Calculator<T> {

    private final ArrayList<T> arr;


    public Calculator(){
        this.arr = new ArrayList<>();
    }

    public ArrayList<T> getArr() {
        return arr;
    }

    public void setArr(T ret) {
        this.arr.add(ret);
    }

    public void removeResult(){
        this.arr.remove(0);
    }

    public void inquiryResults(){
        for(T val: this.arr)
            System.out.print(val+" ");
        System.out.println();
    }




}
