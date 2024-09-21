package AbstractFactory;

import AbstractFactory.FabricaZapatos.FabricaZapatos;
import AbstractFactory.FabricaZapatos.FabricaZapatosMujer;
import AbstractFactory.FabricaZapatos.FabricaZapatosNino;
import AbstractFactory.Zapato.Zapato;

public class Main {
    public static void main(String[] args) {
        FabricaZapatos fabricaMujer = new FabricaZapatosMujer();
        Zapato zapatoDeportivoMujer = fabricaMujer.crearZapatoDeportivo();
        zapatoDeportivoMujer.crear();
        System.out.println("Color: " + zapatoDeportivoMujer.obtenerColor());
        System.out.println("Material: " + zapatoDeportivoMujer.obtenerMaterial());
        System.out.println("Estilo: " + zapatoDeportivoMujer.obtenerEstilo());

        FabricaZapatos fabricaNino = new FabricaZapatosNino();
        Zapato zapatoFormalNino = fabricaNino.crearZapatoFormal();
        zapatoFormalNino.crear();
        System.out.println("Color: " + zapatoFormalNino.obtenerColor());
        System.out.println("Material: " + zapatoFormalNino.obtenerMaterial());
        System.out.println("Estilo: " + zapatoFormalNino.obtenerEstilo());
    }
}
