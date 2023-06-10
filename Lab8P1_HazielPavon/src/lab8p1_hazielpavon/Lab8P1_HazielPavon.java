package lab8p1_hazielpavon;

import java.util.Scanner;

public class Lab8P1_HazielPavon {

    static Scanner leer = new Scanner(System.in);
    static Libro l = new Libro();

    public static void main(String[] args) {
        boolean primero = false;
        boolean seguir = true;
        Libro[][] matriz = null;
        while (seguir) {

            System.out.println("1. Problema");
            System.out.println("2. Modificar Libros");
            System.out.println("2. Salir");
            int opcion = leer.nextInt();

            switch (opcion) {

                case 1:
                    matriz = llenarLibrero();
                    print(matriz);
                    primero = true;

                    break;

                case 2:

                    if (primero == true) {

                        System.out.println("Ingrese el titulo del libro");
                        String titulo = leer.next();

                        System.out.println("Ingrese el Escritor");
                        String escritor = leer.next();

                        System.out.println("Ingrese el anio de publicacion");
                        int anio = leer.nextInt();

                        matriz = ModificarLibro(anio, escritor, titulo, matriz);
                        System.out.println("Matriz Modificada");
                        print(matriz);
                    } else {
                        System.out.println("Tiene que hacer el primer problema");
                    }

                    break;

                default:
                    if (opcion > 2) {
                        System.out.println("Ingrese una opcion valida");
                    }

            }
        }

    }

    public static Libro[][] llenarLibrero() {

        boolean mayor = false;

        int f = 0;
        int c = 0;

        while (mayor == false) {
            System.out.println("Ingrese la canidad de filas para el librero: ");
            f = leer.nextInt();
            System.out.println("Ingrese la cantidad de columnas para el librero");
            c = leer.nextInt();

            if (c > 0 && f > 0) {
                mayor = true;

            } else {
                System.out.println("El numero debes ser mayor a 0");
            }
        }

        Libro[][] librero = new Libro[f][c];

        for (int i = 0; i < librero.length; i++) {

            for (int j = 0; j < librero[i].length; j++) {
                leer = new Scanner(System.in);
                
                System.out.println("Ingrese el titulo del libro");
                String titulo = leer.nextLine();

                System.out.println("Ingrese el Escritor");
                String escritor = leer.nextLine();

                System.out.println("Ingrese el anio de publicacion");
                int anio = leer.nextInt();

                Libro l = new Libro(anio, escritor, titulo);

                librero[i][j] = l;
                System.out.println("El libro fue agregado exitosamente");
            }

        }

        return librero;
    }

    public static void print(Libro[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                Libro l = matriz[i][j];

                System.out.print("[ " + l.getTitulo() + " ]");

            }
            System.out.println("");
        }
    }

    public static Libro[][] ModificarLibro(int anio, String escritor, String titulo, Libro[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                Libro l = matriz[i][j];

                if ((l.getTitulo().equalsIgnoreCase(titulo)) && (l.getEscritor().equalsIgnoreCase(escritor)) && (l.getAnio() == anio)) {

                    System.out.println("El libro fue encontrado en la fila" + (i + 1) + "columna" + (j + 1) + "\n");
                    titulo = leer.next();
                    System.out.println("Ingrese el Escritor");
                    escritor = leer.next();
                    System.out.println("Ingrese el anio de publicacion");
                    anio = leer.nextInt();
                    System.out.println("");
                    System.out.println("El libro fue modificado exitosamente");
                    l.setAnio(anio);
                    l.setEscritor(escritor);
                    l.setTitulo(titulo);
                } else {
                    System.out.println("El libro no fue encontrado");
                }

            }

        }
        return matriz;
    }

}
