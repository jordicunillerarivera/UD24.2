package mainApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mainApp.dto.Articulo;
import mainApp.service.ArticuloServiceImpl;

@RestController
@RequestMapping("/api")
public class ArticuloController {

	@Autowired
	ArticuloServiceImpl articuloServiceImpl;
	
	@GetMapping("/articulos")
	public List<Articulo> listarArticulos() {
		return articuloServiceImpl.listarArticulo();
	}
	
	@PostMapping("/articulos")
	public Articulo guardarArticulo(@RequestBody Articulo articulo) {
		return articuloServiceImpl.guardarArticulo(articulo);
	}
	
	@GetMapping("/articulos/{id}")
	public Articulo articuloId(@PathVariable(name="id") int id) {
		Articulo articulo_id = new Articulo();
		
		articulo_id = articuloServiceImpl.articuloId(id);
		
		System.out.println("Articulo Id: "+articulo_id);
		
		return articulo_id;
	}
	
	@PutMapping("/articulos/{id")
	public Articulo actualizarArticulo(@PathVariable(name="id") int id, @RequestBody Articulo articulo) {
		Articulo articulo_seleccionado = new Articulo();
		Articulo articulo_actualizado = new Articulo();
		
		articulo_seleccionado = articuloServiceImpl.articuloId(id);
		
		articulo_seleccionado.setNombre(articulo.getNombre());
		articulo_seleccionado.setFabricante(articulo.getFabricante());
		articulo_seleccionado.setPrecio(articulo.getPrecio());
		
		articulo_seleccionado = articuloServiceImpl.actualizarArticulo(articulo_seleccionado);
		
		System.out.println("El articulo actualizado es: " + articulo_actualizado);
		
		return articulo_actualizado;
	}
	
}
