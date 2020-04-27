package cl.saleapp.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.saleapp.springboot.model.Cliente;

public interface IClienteRepo extends JpaRepository<Cliente, Integer>{

}
