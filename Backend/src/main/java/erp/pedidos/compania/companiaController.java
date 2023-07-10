package erp.pedidos.compania;

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
@RequestMapping("/api/compania")
@CrossOrigin({"*"})
public class companiaController {
    
    @Autowired
    companiaService service;

    @GetMapping("/{id}/")
    public compania findById(@PathVariable long id){
       return service.findById(id);
    }

    @PostMapping("/")
    public compania save (@RequestBody compania entity){
       return service.save(entity);
    }

    @PutMapping("/")
    public compania update (@RequestBody compania entity){
        return service.save(entity);
    }

    @DeleteMapping("/{id}/")
    public void deeteById(@PathVariable long id){
        service.deleteById(id);
    }

}
