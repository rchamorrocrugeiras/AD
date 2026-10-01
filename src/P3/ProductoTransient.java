package P3;

import java.io.Serializable;

public class ProductoTransient implements Serializable {

    String nome;
    transient int num1;
    double num2;
}