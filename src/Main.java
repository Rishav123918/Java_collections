public class Main {

    public static void method1() {
        throw new ArithmeticException();
    }

    public static void main(String[] args) throws ClassNotFoundException {
        try {
            method1();
        }catch(Exception e){

        }
    }

}