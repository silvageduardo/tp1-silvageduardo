package ar.edu.unahur.obj2;


import java.util.HashSet;
import java.util.Set;

public class Lugar {
    private String nombre;
    private Set<Alma> habitantes = new HashSet<>();

    public Lugar(String nombre, Set<Alma> habitantes) {
        this.nombre = nombre;
        this.habitantes = habitantes;
    }

    public String getNombre() {
        return nombre;
    }

    public Set<Alma> getHabitantes() {
        return habitantes;
    }


}
