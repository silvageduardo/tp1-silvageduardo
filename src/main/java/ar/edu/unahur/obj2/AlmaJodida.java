package ar.edu.unahur.obj2;

public class AlmaJodida extends Alma {

    private Alma alma;

    public AlmaJodida(int bondad, int valor, Boolean friolenta, Alma alma) {
        super(bondad, valor, friolenta);
        this.alma = alma;
    }


    private void atormentar( Demonio demonio){
        alma.setBondad( alma.getBondad() - 5 );
        //if (demonio.fuego){
        //      alma.setFriolenta = false;}
        //else(demonio.hielo){
        //      alma.setFriolenta = true;
        //
    }

}
