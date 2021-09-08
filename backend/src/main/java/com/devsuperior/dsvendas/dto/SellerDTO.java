package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Seller;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class SellerDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public SellerDTO(Long id, String name) {
		
		this.id = id;
		this.name = name;
		
	}
	
public SellerDTO() { //construtor sem arguemntos
		
	}
	
public SellerDTO(Seller entity) {
		
		id =  entity.getId();
		name = entity.getName();
		
	}
	
	private Long id;
	private String name;

}
