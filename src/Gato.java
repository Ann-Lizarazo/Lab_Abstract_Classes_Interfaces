public class Gato extends Animal implements Vacunable, Asegurable {

    private boolean esEsterilizado;
    private int vacunas = 0;

    public Gato(String nombre, int edad, String nombreDueno, boolean esEsterilizado) {
        super(nombre, edad, nombreDueno);
        this.esEsterilizado = esEsterilizado;
    }

    @Override
    public double calcularCostoConsulta() {
        return 38000;
    }

    @Override
    public void registrarVacuna(String nombre) {
        vacunas++;
    }

    @Override
    public int getVacunasAplicadas() {
        return vacunas;
    }

    @Override
    public double calcularPrimaSeguro() {
        if (esEsterilizado) {
            return 120000;
        }
        return 200000;
    }

    @Override
    public String obtenerNumeroPoliza() {
        return "POL-GATO-" + getNombre().toUpperCase();
    }
}
