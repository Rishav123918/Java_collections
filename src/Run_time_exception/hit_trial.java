package Run_time_exception;

public class hit_trial {
    public static void main(String[] args) {
        System.out.println("Starting Runtime Exception Demo...\n");

        handleNullPointerException();
        handleArrayIndexOutOfBoundsException();
        handleClassCastException();
        handleNumberFormatException();
        handleArithmeticException();
        handleIllegalStateException();
        System.out.println("\nProgram completed without crashing.");
    }

    // 1. NullPointerException
    private static void handleNullPointerException() {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    // 2. ArrayIndexOutOfBoundsException
    private static void handleArrayIndexOutOfBoundsException() {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    // 3. ClassCastException
    private static void handleClassCastException() {
        try {
            Object obj = "Java";
            Integer num = (Integer) obj; // Invalid cast
        } catch (ClassCastException e) {
            System.out.println("Caught ClassCastException: " + e.getMessage());
        }
    }

    // 4. NumberFormatException
    private static void handleNumberFormatException() {
        try {
            String input = "abc123";
            int number = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        }
    }

    // 5. ArithmeticException
    private static void handleArithmeticException() {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }
    }

    // 6. IllegalStateException
    private static void handleIllegalStateException() {
        try {
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            scanner.close();
            scanner.nextLine(); // IllegalStateException: Scanner closed
        } catch (IllegalStateException e) {
            System.out.println("Caught IllegalStateException: " + e.getMessage());
        }
    }
}
