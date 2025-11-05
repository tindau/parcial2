package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import logica.Parcial;

public class ParcialTest {

    private Parcial parcial;

    @BeforeEach
    public void setUp() {
        this.parcial = new Parcial();
    }

    @Test
    public void raicesRealesTest() throws Exception {
        double[] r = this.parcial.calcularRaices(1, -3, 2); 
        assertEquals(1.0, r[0]);
        assertEquals(2.0, r[1]);
    }

    @Test
    public void discriminanteCeroTest() throws Exception {
        double[] r = this.parcial.calcularRaices(1, 2, 1); 
        assertEquals(-1.0, r[0]);
        assertEquals(-1.0, r[1]);
    }
    
    @Test
    public void testAigualCero() {
        Exception e = assertThrows(Exception.class, () -> parcial.calcularRaices(0, 2, 1));
        assertEquals("El valor de a no puede ser cero, ya que  no sería una ecuación de segundo orden.", e.getMessage());
    }

    @Test
    public void testRaicesComplejas() {
        Exception e = assertThrows(Exception.class, () -> parcial.calcularRaices(1, 2, 5));
        assertEquals("La ecuación no tiene raíces reales, sus raíces son complejas.", e.getMessage());
    }
}  