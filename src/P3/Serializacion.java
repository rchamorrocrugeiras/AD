package P3;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Serializacion {

    public static void main(String[] args) {
        Producto p = new Producto();

        p.nome = "René Chamorro";
        p.num1 = 25;
        p.num2 = 15.75;

        try {
            FileOutputStream fos = new FileOutputStream("serial");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(p);

            oos.close();
            fos.close();

            System.out.println("Objeto guardado correctamente.");

            FileInputStream fis = new FileInputStream("serial");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Producto recuperado = (Producto) ois.readObject();

            ois.close();
            fis.close();

            System.out.println("Objeto recuperado correctamente.");
            System.out.println("Nome: " + recuperado.nome);
            System.out.println("Num1: " + recuperado.num1);
            System.out.println("Num2: " + recuperado.num2);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}