package cl.duoc.productos.Repository;

import cl.duoc.productos.Model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductoRepository
        extends JpaRepository<Producto, Long> {
}