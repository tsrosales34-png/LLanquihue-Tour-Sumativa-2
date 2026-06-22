package Service;
import Model.Proveedor;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;



public class Gestor {
private ArrayList <Proveedor> listaProveedores = new ArrayList<>();

public void cargarDesdearchivo (String ruta) {

    try {
            File archivo = new File(ruta);
            Scanner lector = new Scanner(archivo);
            while (lector.hasNextLine()) {
                String[] datos = lector.nextLine().split(";");
                if (datos.length == 3) {
                    listaProveedores.add(new Proveedor(datos[0], datos[1], datos[2]));
                }
            }
                lector.close();
        } catch (Exception e) {
            System.out.println("error en la carga de archivos: " + e.getMessage());

        }
    }
        public void mostrarTodo() {

        int contador  = 1;

            for (Proveedor P : listaProveedores) {
                System.out.println(contador + "." + P);
                contador++;
            }
        }
    public void buscarPorServicio(String tipo) {
        System.out.println("resultados por: "  + tipo);
        listaProveedores.stream()
                .filter(p ->p.getServicio().equalsIgnoreCase(tipo))
                .forEach(System.out ::println);


}

}