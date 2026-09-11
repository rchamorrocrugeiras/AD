import java.io.File;
import java.io.IOException;

public class P1_Metodos {
    public static String eDirectorio(String cadea) {
        File arquivo = new File(cadea);

        if (arquivo.isDirectory()) {
            return "É directorio";
        } else {
            return "Non é directorio";
        }
    }

    public static String eFicheiro(String cadea) {
        File arquivo = new File(cadea);

        if (arquivo.isFile()) {
            return "É ficheiro";
        } else {
            return "Non é ficheiro";
        }
    }

    public static String creaDirectorio(String cadea) {
        File arquivo = new File(cadea);

        if (arquivo.exists()) {
            return "O directorio xa existe";
        } else {
            if (arquivo.mkdir()) {
                return "Directorio creado";
            } else {
                return "No se pudo crear el directorio";
            }
        }
    }

    public static String creaFicheiro(String dirName, String fileName) {
        File arquivo = new File(dirName, fileName);

        if (arquivo.exists()) {
            return "O ficheiro xa existe";
        } else {
            try {
                if (arquivo.createNewFile()) {
                    return "Ficheiro creado";
                } else {
                    return "No se pudo crear el fichero";
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void modoAcceso(String dirName, String fileName) {
        File arquivo = new File(dirName, fileName);

        if (arquivo.canWrite()) {
            System.out.println("Escritura si");
        } else {
            System.out.println("Escritura non");
        }

        if (arquivo.canRead()) {
            System.out.println("Lectura si");
        } else {
            System.out.println("Lectura non");
        }
    }

    public static String calculaLonxitude(String dirName, String fileName) {
        File arquivo = new File(dirName, fileName);

        return "Tamaño: " + arquivo.length() + " bytes";
    }
}

