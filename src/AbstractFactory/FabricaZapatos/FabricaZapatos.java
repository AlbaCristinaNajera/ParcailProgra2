package AbstractFactory.FabricaZapatos;

import AbstractFactory.Zapato.Zapato;

public interface FabricaZapatos {
    Zapato crearZapatoDeportivo();
    Zapato crearZapatoFormal();
}
