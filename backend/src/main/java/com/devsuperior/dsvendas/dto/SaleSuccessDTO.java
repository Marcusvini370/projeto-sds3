package com.devsuperior.dsvendas.dto;

import com.devsuperior.dsvendas.entities.Seller;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SaleSuccessDTO {

	private String sellerName; //vendedor name
	private Long visited; //EVITAR ICOMPATIBILIDADE COM BANCO DE DADOS LONG VISITED PARTE DA VISITA
	private Long deals; //PROMOÇÕES 
	public SaleSuccessDTO() {
		
	} //source generation contructor use field 


	//getter e setters do source
   //VAMOS TROCAR O STRING SELLERNAME QUE FICA NA 1 POSIÇÃO POR Seller seller
	public SaleSuccessDTO(Seller seller, Long visited, Long deals) {
	    sellerName = seller.getName();//VENDEDOR
		this.visited = visited;
		this.deals = deals;
	}


	

}