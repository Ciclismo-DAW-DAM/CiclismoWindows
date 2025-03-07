module CiclismoWindows.main {
    requires javafx.controls;
    requires javafx.fxml;
    requires retrofit2;
    requires retrofit2.converter.gson;
    requires com.google.gson;
    requires okhttp3;
    requires java.desktop;

    exports Conexion;


    opens clases.ciclismowindows to javafx.fxml;
    exports clases.ciclismowindows;
    exports controladores;
}