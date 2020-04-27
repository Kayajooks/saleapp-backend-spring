package cl.saleapp.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.saleapp.springboot.model.Categoria;

public interface ICategoriaRepo extends JpaRepository<Categoria, Integer>{

}
