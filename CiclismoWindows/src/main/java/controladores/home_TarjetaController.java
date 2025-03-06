package controladores;

import javafx.fxml.FXML;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import modelos.Carrera;


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


    public void cargarDatosTarjeta(Carrera carrera){

        if (carrera != null) {
            txtNombre.setText(carrera.getNombre());
            txtDireccion.setText(carrera.getDireccion());
            txtDescripcion.setText(carrera.getDescripcion());
            Image image = new Image(carrera.getUrlImagen());
            imgTarjeta.setImage(image);
            imgTarjeta.setFitWidth(320); // Ancho del ImageView
            imgTarjeta.setFitHeight(180); // Alto del ImageView
            imgTarjeta.setPreserveRatio(false); // Mantener la relación de aspecto
            imgTarjeta.setSmooth(true);

        }

    }

}
