package Conexion;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Usuario {
    @SerializedName("id")
    private int id;
    @SerializedName("email")
    private String correo;
    @SerializedName("roles")
    private List<String> roles;
    @SerializedName("name")
    private String nombre;
    @SerializedName("password")
    private String contrasena;
    @SerializedName("banned")
    private Boolean banned;
    @SerializedName("age")
    private int edad;
    @SerializedName("gender")
    private String genero;
    @SerializedName("image")
    private String imagen;

    public Usuario(int id, String correo, List<String> roles, String nombre, String contrasena, Boolean banned, int edad, String genero, String imagen) {
        this.id = id;
        this.correo = correo;
        this.roles = roles;
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.banned = banned;
        this.edad = edad;
        this.genero = genero;
        this.imagen = imagen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Boolean getBanned() {
        return banned;
    }

    public void setBanned(Boolean banned) {
        this.banned = banned;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
