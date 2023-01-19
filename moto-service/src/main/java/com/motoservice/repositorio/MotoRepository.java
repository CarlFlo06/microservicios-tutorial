package com.motoservice.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.motoservice.entidades.Moto;

@Repository
public interface MotoRepository  extends JpaRepository<Moto, Long> {
	List<Moto> findByUsuarioId(Long usuarioId);

}
