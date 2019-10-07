package ar.edu.unahur.obj2.diablo;

import ar.edu.unahur.obj2.Lugar.Lugar;
import ar.edu.unahur.obj2.almas.*;
import ar.edu.unahur.obj2.almas.CruzRoja;
import ar.edu.unahur.obj2.almas.Entrenar;
import ar.edu.unahur.obj2.demonios.Demonio;

import java.util.*;
import java.util.stream.Collectors;

public class Diablo {
    CruzRoja CruzRoja;
    LuchaMarcialDemoniaca luchaMarcialDemoniaca;
    SupervivenciaExtrema supervivenciaExtrema;
    Alma almaEntrenada;
    private Set<Alma> almasCazadasPorDemonios = new HashSet<>();
    private List<Demonio> misDemonios = new ArrayList<>();


    public List<Demonio> getMisDemonios() {
        return misDemonios;
    }

    public boolean puedeCazarA(Alma alma, Demonio demonio, Lugar lugar){
        if ( lugar.getHabitantes().contains(alma)){
            demonio.cazar(lugar);
            return (demonio.getListaPersonasCazadas().contains(alma));
            }
            return false;
    }
    public void entrenarAlma(Entrenar entrenar, Alma alma){
        if(entrenar.equals(CruzRoja)) {
            almaEntrenada = new CruzRoja(alma);
        }else if ( entrenar.equals(luchaMarcialDemoniaca)){
            almaEntrenada = new LuchaMarcialDemoniaca(alma);
        }else {
            almaEntrenada = new SupervivenciaExtrema(alma);
        }
    }

    public void atormentarA(Demonio demonio, Alma alma){
        demonio.atormentarA(alma);
    }
    public void demonioCazar(Demonio demonio, Lugar lugar){
        demonio.cazar(lugar);
        almasCazadasPorDemonios.addAll(demonio.listaPersonasCazadas);
        lugar.habitantes.removeAll(demonio.listaPersonasCazadas);
    }
    public List<Alma> almasCazadasPorDemonios(){
        return misDemonios.stream().
                flatMap(demonio -> demonio.listaPersonasCazadas.stream()).
                collect(Collectors.toList());
    }
    public Alma almaMasValiente(){
        return almasCazadasPorDemonios.stream().max(Comparator.comparing(Alma::getValor)).get();
        /* List<Integer> list = Arrays.asList(2, 4, 1, 3, 7, 5, 9, 6, 8);

        Optional<Integer> maxNumber = list.stream()
                                .max((i, j) -> i.compareTo(j));

        System.out.println(maxNumber.get());
    }*/
    }
    public Demonio mejorCazador(){
        Demonio demonioCazador = misDemonios.get(0);
        int cantidad = demonioCazador.getListaPersonasCazadas().size();

        for(int i=0; i<misDemonios.size(); i++) {
            Demonio demonioComparado = misDemonios.get(i);
            if(demonioComparado.getListaPersonasCazadas().size() > cantidad) {
                demonioCazador = demonioComparado;
            }
        }
        return demonioCazador;
    }


}









