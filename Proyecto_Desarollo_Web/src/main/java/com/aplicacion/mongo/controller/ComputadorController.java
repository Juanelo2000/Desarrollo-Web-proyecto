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

import com.aplicacion.mongo.model.Computador;
import com.aplicacion.mongo.repository.ComputadorRepository;


@RestController 
@RequestMapping("/politecnico/biblioteca/")
public class ComputadorController {
	@Autowired
	ComputadorRepository computadorRepository;
	
	@GetMapping("/Computadores")
	public List<Computador> listaCubiculos(){
		return computadorRepository.findAll();
	}
	
	@GetMapping("/Computadores/{id}")
	public Computador buscarComputador(@PathVariable int id) {
		return computadorRepository.findById(id).get();
	}
	
	@PostMapping("/Computadores")
	public Computador crearComputador(@RequestBody Computador computador){
		return computadorRepository.save(computador);
	}
	
	@PostMapping("/ComputadoresList")
	public List<Computador> crearComputadores(@RequestBody List<Computador> computadores) {
		return computadorRepository.saveAll(computadores);
	}
	
	@PutMapping("/Computadores/{id}")
	public Computador guardarComputador(@PathVariable int id, @RequestBody Computador computador) {
		
		Computador nuevo_Computador = computadorRepository.findById(id).get();
		
		nuevo_Computador.setNum_Computador(computador.getNum_Computador());
		nuevo_Computador.setEstado(computador.isEstado());
		nuevo_Computador.setPiso(computador.getPiso());
		
		computadorRepository.save(nuevo_Computador);
		
		return nuevo_Computador;
	}
	
	@DeleteMapping("/Computador/{id}")
	public Computador eliminarComputador(@PathVariable int id) {
		Computador computador = computadorRepository.findById(id).get();
		computadorRepository.deleteById(id);
		return computador;
	}
	
	@DeleteMapping("/ComputadoresList")
	public void eliminarComputadores() {
		computadorRepository.deleteAll();
	}
}
