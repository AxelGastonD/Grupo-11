public class Producto {
    
    private int codigo;
    private String descripcion;
    private double precio;
    private String categoria;
    private int stock;

    public Producto(int codigo, String descripcion, double precio, String categoria, int stock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.categoria = categoria;
        this.stock = stock;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getStock() {
        return stock;
    }
    
    
}
