package Conexion;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class apiResponseParticipantes {
    @SerializedName("cycling_participant")
    private List<Participante> participantes;

    public List<Participante> getParticipantes() {
        return participantes;
    }
}
