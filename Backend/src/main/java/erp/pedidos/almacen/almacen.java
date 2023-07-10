package erp.pedidos.almacen;

import erp.pedidos.compania.compania;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
@Data
@Entity
public class almacen {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nombre_almacen;
    private String direccion_almacen;
    private String capacidad_almacenimento;

    @ManyToOne
    private compania id_compania;
}
