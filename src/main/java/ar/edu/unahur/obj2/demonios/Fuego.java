package ar.edu.unahur.obj2.demonios;

import ar.edu.unahur.obj2.Lugar.Lugar;
import ar.edu.unahur.obj2.almas.Alma;

import java.util.Iterator;

public class Fuego extends Demonio {

    public Fuego(int nivelMaldad) {
        super(nivelMaldad);
    }

    @Override
    public void atormentarA(Alma alma) {
        alma.setEsFriolenta(true);
        alma.setBondad(alma.getBondad() - 5);
    }

    @Override
    public boolean puedeCazarA(Alma alma) {
        return super.puedeCazarA(alma) && !alma.getEsFriolenta();
    }
}


        /*lugar.getHabitantes().forEach( persona -> {
                    if (  this.getNivelMaldad() > persona.getBondad() && !persona.getEsFriolenta()) {
                        listaPersonasCazadas.add(persona);
                        lugar.getHabitantes().remove(persona);
                    }else {
                        listpaPersonasAtormentadas.add(persona); //almas jodidas
                    }
                    listpaPersonasAtormentadas.forEach(alma -> {
                        alma.setEsFriolenta(true);
                        alma.setBondad(alma.getBondad() - 5);
                    });
                });
        this.setNivelMaldad( this.getNivelMaldad() + listpaPersonasAtormentadas.size() + listaPersonasCazadas.size()*2);
        listpaPersonasAtormentadas.clear();
    }*/

