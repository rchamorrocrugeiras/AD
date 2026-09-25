package P2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO_Stream_Parte2 {
    public static void copiar() throws IOException {
        FileInputStream entrada = new FileInputStream("src/P2/fot.txt");
        FileOutputStream saida = new FileOutputStream("src/P2/foto2.txt");

        int byteleido;

        while ((byteleido = entrada.read()) != -1) {
            saida.write(byteleido);
        }

        entrada.close();
        saida.close();
    }

    public static void engadir() throws IOException {
        FileInputStream entrada = new FileInputStream("src/P2/texto1.txt");
        FileOutputStream saida = new FileOutputStream("src/P2/texto2.txt", true);

        int byteleido;

        while ((byteleido = entrada.read()) != -1) {
            saida.write(byteleido);
        }

        entrada.close();
        saida.close();
    }
}
