import java.util.ArrayList;


public class Inventario {
    private final ArrayList<ProductoEspecifico>  listaProductos;
    public Inventario() {
        this.listaProductos = new ArrayList<>();
    }
    public void agregarProducto(ProductoEspecifico producto) {
        this.listaProductos.add(producto);
    }
    public boolean eliminarProducto(int id ) {
        return this.listaProductos.removeIf(producto -> producto.getId() == id);


    }
    public  ProductoEspecifico buscarNombre(String nombre) {
        for (ProductoEspecifico Ojproducto : listaProductos){
            if(Ojproducto.getNombre().equals(nombre)){

                return Ojproducto;
            }
        }
        return null;
    }
    public  ProductoEspecifico buscarCategoria(String nombre) {
        for (ProductoEspecifico Ojproducto : listaProductos){
            if(Ojproducto.getCategoria().equals(nombre)){

                return Ojproducto;
            }
        }
        return null;
    }

    public void listarproductos(){
        for( ProductoEspecifico iterador:listaProductos ){

            System.out.println(iterador.toString());

        }


    }


}