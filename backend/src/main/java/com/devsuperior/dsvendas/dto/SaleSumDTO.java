package com.devsuperior.dsvendas.dto;

import com.devsuperior.dsvendas.entities.Seller;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SaleSumDTO {

	private String sellerName; //vendedor name
	private Double sum; //double que vai ser a soma  das vendas
	
	public SaleSumDTO() {
		
	} //source generation contructor use field 

	public SaleSumDTO(Seller seller, Double sum) {
		this.sellerName = seller.getName(); //pq vai ter que agrupar por seller em grupo n tem como agrupar pelo nome
		this.sum = sum;
	}
	
	
}