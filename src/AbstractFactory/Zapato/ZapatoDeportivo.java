package AbstractFactory.Zapato;

public class ZapatoDeportivo implements Zapato{

    @Override
    public void crear() {
        System.out.println("Zapato deportivo creado");
    }

    @Override
    public String obtenerColor() {
        return "negro";
    }

    @Override
    public String obtenerMaterial() {
        return "Cuero";
    }

    @Override
    public String obtenerEstilo() {
        return "Con cintas";
    }
}
