package erp.pedidos.Reabastecimiento;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReabastecimientoService {
    
@Autowired
ReabastecimientoRepository repository;
    //CRUD
    //Delimitador de acceso (public, private) tipo de dato de retorno, nombre del metodo, param,etros de entrada [sentencias]
public Reabastecimiento save(Reabastecimiento entity){
        return repository.save(entity);
}

public void deleteById(long id){
    repository.deleteById(id);
}

public Reabastecimiento findById(long id){
    return repository.findById(id).orElse(null);
}

public List<Reabastecimiento> findAll(){
    return repository.findAll();
}
}
