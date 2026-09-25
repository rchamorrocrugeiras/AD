package P2;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.DataInputStream;
import java.io.FileInputStream;

public class Data_Stream {

    public static void escribir() throws IOException {
        DataOutputStream saida = new DataOutputStream(
                new FileOutputStream("src/P2/texto3.txt")
        );

        String texto = "o tempo está xélido";

        for (int i = 0; i < 3; i++) {
            saida.writeUTF(texto);
            System.out.println("Escribindo a cadea: " + texto);
            System.out.println("Tamaño do ficheiro: " + saida.size() + " bytes");
        }

        System.out.println("Tamaño final do ficheiro: " + saida.size() + " bytes");

        saida.close();
    }

    public static void ler() throws IOException {
        DataInputStream entrada = new DataInputStream(
                new FileInputStream("src/P2/texto3.txt")
        );

        while (entrada.available() > 0) {
            System.out.println("Quedan: " + entrada.available() + " bytes por ler");
            String texto = entrada.readUTF();
            System.out.println("Cadea: " + texto);
        }

        System.out.println("Xa non queda nada por ler");

        entrada.close();
    }
}