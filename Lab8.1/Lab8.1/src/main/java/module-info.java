module ru.vorotov.simulationslab81 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.vorotov.simulationslab81 to javafx.fxml;
    exports ru.vorotov.simulationslab81;
}