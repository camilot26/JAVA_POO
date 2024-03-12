import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventario objInventario = new Inventario();

        int option = 0;
        int id = 0;
        String nombre = "";
        double precio = 0;
        String categoria = "";
        String marca = "";
        do {
            scanner.nextLine();
            System.out.println("\nENTER PARA CONTINUAR ...");
            scanner.nextLine();



            System.out.println("Menu de opciones");
            System.out.println("1. Agregar");
            System.out.println("2. Eliminar");
            System.out.println("3. Buscar por nombre");
            System.out.println("4. Buscar por categoria");
            System.out.println("5. listar inventario");
            System.out.println("5. Salir");
            System.out.println("Ingresa una opcion: ");

            option = scanner.nextInt();
            switch (option) {
                case 1:
                    while (true) {
                        int option2 = 0;
                        System.out.println("agregar id del producto");
                        id = scanner.nextInt();
                        System.out.println("agregar nombre del producto");
                        nombre = scanner.next();
                        System.out.println("agregar precio del producto");
                        precio = scanner.nextDouble();
                        System.out.println("agregar categoria del producto");
                        categoria = scanner.next();
                        System.out.println("agregar marca del producto");
                        marca = scanner.next();
                        ProductoEspecifico objeto = new ProductoEspecifico(id, nombre, precio, categoria, marca);
                        objInventario.agregarProducto(objeto);
                        objInventario.listarproductos();
                        System.out.println("desea continuar ");
                        option2 = scanner.nextInt();
                        if (option2 == 0) {
                            break;
                        }
                    }


                    break;
                case 2:
                    System.out.println("Ingresa el id del producto");
                    id = scanner.nextInt();
                    objInventario.eliminarProducto(id);
                    objInventario.listarproductos();
                    break;
                case 3:
                    System.out.println("ingresa el nombre a buscar");

                    nombre = scanner.next();

                   /* System.out.println(objInventario.buscarNombre(nombre));*/
                    if(objInventario.buscarNombre(nombre)==null){

                        System.out.println("no se encontro producto por nombre");

                    }else {

                        System.out.println(objInventario.buscarNombre(nombre).toString());
                    }

                    break;
                case 4:
                    System.out.println("Ingrese la categoria del producto");
                    nombre = scanner.next();
                    if(objInventario.buscarCategoria(nombre)==null){
                        System.out.println("no se encontro producto por categoria");

                    }else {
                        System.out.println(objInventario.buscarNombre(nombre).toString());
                    }
                    break;
                case 5:
                        objInventario.listarproductos();

                    break;

            }


        } while (option != 6);


    }
}






