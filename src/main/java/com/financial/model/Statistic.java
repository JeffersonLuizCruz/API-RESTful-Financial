package com.financial.model;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Statistic {
	
	private BigDecimal sum; //sum: um BigDecimal especificando a soma total das transações criadas.
	private BigDecimal avg; //avg: um BigDecimal especificando a média dos valores das transações criadas.
	private BigDecimal max; //um BigDecimal especificando o maior valor dentre as transações criadas.
	private BigDecimal min; //um BigDecimal especificando o menor valor dentre as transações criadas.
	private long count; //count: um long especificando o número total de transações.
	
	

}
