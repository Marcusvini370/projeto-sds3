package com.devsuperior.dsvendas.dto;

import java.time.LocalDate;

import com.devsuperior.dsvendas.entities.Sale;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SaleDTO {

	private Long id;//id
	private Integer visited;//visitar
	private Integer deals;//detalhes
	private Double amount; //quantia vendida
	private LocalDate date;
	
	private SellerDTO seller;
	
	public SaleDTO() {//sem argumentos
		
	}
	//com argumentos do source getter e setter e using fields

	public SaleDTO(Long id, Integer visited, Integer deals, Double amount, LocalDate date, SellerDTO seller) {
		this.id = id;
		this.visited = visited;
		this.deals = deals;
		this.amount = amount;
		this.date = date;
		this.seller = seller;
	}
	public SaleDTO(Sale entity) { //copior o de cima pra ca , ctl shif o
		id = entity.getId();
		visited = entity.getVisited();
		deals = entity.getDeals();
		amount = entity.getAmount();
		date = entity.getDate();
		seller = new SellerDTO(entity.getSeller());	//ele é um seller e convertemos ele para  SellerDTO usa o construtor new recebendo essa entidade
		//então está copiando todos dados da entidade seller  para nossa sellerDTO
	}


	
	
	
	
}