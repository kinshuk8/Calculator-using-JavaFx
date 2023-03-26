module com.kinshuk.calculator.calculator {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.kinshuk.calculator.calculator to javafx.fxml;
    exports com.kinshuk.calculator.calculator;
}