package controladores;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

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
    private void iniciarSesion() {
        String correo = correoLog.getText();
        String contrasena = contrasenaLog.getText();
        // Aqui comprobamos que los campos email y contraseña contengan informacion
        if(correo.isEmpty() || contrasena.isEmpty()){
            mostrarAlerta("Ciclismo", "Debe llenar todos los campos", Alert.AlertType.ERROR);
            return;
        }
        if(correo.equals("admin") && contrasena.equals("admin")){
            mostrarAlerta("Ciclismo","Has iniciado sesion correctamente", Alert.AlertType.INFORMATION);
            try {
                // Cargar el archivo FXML
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/clases/vistas/home.fxml"));
                Parent root = loader.load();

                // Obtener la escena actual
                Scene scene = new Scene(root);

                // Obtener el escenario (ventana) actual y cambiar la escena
                Stage stage = (Stage) correoLog.getScene().getWindow();
                stage.setScene(scene);
                stage.show();  // Mostrar la nueva ventana

            } catch (IOException e) {
                e.printStackTrace();
                mostrarAlerta("Error", "No se pudo cargar la nueva ventana.", Alert.AlertType.ERROR);
            }
        }else{
            mostrarAlerta("Ciclismo", "Correo o contraseña incorrectos", Alert.AlertType.ERROR);
        }

    }
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
