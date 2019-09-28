package ar.edu.unahur.obj2;

public class Alma {
    private int bondad;
    private int valor;
    private Boolean friolenta;


    public Alma(int bondad, int valor, Boolean friolenta) {
        this.bondad = bondad;
        this.valor = valor;
        this.friolenta = friolenta;
    }

    public int getBondad() {
        return bondad;
    }

    public int getValor() {
        return valor;
    }

    public Boolean getFriolenta() {
        return friolenta;
    }

    public void setBondad(int bondad) {
        this.bondad = bondad;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setFriolenta(Boolean friolenta) {
        this.friolenta = friolenta;
    }
}
