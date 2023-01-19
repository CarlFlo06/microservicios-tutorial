package com.motoservice.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.motoservice.entidades.Moto;
import com.motoservice.repositorio.MotoRepository;

@Service
public class MotoService {
	@Autowired
	private MotoRepository motoRepository;
	
	public List<Moto> getAll(){
		return motoRepository.findAll();
	}
	
	public Moto getMotoById(Long id){
		return motoRepository.findById(id).orElse(null);
	}
	
	public Moto save(Moto moto) {
		Moto nuevaMoto = motoRepository.save(moto);
		return nuevaMoto;
	}
	
	public List<Moto> byUsuarioId(Long usuarioId){
		return motoRepository.findByUsuarioId(usuarioId);
	}
}
