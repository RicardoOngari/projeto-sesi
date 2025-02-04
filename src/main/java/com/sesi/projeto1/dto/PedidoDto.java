package com.sesi.projeto1.dto;

import java.time.Instant;

import com.sesi.projeto1.entities.StatusDoPedido;

public record PedidoDto (Instant momento, StatusDoPedido status) {

}
