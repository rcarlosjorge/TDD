package Test;

import TDD.Azucarero;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAzuquero {

    Azucarero azucarero;

    @Before
    public void setUp() {
        azucarero = new Azucarero(10);
    }

    @Test
    public void deberiadevolverVerdaderoSiHaySuficienteAzucarEnElAzucarero() {

        boolean resultado = azucarero.hasAzucar(5);

        assertEquals(true, resultado);

        resultado = azucarero.hasAzucar(10);

        assertEquals(true, resultado);
    }

    @Test
    public void deberiadevolverFalsoPorqueNoHaySuficienteAzucarEnElAzucarero() {

        boolean resultado = azucarero.hasAzucar(15);

        assertEquals(false, resultado);
    }

    @Test
    public void deberiaRestarAzucarAlAzucarero() {

        azucarero.giveAzucar(5);

        assertEquals(5, azucarero.getCantidadAzucar());

        azucarero.giveAzucar(2);

        assertEquals(3, azucarero.getCantidadAzucar());
    }
}

