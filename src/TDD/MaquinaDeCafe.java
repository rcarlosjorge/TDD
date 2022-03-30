package TDD;

public class MaquinaDeCafe {

  Cafetera cafe;
  Vaso vasosPequenos;
  Vaso vasosMedianos;
  Vaso vasosGrandes;
  Azucarero azucar;

    public MaquinaDeCafe(Cafetera cafetera)
    {
        this.cafe = cafetera;
        this.vasosPequenos = new Vaso();
        this.vasosMedianos = new Vaso();
        this.vasosGrandes = new Vaso();
        this.azucar = new Azucarero(10);
    }

    public void setCafetera(Cafetera cafetera) { this.cafe = cafetera; }
    public void setVasosPequeño(Vaso vasosPequenos) { this.vasosPequenos = vasosPequenos; }
    public void setVasosMediano(Vaso vasosMedianos) { this.vasosMedianos = vasosMedianos; }
    public void setVasosGrande(Vaso vasosGrandes) { this.vasosGrandes = vasosGrandes; }
    public void setAzucarero(Azucarero azucar) { this.azucar = azucar; }

    public Vaso vasosPequeño() { return this.vasosPequenos; }
    public Vaso vasosMediano() { return this.vasosMedianos; }
    public Vaso vasosGrandes() { return this.vasosGrandes; }

    public Vaso getTipoDeVaso(String vaso)
    {
        if(vaso.equals("pequeño"))
        {
            return this.vasosPequenos;
        }
        else if(vaso.equals("mediano"))
        {
            return this.vasosMedianos;
        }
        else if(vaso.equals("grande"))
        {
            return this.vasosGrandes;
        }
        else
        {
            return null;
        }
    }

    public String getVasoDeCafe(Vaso vaso, int cantidadDeVasos, int cantidadDeAzucar)
    {
        if(vaso.equals(this.vasosPequenos) && this.vasosPequenos.hasVasos(cantidadDeVasos))
        {
            this.vasosPequenos.giveVasos(cantidadDeVasos);
        }
        else if(vaso.equals(this.vasosMedianos) && this.vasosMedianos.hasVasos(cantidadDeVasos))
        {
            this.vasosMedianos.giveVasos(cantidadDeVasos);
        }
        else if(vaso.equals(this.vasosGrandes) && this.vasosGrandes.hasVasos(cantidadDeVasos))
        {
            this.vasosGrandes.giveVasos(cantidadDeVasos);
        }
        else
        {
            return "No hay Vasos";
        }

        if(this.azucar.hasAzucar(cantidadDeAzucar))
        {
            this.azucar.giveAzucar(cantidadDeAzucar);
        }
        else
        {
            return "No hay Azucar";
        }

        if(this.cafe.hasCafe(vaso.getContenido()))
        {
            this.cafe.giveCafe(vaso.getContenido());
        }
        else
        {
            return "No hay Cafe";
        }

        return "Felicitaciones";
    }

    public Cafetera getCafetera() {
        return cafe;
    }

    public Azucarero getAzucarero() {
        return azucar;
    }

    public Vaso getVasosPequeño() {
        return vasosPequenos;
    }
}
