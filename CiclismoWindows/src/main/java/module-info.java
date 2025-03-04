module clases.ciclismowindows {
    requires javafx.controls;
    requires javafx.fxml;


    opens clases.ciclismowindows to javafx.fxml;
    exports clases.ciclismowindows;
}