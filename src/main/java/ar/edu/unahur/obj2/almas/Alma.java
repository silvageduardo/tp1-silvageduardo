package ar.edu.unahur.obj2.almas;

public class Alma {
    private int bondad;
    private int valor;
    private Boolean esFriolenta;


    public Alma(int bondad, int valor, Boolean esFriolenta) {
        this.bondad = bondad;
        this.valor = valor;
        this.esFriolenta = esFriolenta;
    }

    public int getBondad() {
        return bondad;
    }

    public int getValor() {
        return valor;
    }

    public Boolean getEsFriolenta() {
        return esFriolenta;
    }

    public void setBondad(int bondad) {
        this.bondad = bondad;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setEsFriolenta(Boolean esFriolenta) {
        this.esFriolenta = esFriolenta;
    }


}
