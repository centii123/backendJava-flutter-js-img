package erp.pedidos.ciudad;

    import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "ciudad") //(opcional)
public class ciudadEntity{ // en la base debe estar el mismo nombre pero en minuscula

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCiudad;

    private String nombreCiudad; //debe ser varchar o character varing en la base de datos

}
