package Conexion;

import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface apiServiceParticipantes {
    @GET("cycling_participant")
    Call<List<apiResponseParticipantes>> getParticipantes();
}
