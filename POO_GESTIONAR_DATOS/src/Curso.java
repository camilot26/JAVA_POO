import java.util.ArrayList;
import java.util.Scanner;

public class Curso {

    private String codigo;
    private String nombre;

    private static int index = 1;

    /*es un metodo que se puede instanciar sin usar la clase*/
    private ArrayList<Estudiante> listaEstudiantes;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.listaEstudiantes = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(ArrayList<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

    public void agregarEstudiante(Scanner objscan) {
        objscan.nextLine();
        System.out.println("Nombre estudiante ");
        String nombre = objscan.nextLine();
        System.out.println("Email estudiante ");
        String email = objscan.nextLine();
        Estudiante estudiante = new Estudiante(index, nombre, email);
        index++;
        this.listaEstudiantes.add(estudiante);
        System.out.println("Estudiante agregado correctamente");
    }
    public void listarEstudiantes() {

        if (this.listaEstudiantes.isEmpty()) {
            System.out.println("No se puede mostrar lista vacia".concat(this.nombre));


        } else {
            System.out.println("lista de estudiantes del".concat(this.nombre));
            for (Estudiante estudiante : this.listaEstudiantes) {
                System.out.println(estudiante.toString());


            }
        }

    }
    public void eliminarEstudiante(Scanner objscan){
        this.listarEstudiantes();
        System.out.println("ingrese el id");
        int idEliminar = objscan.nextInt();
        boolean eliminado=this.listaEstudiantes.removeIf(estudiante->estudiante.getId()==idEliminar);
        System.out.println(eliminado?"Estudiante eliminado":"No se puede eliminar");


    }


    @Override
    public String toString() {
        return "Curso{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", listaEstudiantes=" + listaEstudiantes +
                '}';
    }
}
