package Conexion;

import com.google.gson.annotations.SerializedName;

public class Participante {
    @SerializedName("id")
    private int id;
    @SerializedName("user")
    private Usuario usuario;
    @SerializedName("race")
    private Carrera carrera;
    @SerializedName("time")
    private String tiempo;
    @SerializedName("dorsal")
    private int dorsal;
    @SerializedName("banned")
    private boolean baneado;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public boolean isBaneado() {
        return baneado;
    }

    public void setBaneado(boolean baneado) {
        this.baneado = baneado;
    }
}
