package controladores;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class loginController {
    @FXML
    private Button botonContrasena;

    @FXML
    private Button botonLog;

    @FXML
    private Button botonRegistrarse;

    @FXML
    private TextField contrasenaLog;

    @FXML
    private TextField correoLog;

    @FXML
    private void iniciarSesion() {}
    @FXML
    private void registrarse() {}
    @FXML
    private void recuperarContrasena() {}

    private void mostrarAlerta(String titulo, String mensaje, Alert.AlertType tipo){
        Alert alerta = new Alert(tipo);
        alerta.setTitle(titulo);
        alerta.setHeaderText(null);
        alerta.setContentText(mensaje);
        alerta.showAndWait();
    }
}
