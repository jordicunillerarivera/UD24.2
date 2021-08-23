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

import mainApp.dto.Fabricante;
import mainApp.service.FabricanteServiceImpl;

@RestController
@RequestMapping("/api")
public class FabricanteController {
	
	@Autowired
	FabricanteServiceImpl fabricanteServiceImpl;
	
	@GetMapping("/fabricantes")
	public List<Fabricante> listarFabricantes() {
		return fabricanteServiceImpl.listarFabricante();
	}
	
	@PostMapping("/fabricantes")
	public Fabricante guardaFabricante(@RequestBody Fabricante fabricante) {
		return fabricanteServiceImpl.guardarFabricante(fabricante);
	}
	
	@GetMapping("/fabricantes/{id}")
	public Fabricante FabricanteId(@PathVariable(name="id") int id) {
		Fabricante Fabricante_id = new Fabricante();
		
		Fabricante_id = fabricanteServiceImpl.fabricanteId(id);
		
		System.out.println("Fabricante Id: "+Fabricante_id);
		
		return Fabricante_id;
	}
	
	@PutMapping("/fabricantes/{id")
	public Fabricante actualizarFabricante(@PathVariable(name="id") int id, @RequestBody Fabricante fabricante) {
		Fabricante Fabricante_seleccionado = new Fabricante();
		Fabricante Fabricante_actualizado = new Fabricante();
		
		Fabricante_seleccionado = fabricanteServiceImpl.fabricanteId(id);
		
		Fabricante_seleccionado.setNombre(fabricante.getNombre());
		
		Fabricante_seleccionado = fabricanteServiceImpl.actualizarFabricante(Fabricante_seleccionado);
		
		System.out.println("El fabricante actualizado es: " + Fabricante_actualizado);
		
		return Fabricante_actualizado;
	}

}
