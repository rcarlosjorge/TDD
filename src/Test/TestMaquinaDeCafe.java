package Test;

import TDD.Azucarero;
import TDD.Cafetera;
import TDD.MaquinaDeCafe;
import TDD.Vaso;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMaquinaDeCafe {

    Cafetera cafetera;
    Vaso vasosPequeño;
    Vaso vasosMediano;
    Vaso vasosGrande;

    Azucarero azucarero;
    MaquinaDeCafe maquinaDeCafe;

    @Before
    public void setUp()
    {
        cafetera = new Cafetera(50);
        vasosPequeño = new Vaso(5,10);
        vasosMediano = new Vaso(5,20);
        vasosGrande = new Vaso(5,30);
        azucarero = new Azucarero(20);

        maquinaDeCafe = new MaquinaDeCafe(cafetera);
        maquinaDeCafe.setCafetera(cafetera);
        maquinaDeCafe.setVasosPequeño(vasosPequeño);
        maquinaDeCafe.setVasosMediano(vasosMediano);
        maquinaDeCafe.setVasosGrande(vasosGrande);
        maquinaDeCafe.setAzucarero(azucarero);
    }

    @Test
    public void deberiaDevolverUnVasoPequeño()
    {
        Vaso vaso = maquinaDeCafe.getTipoDeVaso("pequeño");

        assertEquals(maquinaDeCafe.vasosPequeño(), vaso);
    }

    @Test
    public void deberiaDevolverUnVasoMediano()
    {
        MaquinaDeCafe maquinaDeCafe = new MaquinaDeCafe(cafetera);

        Vaso vaso = this.maquinaDeCafe.getTipoDeVaso("mediano");

        assertEquals(this.maquinaDeCafe.vasosMediano(), vaso);
    }

    @Test
    public void deberiaDevolverUnVasoGrande()
    {
        Vaso vaso = maquinaDeCafe.getTipoDeVaso("grande");

        assertEquals(this.maquinaDeCafe.vasosGrandes(), vaso);
    }

    @Test
    public void deberiaDevolverNoHayVasos()
    {
        Vaso vaso = maquinaDeCafe.getTipoDeVaso("pequeño");

        String resultado = maquinaDeCafe.getVasoDeCafe(vaso,10,2);

        assertEquals("No hay Vasos", resultado);
    }

    @Test
    public void deberiaDevolverNoHayCafe()
    {
        cafetera = new Cafetera(5);
        maquinaDeCafe.setCafetera(cafetera);

        Vaso vaso = maquinaDeCafe.getTipoDeVaso("pequeño");

        String resultado = maquinaDeCafe.getVasoDeCafe(vaso,1,2);

        assertEquals("No hay Cafe", resultado);
    }

    @Test
    public void deberiaDevolverNoHayAzucar()
    {
        azucarero = new Azucarero(2);
        maquinaDeCafe.setAzucarero(azucarero);

        Vaso vaso = maquinaDeCafe.getTipoDeVaso("pequeño");

        String resultado = maquinaDeCafe.getVasoDeCafe(vaso,1,3);

        assertEquals("No hay Azucar", resultado);
    }

    @Test
    public void deberiaRestarCafe()
    {
        Vaso vaso = maquinaDeCafe.getTipoDeVaso("pequeño");
        maquinaDeCafe.getVasoDeCafe(vaso,1,3);

        int resultado = maquinaDeCafe.getCafetera().getCantidadCafe();

        assertEquals(40, resultado);
    }

    @Test
    public void deberiaRestarVaso()
    {

        Vaso vaso = maquinaDeCafe.getTipoDeVaso("pequeño");

        maquinaDeCafe.getVasoDeCafe(vaso,1,3);

        int resultado = maquinaDeCafe.getVasosPequeño().getCantidadVasos();

        assertEquals(4, resultado);

    }

    @Test
    public void deberiaRestarAzucar()
    {
        Vaso vaso = maquinaDeCafe.getTipoDeVaso("pequeño");

        maquinaDeCafe.getVasoDeCafe(vaso,1,3);

        int resultado = maquinaDeCafe.getAzucarero().getCantidadAzucar();

        assertEquals(17, resultado);
    }

    @Test
    public void deberiaDevolverFelicitaciones()
    {

        Vaso vaso = maquinaDeCafe.getTipoDeVaso("pequeño");

        String resultado = maquinaDeCafe.getVasoDeCafe(vaso,1,3);

        assertEquals("Felicitaciones", resultado);
    }

}

