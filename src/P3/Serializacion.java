package P3;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serializacion {

    public static void main(String[] args) {
        Producto p = new Producto();

        p.nome = "Alexandre Dumas";
        p.num1 = 25;
        p.num2 = 15.75;

        try {
            FileOutputStream fos = new FileOutputStream("serial");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(p);

            oos.close();
            fos.close();

            System.out.println("Objeto guardado correctamente.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}