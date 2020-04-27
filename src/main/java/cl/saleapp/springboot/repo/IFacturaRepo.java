package cl.saleapp.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.saleapp.springboot.model.Factura;

public interface IFacturaRepo extends JpaRepository<Factura, Integer>{

}
