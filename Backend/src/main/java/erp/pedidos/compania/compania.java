package erp.pedidos.compania;

import java.math.BigInteger;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
@Data
@Entity
public class compania {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String Nombre_compania;
    private String Direccion_compania;
    private BigInteger Telefono_compania;
    private String Correo_compania;
}