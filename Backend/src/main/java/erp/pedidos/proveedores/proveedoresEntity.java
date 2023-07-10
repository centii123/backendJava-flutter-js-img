package erp.pedidos.proveedores;

import erp.pedidos.ciudad.ciudadEntity;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "proveedores") //(opcional)
public class proveedoresEntity{ // en la base debe estar el mismo nombre pero en minuscula

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProveedor;
    private String nombre; 
    private String direccion;

    
    @ManyToOne
    private ciudadEntity ciudad;
}
