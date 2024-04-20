import ArticulosElectronicos.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    //Arraylist para guardar los articulos
    static ArrayList<ArticulosElectronicos> listaArticulos = new ArrayList<ArticulosElectronicos>();

    //funcion principal
    public static void main(String[] args) {
        menuPrincipal();
    }

    //menu Principal donde se encuentran las acciones principales del programa
    private static void menuPrincipal(){
        Scanner sc = new Scanner(System.in);
        int opcion;
        while (true){
            try {
                menu();
                opcion = sc.nextInt();
                sc.nextLine();

                if (opcion == 4){
                    System.out.println("Saliendo del programa...");
                    break;
                }

                switch (opcion){
                    case 1:
                        agregarArticulo();
                        break;
                    case 2:
                        modificarPrecio();
                        break;
                    case 3:
                        mostrarLista();
                        break;
                    default: System.out.println("Opcion no valida! Ingrese otra opcion");
                }
           //captura de errores
            }catch (Exception e){
                System.out.println("Opcion no valida! Ingrese otra opcion");
                sc.nextLine();
            }
        }
    }

    //menu sobre las diferentes acciones
    private static void menu(){
        System.out.println("----Bienvenido al sistema de Iventario de ElectroMart----");
        System.out.println("1) Agregar un articulo electronico");
        System.out.println("2) Modificar el precio de un articulo electronico");
        System.out.println("3) Mostrar la lista de los articulos electronicos disponibles");
        System.out.println("4) Salir");
        System.out.print("Ingrese la opcion que quieres realizar: ");
    }

    //funcion para agregar un nuevo articulo a la lista
    private static void agregarArticulo(){
        Scanner sc = new Scanner(System.in);

        String nombre, modelo, descripcion;
        float precio;

        System.out.println("Agregando un nuevo articulo...");
        System.out.print("Ingrese el nombre del articulo: ");
        nombre = sc.nextLine();
        System.out.print("Ingrese el modelo del articulo: ");
        modelo = sc.nextLine();
        System.out.print("Ingrese una descripcion del articulo: ");
        descripcion = sc.nextLine();
        System.out.print("Ingrese el precio del articulo: $");
        precio = sc.nextFloat();

        int tipoArticulo = obtenerTipo();
        ArticulosElectronicos nuevoArticulo = null;

        switch (tipoArticulo){
            case 1:
                sc.nextLine();
                System.out.print("Ingrese el numero de telefono relacionado con el dispositvo: ");
                String telefono = sc.nextLine();
                System.out.print("Ingrese si el telefono es grande, mediano o pequenio: ");
                String tamanio = sc.nextLine();

                nuevoArticulo = new Telefono(nombre, modelo, descripcion, precio, telefono, tamanio);

                break;
            case 2:
                sc.nextLine();
                System.out.print("Ingrese la RAM de la laptop: ");
                String RAM = sc.nextLine();
                System.out.print("Ingrese el sistema operativo de la laptop: ");
                String OS = sc.nextLine();

                nuevoArticulo = new Laptop(nombre, modelo, descripcion, precio, RAM, OS);

                break;

        }

        listaArticulos.add(nuevoArticulo);
        System.out.println("Se ha agregado el articulo correctamente!");


    }

    //funcion secundaria para determinar el tipo del articulo
    private static int obtenerTipo(){
        Scanner sc = new Scanner(System.in);

        int tipo;

        while (true){
            try {
                System.out.println("****");
                System.out.println("1) Telefono");
                System.out.println("2) Laptops");
                System.out.print("Ingrese el tipo de articulo electronico que va a guardar: ");
                tipo = sc.nextInt();

                if (tipo <= 2 && tipo > 0){
                    return tipo;
                }else{
                    System.out.println("Opcion no valida! Ingrese otra opcion");
                }

            }catch (Exception e){
                System.out.println("Opcion no valida! Ingrese otra opcion");
                sc.nextLine();
            }
        }
    }

    //funcion para mostrar lisra con los atributos principales
    private static void mostrarLista(){
        System.out.println("----LISTA DE ARTICULOS----");
        for (int i = 0; i < listaArticulos.size(); i++){
        System.out.println("---------------------");
        System.out.println("Nombre del articulo: " + listaArticulos.get(i).getNombre());
        System.out.println("Modelo del articulo: " + listaArticulos.get(i).getModelo());
        System.out.println("Descrpicion; " + listaArticulos.get(i).getDescripcion());
        System.out.println("Precio: $" + listaArticulos.get(i).getPrecio());
        System.out.println("---------------------");
       }
    }

    //funcion para modificar el precio de un articulo de la lista, buscandolo por medio del nombre
    private static void modificarPrecio(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre del articulo que quieres modificar: ");
        String nombre = sc.nextLine();

        for (int i = 0; i<listaArticulos.size(); i++){
            if (listaArticulos.get(i).getNombre().equals(nombre)){
                System.out.println("Ingrese el nuevo precio que quiere poner al articulo " +listaArticulos.get(i).getNombre());
                System.out.print("$");
                float precio = sc.nextFloat();

                listaArticulos.get(i).setPrecio(precio);

                System.out.println("Se ha modificado el precio correctamente!");
            }
        }

    }
}