package cl.saleapp.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCTO")
public class Producto {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer id_producto;
	
	@ManyToOne
	@JoinColumn(name="id_categoria", nullable=false, foreignKey = @ForeignKey(name = "FK_id_categoria"))
	private Categoria id_Categoria;
	
	@Column(name="nombre", nullable=false, length=100)
	private String nombre;
	
	@Column(name="precio")
	private Integer precio;
	
	@Column(name="stock")
	private Integer stock;

	public Integer getId_producto() {
		return id_producto;
	}

	public void setId_producto(Integer id_producto) {
		this.id_producto = id_producto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

}
