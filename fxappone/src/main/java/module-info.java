module com.demos.fxappone {
    requires javafx.controls;

    opens com.demos.fxappone to javafx.controls;
    exports com.demos.fxappone;
}