package com.aplicacion.mongo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.aplicacion.mongo.model.Tablet;
import com.aplicacion.mongo.repository.TabletRepository;

@RestController 
@RequestMapping("/politecnico/biblioteca/")
public class TabletController {
	@Autowired
	TabletRepository tabletRepository;
	
	@GetMapping("/Tablets")
	public List<Tablet> listaTablets(){
		return tabletRepository.findAll();
	}
	
	@GetMapping("/Tablets/{id}")
	public Tablet buscarTablet(@PathVariable int id) {
		return tabletRepository.findById(id).get();
	}
	
	@PostMapping("/Tablet")
	public Tablet crearTablet(@RequestBody Tablet tablet){
		return tabletRepository.save(tablet);
	}
	
	@PostMapping("/TabletList")
	public List<Tablet> crearTablets(@RequestBody List<Tablet> tablets) {
		return tabletRepository.saveAll(tablets);
	}
	
	@PutMapping("/Tablet/{id}")
	public Tablet guardarTablet(@PathVariable int id, @RequestBody Tablet tablet) {
		
		Tablet nueva_Tablet = tabletRepository.findById(id).get();
		
		nueva_Tablet.setNum_Tablets(tablet.getNum_Tablets());
		nueva_Tablet.setEstado(tablet.isEstado());
		nueva_Tablet.setPiso(tablet.getPiso());
		
		tabletRepository.save(nueva_Tablet);
		
		return nueva_Tablet;
	}
	
	@DeleteMapping("/Tablet/{id}")
	public Tablet eliminarTablet(@PathVariable int id) {
		Tablet tablet = tabletRepository.findById(id).get();
		tabletRepository.deleteById(id);
		return tablet;
	}
	
	@DeleteMapping("/TabletList")
	public void eliminarTablets() {
		tabletRepository.deleteAll();
	}

}
