package erp.pedidos.ciudad;

    //import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;


//tambien se puede usar JpaRepository es mejor por unas funciones extras pero trabajan igual
public interface ciudadRepository extends CrudRepository<ciudadEntity, Long> {
    //Persona es el objeto clase que se aplicara los metodos
    //Long es el atributo que quiere que se base que es el ID de la Entidad persona
}
