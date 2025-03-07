package Conexion;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Carrera {
    @SerializedName("id")
    private int id;
    @SerializedName("nombre")
    private String nombre;
    @SerializedName("descripcion")
    private String descripcion;
    @SerializedName("fecha")
    private String fecha;
    @SerializedName("hora")
    private String hora;
    @SerializedName("distancia_km")
    private int distancia_km;
    @SerializedName("ubicacion")
    private String ubicacion;
    @SerializedName("coordenadas")
    private String coordenadas;
    @SerializedName("desnivel")
    private String desnivel;
    @SerializedName("precio_inscripcion")
    private String precio_inscripcion;
    @SerializedName("plazas_disponibles")
    private String plazas_disponibles;
    @SerializedName("estado")
    private String estado;
    @SerializedName("categoria")
    private String categoria;
    @SerializedName("imagen")
    private String imagen;
    @SerializedName("premios")
    private List <String> premios;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getDistancia_km() {
        return distancia_km;
    }

    public void setDistancia_km(int distancia_km) {
        this.distancia_km = distancia_km;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(String coordenadas) {
        this.coordenadas = coordenadas;
    }

    public String getDesnivel() {
        return desnivel;
    }

    public void setDesnivel(String desnivel) {
        this.desnivel = desnivel;
    }

    public String getPrecio_inscripcion() {
        return precio_inscripcion;
    }

    public void setPrecio_inscripcion(String precio_inscripcion) {
        this.precio_inscripcion = precio_inscripcion;
    }

    public String getPlazas_disponibles() {
        return plazas_disponibles;
    }

    public void setPlazas_disponibles(String plazas_disponibles) {
        this.plazas_disponibles = plazas_disponibles;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public List<String> getPremios() {
        return premios;
    }

    public void setPremios(List<String> premios) {
        this.premios = premios;
    }
}
