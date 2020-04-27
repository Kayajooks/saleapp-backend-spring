package cl.saleapp.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.saleapp.springboot.model.Producto;

public interface IProductoRepo extends JpaRepository<Producto, Integer>{

}
