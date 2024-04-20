package ArticulosElectronicos;

public class Telefono extends ArticulosElectronicos implements Informacion{

    //atributos especificos de telefono
    private String numeroTelefono;
    private String tamanio;

    //constructor con atributos de la clase padre
    public Telefono(String nombre, String modelo, String descripcion, float precio, String numeroTelefono, String tamanio) {
        super(nombre, modelo, descripcion, precio);
        this.numeroTelefono = numeroTelefono;
        this.tamanio = tamanio;
    }

    //metodos establecidas en la interfaz
    public float obtenerPrecio() {
        return precio;
    }

    public String obtenerDescripcion() {
        return descripcion;
    }

    //getters y setters
    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }
}
