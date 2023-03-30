package org.example;

import BussinesLogic.Controller;
import GraphicalUserInterface.View;

public class Main {
    public static void main(String[] args) {
        View calcView = new View();
        Controller controller = new Controller(calcView);
        calcView.setVisible(true);

    }
}