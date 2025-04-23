package org.example.kakswa;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application! anjing");
    }

    @FXML
    protected void onClearButtonClick(){
        welcomeText.setText("");
    }

    @FXML
    protected void onDontolButtonClick(){welcomeText.setText("dontol");}
}
