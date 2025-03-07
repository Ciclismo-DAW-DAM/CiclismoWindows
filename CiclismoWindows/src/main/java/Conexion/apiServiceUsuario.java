package Conexion;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;


public interface apiServiceUsuario {
    @GET("user/{id}")
    Call<apiResponseUsuario> getUsuarioPorId(@Path("id") int id);
}
