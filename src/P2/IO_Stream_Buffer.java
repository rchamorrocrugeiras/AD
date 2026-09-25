package P2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO_Stream_Buffer {

    public static void copiar() throws IOException {

        FileInputStream entrada = new FileInputStream("src/P2/foto.jpg");
        BufferedInputStream entradaBuffer = new BufferedInputStream(entrada);

        FileOutputStream saida = new FileOutputStream("src/P2/foto3.jpg");
        BufferedOutputStream saidaBuffer = new BufferedOutputStream(saida);

        int byteleido;

        while ((byteleido = entradaBuffer.read()) != -1) {
            saidaBuffer.write(byteleido);
        }

        entradaBuffer.close();
        saidaBuffer.close();
    }
}