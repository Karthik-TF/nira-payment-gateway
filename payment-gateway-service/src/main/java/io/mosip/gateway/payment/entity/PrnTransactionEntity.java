package io.mosip.gateway.payment.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "prn_transaction", schema="pgateway")
public class PrnTransactionEntity implements  Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
    @Column(name = "prn_transc_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long prnTranscId;
	
	@Column(name = "prn")
    private String prn;
	
	@Column(name = "reg_id")
	private String regId;
	
	@Column(name = "cr_by")
	private String crBy;

	@Column(name = "cr_dtimes")
	private LocalDateTime crDatetime;

}
