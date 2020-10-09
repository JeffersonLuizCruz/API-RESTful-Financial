package com.financial.model;

import java.math.BigDecimal;
import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.hateoas.RepresentationModel;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class TransactionTDO extends RepresentationModel<TransactionTDO>{
	
private Long id;
	
	@NotNull()
	private String nsu;

	private String authorizationNumber;
	
	@DateTimeFormat(iso = ISO.DATE_TIME)
	@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
	@NotNull()
	private Date transactionDate;
	
	@NotNull()
	private BigDecimal amount;
	
	@NotNull()
	private TransactionTypeEnum type;


}
