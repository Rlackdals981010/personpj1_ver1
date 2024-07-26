package calculator;

public enum OperatorType {
    ADD('+'),SUB('-'),MUL('*'),DIV('/'),MOD('%'); //5가지 연산자 타입

    public char getSign() {
        return sign;
    }

    private final char sign; //열거형 상수가 갖는 문자 필드

    OperatorType(char sign){ //각 열거형 상수를 해당 기호 문자와 연결
        this.sign = sign;
    }

    public static OperatorType findType(char sign){
        for(OperatorType ot : OperatorType.values()){
            if(ot.getSign()==sign)
                return ot;
        }
        throw new IllegalArgumentException("잘못된 연산자 입니다.");
    }

}
