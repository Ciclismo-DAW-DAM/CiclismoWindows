package Conexion;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class apiResponseCarreras {
    @SerializedName("carrerasRunning")
    private List<Carrera> carreras;

    public List<Carrera> getCarreras() {
        return carreras;
    }
}
