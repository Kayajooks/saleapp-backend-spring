package cl.saleapp.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.saleapp.springboot.model.ModoPago;

public interface IModoPagoRepo extends JpaRepository<ModoPago, Integer> {

}
