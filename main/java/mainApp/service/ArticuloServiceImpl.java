package mainApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mainApp.dao.IArticuloDAO;
import mainApp.dto.Articulo;

@Service
public class ArticuloServiceImpl implements IArticuloService {

	@Autowired
	IArticuloDAO articuloDAO;

	@Override
	public List<Articulo> listarArticulo() {
		
		return articuloDAO.findAll();
	}

	@Override
	public Articulo guardarArticulo(Articulo articulo) {
		
		return articuloDAO.save(articulo);
	}

	@Override
	public Articulo articuloId(int codigo) {
		
		return articuloDAO.findById(codigo).get();
	}

	@Override
	public List<Articulo> articuloNombre(String nombre) {
		
		return articuloDAO.findByNombre(nombre);
	}

	@Override
	public Articulo actualizarArticulo(Articulo articulo) {
		
		return articuloDAO.save(articulo);
	}

	@Override
	public void eliminarArticulo(int codigo) {
		
		articuloDAO.deleteById(codigo);
	}
	
}
