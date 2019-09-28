package ar.edu.unahur.obj2;

public class Fuego extends Demonio {

    // List<Alma> listaPersonas
    // List<AlmaJodida> listpaPersonasAtormentadas


    public Fuego(int nivelMaldad) {
        super(nivelMaldad);
    }

    @Override
    void cazar(Lugar lugar) {

        lugar.getHabitantes().forEach( persona -> {
                    if (persona.getBondad() > this.getNivelMaldad() && !persona.getFriolenta()) {
                        // lugar.habitantes().remove(persona)
                        // listaPersonas.add(persona)
                        //
                    }else {
                        // listaPersonasAtormentadas.add(new AlmaJodida(persona))
                    }
                    //listaPersonasAtormentadas.forEach( persona -> persona.atormentar()
                });
    }
}
