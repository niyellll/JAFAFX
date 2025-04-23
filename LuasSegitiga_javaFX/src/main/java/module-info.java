module org.example.luassegitiga_javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.luassegitiga_javafx to javafx.fxml;
    exports org.example.luassegitiga_javafx;
}