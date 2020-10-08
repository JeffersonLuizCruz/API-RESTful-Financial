package com.financial.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "transaction")
public class Transaction implements Serializable{


	private static final long serialVersionUID = -1066367780579416283L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; //id: número único da transação.
	
	@NotNull
	private String nsu; //nsu: número de identificação de uma transação de cartão de crédito.
	
	private String authorizationNumber; //código único das transações online.
	
	@NotNull
	@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
	private Date transactionDate;
	
	/* amount: valor da transação; deve ser uma String de tamanho 
	 * arbitrário que pode ser parseada como um BigDecimal.
	 * */
	@NotNull
	private BigDecimal amount;

	@NotNull
	@Enumerated(EnumType.STRING)
	private TransactionTypeEnum type; //type: se a transação é em cartão (CARD) ou em dinheiro (MONEY).
	
	public Transaction (TransactionTypeEnum type){
		this.type = type;
	}

}
