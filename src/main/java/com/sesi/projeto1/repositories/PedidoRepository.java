package com.sesi.projeto1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sesi.projeto1.entities.Pedido;

public interface PedidoRepository extends JpaRepository <Pedido, Long> {

}
