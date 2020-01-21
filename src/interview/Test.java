package interview;

public class Test {

    public static void main(String[] args) {
        test1();
       // test2();
       // test3();
    }

    public static void test1(){
        CaiNiaoInternational1 international1 = new CaiNiaoInternational1();
        international1.filterCharAppearMost("fxbfxbfxbfffbbbxxxffsadlfadf");
    }

    public static void test2(){
        CaiNiaoInternational2 international2 = new CaiNiaoInternational2();
        System.out.println("n is 1: result: " + international2.getNumber(1));
        System.out.println("n is 2: result: " + international2.getNumber(2));
        System.out.println("n is 30: result: " + international2.getNumber(30));
    }

    public static void test3(){
        CaiNiaoInternational3 international3 = new CaiNiaoInternational3();
        international3.sortArray(1000);
    }

}
