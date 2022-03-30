package TDD;

public class Cafetera {

    int cantidadCafe;

    public Cafetera(int i) {
        cantidadCafe = i;
    }

    public int getCantidadCafe(){
        return cantidadCafe;
    }
    public void setCantidadCafe(int cantidadCafe)  { this.cantidadCafe -= cantidadCafe; }

    public boolean hasCafe(int cantidadCafe)
    {
        if (cantidadCafe <= this.cantidadCafe)
        {
            return true;
        }
        else {
            return false;
        }
    }

    public int giveCafe(int cantidadCafe)
    {
        if(hasCafe(cantidadCafe))
        {
            this.cantidadCafe -= cantidadCafe;
            return cantidadCafe;
        }
        else
        {
            return 0;
        }
    }
}
