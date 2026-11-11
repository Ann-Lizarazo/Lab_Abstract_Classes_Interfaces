public class Main {

    public static void main(String[] args) {

        //  Bloque 1: fichas polimórficas 
        System.out.println("=== 1. Fichas ===");
        Animal[] animales = {
                new Perro("Luna", 3, "Carlos", "Labrador"),
                new Gato("Michi", 2, "Ana", true),
                new Ave("Pepe", 1, "Sofía", 450),
                new Conejo("Bunny", 1, "Luis"),   // Bloque 4

        };
        for (Animal a : animales) {
            a.imprimirFicha();
        }

        // Bloque 2: vacunar (tipo concreto)
        System.out.println(" 2. Vacunas ");
        Perro perro = new Perro("Rex", 5, "Marta", "Pastor Alemán");
        Gato gato = new Gato("Nala", 4, "Pedro", false);

        perro.registrarVacuna("Rabia");
        perro.registrarVacuna("Parvovirus");
        gato.registrarVacuna("Triple felina");

        System.out.println("Vacunas de Rex: " + perro.getVacunasAplicadas());
        System.out.println("Vacunas de Nala: " + gato.getVacunasAplicadas());


        // Ave ave = new Ave("Pepe", 1, "Sofía", 450);
        // ave.registrarVacuna("Newcastle");

        // Bloque 3: pólizas 
        System.out.println("\n 3. Pólizas ");
        Clinica clinica = new Clinica("VetCare", "Calle 100 #15-20");
        Asegurable[] asegurables = {perro, gato, clinica};
        for (Asegurable s : asegurables) {
            System.out.println(s.obtenerNumeroPoliza() + " -> prima anual: $" + s.calcularPrimaSeguro());
        }
    }
}