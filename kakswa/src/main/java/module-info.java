module org.example.kakswa {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens org.example.kakswa to javafx.fxml;
    exports org.example.kakswa;
}