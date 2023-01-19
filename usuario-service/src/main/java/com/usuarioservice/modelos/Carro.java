package com.usuarioservice.modelos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Carro {
	private String marca;
	private String modelo;
	private Long usuarioId;
	
	public Carro() {
		super();
	}

}
