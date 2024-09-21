package AbstractFactory.Zapato;

public class ZapatoFormal implements Zapato{
    @Override
    public void crear() {
        System.out.println("Zapato formal creado");
    }

    @Override
    public String obtenerColor() {
        return "Cafe";
    }

    @Override
    public String obtenerMaterial() {
        return "Cuerina";
    }

    @Override
    public String obtenerEstilo() {
        return "Suela alta";
    }
}
