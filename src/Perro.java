public class Perro extends Animal implements Vacunable, Asegurable {

    private String raza;
    private int vacunas = 0;

    public Perro(String nombre, int edad, String nombreDueno, String raza) {
        super(nombre, edad, nombreDueno);
        this.raza = raza;
    }

    @Override
    public double calcularCostoConsulta() {
        return 45000 + 3000 * getEdad();
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
        return 80000 * getEdad();
    }

    @Override
    public String obtenerNumeroPoliza() {
        return "POL-PERRO-" + getNombre().toUpperCase();
    }
}
