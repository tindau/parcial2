package logica;

public class Parcial {

    public double[] calcularRaices(double a, double b, double c) throws Exception {
    	    	
        if (a == 0)
            throw new Exception("El valor de a no puede ser cero, ya que  no sería una ecuación de segundo orden.");

        double discriminante = b*b - 4*a*c;

        if (discriminante < 0) {
            throw new Exception("La ecuación no tiene raíces reales, sus raíces son complejas.");
        }
        
    	double[] rta = new double[2];
        
        if (discriminante == 0) {
        	double raiz = (-b / (2*a));
        	rta[0] = raiz;
            rta[1] = raiz;
        }
        else {
        	rta[0] = (-b - Math.sqrt(discriminante)) / (2*a);
        	rta[1] = (-b + Math.sqrt(discriminante)) / (2*a); 
        }
        
        return rta;
    }
}