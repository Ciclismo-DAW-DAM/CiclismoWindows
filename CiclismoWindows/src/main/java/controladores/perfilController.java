package controladores;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import javafx.scene.image.ImageView;
import java.awt.*;
import java.io.IOException;
import javafx.scene.image.Image;

public class perfilController {
    @FXML
    private Button actualizarDatos;

    @FXML
    private ImageView imagenPerfil;

    @FXML
    private TextField urlImagen;

    @FXML
    private TextField carrerasParticipadas;

    @FXML
    private TextField categoríapref;

    @FXML
    private Button cerrarSesion;

    @FXML
    private Button confirmarBoton;

    @FXML
    private StackPane contenedorImagen;

    private Circle circle;

    @FXML
    private TextField confirmarNuevaPasswd;

    @FXML
    private TextField confirmarNuevoNombre;

    @FXML
    private Button eliminarUsuario;

    @FXML
    private Button homePerfil;

    @FXML
    private TextField kmRecorridos;

    @FXML
    private TextField nuevaPsswd;

    @FXML
    private Pane formulario;

    @FXML
    private TextField nuevoNombre;

    @FXML
    private TextField totalPagado;

    @FXML
    private TextField ubicacionPreferida;

    @FXML
    private TextField vecesGanadas;

    @FXML
    private void initialize() {
        // Configurar estado inicial
        disableFormulario(true);
        confirmarBoton.setDisable(true);

        // Configurar eventos de botones
        configurarEventos();

        // Crear el círculo y configurarlo
        circle = new Circle(50);
        circle.setStroke(javafx.scene.paint.Color.BLACK);

        // Agregar el círculo al contenedor
        contenedorImagen.getChildren().add(circle);

        // Configurar evento de actualización de imagen
        urlImagen.setOnAction(event -> actualizarImagen());


        homePerfil.setCursor(javafx.scene.Cursor.HAND);
        eliminarUsuario.setCursor(javafx.scene.Cursor.HAND);
        confirmarBoton.setCursor(javafx.scene.Cursor.HAND);
        actualizarDatos.setCursor(javafx.scene.Cursor.HAND);
        cerrarSesion.setCursor(javafx.scene.Cursor.HAND);
    }

    private void actualizarImagen() {
        String url = urlImagen.getText();
        if (url != null && !url.trim().isEmpty()) {
            try {
                Image image = new Image(url, false);
                circle.setFill(new ImagePattern(image)); // Asignar imagen al círculo
            } catch (Exception e) {
                System.out.println("Error al cargar la imagen: " + e.getMessage());
            }
        }
    }

    /**
     * Configura los eventos para los botones que controlan el formulario
     */
    private void configurarEventos() {
        // Evento para el botón Actualizar datos
        actualizarDatos.setOnAction(event -> {
            // Habilitar el formulario y desactivar el resto
            disableFormulario(false);
            confirmarBoton.setDisable(false);

            // Desactivar otros elementos
            actualizarDatos.setDisable(true);
            eliminarUsuario.setDisable(true);
            cerrarSesion.setDisable(true);
            homePerfil.setDisable(true);

            // Desactivar campos de estadísticas
            disableStatsFields(true);
        });

        // Evento para el botón Confirmar
        confirmarBoton.setOnAction(event -> {
            // Guardar los cambios (llamar a tu metodo cambiarContrasena)
            cambiarContrasena();

            // Deshabilitar el formulario
            disableFormulario(true);
            confirmarBoton.setDisable(true);

            // Reactivar otros elementos
            actualizarDatos.setDisable(false);
            eliminarUsuario.setDisable(false);
            cerrarSesion.setDisable(false);
            homePerfil.setDisable(false);

            // Reactivar campos de estadísticas
            disableStatsFields(false);
        });
    }

    /**
     * Deshabilita o habilita el formulario y aplica efectos visuales
     * @param disable true para deshabilitar, false para habilitar
     */
    private void disableFormulario(boolean disable) {
        // Cambiar apariencia visual (grisáceo cuando está deshabilitado)
        if (disable) {
            // Aplicar efecto grisáceo cuando está deshabilitado
            formulario.setStyle("-fx-opacity: 0.6; -fx-background-color: rgba(128, 128, 128, 0.2);-fx-border-color: #00ffaa; -fx-border-width: 2px; -fx-border-radius: 5px;");
        } else {
            // Restaurar apariencia normal cuando está habilitado
            formulario.setStyle("-fx-opacity: 1.0; -fx-background-color: transparent;-fx-border-color: #00ffaa; -fx-border-width: 2px; -fx-border-radius: 5px;");
        }

        // Deshabilitar/habilitar todos los campos del formulario
        nuevoNombre.setDisable(disable);
        confirmarNuevoNombre.setDisable(disable);
        nuevaPsswd.setDisable(disable);
        confirmarNuevaPasswd.setDisable(disable);
    }

    /**
     * Deshabilita o habilita los campos de estadísticas
     * @param disable true para deshabilitar, false para habilitar
     */
    private void disableStatsFields(boolean disable) {
        carrerasParticipadas.setDisable(disable);
        kmRecorridos.setDisable(disable);
        ubicacionPreferida.setDisable(disable);
        vecesGanadas.setDisable(disable);
        categoríapref.setDisable(disable);
        totalPagado.setDisable(disable);
    }

    @FXML
    private void volverHome(){
        try {
            // Cargar el archivo FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/clases/vistas/home.fxml"));
            Parent root = loader.load();

            // Obtener la escena actual
            Scene scene = new Scene(root);

            // Obtener el escenario (ventana) actual y cambiar la escena
            Stage stage = (Stage) vecesGanadas.getScene().getWindow();
            stage.setScene(scene);
            stage.show();  // Mostrar la nueva ventana

        } catch (IOException e) {
            e.printStackTrace();
            mostrarAlerta("Error", "No se pudo cargar la nueva ventana.", Alert.AlertType.ERROR);
        }
    }

    @FXML
    private void cambiarContrasena(){
        // Implementa aquí la lógica para cambiar la contraseña
        // Puedes acceder a los valores de los campos con:
        // String nombre = nuevoNombre.getText();
        // String confirmarNombre = confirmarNuevoNombre.getText();
        // String password = nuevaPsswd.getText();
        // String confirmarPassword = confirmarNuevaPasswd.getText();

        // Validar que los campos coincidan
        if (!nuevoNombre.getText().equals(confirmarNuevoNombre.getText())) {
            mostrarAlerta("Error", "Los nombres no coinciden.", Alert.AlertType.ERROR);
            return;
        }

        if (!nuevaPsswd.getText().equals(confirmarNuevaPasswd.getText())) {
            mostrarAlerta("Error", "Las contraseñas no coinciden.", Alert.AlertType.ERROR);
            return;
        }

        // Aquí iría la lógica para actualizar los datos en la base de datos

        // Mostrar mensaje de éxito
        mostrarAlerta("Éxito", "Datos actualizados correctamente.", Alert.AlertType.INFORMATION);
    }

    @FXML
    private void eliminarUsuario(){}

    @FXML
    private void cerrarSesion(){}

    private void mostrarAlerta(String titulo, String mensaje, Alert.AlertType tipo){
        Alert alerta = new Alert(tipo);
        alerta.setTitle(titulo);
        alerta.setHeaderText(null);
        alerta.setContentText(mensaje);
        alerta.showAndWait();
    }
}
