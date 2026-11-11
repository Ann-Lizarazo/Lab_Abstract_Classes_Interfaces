/**
 * Animal es abstracta: no existe un "animal a secas", solo perros, gatos, aves...
 * Guarda lo que todos tienen en común
 */
public abstract class Animal {

    // private: nadie de afuera toca los datos directamente, solo por getters y setters
    private String nombre;
    private int edad;
    private String nombreDueno;

    public Animal(String nombre, int edad, String nombreDueno) {
        this.nombre = nombre;
        this.edad = edad;
        this.nombreDueno = nombreDueno;
    }

    // Getters: las subclases los usan para leer los datos
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombreDueno() {
        return nombreDueno;
    }

    // Setters: para cambiar los datos de forma controlada
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombreDueno(String nombreDueno) {
        this.nombreDueno = nombreDueno;
    }

    // Cada especie calcula su costo a su manera, por eso aquí no tiene cuerpo
    public abstract double calcularCostoConsulta();

    // Todas las especies heredan esta ficha igual
    public void imprimirFicha() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Dueño: " + nombreDueno);
        System.out.println("Costo de consulta: $" + calcularCostoConsulta());
        System.out.println("-----------------------------");
    }
}
