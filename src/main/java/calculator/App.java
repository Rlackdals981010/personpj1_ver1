package calculator;

import java.io.*;

public class App {

    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a,b;
        char sign;
        System.out.print("첫 번째 숫자를 입력하세요: ");
        a=Integer.parseInt(br.readLine());
        System.out.print("두 번째 숫자를 입력하세요: ");
        b=Integer.parseInt(br.readLine());
        System.out.print("사칙연산 기호를 입력하세요: ");
        sign=br.readLine().charAt(0);
    }
}
