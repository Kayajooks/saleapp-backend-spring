package cl.saleapp.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CATEGORIA")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_caterogia;
	
	@Column(name="nombre", nullable=false, length=70)
	private String nombre;
	
	@Column(name="descripcion", nullable=false, length=100)
	private String descripcion;

	public Integer getId_caterogia() {
		return id_caterogia;
	}

	public void setId_caterogia(Integer id_caterogia) {
		this.id_caterogia = id_caterogia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
