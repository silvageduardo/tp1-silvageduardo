package ar.edu.unahur.obj2.Lugar;


import ar.edu.unahur.obj2.almas.Alma;

import java.util.HashSet;
import java.util.Set;

public class Lugar {
    private String nombre;
    public Set<Alma> habitantes = new HashSet<>();

    public Lugar(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public Set<Alma> getHabitantes() {
        return habitantes;
    }


}
