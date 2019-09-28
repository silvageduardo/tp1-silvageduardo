package ar.edu.unahur.obj2;

public abstract class Demonio {
    private int nivelMaldad;


    public Demonio(int nivelMaldad) {
        this.nivelMaldad = nivelMaldad;
   }

    public int getNivelMaldad() {
        return nivelMaldad;
    }

    abstract void cazar(Lugar lugar );

}
