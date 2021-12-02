module com.demos.gridpane {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.demos.gridpane to javafx.controls, javafx.fxml;
    exports com.demos.gridpane;
}