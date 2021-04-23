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

import com.aplicacion.mongo.model.Cubiculo;
import com.aplicacion.mongo.repository.CubiculoRepository;

@RestController 
@RequestMapping("/politecnico/biblioteca/")
public class CubiculoController {
	
	@Autowired
	CubiculoRepository cubiculoRepository;
	
	@GetMapping("/Cubiculos")
	public List<Cubiculo> listaCubiculos(){
		return cubiculoRepository.findAll();
	}
	
	@GetMapping("/Cubiculos/{id}")
	public Cubiculo buscarCubiculo(@PathVariable int id) {
		return cubiculoRepository.findById(id).get();
	}
	
	@PostMapping("/Cubiculos")
	public Cubiculo crearCubiculo(@RequestBody Cubiculo pais){
		return cubiculoRepository.save(pais);
	}
	
	@PostMapping("/CubiculosList")
	public List<Cubiculo> crearCubiculos(@RequestBody List<Cubiculo> cubiculos) {
		return cubiculoRepository.saveAll(cubiculos);
	}
	
	@PutMapping("/Cubiculos/{id}")
	public Cubiculo guardarCubiculo(@PathVariable int id, @RequestBody Cubiculo cubiculo) {
		
		Cubiculo nuevo_Cubiculo = cubiculoRepository.findById(id).get();
		
		nuevo_Cubiculo.setNum_Cubiculo(cubiculo.getNum_Cubiculo());
		nuevo_Cubiculo.setTipo_Cubiculo(cubiculo.getTipo_Cubiculo());
		nuevo_Cubiculo.setEstado(cubiculo.getEstado());
		nuevo_Cubiculo.setPiso(cubiculo.getPiso());
		
		cubiculoRepository.save(nuevo_Cubiculo);
		
		return nuevo_Cubiculo;
	}
	
	@DeleteMapping("/Cubiculos/{id}")
	public Cubiculo eliminarCubiculo(@PathVariable int id) {
		Cubiculo cubiculo = cubiculoRepository.findById(id).get();
		cubiculoRepository.deleteById(id);
		return cubiculo;
	}
	
	@DeleteMapping("/CubiculosList")
	public void eliminarCubiculos() {
		cubiculoRepository.deleteAll();
	}


}
