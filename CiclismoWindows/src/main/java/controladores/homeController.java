package controladores;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import java.net.URL;
import java.util.ResourceBundle;

public class homeController {

    @FXML
    private GridPane P_grid;

    @FXML
    private ScrollPane P_scroll;

    @FXML
    private TextField txt_Buscardor;

    @FXML
    private ListView<String> vl_respuestas = new ListView<>();

    private ObservableList<String> resultados = FXCollections.observableArrayList(
            "Raton",
            "Perro",
            "Gato",
            "Loro",
            "Tortuga",
            "Pez",
            "Serpiente"
    );


    @FXML
    public void initialize() {
        inicializarLisener();
    }

    private void  inicializarLisener(){
        inicializarLisenerBusqueda();
    }

    private void inicializarLisenerBusqueda(){
        txt_Buscardor.textProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue.isEmpty()) {
                // Si el campo de búsqueda está vacío, ocultar el ListView
                vl_respuestas.setVisible(false);
            } else {
                // Crear una lista filtrada
                ObservableList<String> filtrado = FXCollections.observableArrayList();

                // Recorrer la lista original y buscar coincidencias
                for (String item : resultados) {
                    if (item.toLowerCase().contains(newValue.toLowerCase())) {
                        filtrado.add(item);
                    }
                }

                // Actualizar el ListView con los resultados filtrados
                vl_respuestas.setItems(filtrado);

                // Mostrar el ListView solo si hay resultados
                vl_respuestas.setVisible(!filtrado.isEmpty());
            }
        });
    }
}
