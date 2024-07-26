package calculator;

import java.io.*;

public class App  {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArithmeticCalculator cal = new ArithmeticCalculator();
    static CircleCalculator cir_cal = new CircleCalculator();

    static String command; // remove, inquiry, exit 객체

    public static void main(String[] args)throws Exception  {
        command = "play";
        while(!command.equals("exit")){

            System.out.println("사칙연산 계산기 1 | 원 넓이 계산기 2");
            command = br.readLine();
            if(command.equals("1")){
                callAC();
            }
            else if(command.equals("2")){
                callCA();
            }
            else{
                throw new IllegalArgumentException("해당 문자는 연산자가 아닙니다: " );
            }

            System.out.println("계속 하시겠습니까? (exit 입력 시 종료)");
            command=br.readLine();
        }

    }

    static void callAC() throws Exception{
        double a,b;
        char sign;
        System.out.print("첫 번째 숫자를 입력하세요: ");
        a=Integer.parseInt(br.readLine());
        System.out.print("두 번째 숫자를 입력하세요: ");
        b=Integer.parseInt(br.readLine());
        System.out.print("사칙연산 기호를 입력하세요: ");
        sign=br.readLine().charAt(0);

        double ret = cal.calculate(a, b, sign);

        System.out.println("결과:"+ret);
        cal.setArr(ret);

        System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
        command=br.readLine();
        if(command.equals("remove")) cal.removeResult();

        System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
        command=br.readLine();
        if(command.equals("inquiry")) {
            cal.inquiryResults();
        }
    }

    static void callCA() throws Exception{
        int r;
        System.out.print("반지름을 입력하세요: ");
        r=Integer.parseInt(br.readLine());

        double ret = cir_cal.calculate(r);

        System.out.println("결과:"+ret);
        cir_cal.setArr(ret);

        System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
        command=br.readLine();
        if(command.equals("remove")) cir_cal.removeResult();

        System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
        command=br.readLine();
        if(command.equals("inquiry")) {
            cir_cal.inquiryResults();
        }
    }
}
