package ArticulosElectronicos;

public class Laptop extends ArticulosElectronicos implements Informacion{

    //atributos especificos de la clase Laptop
    private String RAM;
    private String OS;

    //constructor con atriburos de la clase padre
    public Laptop(String nombre, String modelo, String descripcion, float precio, String RAM, String OS) {
        super(nombre, modelo, descripcion, precio);
        this.RAM = RAM;
        this.OS = OS;
    }

    //metodos establecidos en la interfaz
    public float obtenerPrecio() {
        return precio;
    }

    public String obtenerDescripcion() {
        return descripcion;
    }

    //getters y setters
    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }
}
