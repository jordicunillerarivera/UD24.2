package mainApp.service;

import java.util.List;

import mainApp.dto.Fabricante;

public interface IFabricanteService {
	
	// Metodos CRUD
	
	public List<Fabricante> listarFabricante();	// Listar a todos los fabricantes
	
	public Fabricante guardarFabricante(Fabricante fabricante);	// Crear fabricante nuevo
	
	public Fabricante fabricanteId(int codigo);	// Buscar fabricante por codigo
	
	public List<Fabricante> fabricanteNombre(String nombre);	// Buscar fabricante por nombre
	
	public Fabricante actualizarFabricante(Fabricante fabricante);	// Actualizar la informacion de un fabricante
	
	public void eliminarFabricante(int codigo);	// Eliminar a un fabricante

}
