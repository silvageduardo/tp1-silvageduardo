package ar.edu.unahur.obj2.demonios;

import ar.edu.unahur.obj2.Lugar.Lugar;
import ar.edu.unahur.obj2.almas.Alma;

import java.util.*;

public abstract class Demonio {
    public int nivelMaldad;
    public Set<Alma> listaPersonasCazadas = new LinkedHashSet<>();
    Set<Alma> listpaPersonasAtormentadas = new LinkedHashSet<>();


    public Set<Alma> getListaPersonasCazadas() {
        return listaPersonasCazadas;
    }

    public Set<Alma> getListpaPersonasAtormentadas() {
        return listpaPersonasAtormentadas;
    }
    public abstract void atormentarA(Alma alma);

    public Demonio(int nivelMaldad) {
        this.nivelMaldad = nivelMaldad;
   }

    public int getNivelMaldad() {
        return nivelMaldad;
    }

    public void setNivelMaldad(int nivelMaldad) {
        this.nivelMaldad = nivelMaldad;
    }

    public boolean puedeCazarA(Alma alma){
        return nivelMaldad > alma.getBondad();
    }

    public void cazar(Lugar lugar ){
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



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Demonio)) return false;
        Demonio demonio = (Demonio) o;
        return getNivelMaldad() == demonio.getNivelMaldad() &&
                Objects.equals(getListaPersonasCazadas(), demonio.getListaPersonasCazadas()) &&
                Objects.equals(getListpaPersonasAtormentadas(), demonio.getListpaPersonasAtormentadas());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNivelMaldad(), getListaPersonasCazadas(), getListpaPersonasAtormentadas());
    }
}
