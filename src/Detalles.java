
import java.sql.PreparedStatement;
import javax.swing.ImageIcon;

/**
 *
 * @author luisf
 */
public class Detalles {

    String id, cantidad;
    ImageIcon foto;
    String precio, status, pedido, producto;

    public Detalles(String id) {
        this.id = id;
    }

    
    public Detalles(String id, String cantidad, ImageIcon foto, String precio, String status, String pedido, String producto) {
        this.id = id;
        this.cantidad = cantidad;
        this.foto = foto;
        this.precio = precio;
        this.status = status;
        this.pedido = pedido;
        this.producto = producto;
    }

    public int insertar (Conexion cnx){
        try {
            String sql = "INSERT INTO detalles VALUES (?,?,?,?,?,?,?)";
            PreparedStatement ps = cnx.con.prepareStatement(sql);
            ps.setString(1, id);
            ps.setString(2, cantidad);
            ps.setBinaryStream(3, cnx.ImagenBytes(foto));
            ps.setString(4, precio);
            ps.setString(5, status);
            ps.setString(6, pedido);
            ps.setString(7, producto);
            
            return ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("No se pudo insertar " + e.getMessage());
            return 0;
        }
    }
    
    public int actualizar(Conexion cnx) {
        try {
            String sql = "UPDATE detalles SET cantidadp=?,fotod=?,preciod=?,estatus=?,pedidos_folio=?,productos_idproductos=? "
                    + "WHERE  iddetalles=?";
            PreparedStatement ps = cnx.con.prepareStatement(sql);
            
            ps.setString(1, cantidad);
            ps.setBinaryStream(2, cnx.ImagenBytes(foto));
            ps.setString(3, precio);
            ps.setString(4, status);
            ps.setString(5, pedido);
            ps.setString(6, producto);
            ps.setString(7, id);
            
            return ps.executeUpdate();

        } catch (Exception e) {
            System.out.println("No se pudo actualizar " + e.getMessage());
            return 0;
        }
    }
    
    public int remover(Conexion cnx) {
        try {
            String sql = "DELETE FROM detalles WHERE iddetalles=?";
            PreparedStatement ps = cnx.con.prepareStatement(sql);

            ps.setString(1, id);

            return ps.executeUpdate();

        } catch (Exception e) {
            System.out.println("No se pudo remover " + e.getMessage());
            return 0;
        }
    }
    
}
