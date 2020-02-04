package ua.com.kpi.hellojava;

import ua.com.kpi.hellojava.controllers.Controller;
import ua.com.kpi.hellojava.models.Model;
import ua.com.kpi.hellojava.views.View;

public class Main {

    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        controller.processUser();
    }
}
