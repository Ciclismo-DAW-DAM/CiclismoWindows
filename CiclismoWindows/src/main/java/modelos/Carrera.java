package modelos;

public class Carrera {

    private String direccion;
    private String urlImagen;
    private String descripcion;


    public Carrera(String direccion, String urlImagen, String descripcion) {
        this.direccion = direccion;
        this.urlImagen = urlImagen;
        this.descripcion = descripcion;
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



}
