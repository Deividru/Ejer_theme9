public class Main {
    public static void main(String[] args) {

        Cliente c1 = new Cliente();

        c1.edad = 5;
        c1.nombre = "Lucy";
        c1.telefono = 645478339;
        c1.credito = 500;

        System.out.println("Tenemos un cliente con los siguientes datos:");
        System.out.println("Nombre: " +c1.nombre + " su edad es: "+ c1.edad +" años.");
        System.out.println("su numero de contacto: " +c1.telefono + ", su credito en la cuenta es: "+ c1.credito +"€.");
        System.out.println("");
        
        Trabajador t1 = new Trabajador(2000);
        t1.edad = 20;
        t1.nombre = "manolo";
        t1.telefono = 642332839;

        System.out.println("Tenemos un trabajador con los siguientes datos:");
        System.out.println("Nombre: " +t1.nombre + " su edad es: "+ t1.edad +" años.");
        System.out.println("su numero de contacto: " +t1.telefono + ", Su salario actual es: "+ t1.salario +"€.");





    }
}