public class Socio extends Biblioteca{
    private  String Nombre;
    private String Direccion;
    private int Telefono;
    private int Fecha;
    private int NumIdentificacion;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int telefono) {
        Telefono = telefono;
    }

    public int getFecha() {
        return Fecha;
    }

    public void setFecha(int fecha) {
        Fecha = fecha;
    }

    public int getNumIdentificacion() {
        return NumIdentificacion;
    }

    public void setNumIdentificacion(int numIdentificacion) {
        NumIdentificacion = numIdentificacion;
    }
}
