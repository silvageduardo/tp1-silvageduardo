package ar.edu.unahur.obj2.almas;

public class Entrenar extends Alma {//decorator

    Alma alma;//composicion

    public Entrenar(Alma alma) {
        super(alma.getBondad(),alma.getValor(), alma.getEsFriolenta());
        this.alma = alma;
    }

    public Alma getAlma() {
        return alma;
    }
}
