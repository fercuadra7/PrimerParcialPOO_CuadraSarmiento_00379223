package ArticulosElectronicos;

public abstract class ArticulosElectronicos {
    //atributos de clase abstracta
    private String nombre;
    private String modelo;
    //atributos tipo protected para utilizarlos de manera comoda en las subclases
    protected String descripcion;
    protected float precio;

    //constructor
    public ArticulosElectronicos(String nombre, String modelo, String descripcion, float precio) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

//getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
