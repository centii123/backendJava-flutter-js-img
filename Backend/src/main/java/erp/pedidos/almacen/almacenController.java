package erp.pedidos.almacen;

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
@RequestMapping("/api/almacen")
@CrossOrigin({"*"})
public class almacenController {
    
    @Autowired
    almacenService service;

    @GetMapping("/{id}/")
    public almacen findById(@PathVariable long id){
       return service.findById(id);
    }

    @PostMapping("/")
    public almacen save (@RequestBody almacen entity){
       return service.save(entity);
    }

    @PutMapping("/")
    public almacen update (@RequestBody almacen entity){
        return service.save(entity);
    }

    @DeleteMapping("/{id}/")
    public void deeteById(@PathVariable long id){
        service.deleteById(id);
    }

}
