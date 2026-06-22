package Model;

public class Proveedor {

    private String identificacion;
    private String nombre;
    private String Servicio;


    public Proveedor() {
    }

    public Proveedor(String identificacion, String nombre, String servicio) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        Servicio = servicio;


        }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getServicio() {
        return Servicio;
    }

    public void setServicio(String servicio) {
        Servicio = servicio;
    }

    @Override
    public String toString() {
        return "Proveedor{" +
                "identificacion='" + identificacion + '\'' +
                ", nombre='" + nombre + '\'' +
                ", Servicio='" + Servicio + '\'' +
                '}';
    }
}

