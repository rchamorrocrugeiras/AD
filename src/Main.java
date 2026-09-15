public class Main {

  public static void main(String[] args) {
    System.out.println("--Exercicio 1--");
    System.out.println(P1_Metodos.eDirectorio("/home/dam26/Descargas"));
    System.out.println(P1_Metodos.eDirectorio("/home/dam26/asd.txt"));
    System.out.println("--Exercicio 2--");
    System.out.println(P1_Metodos.eFicheiro("/home/dam26/Descargas"));
    System.out.println(P1_Metodos.eFicheiro("/home/dam26/asd.txt"));
    System.out.println("--Exercicio 3--");
    System.out.println(P1_Metodos.creaDirectorio("/home/dam26/Descargas"));
    System.out.println(P1_Metodos.creaDirectorio("/home/dam26/Prueba2"));
    System.out.println("--Exercicio 4--");
    System.out.println(P1_Metodos.creaFicheiro("/home/dam26/Prueba", "qwe.txt"));
    System.out.println("--Exercicio 5--");
    P1_Metodos.modoAcceso("/home/dam26/Descargas", "P1-1 Ficheiros.pdf");
    System.out.println("--Exercicio 6--");
    System.out.println(P1_Metodos.calculaLonxitude("/home/dam26/Descargas", "P1-1 Ficheiros.pdf"));
    System.out.println("--Exercicio 7--");
    System.out.println(P1_Metodos.mLectura("/home/dam26/Prueba", "qwe.txt"));
    System.out.println("--Exercicio 8--");
    System.out.println(P1_Metodos.mEscritura("/home/dam26/Prueba", "asd.txt"));
    System.out.println("--Exercicio 9--");
    System.out.println(P1_Metodos.borraFicheiro("/home/dam26/Prueba", "qwe.txt"));
    System.out.println("--Exercicio 10--");
    System.out.println(P1_Metodos.borraDirectorio("/home/dam26/Prueba2"));
    System.out.println("--Exercicio 11--");
    P1_Metodos.mContido("/home/dam26/Descargas");
  }
}