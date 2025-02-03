package com.sesi.projeto1.entities;

import java.time.Instant;

import com.sesi.projeto1.dto.PedidoDto;

import ch.qos.logback.core.status.Status;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="tb_pedidos")
public class Pedido {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private Instant momento;
	private Status StatusDoPedido;
	private String descricao;
	
	
	public Pedido(PedidoDto dto) {
		this.momento= dto.momento();
	}
	
	
	public Pedido(long id, Instant momento, Status statusDoPedido, String descricao) {
		super();
		this.id = id;
		this.momento = momento;
		StatusDoPedido = statusDoPedido;
		this.descricao = descricao;
	}	

	public void setId(long id) {
		this.id = id;
	}
	public Instant getMomento() {
		return momento;
	}
	public void setMomento(Instant momento) {
		this.momento = momento;
	}
	public Status getStatusDoPedido() {
		return StatusDoPedido;
	}
	public void setStatusDoPedido(Status statusDoPedido) {
		StatusDoPedido = statusDoPedido;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
