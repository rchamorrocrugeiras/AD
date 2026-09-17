package P2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO_Stream {
    public static void copiar() throws IOException{
        FileInputStream entrada = new FileInputStream("texto1.txt");
        FileOutputStream saida = new FileOutputStream("texto2.txt");

        int byteleido;

        while ((byteleido = entrada.read()) != -1) {
            saida.write(byteleido);
        }

        entrada.close();
        saida.close();
    }
}
