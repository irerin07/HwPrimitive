public class PrimitiveMain {

    public static void main(String[] args) {
        Primitives pt = new Primitives();
        pt.bool();
        pt.boolTest(5, 9);
        pt.boolTest(7, 7);

        pt.charTest();
        char a = 'a';
        //char a1 = 'ab'; char는 한글자만 표현 할 수 있다.
        char a2 = 65535;
        pt.byteTest();
        byte b = 127;
        pt.shortTest();
        short s = 32767;
        pt.intTest();
        int i = 2147483647;
        pt.longTest();
        long l = 9223372034854775807L;
        pt.floatTest();
        float f = 3.54f;
        pt.doubleTest();
        double d = 23.5;

        System.out.println("정수형과 실수형의 범위를 살펴보면 음의 값이 양의 값보다 1이 큰 것을 알 수 있다.  \n이와 같은 현상은 음의 값은 -1에서부터 시작하지만 양의 값의 시작은 1이 아닌 0에서부터 시작하기 때문이다." );


    }

}
