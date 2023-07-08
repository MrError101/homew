public class Main {
    public static void main (String...args){
        String text = "Ideal Husband";
        String text2 = "Beach";
        String text3 = text+text2;

        String text1 = "Hello";
        String text11 = "Hello2";
        String text4 = text1+text11;

        String text101 = "Error1";
        String text102 = "Error2";
        String text103 = text101+102;

        int number1 = 10;
        int number2 = 10;

        int number3 = number1+number2;

        String text01 = "Box1";
        String text02 = "Box2";
        String text03 = text01+text02;

        int number01 = 11;
        int number02 = 11;

        int number03 = number01+number02;

        String text001 = "Box1"+"Box2";

        int number001 = 11;
        int number002 = 11;
        int point1 = number001*number002;

        int number0001 = 11;
        int number0002 = 11;
        int point2 = number0001/number0001;

        int number00001 = 11;
        int number00002 = 11;
        int point3 = number00002-number00001;

        int number000001 = 11;
        int number000002 = 11;
        int point4 = number000001+number000002;

        String point10 = "number001"+"number002";
        String point20 = "number0001"+"number0002";
        String point30 = "number00002"+"number00001";
        String point40 = "number000001"+"number000002";
        String total = point10+point20+point30+point40;


        System.out.println(total);
        System.out.println(point4);
        System.out.println(point3);
        System.out.println(point2);
        System.out.println(point1);
        System.out.println(text001);
        System.out.println(text3+text4+text103+text03);
        System.out.println(number3+number03);
    }
}