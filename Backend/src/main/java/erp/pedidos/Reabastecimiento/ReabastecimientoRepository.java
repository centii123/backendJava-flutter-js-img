package erp.pedidos.Reabastecimiento;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ReabastecimientoRepository extends CrudRepository <Reabastecimiento, Long> {
    List<Reabastecimiento> findAll();
}
