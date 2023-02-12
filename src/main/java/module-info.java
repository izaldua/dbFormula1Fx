module com.example.dbformula1fx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.dbformula1fx to javafx.fxml;
    exports com.example.dbformula1fx;
}