package erp.pedidos.proveedores;

    import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;


@Service
public class proveedoresService {

    @Autowired
    private proveedoresRepository base;

    //mostrar todos
    public ArrayList<proveedoresEntity> getAll(){
        return (ArrayList<proveedoresEntity>) this.base.findAll();
    }

    //mostrar uno
    public Optional<proveedoresEntity> getOne(Long id){
        return this.base.findById(id);
    }

    //guardar nuevo
    public proveedoresEntity save(proveedoresEntity persona){
        return this.base.save(persona);
    }

    //actualizar todo
    public proveedoresEntity put(Long id, proveedoresEntity personaAc){
        proveedoresEntity datos = this.base.findById(id).get();
        datos.setNombre(personaAc.getNombre());
        datos.setDireccion(personaAc.getDireccion());
        this.base.save(datos);
        return datos;
    }

    //actualizar por campos
    public proveedoresEntity patch(Long id, proveedoresEntity personaAc){
        proveedoresEntity datos = this.base.findById(id).get();
        datos.setNombre((personaAc.getNombre() != null) ? personaAc.getNombre() : datos.getNombre());
        datos.setDireccion((personaAc.getDireccion() != null) ? personaAc.getDireccion() : datos.getDireccion());
        this.base.save(datos);
        return datos;
    }

    //eliminar
    public String delete(Long id){
        this.base.deleteById(id);
        return "eliminado";
    }
}
