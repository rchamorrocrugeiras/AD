package P1;

public class Main {

  public static void main(String[] args) {
    System.out.println("--Exercicio 1--");
    System.out.println("Crear directorio 'arquivosdir'");
    System.out.println(P1_Metodos.creaDirectorio("/home/dam26/arquivosdir"));
    System.out.println("Comprobar se é directorio");
    System.out.println(P1_Metodos.eDirectorio("/home/dam26/arquivosdir"));

    System.out.println("--Exercicio 2--");
    System.out.println("Crear Products1.txt");
    System.out.println(P1_Metodos.creaFicheiro("/home/dam26/arquivosdir", "Products1.txt"));
    System.out.println("Comprobar se é ficheiro");
    System.out.println(P1_Metodos.eFicheiro("/home/dam26/arquivosdir/Produtos1.txt"));

    System.out.println("--Exercicio 3--");
    System.out.println("Crear subdirectorio subdir");
    System.out.println(P1_Metodos.creaDirectorio("/home/dam26/arquivosdir/subdir"));
    System.out.println("Crear Products2.txt");
    System.out.println(P1_Metodos.creaFicheiro("/home/dam26/arquivosdir/subdir", "Products2.txt"));

    System.out.println("--Exercicio 4--");
    System.out.println("Amosar contido de arquivosdir");
    P1_Metodos.mContido("/home/dam26/arquivosdir");

    System.out.println("--Exercicio 5--");
    System.out.println("Comprobar permisos de lectura y escritura de Products1.txt");
    P1_Metodos.modoAcceso("/home/dam26/arquivosdir", "Products1.txt");
    System.out.println("Comprobar a lonxitude en bits");
    System.out.println(P1_Metodos.calculaLonxitude("/home/dam26/arquivosdir", "Products1.txt"));

    System.out.println("--Exercicio 6--");
    System.out.println("Cambiar Products1.txt a modo lectura");
    System.out.println(P1_Metodos.mLectura("/home/dam26/arquivosdir", "Products1.txt"));
    System.out.println("Comprobar permisos de Products1.txt");
    P1_Metodos.modoAcceso("/home/dam26/arquivosdir", "Products1.txt");

    System.out.println("--Exercicio 7--");
    System.out.println("Volver a permitir la escritura a Products1.txt");
    System.out.println(P1_Metodos.mEscritura("/home/dam26/arquivosdir", "Products1.txt"));
    System.out.println("Comprobar permisos");
    P1_Metodos.modoAcceso("/home/dam26/arquivosdir", "Products1.txt");

    System.out.println("--Exercicio 8--");
    System.out.println("Borrar Products1.txt");
    System.out.println(P1_Metodos.borraFicheiro("/home/dam26/arquivosdir", "Products1.txt"));

    System.out.println("--Exercicio 9--");
    System.out.println("Borrar el resto de elementos");
    System.out.println("Borro Products2.txt");
    System.out.println(P1_Metodos.borraFicheiro("/home/dam26/arquivosdir/subdir", "Products2.txt"));
    System.out.println("Borro subdir");
    System.out.println(P1_Metodos.borraDirectorio("/home/dam26/arquivosdir/subdir"));
    System.out.println("Borro arquivosdir");
    System.out.println(P1_Metodos.borraDirectorio("/home/dam26/arquivosdir"));
  }
}