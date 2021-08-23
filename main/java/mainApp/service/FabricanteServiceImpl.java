package mainApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mainApp.dao.IFabricanteDAO;
import mainApp.dto.Fabricante;

@Service
public class FabricanteServiceImpl implements IFabricanteService{
	
	@Autowired
	IFabricanteDAO iFabricanteDAO;

	@Override
	public List<Fabricante> listarFabricante() {
		
		return iFabricanteDAO.findAll();
	}

	@Override
	public Fabricante guardarFabricante(Fabricante fabricante) {
		
		return iFabricanteDAO.save(fabricante);
	}

	@Override
	public Fabricante fabricanteId(int codigo) {
		
		return iFabricanteDAO.findById(codigo).get();
	}

	@Override
	public List<Fabricante> fabricanteNombre(String nombre) {
		
		return iFabricanteDAO.findByNombre(nombre);
	}

	@Override
	public Fabricante actualizarFabricante(Fabricante fabricante) {
		
		return iFabricanteDAO.save(fabricante);
	}

	@Override
	public void eliminarFabricante(int codigo) {
		
		iFabricanteDAO.deleteById(codigo);
	}

}
