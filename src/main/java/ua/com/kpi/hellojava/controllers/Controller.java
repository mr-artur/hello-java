package ua.com.kpi.hellojava.controllers;

import ua.com.kpi.hellojava.models.Model;
import ua.com.kpi.hellojava.views.View;

import java.util.Scanner;

public class Controller {

    public static final String PATTERN_HELLO = "Hello";
    public static final String PATTERN_JAVA = "Java!";

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner scanner = new Scanner(System.in);

        view.printMessage(View.INPUT_HELLO);
        String firstWord = getData(scanner, PATTERN_HELLO);
        model.setFirstWord(firstWord);

        view.printMessage(View.INPUT_JAVA);
        String secondWord = getData(scanner, PATTERN_JAVA);
        model.setSecondWord(secondWord);

        view.printResult(model.buildMessage());
    }

    private String getData(Scanner scanner, String pattern) {
        while (!scanner.hasNext(pattern)) {
            view.printMessage(View.WRONG_INPUT);
            scanner.next();
        }
        return scanner.next();
    }
}
