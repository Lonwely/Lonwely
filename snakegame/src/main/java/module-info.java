module com.lonwely {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.lonwely to javafx.fxml;
    exports com.lonwely;
}
