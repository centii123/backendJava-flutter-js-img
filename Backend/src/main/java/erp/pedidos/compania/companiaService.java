package erp.pedidos.compania;

import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Service;
    
    @Service
    public class companiaService {
        
        @Autowired
        companiaRepository repository;

        public compania save(compania entity){
            return repository.save(entity);
        }
    
        public void deleteById(long id){
            repository.deleteById(id);
        }
    
        public compania findById(long id){
            return repository.findById(id).orElse(null);
        }
    }