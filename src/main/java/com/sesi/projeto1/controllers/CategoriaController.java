//package com.sesi.projeto1.controllers;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.sesi.projeto1.dto.CategoriaDto;
//import com.sesi.projeto1.entities.Categoria;
//import com.sesi.projeto1.repositories.CategoriaRepository;
//
//@RestController
//@RequestMapping("categoria")
//public class CategoriaController {
//	
//	@Autowired
//	CategoriaRepository repo;
//	
//	@GetMapping
//	public ResponseEntity<List<Categoria>> mostrarTodos() {
//		List<Categoria> prod = repo.findAll();
//		return ResponseEntity.ok(prod);
//	}
//	
//	@GetMapping(value = "/categoria/{id}")
//	public ResponseEntity<?> mostrarPorId(@PathVariable Long id) {
//		Categoria prod = repo.getById(id);
//		return ResponseEntity.ok(prod);
//	}
//	
//	@PostMapping
//    public ResponseEntity<Categoria> criar(@RequestBody CategoriaDto dto) {
//		Categoria prod = new Categoria(dto);
//		return ResponseEntity.ok(prod);
//    }
//	 
//}
