package org.example.luassegitiga_javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SegitigaController {

    @FXML
    private Button btnClose;

    @FXML
    private Label btnHasil;

    @FXML
    private Button btnLuas;

    @FXML
    private TextField txtAlas;

    @FXML
    private TextField txtTinggi;

    @FXML
    private Label welcomeText;


    @FXML
    protected void onCloseClick(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    protected void onLuasClick(ActionEvent event) {
        double alas = Double.parseDouble(txtAlas.getText());
        double tinggi = Double.parseDouble(txtTinggi.getText());

        double luas = 0.5 * alas * tinggi;

        btnHasil.setText(String.valueOf(luas));
    }

}


