package ar.edu.unahur.obj2.demonios;

import ar.edu.unahur.obj2.Lugar.Lugar;
import ar.edu.unahur.obj2.almas.Alma;

import java.util.Iterator;

public class Hielo extends Demonio {


    public Hielo(int nivelMaldad) {
        super(nivelMaldad);
    }

    @Override
    public void atormentarA(Alma alma) {
        alma.setEsFriolenta(false);
        alma.setBondad(alma.getBondad() - 5);
    }

    @Override
    public boolean puedeCazarA(Alma alma) {
        return super.puedeCazarA(alma) && alma.getEsFriolenta();
    }

}
