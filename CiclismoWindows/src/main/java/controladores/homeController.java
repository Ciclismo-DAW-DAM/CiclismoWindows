package controladores;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import modelos.Carrera;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

    ObservableList<String> filtrado = FXCollections.observableArrayList();
    private ObservableList<String> resultados = FXCollections.observableArrayList(
            "Raton",
            "Perro",
            "Gato",
            "Loro",
            "Tortuga",
            "Pez",
            "Serpiente"
    );

    private List<Carrera> carrera = Arrays.asList(
            new Carrera(
                    "Granada, Gran ciudad",
                    "https://www.spain.info/export/sites/segtur/.content/imagenes/cabeceras-grandes/andalucia/alhambra-granada-20044065-istock.jpg_1014274486.jpg",
                    "Carrera benefica"
            ),
            new Carrera(
                    "Sevilla, Ciudad",
                    "https://losdosviajeros.com/img/sevilla/plaza-espana-noche.jpg",
                    "Carrera de cancer"
            )
    );


    @FXML
    public void initialize() {
        inicializarLisener();




        cargarTarjetas();
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
                filtrado.clear();

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

    private void selectorDeLista(){

        if (filtrado.isEmpty()) {
//            cargarTarjetas(resultados);
        } else {
//            cargarTarjetas(filtrado);
        }

    }


    private void cargarTarjetas() {
        // Código para cargar tarjetas en la GridPane



        int column = 0; // Columna inicial
        int row = 0;    // Fila inicial

        for (Carrera carrera : carrera) { // Iterar sobre la lista de productos
            try {
                // Cargar el archivo FXML de la tarjeta
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/clases/vistas/home_tarjeta.fxml"));
                Node tarjeta = fxmlLoader.load();

                P_grid.setMargin(tarjeta, new Insets(170, 10, 10, 10));

                // Obtener el controlador de la tarjeta
                home_TarjetaController tarjetaController = fxmlLoader.getController();

                // Pasar los datos al controlador de la tarjeta
                tarjetaController.cargarDatosTarjeta(carrera);

                // Agregar la tarjeta al GridPane
                P_grid.add(tarjeta, column, row);

                // Ajustar la posición de las tarjetas
                column++;
                if (column == 3) { // Cambiar de fila después de 3 columnas
                    column = 0;
                    row++;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



    }


}
