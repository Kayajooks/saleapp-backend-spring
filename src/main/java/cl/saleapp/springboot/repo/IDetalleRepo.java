package cl.saleapp.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.saleapp.springboot.model.Detalle;

public interface IDetalleRepo extends JpaRepository<Detalle, Integer>{

}
