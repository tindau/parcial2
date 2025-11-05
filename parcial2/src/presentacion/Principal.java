package presentacion;

import java.util.Arrays;
import logica.Parcial;

public class Principal {

    private Parcial parcial;

    public Principal() {
        this.parcial = new Parcial();

        try {
            double[] r1 = this.parcial.calcularRaices(1, -3, 2);
            System.out.println("Caso 1 -> Discriminante mayor (a=1, b=-3, c=2): " + Arrays.toString(r1));

            double[] r2 = this.parcial.calcularRaices(1, 2, 1);
            System.out.println("Caso 2 -> Discriminante igual 0 (a=1, b=2, c=1): " + Arrays.toString(r2));

            double[] r3 = this.parcial.calcularRaices(1, 2, 5);
            System.out.println("Caso 3 -> Discriminante menor (a=1, b=2, c=5): " + Arrays.toString(r3));
            
            double[] r4 = this.parcial.calcularRaices(0, 2, 1);
            System.out.println("Caso 4 -> a igual a cero (a=0, b=2, c=1): " + Arrays.toString(r4));            
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Principal();
    }
}
