package ua.com.kpi.hellojava.views;

public class View {

    public static final String INPUT_HELLO = "Input \"Hello\": ";
    public static final String INPUT_JAVA = "Input \"Java!\": ";
    public static final String WRONG_INPUT = "Wrong input! Try once more :)";

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printResult(String result) {
        printMessage(String.format("Result: %s", result));
    }
}
