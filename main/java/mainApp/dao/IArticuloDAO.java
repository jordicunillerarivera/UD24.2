package mainApp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import mainApp.dto.Articulo;

public interface IArticuloDAO extends JpaRepository<Articulo, Integer>{

	//Listar clientes or campo nombre
	public List<Articulo> findByNombre(String nombre);
	
}
