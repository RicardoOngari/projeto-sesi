package com.sesi.projeto1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sesi.projeto1.dto.ItemDoPedidoDto;
import com.sesi.projeto1.entities.ItemDoPedido;
import com.sesi.projeto1.repositories.ItemDoPedidoRepository;

@RestController
@RequestMapping("item")
public class ItemDoPedidoController {
	
	@Autowired
	ItemDoPedidoRepository repo;
	
	@GetMapping
	public ResponseEntity<List<ItemDoPedido>> mostrarTodos() {
		List<ItemDoPedido> prod = repo.findAll();
		return ResponseEntity.ok(prod);
	}
	
	@GetMapping(value = "/itemdopedido/{id}")
	public ResponseEntity<?> mostrarPorId(@PathVariable Long id) {
		ItemDoPedido prod = repo.getById(id);
		return ResponseEntity.ok(prod);
	}
	
	@PostMapping
    public ResponseEntity<ItemDoPedido> criar(@RequestBody ItemDoPedidoDto dto) {
		ItemDoPedido prod = new ItemDoPedido(dto);
		return ResponseEntity.ok(prod);
    }
	 



}
