package calculator;

import java.io.*;
import java.util.*;

public class App {

    public static void main(String[] args)throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a,b,ret=0; // idx 삭제
        char sign;
        String command;

        ArrayList<Integer> arr = new ArrayList<>(); // 배열-> 리스트로 교체, 순서 존재해서 ArrayList

        while(true){

            System.out.print("첫 번째 숫자를 입력하세요: ");
            a=Integer.parseInt(br.readLine());
            System.out.print("두 번째 숫자를 입력하세요: ");
            b=Integer.parseInt(br.readLine());
            System.out.print("사칙연산 기호를 입력하세요: ");
            sign=br.readLine().charAt(0);

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

            System.out.println("결과:"+ret);
            arr.add(ret);

            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            command=br.readLine();
            if(command.equals("remove")) arr.remove(0);

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            command=br.readLine();
            if(command.equals("inquiry")) {
                for(int val : arr)
                    System.out.print(val+" ");
                System.out.println();
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            command=br.readLine();
            if(command.equals("exit"))break;
        }

    }
}
