package com.financial.model;

import java.math.BigDecimal;
import java.sql.Date;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.hateoas.RepresentationModel;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class TransactionTDO extends RepresentationModel<TransactionTDO>{
	
	private Long id;
	
	@javax.validation.constraints.NotNull(message = "Nsu cannot be null")
	@Length(min = 6,message = "Nsu must contain at least 6 characters")
	private String nsu;

	private String authorizationNumber;
	
	@DateTimeFormat(iso = ISO.DATE_TIME)
	@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
	@javax.validation.constraints.NotNull(message = "TransactionDate cannot be null")
	private Date transactionDate;
	
	@javax.validation.constraints.NotNull(message = "Amount cannot be null")
	private BigDecimal amount;
	
	@javax.validation.constraints.NotNull(message = "Type cannot be null")
	private TransactionTypeEnum type;


}
