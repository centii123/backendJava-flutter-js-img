package erp.pedidos.roles;

import java.io.IOException;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Base64;

import javax.sql.rowset.serial.SerialBlob;

import org.hibernate.mapping.Any;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/images")
@CrossOrigin("*")
public class ImageController {
    @Autowired
    private ImageRepository imageRepository;

    @PostMapping
    public void subirImagen(@RequestParam("file") MultipartFile file) throws IOException {
        Image image = new Image();
        image.setNombre(file.getOriginalFilename());
        image.setTipo(file.getContentType());
        image.setDatos(file.getBytes());

        imageRepository.save(image);
    }

    @GetMapping("/{id}")
    public ResponseEntity<byte[]> obtenerImagen(@PathVariable("id") Long id) {

        Optional<Image> optionalImage = imageRepository.findById(id);

        if (optionalImage.isPresent()) {
            Image image = optionalImage.get();
            return ResponseEntity.ok().contentType(MediaType.parseMediaType(image.getTipo())).body(image.getDatos());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<Image>> listarImagenes() {
        List<Image> images = imageRepository.findAll();
        return ResponseEntity.ok().body(images);
    }

    @GetMapping("/a")
    public ResponseEntity<List<Image>> getImages() {
        List<Image> images = imageRepository.todasimg();
        return ResponseEntity.ok().body(images);
    }

    @GetMapping("/aa")
    public String hola() {

        // Supongamos que tienes el valor byte 49671
        byte byteValue = (byte) 49671;

// Convertir el byte a una cadena Base64
String base64String = Base64.getEncoder().encodeToString(new byte[] { byteValue });

return base64String;

    }
}