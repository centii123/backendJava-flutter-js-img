package erp.pedidos.producto;

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
@RequestMapping("/api/producto")
//Nos permite controlar solicitudes de recursos crusados
@CrossOrigin({"*"})
public class ProductoController {
    
    @Autowired
    ProductoService service;

    @GetMapping("/{id}/")
    public Producto findById(@PathVariable long id){
       return service.findById(id);
    }

    @GetMapping("/")
    public List<Producto> findAll(){
        return service.findAll();
    }

    //Create
    @PostMapping("/")
    public Producto save (@RequestBody Producto entity){
       return service.save(entity);
    }

    @PutMapping("/")
    public Producto update (@RequestBody Producto entity){
        return service.save(entity);
    }

    @DeleteMapping("/{id}/")
    public void deeteById(@PathVariable long id){
        service.deleteById(id);
    }

}
