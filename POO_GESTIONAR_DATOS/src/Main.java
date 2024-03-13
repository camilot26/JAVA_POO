import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int opcion = 0;

        Scanner objScan = new Scanner(System.in);
        GestionCurso gestionCurso = new GestionCurso();
        do {
            System.out.println("""
                    1.Administrar Estudiantes
                    2.Administrar Cursos
                    3.Salir
                     
                    ingree una opcion:
                    """);
            opcion = objScan.nextInt();
            int opcion2 = 0;
            switch (opcion) {
                case 1:
                    do {

                        System.out.println("""
                                Menu de estudiantes
                                1.agregar estudiante
                                2.listar estudiantes
                                3.eliminar estudiantes
                                4.salir
                                                        
                                                        
                                """);
                        opcion2 = objScan.nextInt();
                        switch (opcion2) {
                            case 1:
                                gestionCurso.listarCursos();
                                System.out.println("a cual de los cursos desea agregar estudiante");
                                String idbuscar = objScan.next();
                                Curso objcurso = gestionCurso.buscarCurso(idbuscar);
                                if (objcurso == null) {

                                    System.out.println("el codigo ingresado no es valido");
                                } else {
                                    objcurso.agregarEstudiante(objScan);


                                }
                                break;
                            case 2:
                                gestionCurso.listarCursos();
                                System.out.println("que curso desea listar");
                                idbuscar = objScan.next();
                                objcurso = gestionCurso.buscarCurso(idbuscar);
                                objcurso.listarEstudiantes();


                                break;
                            case 3: // eliminar un estudiante en especifico
                                // listar curso
                                //preguntar curso
                                //buscar el curso
                                gestionCurso.listarCursos();
                                System.out.println("que curso desea eliminar");
                                idbuscar = objScan.next();
                                Curso objcurso1 = gestionCurso.buscarCurso(idbuscar);
                                if (objcurso1 == null) {
                                    System.out.println("codigo no valido");
                                } else {
                                    objcurso1.eliminarEstudiante(objScan);

                                }
                                break;


                        }

                    } while (opcion2 != 4);


                    break;
                case 2:
                    do {

                        System.out.println("""
                                Menu de cursos
                                1.agregar cursos
                                2.listar cursos
                                3.buscar cursos
                                4.salir
                                                        
                                                        
                                """);
                        opcion2 = objScan.nextInt();
                        switch (opcion2) {
                            case 1:
                                gestionCurso.agregarCurso(objScan);


                                break;
                            case 2:
                                gestionCurso.listarCursos();


                                break;
                            case 3:

                                System.out.println("ingresar codigo a buscar");
                                String tipo = objScan.next();
                                Curso objCurso = gestionCurso.buscarCurso(tipo);
                                if (objCurso == null) {

                                    System.out.println("no existe");
                                } else {

                                    System.out.println(objCurso.toString());
                                }


                                break;

                        }


                    }
                    while (opcion2 != 4);


                    break;

            }
        }
        while (opcion != 3);


        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    }
}