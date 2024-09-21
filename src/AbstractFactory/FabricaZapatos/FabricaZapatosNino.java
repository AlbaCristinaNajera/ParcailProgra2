package AbstractFactory.FabricaZapatos;

import AbstractFactory.Zapato.Zapato;
import AbstractFactory.Zapato.ZapatoDeportivo;
import AbstractFactory.Zapato.ZapatoFormal;

public class FabricaZapatosNino implements FabricaZapatos{
    @Override
    public Zapato crearZapatoDeportivo() {
        return new ZapatoDeportivo();
    }

    @Override
    public Zapato crearZapatoFormal() {
        return new ZapatoFormal();
    }
}
