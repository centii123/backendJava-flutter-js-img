package erp.pedidos.categorias;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriasService {
    
@Autowired
CategoriasRepository repository;
    //CRUD
    //Delimitador de acceso (public, private) tipo de dato de retorno, nombre del metodo, param,etros de entrada [sentencias]
public Categorias save(Categorias entity){
        return repository.save(entity);
}

public void deleteById(long id){
    repository.deleteById(id);
}

public Categorias findById(long id){
    return repository.findById(id).orElse(null);
}

public List<Categorias> findAll(){
    return repository.findAll();
}
}