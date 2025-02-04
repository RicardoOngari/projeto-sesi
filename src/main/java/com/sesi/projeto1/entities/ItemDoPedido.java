package com.sesi.projeto1.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_pedido_item")
public class ItemDoPedido {

	@EmbeddedId

	private ItemDoPedidoPk id = new ItemDoPedidoPk();
	private Integer quantidade;
	private Double preco;

	public ItemDoPedido() {
	}

	public ItemDoPedido(Pedido pedido, Produto produto, Integer quantidade, Double preco) {
		id.setPedido(pedido);
		id.setProduto(produto);
		this.quantidade = quantidade;
		this.preco = preco;
	}

	public Pedido getPedido() {
		return id.getPedido();
	}

	public void setPedido(Pedido pedido) {
		id.setPedido(pedido);
	}

	public Produto getProduto() {
		return id.getProduto();}

	

	public void setProduto(Produto produto) {
		id.setProduto(produto);
	}

}
