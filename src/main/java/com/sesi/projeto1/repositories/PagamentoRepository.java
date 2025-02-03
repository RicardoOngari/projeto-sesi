package com.sesi.projeto1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sesi.projeto1.entities.Pagamento;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long>{

}