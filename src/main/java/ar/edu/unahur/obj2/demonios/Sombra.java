package ar.edu.unahur.obj2.demonios;

import ar.edu.unahur.obj2.Lugar.Lugar;
import ar.edu.unahur.obj2.almas.Alma;

import java.util.Iterator;

public class Sombra extends Demonio {

    public Sombra(int nivelMaldad) {
        super(nivelMaldad);
    }

    @Override
    public void atormentarA(Alma alma) {
        alma.setBondad(alma.getBondad() - 5);
        alma.setBondad(alma.getValor()/2);
    }

    @Override
    public boolean puedeCazarA(Alma alma) {
        return super.puedeCazarA(alma) && alma.getValor() < 50;
    }

    @Override
    public void cazar(Lugar lugar) {
        Iterator<Alma> iterator = lugar.getHabitantes().iterator();
        while (iterator.hasNext()){
            Alma persona = iterator.next();
            if(  puedeCazarA(persona)){
                listaPersonasCazadas.add(persona);
                iterator.remove();
            }else {
                listpaPersonasAtormentadas.add(persona); //almas jodidas
            }
            listpaPersonasAtormentadas.stream().forEach(alma -> {
                atormentarA(alma);
            });
        };
        this.setNivelMaldad( this.getNivelMaldad() + listpaPersonasAtormentadas.size() + listaPersonasCazadas.size()*2);
        listpaPersonasAtormentadas.clear();
    }
}
