public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        CauseClassDataShouldBePrivate1 causeClassDataShouldBePrivate1 = new CauseClassDataShouldBePrivate1();
        causeClassDataShouldBePrivate1.nonPrivate = 123;
        CauseClassDataShouldBePrivate2 causeClassDataShouldBePrivate2 = new CauseClassDataShouldBePrivate2();
        causeClassDataShouldBePrivate2.nonPrivate = 123;
    }
}
