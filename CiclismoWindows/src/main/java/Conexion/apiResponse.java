package Conexion;

import java.util.List;

import modelos.Carrera;
import com.google.gson.annotations.SerializedName;

public class apiResponse {
    @SerializedName("carrerasRunning")
    private List<Carrera> carreras;

    public List<Carrera> getCarreras() {
        return carreras;
    }
}
