package erp.pedidos.usuario;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    
@Autowired
UsuarioRepository repository;
    //CRUD
    //Delimitador de acceso (public, private) tipo de dato de retorno, nombre del metodo, param,etros de entrada [sentencias]
public Usuario save(Usuario entity){
        return repository.save(entity);
}

public void deleteById(long id){
    repository.deleteById(id);
}

public Usuario findById(long id){
    return repository.findById(id).orElse(null);
}

public List<Usuario> findAll(){
    return repository.findAll();
}
}
