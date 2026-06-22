package App;
import Service.Gestor;



public class Main {

    public static void main (String[] args) {
        Gestor G = new Gestor();
        System.out.println( " INICIANDO SISTEMA ");
        G.cargarDesdearchivo("proveedores.txt");

        System.out.println("\nCatálogo");
        G.mostrarTodo();



        System.out.println( "\n Filtrado" );
        G.buscarPorServicio("Gastronomia");

    }
}
