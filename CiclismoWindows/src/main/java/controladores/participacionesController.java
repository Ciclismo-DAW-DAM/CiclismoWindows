package controladores;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.GridPane;

import java.net.URL;
import java.util.ResourceBundle;

public class participacionesController implements Initializable {

    @FXML
    private GridPane P_grid;

    @FXML
    private ScrollPane P_scroll;

    @FXML
    private Label labelParticipaciones;

    @FXML
    private Label labelPerfil;

    @FXML
    private ListView<?> vl_respuestas;




    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

}
