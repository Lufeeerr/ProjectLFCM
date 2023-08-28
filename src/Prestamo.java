public class Prestamo {
    private int Codigo;
    private int FechaInicio;
    private int FechaDevolucion;
    private String Estado;

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        Codigo = codigo;
    }

    public int getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(int fechaInicio) {
        FechaInicio = fechaInicio;
    }

    public int getFechaDevolucion() {
        return FechaDevolucion;
    }

    public void setFechaDevolucion(int fechaDevolucion) {
        FechaDevolucion = fechaDevolucion;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }
}
