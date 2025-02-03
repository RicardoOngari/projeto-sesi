package com.sesi.projeto1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sesi.projeto1.entities.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository <Usuario, Long> {

}