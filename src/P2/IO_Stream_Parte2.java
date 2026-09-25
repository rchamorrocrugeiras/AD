package P2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO_Stream_Parte2 {
    public static void copiar() throws IOException {
        FileInputStream entrada = new FileInputStream("src/P2/foto.jpg");
        FileOutputStream saida = new FileOutputStream("src/P2/foto2.jpg");

        int byteleido;

        while ((byteleido = entrada.read()) != -1) {
            saida.write(byteleido);
        }

        entrada.close();
        saida.close();
    }
}
