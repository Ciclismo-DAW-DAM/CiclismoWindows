package controladores;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class detalleCarreraController {

    @FXML
    private ImageView imgView;

    @FXML
    private Label labelCategoria;

    @FXML
    private Label labelCiclismo;

    @FXML
    private Label labelDescripcion;

    @FXML
    private Label labelDistancia;

    @FXML
    private Label labelEstado;

    @FXML
    private Label labelFecha;

    @FXML
    private Label labelNombreCarrera;

    @FXML
    private Label labelParticipaciones;

    @FXML
    private Label labelPerfil;

    @FXML
    private Label labelUbicacion;

    @FXML
    private Label labelPlazasDisponibles;

    @FXML
    private Label labelPrecioInscripcion;

    @FXML
    private Label labelTiempoMaximo;

    @FXML
    public void initialize() {
        Image imagen = new Image(Objects.requireNonNull(getClass().getResource("/imagenes/imagen2.jpg")).toExternalForm());
        imgView.setImage(imagen);
        imgView.setFitWidth(1420);
        imgView.setFitHeight(250);
        imgView.setPreserveRatio(false);
        imgView.setSmooth(true);
        imgView.setCache(true);

        labelPerfil.setOnMouseClicked(event -> {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/clases/vistas/perfil.fxml"));
                Parent vistas = loader.load();
                Stage stage = (Stage) labelPerfil.getScene().getWindow();
                stage.getScene().setRoot(vistas);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        labelCiclismo.setOnMouseClicked(event -> {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/clases/vistas/home.fxml"));
                Parent vistas = loader.load();
                Stage stage = (Stage) labelCiclismo.getScene().getWindow();
                stage.getScene().setRoot(vistas);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        labelParticipaciones.setOnMouseClicked(event -> {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/clases/vistas/participaciones.fxml"));
                Parent vistas = loader.load();
                Stage stage = (Stage) labelParticipaciones.getScene().getWindow();
                stage.getScene().setRoot(vistas);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });


    }
}
