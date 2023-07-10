package erp.pedidos.clientes;

    import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;


@Service
public class clientesService {

    @Autowired
    private clientesRepository base;

    //mostrar todos
    public ArrayList<clientesEntity> getAll(){
        return (ArrayList<clientesEntity>) this.base.findAll();
    }

    //mostrar uno
    public Optional<clientesEntity> getOne(Long id){
        return this.base.findById(id);
    }

    //guardar nuevo
    public clientesEntity save(clientesEntity persona){
        return this.base.save(persona);
    }

    //actualizar todo
    public clientesEntity put(Long id, clientesEntity personaAc){
        clientesEntity datos = this.base.findById(id).get();
        datos.setIdCliente(personaAc.getIdCliente());
        datos.setFechaNacimiento(personaAc.getFechaNacimiento());
        datos.setCorreoElectronico(personaAc.getCorreoElectronico());
        datos.setDireccion(personaAc.getDireccion());
        this.base.save(datos);
        return datos;
    }

    //actualizar por campos
    public clientesEntity patch(Long id, clientesEntity personaAc){
        clientesEntity datos = this.base.findById(id).get();
        datos.setIdCliente((personaAc.getIdCliente() != null) ? personaAc.getIdCliente() : datos.getIdCliente());
        datos.setFechaNacimiento((personaAc.getFechaNacimiento() != null) ? personaAc.getFechaNacimiento() : datos.getFechaNacimiento());
        datos.setCorreoElectronico((personaAc.getCorreoElectronico() != null) ? personaAc.getCorreoElectronico() : datos.getCorreoElectronico());
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


