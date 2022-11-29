
import java.sql.PreparedStatement;


public class Pedidos {
    String folio, fecha, hora, estatus, cliente, empleado;

    public Pedidos(String cliente, String empleado) {
        this.folio = null;
        this.fecha = Conexion.ObtenerFecha();
        this.hora = Conexion.ObtenerHora();
        this.estatus = "pendiente";
        this.cliente = cliente;
        this.empleado = empleado;
    }

    

     public int insertar (Conexion cnx){
        try {
            String sql = "INSERT INTO pedidos VALUES (?,?,?,?,?,?)";
            PreparedStatement ps = cnx.con.prepareStatement(sql);
            ps.setString(1, folio);
            ps.setString(2, fecha);
            ps.setString(3, hora);
            ps.setString(4, estatus);
            ps.setString(5, cliente);
            ps.setString(6, empleado);
            
            return ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("No se pudo insertar " + e.getMessage());
            return 0;
        }
    }
     
     public int actualizar(Conexion cnx) {
        try {
            String sql = "UPDATE pedidos SET fecha=?, hora=?,estatus=?,clientes_codigoc=?,empleados_codigoe=? "
                    + "WHERE folio=?";
            PreparedStatement ps = cnx.con.prepareStatement(sql);
            
            ps.setString(1, fecha);
            ps.setString(2, hora);
            ps.setString(3, estatus);
            ps.setString(4, cliente);
            ps.setString(5, empleado);
            ps.setString(6, folio);
            
            return ps.executeUpdate();

        } catch (Exception e) {
            System.out.println("No se pudo actualizar " + e.getMessage());
            return 0;
        }
    }
     
    public int remover(Conexion cnx) {
        try {
            String sql = "DELETE FROM pedidos WHERE folio=?";
            PreparedStatement ps = cnx.con.prepareStatement(sql);

            ps.setString(1, folio);

            return ps.executeUpdate();

        } catch (Exception e) {
            System.out.println("No se pudo remover " + e.getMessage());
            return 0;
        }
    }
}
