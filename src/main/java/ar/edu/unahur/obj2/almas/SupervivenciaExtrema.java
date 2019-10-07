package ar.edu.unahur.obj2.almas;

public class SupervivenciaExtrema extends Entrenar {


    public SupervivenciaExtrema(Alma alma) {
        super( alma);
    }

    @Override
    public Boolean getEsFriolenta() {
        return false;
    }
}
