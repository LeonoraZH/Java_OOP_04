public class Task {
    public static <T> void printElement(T element) {
        System.out.println(element);
    }

    public static void main(String[] args) {
        Integer integerElement = 42;
        printElement(integerElement);

        String stringElement = "Hello, World!";
        printElement(stringElement);

        Double doubleElement = 3.14;
        printElement(doubleElement);
    }
}
