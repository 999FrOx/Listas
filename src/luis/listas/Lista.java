package luis.listas;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Lista {

    List<String> lista01 = new ArrayList<>();
    //crear lista con List y ArrayList
    public void agregarLista(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el elemnto que desea agregar: ");
         String elemento = scanner.next();
         lista01.add(elemento);
        System.out.println("La lista es: "  + lista01);
    }
    public void tamanioLista() {
        System.out.println("El tamaño de la lista es de: " + lista01.size() + " elementos");
    }
    public void estaVacia() {
        if (lista01.isEmpty()) {
            System.out.println("La lista esta vacía");
        }
        System.out.println("La lista tiene elementos");
    }
    public void buscarElemento() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el elemento que desea buscar en la lista: ");
        String elemento = scanner.next();

        if (lista01.contains(elemento)) {
            System.out.println("El elemento " + elemento + " si esta en la lista");
        } else {
            System.out.println("El elemento " + elemento + " no esta en la lista");
        }
    }
    public void eliminarElemento() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Que desea eliminar? \n"
                + "1. Un elemento de la lista \n"
                + "2. Toda la lista \n");
        int opt = scanner.nextInt();
        switch (opt) {
            case 1:
                System.out.println("Ingrese la posición que desea eliminar: ");
                int elemento = scanner.nextInt();
                lista01.remove(elemento);
                if (!lista01.isEmpty()) {
                    System.out.println("El elemento " + elemento + " ha sido borrado");
                } else {
                    System.out.println("El elemento " + elemento + " no se elimino ya que no existe en la lista");
                }
                System.out.println("La lista es: " + lista01);
                break;
            case 2:
                lista01.clear();
                System.out.println("La lista está vacía");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + opt);
        }
    }
    public void compararLista() {
        List<String> lista02 = new ArrayList<>();
        List<String> lista03 = new ArrayList<>();
        lista02.add("Pepe");
        lista03.add("Pepe");
        if (lista02.equals(lista03)) {
            System.out.println("Las listas son identicas :o ");
        } else {
            System.out.println("Las listas son distintas :c ");
        }
     }
}
