package TDD;

public class Azucarero
{

    int cantidadDeAzucar;

    public Azucarero(int i) { cantidadDeAzucar = i; }

    public boolean hasAzucar(int eAzucar)
    {
        return cantidadDeAzucar >= eAzucar ? true : false;
    }

    public int giveAzucar(int eAzucar)
    {
        return cantidadDeAzucar -= eAzucar;
    }

    public int getCantidadAzucar()
    {
        return cantidadDeAzucar;
    }

    public void setCantidadDeAzucar(int cantidadDeAzucar)  { this.cantidadDeAzucar -= cantidadDeAzucar; }

}
