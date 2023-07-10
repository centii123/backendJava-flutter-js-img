package erp.pedidos.roles;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface ImageRepository extends JpaRepository<Image, Long> {
    /*@Query(value = "SELECT * FROM images WHERE category = :category", nativeQuery = true)
    List<Image> findByCategory(@Param("category") String category);*/

    @Query(value = "SELECT * FROM images", nativeQuery = true)
    List todasimg();
}
