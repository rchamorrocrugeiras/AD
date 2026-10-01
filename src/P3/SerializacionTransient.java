package P3;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializacionTransient {

    public static void main(String[] args) {
        ProductoTransient p = new ProductoTransient();

        p.nome = "René Chamorro";
        p.num1 = 25;
        p.num2 = 15.75;

        try {
            FileOutputStream fos = new FileOutputStream("serialTransient");
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