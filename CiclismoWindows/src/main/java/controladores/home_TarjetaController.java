package controladores;

import Conexion.Carrera;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;


public class home_TarjetaController {


    @FXML
    private ImageView imgTarjeta;

    @FXML
    private Label txtDescripcion;

    @FXML
    private Label txtDireccion;

    @FXML
    private Label txtNombre;

    @FXML
    public void initialize() {}


    @FXML
    void onClick(MouseEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/clases/vistas/detalleCarrera.fxml"));
            Parent vistas = loader.load();
            Stage stage = (Stage) txtNombre.getScene().getWindow();
            stage.getScene().setRoot(vistas);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void cargarDatosTarjeta(Carrera carrera){

        if (carrera != null) {
            txtNombre.setText(carrera.getNombre());
            txtDireccion.setText(carrera.getUbicacion());
            txtDescripcion.setText(carrera.getDescripcion());
            Image image = new Image("/imagenes/imagen2.jpg");
            imgTarjeta.setImage(image);
            imgTarjeta.setFitWidth(320); // Ancho del ImageView
            imgTarjeta.setFitHeight(180); // Alto del ImageView
            imgTarjeta.setPreserveRatio(false); // Mantener la relación de aspecto
            imgTarjeta.setSmooth(true);

        }

    }

}
