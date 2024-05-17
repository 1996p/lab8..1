package ru.vorotov.simulationslab81;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.Random;

public class HelloController {
    @FXML
    private Label answer;
    private final double p = 0.8;

    @FXML
    protected void onHelloButtonClick() {
        Random random = new Random();

        var a = random.nextDouble();

        if (a < p) {
            answer.setText("Да");
        } else {
            answer.setText("Нет");
        }
    }
}