package ar.edu.unahur.obj2;

import ar.edu.unahur.obj2.Lugar.Lugar;
import ar.edu.unahur.obj2.almas.Alma;
import ar.edu.unahur.obj2.demonios.*;
import ar.edu.unahur.obj2.diablo.Diablo;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.LinkedHashSet;
import java.util.Set;

public class DiabolicoTest {
    Demonio demonioFuego,demonioHielo,demonioSombra;
    Diablo diablo;
    Alma persona1;
    Alma persona2;
    Alma persona3;
    Alma persona4;
    Alma persona5;
    Alma persona6;
    Alma persona7;
    Alma persona8;
    Alma persona9;
    Alma persona10;
    Lugar norte,sur,este,oeste;
    Set<Alma> comparar;
    @BeforeMethod
    public void setUp() {
        demonioFuego = new Fuego( 30);
        demonioHielo = new Hielo(30);
        demonioSombra = new Sombra(30);
        persona1 = new Alma(10,10,false);
        persona2 = new Alma(10,10,true);
        persona3 = new Alma(10,10,false);
        persona4 = new Alma(30,10,true);
        persona5 = new Alma(10,10,false);
        persona6 = new Alma(10,10,true);
        persona7 = new Alma(10,10,true);
        persona8 = new Alma(10,10,true);
        persona9 = new Alma(10,10,true);
        persona10 = new Alma(10,10,true);
        diablo = new Diablo( );
        norte = new Lugar("Norte");
        norte.habitantes.add(persona1);
        norte.habitantes.add(persona2);
        norte.habitantes.add(persona3);
        norte.habitantes.add(persona4);
        norte.habitantes.add(persona5);
        comparar = new LinkedHashSet<>();
        comparar.add(persona1);
        comparar.add(persona3);
        comparar.add(persona5);
    }

        @Test
        public void testAtormentarA() {
            demonioFuego.atormentarA(persona1);
            Assert.assertEquals(persona1.getBondad(),5);
        }

        @Test
        public void testCazar() {
            demonioFuego.cazar(norte);
            Assert.assertEquals(demonioFuego.listaPersonasCazadas, comparar);
        }

        @Test
        public void testDiabloCazarA(){
            diablo.demonioCazar(demonioFuego,norte);
            Assert.assertEquals(norte.habitantes.size(),2);
        }

}