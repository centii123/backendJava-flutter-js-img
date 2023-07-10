package erp.pedidos.usuario;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.Data;
@Data
@Entity
public class Usuario {
    //Delimitador de acceso, tipo de dato, nombre del atributo, cierre con punto y como;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nombre;
    private String correoElectronico;
    private String contrasena;

} 