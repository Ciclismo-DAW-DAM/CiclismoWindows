package modelos;

public class Carrera {

    private String direccion;
    private String urlImagen;
    private String descripcion;
    private String nombre;

    public Carrera(String direccion, String urlImagen, String descripcion, String nombre) {
        this.direccion = direccion;
        this.urlImagen = urlImagen;
        this.descripcion = descripcion;
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



}
