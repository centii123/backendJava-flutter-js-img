package erp.pedidos.usuario;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//Es una ruta de acceso para manejar solicitudes http
@RequestMapping("/api/usuario")
//Nos permite controlar solicitudes de recursos crusados
@CrossOrigin({"*"})
public class UsuarioController {

@Autowired
UsuarioService service;

@GetMapping("/{id}/")
public Usuario findById(@PathVariable long id){
    return service.findById(id);
}

@GetMapping("/")
public List<Usuario> findAll(){
    return service.findAll();
}

//Create
@PostMapping("/")
public Usuario save (@RequestBody Usuario entity){
    return service.save(entity);
}

@PutMapping("/")
public Usuario update (@RequestBody Usuario entity){
    return service.save(entity);
}

@DeleteMapping("/{id}/")
public void deeteById(@PathVariable long id){
    service.deleteById(id);
}

}