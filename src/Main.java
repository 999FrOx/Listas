import luis.listas.Lista;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menuLista();

    }
    public static void menuLista() {
        Scanner scanner = new Scanner(System.in);

        Lista lista = new Lista();
        int opt;

        do {
            System.out.println("Seleccione una opción: \n" + "1. Agregar elemento \n"+
                    "2. Ver tamaño \n" +
                    "3 Verificar si esta vacia \n" +
                    "4. Buscar elemento \n" +
                    "5. Eliminar elemento \n" +
                    "6. Comparar lista \n" +
                    "7. Salir \n");
                    opt = scanner.nextInt();

            switch (opt) {
                case 1 :
                    lista.agregarLista();
                    break;
                case 2:
                    lista.tamanioLista();
                    break;
                case 3:
                    lista.estaVacia();
                    break;
                case 4:
                    lista.buscarElemento();
                    break;
                case 5:
                    lista.eliminarElemento();
                    break;
                case 6:
                    lista.compararLista();
                    break;
                case 7:
                    System.out.println("Salir del Programa");
                    break;
                default:
                    System.out.println("Ingrese una opción válida!!!");
            }
        } while (opt != 7);
    }
}
//Luis Manuel Pérez González
//Jimena Hernández Luna
//Angel Gabriel Guzmán Ramirez