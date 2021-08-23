package mainApp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="articulos")
public class Articulo {
	
	// Atributos
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	@Column(name = "nombre")
	private String nombre;
//	@Column(name = "precio")
	private int precio;
//	@Column(name = "fabricante")
	private int fabricante;
	
	// Constructores
	
	public Articulo() {
		
	}
	
	public Articulo(String nombre, int precio, int fabricante) {
		this.nombre = nombre;
		this.precio = precio;
		this.fabricante = fabricante;
	}
	
	// Setters & Getters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getFabricante() {
		return fabricante;
	}

	public void setFabricante(int fabricante) {
		this.fabricante = fabricante;
	}

	@Override
	public String toString() {
		return "Articulo [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", fabricante=" + fabricante
				+ "]";
	}

}
