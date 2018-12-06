public class Primitives {

    public void bool() {
        System.out.println("boolean은 논리형. 크기는 1byte이며 표현 범위는 true or false로 0과 1이 아니다.");

    }
    public void boolTest(int a, int b) {

        System.out.println("정수 " + a +" 은/는 " + "정수 " + b + " 과/와 같습니까? " + (a == b));

    }
    public void charTest() {
        // TODO Auto-generated method stub
        System.out.println("char는 문자형과 정수형. 크기는 2byte이며 문자형은 작은 따옴표를 사용하여 한글자를 표현 할 수 있다. ");
        System.out.println("정수형은 0에서 65,535까지 표현 할 수 있다.");

    }
    public void byteTest() {
        // TODO Auto-generated method stub
        System.out.println("byte는 정수형. 크기는 2byte이며 표현 할 수 있는 정수의 범위는 -32768에서 32767이다.");

    }
    public void shortTest() {
        // TODO Auto-generated method stub
        System.out.println("short는 정수형. 크기는 2byte이며 표현 할 수 있는 정수의 범위는 -32768에서 32767이다.");

    }
    public void intTest() {
        // TODO Auto-generated method stub
        System.out.println("int는 정수형. 크기는 4byte이며 표현 할 수 있는 정수의 범위는 -2147483648에서 2147483647이다.");

    }
    public void longTest() {
        // TODO Auto-generated method stub
        System.out.println("long은 정수형. 크기는 8byte이며 표현 할 수 있는 정수의 범위는 -9,223,372,036,854,775,808 에서 9,223,372,036,854,775,807 이다. 마지막에 l을 붙여주어야 한다.");
        System.out.println("long 예시 : long big = 345l;");

    }
    public void floatTest() {
        // TODO Auto-generated method stub
        System.out.println("float는 실수형. 크기는 4byte이며 표현 할 수 있는 정수의 범위는 -3.4E+38 에서 +3.4E+38이다. 마지막에 f를 붙여주어야 한다.");
        System.out.println("float 예시 : float f = 23.5f;");

    }
    public void doubleTest() {
        // TODO Auto-generated method stub
        System.out.println("double은 정수형. 크기는 2byte이며 표현 할 수 있는 정수의 범위는 -1.7E+308에서 1.7E+308이다.");

    }

}
