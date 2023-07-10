package erp.pedidos.ciudad;

    import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;


@Service
public class ciudadService {

    @Autowired
    private ciudadRepository base;

    //mostrar todos
    public ArrayList<ciudadEntity> getAll(){
        return (ArrayList<ciudadEntity>) this.base.findAll();
    }

    //mostrar uno
    public Optional<ciudadEntity> getOne(Long id){
        return this.base.findById(id);
    }

    //guardar nuevo
    public ciudadEntity save(ciudadEntity persona){
        return this.base.save(persona);
    }

    //actualizar todo
    public ciudadEntity put(Long id, ciudadEntity personaAc){
        ciudadEntity datos = this.base.findById(id).get();
        datos.setNombreCiudad(personaAc.getNombreCiudad());
        this.base.save(datos);
        return datos;
    }

    //actualizar por campos
    public ciudadEntity patch(Long id, ciudadEntity personaAc){
        ciudadEntity datos = this.base.findById(id).get();
        datos.setNombreCiudad((personaAc.getNombreCiudad() != null) ? personaAc.getNombreCiudad() : datos.getNombreCiudad());
        this.base.save(datos);
        return datos;
    }

    //eliminar
    public String delete(Long id){
        this.base.deleteById(id);
        return "eliminado";
    }
}
