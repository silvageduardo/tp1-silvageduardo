package ar.edu.unahur.obj2.almas;

public class LuchaMarcialDemoniaca extends Entrenar {

    public LuchaMarcialDemoniaca(Alma alma) {
        super(alma);
    }

    @Override
    public int getValor() {
        return super.getValor() * 2;
    }
}
