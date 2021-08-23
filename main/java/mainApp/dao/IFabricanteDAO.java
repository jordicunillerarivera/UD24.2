package mainApp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import mainApp.dto.Fabricante;

public interface IFabricanteDAO extends JpaRepository<Fabricante, Integer>{
	
	//Listar clientes or campo nombre
	public List<Fabricante> findByNombre(String nombre);
	
}
