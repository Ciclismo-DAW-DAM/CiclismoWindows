package controladores;

import Conexion.Carrera;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.scene.Node;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import modelos.Carrera;
import java.io.IOException;

import java.util.ArrayList;

import java.util.List;


public class homeController {

    @FXML
    private ScrollPane P_scroll;

    @FXML
    private Pane PanelPrueba;

    @FXML
    private TextField txt_Buscardor;

    @FXML
    private ListView<String> vl_respuestas = new ListView<>();

    @FXML
    void onParticipaciones(MouseEvent event) {
            participaciones = true;

    }

    @FXML
    void onInicio(MouseEvent event) {
        participaciones = false;
    }

    @FXML
    void onPerfil(MouseEvent event) {

    }

    private boolean participaciones = false;


    // String
    ObservableList<String> filtrado = FXCollections.observableArrayList();
    private ObservableList<String> resultados = FXCollections.observableArrayList();

    // Carrera
    private List<Carrera> carreras = new ArrayList<>();
    private  List<Carrera> carreraFiltradas = new ArrayList<>();

    @FXML
    public void initialize() {
        inicializarLisener();

        funcionPrincipal();
    }

    private void funcionPrincipal() {
        cargarCarreras();

        cargarResultadosLista(carreras);

        crearTarjetas(carreras);
    }

    private void cargarCarreras(){

        carreras.clear();

        carreras.add(
                new Carrera(
                        1,
                        "Granada",
                        "Carrera benefica",
                        "Carrera de granada"
                ));
        carreras.add(
                new Carrera(
                        2,
                        "Granada",
                        "Carrera de cancer",
                        "Carrera de Sevilla"
                )
        );

        carreras.add(
                new Carrera(
                        3,
                        "Granada",
                        "Carrera de cancer",
                        "Carrera de Sevilla"
                )
        );

        carreras.add(

                new Carrera(
                        4,
                        "Granada",
                        "Carrera de cancer",
                        "Carrera de Sevilla"
                )
        );

        carreras.add(
                new Carrera(
                        5,
                        "Granada",
                        "Carrera de cancer",
                        "Carrera de Sevilla"
                )
        );

        carreras.add(
                new Carrera(
                        6,
                        "Granada",
                        "Carrera de cancer",
                        "Carrera de Sevilla"
                )
        );

        carreras.add(
                new Carrera(
                        7,
                        "Granada",
                        "Carrera de cancer",
                        "Carrera de Sevilla"
                )
        );

        carreras.add(

                new Carrera(
                        8,
                        "Granada",
                        "Carrera de cancer",
                        "Carrera de Sevilla"
                )
        );

        carreras.add(
                new Carrera(
                        9,
                        "Granada",
                        "Carrera de cancer",
                        "Carrera de Sevilla"
                )
        );

        carreras.add(
                new Carrera(
                        10,
                        "Granada",
                        "Carrera de cancer",
                        "Carrera de Sevilla"
                )
        );

        carreras.add(
                new Carrera(
                        11,
                        "Granada",
                        "Carrera de cancer",
                        "Carrera de Sevilla"
                )
        );

        carreras.add(
                new Carrera(
                        12,
                        "Granada",
                        "Carrera de cancer",
                        "Carrera de Sevilla"
                )
        );

        carreras.add(

                new Carrera(
                        13,
                        "Granada",
                        "Carrera de cancer",
                        "Carrera de Sevilla"
                )
        );

        carreras.add(
                new Carrera(
                        14,
                        "Granada",
                        "Carrera de cancer",
                        "Carrera de Sevilla"
                )
        );

        carreras.add(
                new Carrera(
                        15,
                        "Granada",
                        "Carrera de cancer",
                        "Carrera de Sevilla"
                )
        );

        carreras.add(
                new Carrera(
                        16,
                        "Granada",
                        "Carrera de cancer",
                        "Carrera de Sevilla"
                )
        );

        carreras.add(
                new Carrera(
                        17,
                        "Granada",
                        "Carrera de cancer",
                        "Carrera de Sevilla"
                )
        );

        carreras.add(

                new Carrera(
                        18,
                        "Granada",
                        "Carrera de cancer",
                        "Carrera de Sevilla"
                )
        );

        carreras.add(
                new Carrera(
                        19,
                        "Granada",
                        "Carrera de cancer",
                        "Carrera de Sevilla"
                )
        );
    }

    private void  inicializarLisener(){
        inicializarLisenerBusqueda();
        inicializarLisenerListaView();
    }

    private void inicializarLisenerBusqueda(){

        txt_Buscardor.textProperty().addListener((observable, oldValue, newValue) -> {

            // Si esta vacio oculta la lista

            if ((newValue.isEmpty()) || (newValue.length() < 1)) {

                // Si el campo de búsqueda está vacío, ocultar el ListView
                vl_respuestas.setVisible(false);
                filtrado.clear();
                carreraFiltradas.clear();

                cargarCarreras();
                cargarResultadosLista(carreras);
                crearTarjetas(carreras);

            } else {

                filtrado.clear();
                carreraFiltradas.clear();

                for (String item : resultados) {
                    if (item.toLowerCase().contains(newValue.toLowerCase())) {
                        filtrado.add(item);
                    }
                }

                for (Carrera c : carreras){
                    if ((c.getNombre().toLowerCase().contains(newValue.toLowerCase())) || (c.getUbicacion().toLowerCase().contains(newValue.toLowerCase()))){
                        carreraFiltradas.add(c);
                    }
                }

                crearTarjetas(carreraFiltradas);


                // Actualizar el ListView con los resultados filtrados
                vl_respuestas.setItems(filtrado);

                // Mostrar el ListView solo si hay resultados
                vl_respuestas.setVisible(!filtrado.isEmpty());
            }
        });
    }

    private void inicializarLisenerListaView(){
        // Código para manejar eventos del ListView

        vl_respuestas.setOnMouseClicked((MouseEvent event) -> {
            // Obtener el controlador de la tarjeta
            String carreraSeleccionada = vl_respuestas.getSelectionModel().getSelectedItem();

            txt_Buscardor.setText(carreraSeleccionada);

            vl_respuestas.setVisible(false);


        });
    }

    private void crearTarjetas(List<Carrera> list) {
        // Código para cargar tarjetas en la GridPane

        PanelPrueba.getChildren().clear();
        int column = 0; // Columna inicial
        int row = 0;    // Fila inicial

        double tamanioPorPanel = 372;

        double x = 0;

        System.out.println(list.size());

        for (Carrera carrera : list) { // Iterar sobre la lista de productos
            try {
                // Cargar el archivo FXML de la tarjeta
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/clases/vistas/home_tarjeta.fxml"));
                Node tarjeta = fxmlLoader.load();

                Pane tarjetaPane = (Pane) tarjeta;
                tarjetaPane.setPrefSize(351, 292);

                // Obtener el controlador de la tarjeta
                home_TarjetaController tarjetaController = fxmlLoader.getController();

                // Pasar los datos al controlador de la tarjeta
                tarjetaController.cargarDatosTarjeta(carrera);


                // VAmos a poner segun la tarjeta
                if (column == 0){
                    x = 36;
                }
                if (column == 1){
                    x = 412;
                }
                if (column == 2){
                    x = 787;
                }

                double y = (tamanioPorPanel - 40) * row;

                tarjetaPane.setLayoutX(x);
                tarjetaPane.setLayoutY(y);

                PanelPrueba.getChildren().add(tarjetaPane);
                PanelPrueba.setPrefHeight((tamanioPorPanel ) * row);

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

    private void cargarResultadosLista(List<Carrera> list){
        resultados.clear();

        for (Carrera c : list){
            resultados.add(c.getNombre());
            resultados.add(c.getUbicacion());
        }


    }


}
