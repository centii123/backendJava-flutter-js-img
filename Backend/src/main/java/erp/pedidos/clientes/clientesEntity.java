package erp.pedidos.clientes;

import java.sql.Date;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "clientes") //(opcional)
public class clientesEntity{ // en la base debe estar el mismo nombre pero en minuscula

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;

    private String nombreCliente; //debe ser varchar o character varing en la base de datos
    private Date fechaNacimiento;
    private String direccion;
    private String correoElectronico;
}
