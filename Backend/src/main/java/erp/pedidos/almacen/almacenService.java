package erp.pedidos.almacen;

import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Service;
    
    @Service
    public class almacenService {
        
        @Autowired
        almacenRepository repository;

        public almacen save(almacen entity){
            return repository.save(entity);
        }
    
        public void deleteById(long id){
            repository.deleteById(id);
        }
    
        public almacen findById(long id){
            return repository.findById(id).orElse(null);
        }
    }
