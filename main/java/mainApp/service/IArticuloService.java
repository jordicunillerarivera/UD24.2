package mainApp.service;

import java.util.List;

import mainApp.dto.Articulo;

public interface IArticuloService {
	
	// Metodos CRUD
	
	public List<Articulo> listarArticulo();	// Listar a todos los articulos
	
	public Articulo guardarArticulo(Articulo articulo);	// Crear articulo
	
	public Articulo articuloId(int codigo);	// Buscar articulo por nombre
	
	public List<Articulo> articuloNombre(String nombre);	// Buscar articulo por nombre
	
	public Articulo actualizarArticulo(Articulo articulo);	// Actualizar la informacion de un articulo
	
	public void eliminarArticulo(int codigo); // Eliminar articulo por id 

}
