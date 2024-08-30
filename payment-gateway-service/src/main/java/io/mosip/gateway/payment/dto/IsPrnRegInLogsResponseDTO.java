package io.mosip.gateway.payment.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class IsPrnRegInLogsResponseDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String prn;
	private String regId;
	private boolean isPresentInLogs;

}
