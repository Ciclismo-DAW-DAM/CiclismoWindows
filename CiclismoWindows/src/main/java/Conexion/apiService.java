package Conexion;

import clases.ciclismowindows.Carrera;
import retrofit2.http.GET;
import retrofit2.Call;

public interface apiService {
    @GET("cycling")
    Call<apiResponse> getCarreras();

    /*
    @GET("cycling")
    Call<List<apiResponse>> getCarreras();

    // Obtener una carrera de ciclismo por ID
    @GET("cycling/{id}")
    Call<apiResponse> getCarreraPorId(@Path("id") int id);

    // Crear una nueva carrera de ciclismo
    @POST("cycling")
    Call<apiResponse> crearCarrera(@Body Carrera carrera);

    // Actualizar una carrera de ciclismo
    @PUT("cycling/{id}")
    Call<apiResponse> actualizarCarrera(@Path("id") int id, @Body Carrera carrera);

    // Eliminar una carrera de ciclismo
    @DELETE("cycling/{id}")
    Call<apiResponse> eliminarCarrera(@Path("id") int id);
    */
}
