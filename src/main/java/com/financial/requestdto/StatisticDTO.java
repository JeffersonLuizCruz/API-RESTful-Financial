package com.financial.requestdto;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;

import org.springframework.hateoas.RepresentationModel;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class StatisticDTO extends RepresentationModel<StatisticDTO>{
	
	private Long id;
	
	@NotNull(message = "Sum cannot be null")
	private BigDecimal sum;
	
	@NotNull(message = "Avg cannot be null")
	private BigDecimal avg;
	
	@NotNull(message = "Max cannot be null")
	private BigDecimal max;
	
	@NotNull(message = "Min cannot be null")
	private BigDecimal min;
	
	@NotNull(message = "Count cannot be null")
	private long count;

}
