package com.mycompany.ds;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class PrimaryController {

    @FXML
    private Pane fondo;
    @FXML
    private Button amariilo;
    @FXML
    private Button azul;
    @FXML
    private Button rojo;
    @FXML
    private void cambiarAmarillo(MouseEvent event) {
        fondo.setBackground(new Background(new BackgroundFill(Color.YELLOW, CornerRadii.EMPTY, Insets.EMPTY)));
        System.out.println("Se cambio el color a amarillo");
    }

    @FXML
    private void cambiarAzul(MouseEvent event) {
        fondo.setBackground(new Background(new BackgroundFill(Color.BLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        System.out.println("Se cambio el color a azul");
    }
    

    @FXML
    private void cambiarRojo(MouseEvent event) {
        fondo.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
        System.out.println("Secambio el color a rojo");
    }
}
