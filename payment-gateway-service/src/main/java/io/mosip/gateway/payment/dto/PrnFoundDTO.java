package io.mosip.gateway.payment.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PrnFoundDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String prnNumber;
}