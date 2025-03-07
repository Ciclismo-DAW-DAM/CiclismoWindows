package Conexion;

import retrofit2.http.GET;
import retrofit2.Call;
import retrofit2.http.Path;

import java.util.List;

public interface apiServiceCarreras {
    @GET("cycling")
    Call<List<apiResponseCarreras>> getCarreras();

    @GET("cycling/{id}")
    Call<apiResponseCarreras> getCarreraPorId(@Path("id") int id);

}
